package com.revature.service;

import java.util.LinkedList;
import java.util.Stack;

public class BChallenge 
{
	@SuppressWarnings("unchecked")
	public static <T> T loopDetection(LinkedList<?> A)
	{
		Stack<T> previousValues = new Stack<T>();
		previousValues.push((T) A.get(0));
		
		for(int i = 1; i < A.size(); i++)
		{
			if(previousValues.contains(A.get(i)))
			{
				return (T) A.get(i);
			}
		}
		
		return null;
	}
}
