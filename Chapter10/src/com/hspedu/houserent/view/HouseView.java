package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 3. 调用HouseService 进行各种操作
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' ';         //接收用户选择
    private HouseService houseService = new HouseService(2);   //设置数组大小为10

    //根据id修改房屋信息
    public void updateHouse() {
        System.out.println("-------------修改房屋信息-------------");
        System.out.print("请选择修改房屋的编号(-1可以退出):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("您已经放弃修改房屋信息");
            return;
        }

        //根据输入得到 updateId
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("该房间id不存在!!");
            return;
        }

        System.out.println("############已进入房屋信息修改界面############");
        System.out.println("--------------已打印该编号为 " + house.getId() + " 的房屋信息--------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        System.out.println(house);

        //修改姓名
        System.out.print("姓名:");
        String name = Utility.readString(8, "");//如果这里用户直接回车表示不修改 该信息,默认""
        if (!"".equals(name)) {
            house.setName(name);
        }

        //修改电话
        System.out.print("电话:");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.print("住址:");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.print("月租:");
        int rent = Utility.readInt();
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.print("状态:");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        /**
        //修改姓名
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");//如果这里用户直接回车表示不修改 该信息,默认""
        if (!"".equals(name)) {
            house.setName(name);
        }

        //修改电话
        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.print("住址(" + house.getAddress() + "):");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("月租(" + house.getRent() + "):");
        int rent = Utility.readInt();
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
         */


    }

    //根据id 查找房屋信息
    public void findHouse() {
        System.out.println("===========查找房屋信息===========");
        System.out.print("请输入查找的id:");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("您所查找的id不存在!!");
        }

    }

    //编写 exit退出确认方法
    public void exit() {
        System.out.println("--------------您即将退出房屋出租系统--------------");

        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
            System.out.println("您已经退出房屋系统");
        }
    }

    //编写delHouse()方法，接受输入id 调用Service 的 del方法
    public void delHouse() {
        System.out.println("===========删除房屋信息===========");
        System.out.print("请输入待删除房屋的编号(输入-1可退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("===========您已放弃本次删除操作===========");
            return;
        }
        System.out.println("请确认是否要删除(Yes/No),注意此操作将删除房屋信息，不可恢复!!");
        //该方法本身有循环逻辑判断，必须输出Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("===========删除成功===========");
            } else {
                System.out.println("===========房屋编号不存在,删除失败!!===========");
            }
        } else {
            System.out.println("===========您已放弃本次删除操作===========");
        }
    }

    //编写addHouse()方法，用于添加房屋信息
    public void addHouse() {
        System.out.println("===========添加房屋===========");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id 是系统自动分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============添加房屋成功=============");
        } else {
            System.out.println("=============添加房屋失败!!!=============");
        }
    }


    //编写listHouse()显示房屋列表
    public void listHouse() {
        System.out.println("===========房屋列表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); //得到所有的房屋信息

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }

        System.out.println("===========房屋列表显示完毕===========");
    }

    public void mainMenu() {
        do {
            System.out.println("===========房屋出租系统菜单界面===========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请输入你的选择(1-6):");
            key = Utility.readChar();

            switch (key) {
                case '1':
//                    System.out.println("新 增");
                    addHouse();
                    break;
                case '2':
                    findHouse();
//                    System.out.println("查 找");
                    break;
                case '3':
//                    System.out.println("删 除");
                    delHouse();
                    break;
                case '4':
                    updateHouse();
//                    System.out.println("修 改");
                    break;
                case '5':
//                    System.out.println("房 屋 列 表");
                    listHouse();
                    break;
                case '6':
                    exit();
//                    System.out.println("您已经退出房屋系统");
//                    loop = false;
                    break;
            }

        } while (loop);
    }
}
