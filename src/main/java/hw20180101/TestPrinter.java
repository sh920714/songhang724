/**
 * Project Name:songhang724
 * File Name:TestPrinter.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午4:33:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:33:10 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestPrinter {

    public static void main(String[] args) {
        Printer printer = new HbPrinter();// 向上转型
        Printer printer1 = new ColourPrinter();// 向上转型
        printer.print();
        printer1.print();
    }

}
