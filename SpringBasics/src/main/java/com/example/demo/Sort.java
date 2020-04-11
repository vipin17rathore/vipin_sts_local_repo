package com.example.demo;

public interface Sort {
	default int[] sorting(int[] numbers) {
		return numbers;
	}

	int[] sort(int [] num);
}
