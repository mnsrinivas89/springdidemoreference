package com.verizontraining.springdidemoreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/verizontraining/springdidemoreference/config.xml");
		Club club = (Club) ctx.getBean("club");
		System.out.println(club);
	}
}
