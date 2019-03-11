package com.springboot.bksboot2.testservice;

/**
 * MyPojo
 */
public class MyPojo {

    private String name;

    private String desc;

    // public MyPojo(String name, String desc){
    //     this.name = name;
    //     this.desc = desc;
    // }

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
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}