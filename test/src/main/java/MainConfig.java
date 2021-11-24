/*
 * Project: demo
 *
 * File Created at 2021-10-30
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


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import aop.AopAspect;
import bo.Person;

/**
 * @author liangbf
 * @version V1.0
 * @since 2021-10-30 16:25
 */
@Configuration
@ComponentScan(basePackages = {"service","aop"})	//只扫描带有@Component注解的类
@EnableAspectJAutoProxy
public class MainConfig {



    @Bean
    public Person person(){
        Person person = new Person();
        return person;
    }

}
