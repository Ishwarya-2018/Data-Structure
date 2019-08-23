package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.util.Utility;
import com.bridgelabz.datastructure.util.Utility.Stack;

public class Prime_Stack {
	public static void main(String[] args) {
		Utility util = new Utility();
		Stack<Integer> st = util.new Stack<Integer>();
		int[] arr=util.prime();
		int[] anag=util.anagram(arr);
		for(int i=0;i<arr.length;i++)
		{
		st.push(arr[i]);
		}
		int size=st.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(st.pop());
		}
		}
		
		
	}


