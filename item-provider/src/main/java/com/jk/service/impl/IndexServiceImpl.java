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
    public List<Tree> select() {
        int pid=0;
        List<Tree> list = pid(pid);
        return list;
    }

    private List<Tree> pid(int pid) {
        List<Tree> list = mapper.select(pid);
        for (Tree tree : list) {
            Integer id = tree.getId();
            List<Tree> sdfghjk = pid(id);
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
