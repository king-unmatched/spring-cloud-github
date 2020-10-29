package com.jk.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "t_aop")
public class LogBean {

    private String id;

    private String className;

    private String methodName;

    private String requestParam;

    private String responseParam;
}
