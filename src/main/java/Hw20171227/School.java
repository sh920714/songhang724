/**
 * Project Name:songhang724
 * File Name:School.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午4:21:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:21:07 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class School {
    String name;

    int yeas;

    double s;

    String lode;

    public School(String name) {
        this.name = name;
    }

    public School(int yeas, double s) {
        this.yeas = yeas;
        this.s = s;
    }

    public School(int yeas, double s, String lode) {
        this.yeas = yeas;
        this.s = s;
        this.lode = lode;
    }

}
