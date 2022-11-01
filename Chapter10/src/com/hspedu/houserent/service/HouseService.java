package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/**
 * HouseService.java 类 【业务层】
 * // 定义House[] 数组 存放House对象
 * 1.相应 HouseVIew的调用
 * 2. 完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {

    private House[] houses; //创建数组，用于存放house对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前已经添加房屋id 的值

    public HouseService(int size) {
        //new Houses
        houses = new House[size];
        //为了配合测试，创建一个测试对象
        houses[0] = new House(1, "jack", "110", "海淀区", 2000, "未出租");
    }

    //find方法,返回house对象或者null
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if ( findId == houses[i].getId() ){
                return houses[i];
            }
        }
        return null;
    }

    // del() 方法，删除一个房屋信息
    public boolean del(int delId) {

        //应当先要找到要删除的房屋的下表
        //要注意 房屋的id 不是 房屋在数组中储存的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) { //如果要删除的id 是数组下标为 i 的 元素
                index = i;  //就使用 index记录 下表

            }
        }

        if (index == -1) {       //说明没有找到
            return false;
        }

        //如果找到
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
//        houses[houseNums - 1] = null;
        houses[--houseNums] = null; //将当前存在的房屋信息的最后一个设置为空
        return true;

    }

    //add方法添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否可以继续添加(暂时不用考虑 数组扩容的问题)
        if (houseNums == houses.length) { //判断不能继续添加
            System.out.println("数组已满,无法继续添加.....");
            return false;
        }
        //加入新的house对象
//        houses[houseNums] = newHouse;
//        houseNums++;
        houses[houseNums++] = newHouse;
        //我们需要设计一个id自增长的机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
//        idCounter++;
//        newHouse.setId(idCounter);
        return true;
    }


    //list方法，返回 house数组
    public House[] list() {
        return houses;
    }
}
