/**
 * Project Name:songhang724
 * File Name:VipCard.java
 * Package Name:work20171225
 * Date:2017年12月25日下午9:23:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package work20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午9:23:15 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class VipCard {
    String vipcard1;

    String vipcard2;

    String vipcard3;

    String vipcard4;

    String vipcard5;

    double c;

    int b;

    double a(int b, double c) {
        return (0.7 + b * 0.05) * c;
    }

    public static void main(String[] args) {
        VipCard vipcard = new VipCard();
        Scanner intput = new Scanner(System.in);
        System.out.println("至尊级");
        System.out.println("钻石级");
        System.out.println("白金级");
        System.out.println("黄金级");
        System.out.println("白银级");
        System.out.println("请输入你的等级：");
        int num = intput.nextInt();
        System.out.println("请输入你消费的金额：");
        Double num1 = intput.nextDouble();
        System.out.println("你本次消费的金额是：" + vipcard.a(num, num1));

    }

}
