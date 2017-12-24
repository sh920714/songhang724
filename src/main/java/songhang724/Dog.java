/**
 * Project Name:songhang724
 * File Name:Dog.java
 * Package Name:songhang724
 * Date:2017年12月24日下午2:35:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package songhang724;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:35:32 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Dog {
    String colors;

    String name;

    int age;

    void voice() {
        System.out.println("汪汪");
    }

    void eat() {
        System.out.println("骨头");
    }

    void see() {
        System.out.println("门");
    }

    int catchRabbit() {
        return 1;
    }

    public static void main(String[] args) {
        Dog dog;
        dog = new Dog();
        dog.colors = "黄色";
        dog.name = "小黄";
        dog.age = 5;
        System.out.println("狗的颜色:" + dog.colors + "\n狗的名字：" + dog.name + "\n狗的年龄:" + dog.age);
        dog.voice();
        dog.eat();
        dog.see();
        System.out.println("抓到兔子的数量：" + dog.catchRabbit());
    }
}
