/**
 * Project Name:songhang724
 * File Name:BigCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:30:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:30:58 <br/>
 * 
 * @author songhang
 * @version
 * @see 定义一个小汽车的类和大卡车的类，要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
 */
public class BigCar {
    private String size;// 定义了一个私有的属性(也叫成员变量)

    private String wheel;// 定义了一个私有的属性(也叫成员变量)

    public String getSize() {// 定义一个get方法
        return size;
    }

    public String getWheel() {// 定义一个get方法
        return wheel;
    }

    public void setSize(String size) {// 定义一个set方法
        this.size = size;
    }

    public void setWheel(String wheel) {// 定义一个set方法
        this.wheel = wheel;
    }

}
