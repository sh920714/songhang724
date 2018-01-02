/**
 * Project Name:songhang724
 * File Name:Printer.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午2:59:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:59:01 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
/*
 * 场景一：父类：打印机类printer <br/>
 * 
 * 子类：黑白打印机heibai printer 彩色打印机colour printer<br/>
 * 
 * 多态的方法（打印）；各子类的不同实现，黑白打印机打印黑白，彩色打印机打印彩色<br/>
 * 
 * 场景二：父类：人类person<br/>
 * 
 * 子类：男人慢men 女人women<br/>
 * 
 * 多态的方法（学习）：男人学习java 女人学习ui<br/>
 * 
 * 场景三：父类：汽车类<br/>
 * 
 * 子类：小车 卡车<br/>
 * 
 * 多态的方法（学习）：小车载人 卡车载货<br/>
 */
/*
 * 选择场景一
 */
public abstract class Printer {// 定义一个抽象的打印机类
    private String color;// 定义一个私有属性color

    private int length;// 定义一个私有属性length

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // public void print() {// 定义一个打印的方法
    // System.out.println("打印的颜色为" + this.color);
    // }
    public abstract void print();
}
