/*
 * Project: spring
 *
 * File Created at 2021-11-21
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
package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * 切面类首先要被spring管理，成为spring的bean，只有@Aspect这个注解无法成为spring的bean，成为spring的bean的做法：
 * 1.@Import
 * 2.@Bean
 * 3.加上@Component让@ComponentScan扫描到
 * @author liangbf
 * @version V1.0
 * @since 2021-11-21 16:39
 */
@Aspect
@Component
public class NoUserAspect {


	@Pointcut("execution(* bo.Person.*(..))")
	public void pointCut(){

	}

	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint){
		System.out.println("无用方法执行前执行========");
	}

	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println("无用方法执行后执行=======");
	}

}
