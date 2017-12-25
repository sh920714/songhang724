/**
 * Project Name:songhang724
 * File Name:Hwork20171225.java
 * Package Name:work
 * Date:2017年12月25日下午4:54:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package work20171225;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午4:54:12 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Hwork {
    int a;

    int b;

    int hwork(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Hwork hwork;
        hwork = new Hwork();
        int a = 56;
        int b = 57;
        hwork.hwork(a, b);
        int glass = hwork.hwork(a, b);
        System.out.println(glass);

    }

}
