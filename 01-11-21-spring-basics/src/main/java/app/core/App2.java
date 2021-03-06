package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.util.Util;

public class App2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Util util = ctx.getBean(Util.class);
		System.out.println(util.add(5, 8));
		System.out.println("10 NIS = " + util.convertNisToDolar(10) + " Dollar");

		ctx.close();

	}

}
