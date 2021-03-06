package com.norton.patterns_project;

import java.util.concurrent.CompletableFuture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.norton.patterns_project.coffee.Coffee;
import com.norton.patterns_project.coffee.CoffeeFactory;
import com.norton.patterns_project.extra.Acucar;
import com.norton.patterns_project.extra.BaseCoffee;
import com.norton.patterns_project.extra.Chantilly;
import com.norton.patterns_project.extra.Extra;
import com.norton.patterns_project.state.Order;
import com.norton.patterns_project.state.OrderState;
import com.norton.patterns_project.state.PaymentOrder;

@SpringBootApplication
@Configuration
public class App 
{
	public static void main(String[] args) {
		Coffee coffee = new CoffeeFactory().getCoffee("C");
		Extra completeCoffee = new Acucar(new Chantilly(new BaseCoffee(coffee)));

		Order state = new Order(completeCoffee);
		state.next();
		state.next();
		state.next();
		state.next();
		
		System.out.println("\n");
		
		coffee = new CoffeeFactory().getCoffee("N");
		completeCoffee = new Acucar(new Chantilly(new BaseCoffee(coffee)));

		state = new Order(completeCoffee);
		state.next();
		state.cancel();
	}
}
