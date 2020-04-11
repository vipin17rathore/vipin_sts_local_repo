package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SortService {
	@Autowired
	@Qualifier("bubbleSort")
	Sort sort;
	
	public int search(int [] num) {
		sort.sort(num);
		return num.length;
	}
}
