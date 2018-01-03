/**
 * Project Name:songhang724
 * File Name:School.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:00:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:00:38 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
/*
 * 作业一：列举三个以上接口应用场景； <br/>
 * 
 * 1.学校作为一个接口 学校有学习和运动的功能，让学生学习来实现类br/>
 * 
 * 2.锁定义成接口，锁有上锁和开锁的功能，让防盗门继承门类实现锁类
 * 
 * 3.定义一个硬盘的接口，返回硬盘信息，让计算机实现类
 */

public interface School {
    /**
     * Description: <br/>
     * 定义一个学习的接口方法
     * 
     * @author songhang
     * @return学习内容
     */
    /*
     * 1.学校作为一个接口 学校有学习和运动的功能，让学生学习来实现类br/>
     */
    public String study();
}
