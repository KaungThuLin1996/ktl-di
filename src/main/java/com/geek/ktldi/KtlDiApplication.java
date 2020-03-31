package com.geek.ktldi;

import com.geek.ktldi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KtlDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KtlDiApplication.class, args);

		System.out.println("******************");
		System.out.println("----- Pets");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichIsTheBest());

		System.out.println("******************");
		System.out.println("----- Profile");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("******************");
		System.out.println("----- Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayGreeting());

		System.out.println("******************");
		System.out.println("----- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.say());

		System.out.println("******************");
		System.out.println("----- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.say());

		System.out.println("******************");
		System.out.println("----- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.say());
	}

}
