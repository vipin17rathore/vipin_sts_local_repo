package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component()
@Scope(value="prototype",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] num) {
		// TODO Auto-generated method stub
		return num;
	}

}
