/**
 * Project Name:songhang724
 * File Name:TestPerson.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午6:19:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180101;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:19:39 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person("张三", 20);
        Printer printer = new HbPrinter();
        Printer printer1 = new ColourPrinter();
        person.operate(printer);
        person.operate(printer1);

    }

}
