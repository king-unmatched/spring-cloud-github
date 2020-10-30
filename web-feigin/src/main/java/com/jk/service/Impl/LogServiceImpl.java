package com.jk.service.Impl;

import com.jk.entity.LogBean;
import com.jk.pojo.PageResult;
import com.jk.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public PageResult selectlist(Integer currPage, Integer pageSize, LogBean log) {
        Query query=new Query();
        if(log.getClassName()!=null && !"".equals(log.getClassName())){
            query.addCriteria(Criteria.where("className").regex(log.getClassName()));
        }
        long count = mongoTemplate.count(query, LogBean.class);
        int start=(currPage-1)*pageSize;
        query.skip(start).limit(pageSize);
        List<LogBean>list=mongoTemplate.find(query,LogBean.class);
        Long totalPage = count%pageSize == 0 ? count/pageSize : (count/pageSize + 1);
        return new PageResult(count,list,currPage, pageSize, totalPage);
    }

    @Override
    public void delete(String[] id) {
        Query query=new Query();
        query.addCriteria(Criteria.where("id").in(id));
        mongoTemplate.remove(query, LogBean.class);
    }
}
