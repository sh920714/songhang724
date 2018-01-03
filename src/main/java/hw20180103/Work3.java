/**
 * Project Name:songhang724
 * File Name:Work3.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:29:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:29:39 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Work3 {
    private final static Logger LOG = Logger.getLogger(Work3.class);

    public static void main(String[] args) {

        String str = null;
        LOG.info(str);
        try {
            str.length();
        } catch (Exception e) {
            LOG.info("异常信息");
            e.printStackTrace();
        }
    }
}
