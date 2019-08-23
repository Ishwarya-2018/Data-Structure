package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.datastructure.util.Utility;

public class Balansed_Parenthsis {
		public static void main(String[] args) {
			
			Utility util=new Utility();
			Scanner scan=new Scanner(System.in);
			char search;
			System.out.println("enter the expression");
			String input=scan.next();
			for (int i = 0; i < input.length(); i++) {
				search = input.charAt(i);// picking one on one element
				if (search == '(' || search == '[' || search == '{') 
				{
					util.stack.push(search);// pushing the element to stack object
				} else if (search == ')' || search == ']' || search == '}') 
				{
					util.stack.pop();// removing the element from stack object
				}
			}
			if(util.stack.isEmpty()==true)
			{
				System.out.println("the expression is having a balanced parentheses");
			}else
			{
				System.out.println("the expression is not having a balanced parentheses");
			}
			scan.close();
		}

	}


