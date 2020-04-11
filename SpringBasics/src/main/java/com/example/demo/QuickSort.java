package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("quickSort")
@Primary
public class QuickSort implements Sort {

	@Override
	public int[] sort(int[] num) {
		System.out.println("Inside Quick");// TODO Auto-generated method stub
		return num;
	}

}
