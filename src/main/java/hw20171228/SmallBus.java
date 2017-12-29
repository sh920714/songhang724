/**
 * Project Name:songhang724
 * File Name:SmallBus.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:13:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:13:53 <br/>
 * 
 * @author songhang
 * @version
 * @see 定义一个小汽车的类和大卡车的类，要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
 * 
 */
public class SmallBus extends Car {// 定义一个小汽车的类，且继承了车的抽象类
    private String wheel = "4个";// 定义了一个私有的属性(也叫成员变量)

    private char size = '小';// 定义了一个私有的属性(也叫成员变量)

    public String getWheel() {
        return wheel;// 定义一个get方法
    }

    public char getSize() {
        return size;// 定义一个get方法
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;// 定义了一个set方法
    }

    public void setSize(char size) {
        this.size = size;// 定义了一个set方法
    }

    /* 2) 接第1题，在小汽车类中，添加输出小洗车整体介绍信息方法，方法中，除输出小洗车本类中的属性外，还要输出父类中的属性信息。 */
    public void summary() {// 输出小洗车整体介绍信息方法
        System.out.println("我的小汽车有" + this.wheel + this.size + "我这车子的型号" + getKind()/* 调用父类的属性 */+ getColor());
    }// 方法中，除输出小洗车本类中的属性外，还要输出父类中的属性信息

}
