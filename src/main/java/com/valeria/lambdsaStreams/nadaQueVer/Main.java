package com.valeria.lambdsaStreams.nadaQueVer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		
		List<Object> list = Arrays.asList( "Casa", new Long(19) );
		
		list.stream().forEach( System.out::println );

	}

}
