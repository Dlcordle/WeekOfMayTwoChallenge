package com.revature.main;

import java.util.LinkedList;

import com.revature.service.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		/////////////////////////////FIRST CHALLENGE/////////////////////////////////
		System.out.println("///////////////CHALLENGE ONE//////////////");
		LinkedList<Integer> one = new LinkedList<>();
		LinkedList<Integer> two = new LinkedList<>();
		
		one.add(1);
		one.add(2);
		one.add(3);
		
		two.add(4);
		two.add(one.get(2));
		
		int [] result = AChallenge.checkIntersection(one, two);
		
		if(result == null)
		{
			System.out.println("No intersection between lists");
		}
		else
		{
			System.out.println("Location in first: " + result[0]);
			System.out.println("Location in second: " + result[1]);
		}
		System.out.println("///////////////END//////////////");
		System.out.println();
		///////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////SECOND CHALLENGE//////////////////////////////////
		System.out.println("///////////////CHALLENGE TWO//////////////");
		
		System.out.println("Expected Outcome: Loop does exist");
		
		one.add(one.get(0));
		
		Integer result1 = BChallenge.loopDetection(one);
		
		if(result1 == null)
		{
			System.out.println("No loop Exists");
		}
		else
		{
			System.out.println("Loop at node: " + result1);
		}
		
		System.out.println("///////////////END//////////////");
		///////////////////////////////////////////////////////////////////////////////
	}
}
