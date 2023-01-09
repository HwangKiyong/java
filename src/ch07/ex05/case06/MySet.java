package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
	}
}
/*
List와 Set 같은 식구이다.
set의 특징은 중복된 값이 없다.
set은 key라는 데이터가 따로 없다.
*/