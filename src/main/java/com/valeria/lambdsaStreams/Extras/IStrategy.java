package com.valeria.lambdsaStreams.Extras;


@FunctionalInterface
public interface IStrategy {
	public String sayHello(String name);
	public default String helloWorld() {
		return "Hello World";
	}
}
