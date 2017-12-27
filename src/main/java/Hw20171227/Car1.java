/**
 * Project Name:songhang724
 * File Name:Car1.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午3:40:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:40:09 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Car1 {

    public static void main(String[] args) {
        String color = "红色";
        String kind = "雪佛兰";
        int heigth = 4;
        System.out.println(color + kind + heigth);
        Car str = new Car(color, kind, heigth);
        System.out.println(str.color + str.kind + str.heigth);
    }
}
