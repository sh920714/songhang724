/**
 * Project Name:songhang724
 * File Name:Person.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午6:10:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:10:57 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Person {
    private String name = "";

    private int age = 20;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void operate(Printer printer) {// 构造一个以Printer printer为形参方法操作打印机
        printer.print();
    }

}
