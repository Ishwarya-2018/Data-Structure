package com.bridgelabz.datastructure;
import java.util.Scanner;
public class WeekDay {
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter th date in form(dd,mm,yyyy)");
		int day=dayofweek(sc.nextInt(),sc.nextInt(),sc.nextInt());
		if(day==1) {System.out.println("Monday");}
		else if(day==2) {System.out.println("Tuesday");}
		else if(day==3) {System.out.println("Wednesday");}
		else if(day==4) {System.out.println("Thursday");}
		else if(day==5) {System.out.println("Friday");}
		else if(day==6) {System.out.println("Saturday");}
		else {System.out.println("Sunday");}
		}finally {
		if(sc!=null)
		       sc.close();
		}
		}
		static int dayofweek(int d, int m, int y) //Sakamoto's methods
		{ 
		   int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
		   y -= (m < 3) ? 1 : 0; 
		   return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
		} 
		}






