package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		System.out.println("Before Swap");
		System.out.println("num1 : "+ar.get(0));
		System.out.println("num2 : "+ar.get(1));
		Collections.swap(ar, 0, 1);
		System.out.println("After Swap");
		System.out.println("num1 : "+ar.get(0));
		System.out.println("num2 : "+ar.get(1));
		sc.close();
	}

}
