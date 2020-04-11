package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JavaPracticeApplication.class, args);
		SortService sortService = context.getBean(SortService.class);
		BubbleSort bubbleSort = context.getBean(BubbleSort.class);
		BubbleSort bubbleSort1 = context.getBean(BubbleSort.class);
		SortService sortService1 = context.getBean(SortService.class);
		System.out.println("sortService"+sortService+"sortService1"+sortService1);
		System.out.println("bubbleSort "+bubbleSort   +" \n bubbleSort1"+bubbleSort1);
		System.out.println("InsideJavaPracticeApplication : sortService  "+sortService);
		int number=sortService.search(new int[] {1,2,3,4,5});
		System.out.println("Number "+number);
	}

}
