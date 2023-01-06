package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 한쪽에 Integer를 사용하게 되면 뒤에도 저절로 적용된다.
		list.add(1);	//CRUD 중 C이다.
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1); //제거하는것 CRUD중 D이다. 제거된 후에 순서가 바뀐다.
		System.out.println(list);
		
		//과제: list의 모든 원소를 삭제하라.
		list.removeAll(list);	
		System.out.println(list);
//		
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1)); // remove할때 asList를 단독으로 사용하면 안된다.
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);		
	}
}
/*
Arraylist 를 사용하게 되면 사이즈를 지정해줄 필요가 없다.
배열의 단점을 극복한것이다.
현장에서 많이 사용할 것이다.
*/