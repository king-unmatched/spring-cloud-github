package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.entity.LogBean;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReceiveController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RabbitListener(queues = "log-queue")
    public void saveAop(String logBean){
        LogBean log = JSONObject.parseObject(logBean, LogBean.class);
        mongoTemplate.save(log);
    }
}
