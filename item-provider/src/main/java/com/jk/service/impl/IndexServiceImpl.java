package com.jk.service.impl;

import com.jk.dao.TreeMapper;
import com.jk.entity.Tree;
import com.jk.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private TreeMapper mapper;

    @Override
    public List<Tree> select(Integer id) {
        Integer pid=1;
        List<Tree> list = pid(pid,id);
        return list;
    }

    private List<Tree> pid(Integer pid,Integer id) {
        List<Tree> list = mapper.select(pid,id);
        for (Tree tree : list) {
            List<Tree> sdfghjk = pid(tree.getId(),id);
            if (sdfghjk!=null && sdfghjk.size()>0) {
                tree.setNodes(sdfghjk);
                tree.setLeaf(true);
                tree.setSelectable(false);
            }else{
                tree.setLeaf(false);
                tree.setSelectable(true);
            }
        }
        return list;
    }
}
