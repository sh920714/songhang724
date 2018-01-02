/**
 * Project Name:songhang724
 * File Name:ColourPrinter.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午3:30:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午3:30:17 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class ColourPrinter extends Printer {

    private String color = "彩色";

    private char size;// 定义一个HbPrinter类私有的特有的属性

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void print() {// 重写父类的方法
        System.out.println("打印的颜色为" + this.color);
    }

}
