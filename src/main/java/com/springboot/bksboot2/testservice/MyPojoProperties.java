package com.springboot.bksboot2.testservice;

import java.util.List;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.stereotype.Component;

/**
 * MyPojoProperties
 */
// @Component
// @ConfigurationProperties("testproperties") // @SpringBootApplication annotation이 있는 클래스에서도 사용하여 properties 클래스 빈으로 등록가능
public class MyPojoProperties {

    private String name;

    private List<MyPojo> pojoList;

    private String workFor;

    private String whereToGo;

    private String fooBar;

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

    /**
     * @return the workFor
     */
    public String getWorkFor() {
        return workFor;
    }

    /**
     * @param workFor the workFor to set
     */
    public void setWorkFor(String workFor) {
        this.workFor = workFor;
    }

    /**
     * @return the whereToGo
     */
    public String getWhereToGo() {
        return whereToGo;
    }

    /**
     * @param whereToGo the whereToGo to set
     */
    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    /**
     * @return the fooBar
     */
    public String getFooBar() {
        return fooBar;
    }

    /**
     * @param fooBar the fooBar to set
     */
    public void setFooBar(String fooBar) {
        this.fooBar = fooBar;
    }
    
}