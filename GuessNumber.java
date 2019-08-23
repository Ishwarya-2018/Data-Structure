package com.bridgelabz.datastructure;
import java.util.Scanner;

import com.bridgelabz.datastructure.util.Utility;
 
public class GuessNumber {
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n ");
			int n=sc.nextInt();
			int num=(int)Math.pow(2, n);
			int secret=Utility.search(0,num);
			System.out.println(secret);
			sc.close();
		}

		
						
			
		}


