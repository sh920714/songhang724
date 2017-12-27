/**
 * Project Name:songhang724
 * File Name:XiaoGao.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午5:16:41
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:16:41 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class XiaoGao {
    private String name;

    private String love;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {// 为何要get一个方法？
        return name;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getLove() {
        return love;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
