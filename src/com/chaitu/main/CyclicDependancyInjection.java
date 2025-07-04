package com.chaitu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chaitu.sbeans.A;
import com.chaitu.sbeans.B;

public class CyclicDependancyInjection {

	public static void main(String[] args) {

		try (FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/chaitu/cfgs/applicationContext.xml")) {

			A a2 = (A) ctx.getBean("a1");
			System.out.println(a2);

			System.out.println("======================");

			B b2 = (B) ctx.getBean("b1");
			System.out.println(b2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
