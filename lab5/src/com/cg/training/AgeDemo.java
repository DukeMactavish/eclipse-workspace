package com.cg.training;

import java.util.*;

import com.cg.training.AgeException;

public class AgeDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			if(age<15) {
				throw new AgeException("Your age is under limit, can't vote");
			}
			System.out.println("You are eligible to vote");
			
		}catch(AgeException e) {
			e.printStackTrace();
		}
	}

}
