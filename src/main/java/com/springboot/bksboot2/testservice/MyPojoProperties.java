package com.springboot.bksboot2.testservice;

import java.time.Duration;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.stereotype.Component;

/**
 * MyPojoProperties
 */
// @Component
// @ConfigurationProperties("testproperties") // @SpringBootApplication annotation이 있는 클래스에서도 사용하여 properties 클래스 빈으로 등록가능
public class MyPojoProperties {

    @NotEmpty
    private String name;

    private List<MyPojo> pojoList;

    private String workFor;

    private String whereToGo;

    private String fooBar;
    
    private Duration time1; // 1000 ms --> PT1S

    private Duration time2; // 10 hr --> PT10H

    private Duration time3; // 10 s --> PT10S

    @Min(0)
    @Max(100)
    private int number1;

    private int number2;

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

    /**
     * @return the time1
     */
    public Duration getTime1() {
        return time1;
    }

    /**
     * @param time1 the time1 to set
     */
    public void setTime1(Duration time1) {
        this.time1 = time1;
    }

    /**
     * @return the time2
     */
    public Duration getTime2() {
        return time2;
    }

    /**
     * @param time2 the time2 to set
     */
    public void setTime2(Duration time2) {
        this.time2 = time2;
    }

    /**
     * @return the time3
     */
    public Duration getTime3() {
        return time3;
    }

    /**
     * @param time3 the time3 to set
     */
    public void setTime3(Duration time3) {
        this.time3 = time3;
    }

    /**
     * @return the number1
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * @return the number2
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    
}