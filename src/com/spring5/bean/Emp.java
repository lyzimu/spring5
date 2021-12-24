package com.spring5.bean;

public class Emp {
    private String ename;
    private String gender;
//    注入Dept属性
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//    测试使用的方法
    public void test(){
        System.out.println(ename + " : " + gender + " : " + dept);
    }
}
