/**
 * Project Name:songhang724
 * File Name:HbPrinter.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午3:15:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午3:15:50 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class HbPrinter extends Printer {// 定义一个HbPrinter类继承Printer类
    private int height;// 定义一个HbPrinter类私有的特有的属性

    private String color = "黑白";

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {// 重写父类的方法

        System.out.println("打印的颜色为" + this.color);
    }
}
