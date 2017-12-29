/**
 * Project Name:songhang724
 * File Name:LuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午5:00:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;/* 在相同子包类如何继承上个包的抽象类？导入到上个子包 */

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:00:58 <br/>
 * 
 * @author songhang
 * @version
 * @see 3)
 */

/*
 * 在hw20171228.huxury类包中，编写一个豪华汽车的类，<br/>
 * 
 * 要求继承第1题中车的抽象类，重写车的简介方法summary()，输出信息中<br/>
 * 
 * ，包括“我是豪车。。。”形式的内容，并添加相应属性方法。
 */

public class LuxuryCar extends Car /* 在相同子包类如何继承上个包的抽象类？导入到上个子包 */{
    private String model = "s007";// 定义了一个私有的属性(也叫成员变量)

    public/* 权限修饰符 */void summary() {// 重写车的简介方法summary()

        super.summary();// 调用抽象类的方法
        System.out.println("我是豪车保时捷" + this.model + "型号");
    }// 定义一个set方法

    public static void main(String[] args) {
        LuxuryCar luxurycar = new LuxuryCar();
        luxurycar.summary();// 调用了summary的方法？
    }
}
