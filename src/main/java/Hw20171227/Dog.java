/**
 * Project Name:songhang724
 * File Name:Dog.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午3:08:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:08:19 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Dog {
    String name = "小黄";

    char color = '黄';

    int age = 5;

    public Dog() {
        System.out.println(name + color + age);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "小红";
        dog.color = '黄';
        dog.age = 6;

    }
}
