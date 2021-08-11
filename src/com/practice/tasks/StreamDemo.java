package com.practice.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream is=IntStream.of(1,2,3,4,5);
		List<Integer> ls=Arrays.asList(1,2,3,4,5);
		int max=ls.stream().reduce((a,b)->a>b? a :b).get();
		System.out.println(max);
		//OptionalInt op=is.max();
		//System.out.println(op.getAsInt());
	}

}
