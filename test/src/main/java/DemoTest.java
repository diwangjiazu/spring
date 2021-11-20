/*
 * Project: demo
 *
 * File Created at 2021-09-22
 *
 * Copyright 2012-2015 Greenline.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Greenline Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Greenline.com.
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liangbf
 * @version V1.0
 * @since 2021-09-22 17:05
 */
public class DemoTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        applicationContext.start();
        //611506800000
        System.out.println(applicationContext.getBean("testService"));



    }

}
