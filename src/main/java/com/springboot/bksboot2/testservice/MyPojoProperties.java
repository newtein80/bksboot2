package com.springboot.bksboot2.testservice;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MyPojoProperties
 */
@Component
@ConfigurationProperties("testproperties")
public class MyPojoProperties {

    private String name;

    private List<MyPojo> pojoList;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pojoList
     */
    public List<MyPojo> getPojoList() {
        return pojoList;
    }

    /**
     * @param pojoList the pojoList to set
     */
    public void setPojoList(List<MyPojo> pojoList) {
        this.pojoList = pojoList;
    }
    
}