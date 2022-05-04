package com.revature.service;

import java.util.LinkedList;

public class AChallenge 
{
	public static int[] checkIntersection(LinkedList A, LinkedList B)
	{
		int[] returnVal = new int[2];
		
		for(int i = 0; i < A.size(); i++)
		{
			if(B.contains(A.get(i)))
			{
				returnVal[0] = i;
				returnVal[1] = B.indexOf(A.get(i));
				return returnVal;
			}
		}
		
		return null;
	}
}
