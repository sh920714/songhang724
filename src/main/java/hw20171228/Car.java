/**
 * Project Name:songhang724
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:33:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:33:47 <br/>
 * 
 * @author songhang
 * @version
 * @see <br/>
 *      1) 在hw20171228类包中，编写一个车的抽象类//加一个abstract修饰符，<br/>
 *      先定义车的简介方法summary()，输出车的概要信息，再自由定义两个属性、两个方法//；<br/>
 *      定义一个小汽车的类和大卡车的 类， 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法<br/>
 * 
 */
public abstract class Car {// 编写一个车的抽象类
    public/* 权限修饰符 */void summary() {// 定义一个简介方法summary()
        System.out.println(this.kind + this.color);// 输出车的概要信息
    }

    String kind = "小型";// 定义属性，且给属性赋值

    String color = "黄色";// 定义属性，且给属性赋值

    public String getKind() {
        return kind;
    }// 定义一个get方法

    public void setKind(String kind) {
        this.kind = kind;
    }// 定义一个set方法

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
