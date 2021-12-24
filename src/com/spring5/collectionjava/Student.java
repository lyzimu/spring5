package com.spring5.collectionjava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
//    xml注入集合类
//   1、数组类型
    private String[] courses;
//    2、list类型
    private List<String> lists;
//    3、map类型
    private Map<String,String> maps;
//    4、set类型
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
//    测试方法
    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(lists);
        System.out.println(maps);
        System.out.println(sets);
    }

}
