package com.bridgelabz.datastructure.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Day in Calender
public class Utility {
	public static int dayincalender(int d, int m, int y) {
		int y0 =y - (14 - m) / 12;							//gives year
		int x =y0 + y0/4 - y0/100 + y0/400;					//gives prime value
		int m0 = m + 12 * ((14 - m) / 12) - 2;				//gives month
		int d0 = (d + x + (31*m0)/12) % 7;					//gives the value between 0-6
		return d0;
	} 
	


//   Guess Number
	
public static int search(int lo, int hi) {
	// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	int x;
	if(hi-lo==1) {
		
	
		return lo;						//return value
	}
	int mid=lo+(hi-lo)/2;				// calculating mid
	System.out.println("is it less than "+mid);
	System.out.println("enter 1 or 0");
	x=scan.nextInt();
	if(x==1)											
		{
		return search(lo,mid);
		}
		else {
			return search(mid,hi);
		}	}

//  unordered list using linked list
  
	public Scanner scan=new Scanner(System.in);
	
	static public class Node<T>{							//to create a new node
		 T data;
		 Node next;
	}
	@SuppressWarnings("rawtypes")
	public static class linkedlist<T>
	{
		 Node head;									//creating head node
		public int size=0;
		
		
		/**
		 * to add elements to linked list
		 * 
		 * @param data 
		 */
		 @SuppressWarnings("unchecked")
		public void add(T data)
		 {
			 Node node=new Node();				//new node creation
			 node.data=data;					//value is assigned to node
			 node.next=null;
			 if(head==null)						//if head has no value enter the node
			 {
				 head=node;						//assigning value to head
				 size++;
			 }
			 else
			 {
				 
				 Node n=head;					//new node to traversal
				 while(n.next!=null)			//loop for finding last node
				 {
					 n=n.next;
				 }
				 n.next=node;					//assigning link to previous to current new node
				 size++;
			 }
		 }
		 
		  /**
			 *method to display the data 
			 * 
			 * 
			 */
		 public void show()
		 {
			 Node node=head;					//to iteration 
			 while(node!=null)
			 {
				 System.out.println(node.data);
				 node=node.next;
			 }
			 
		 }
		 public void writeToFile(String address1) throws IOException
		  {
			  File file=new File(address1);
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
			  Node node=head;					//to iteration 
				 while(node!=null)
				 {
					 System.out.println("writing to file "+node.data);
					 bw.write((String) node.data);
					 bw.newLine();
					 bw.flush();
					 node=node.next;
				 }
		  }
		  
		   
		 	/**
			 * to search the element in the list
	
			 * @param key
			 * returns true if found or false if it is not found
			 */
		 
		 
		 		public boolean search(T key) 			//method to search
		 {
			 Node node=head;					
			 while(node.next!=null)					//iteration
			 {
				if((node.data).equals(key)==true)
				{
					return true;
					
				}
				else
				{
					node=node.next;					//if element is not the word to iterate
				}
				 
			 }
			 	 return false;
			 }
		 		
		 
		 		/**
				 * 
				 * to remove specified element from list
				 * @param key
				 */
		 		
		 @SuppressWarnings("unchecked")
		 		public void delete(T key)				//method to delete the element
		 {
			 Node x=head;
			 Node y=head.next;
			
			 
			 while(x.next!=null)
			 {
				 if(head.data.equals(key))       //checking wether first element is same or not
				 {
					 System.out.println("the deleted element is "+head.data);
					 head=head.next;
					 size--;
					break; 
				 }
				 if(y.data.equals(key)==true&&y.next==null)	//if the element is last deleting last node
				 {
					 System.out.println("the deleted item is "+y.data);
					 x.next=null;
					 size--;
					 break;
				 }
				 if(y.data.equals(key)==true)		// else other node contains data delete it 
				 {
					 System.out.println("the deleted item is "+y.data);
					 size--;
					 x.next=y.next;
					 break;
				 }
				 else
					 
				 {
					 x=x.next;
					 y=y.next;
				 }
				 
			 }
		 }
		 
		 @SuppressWarnings("unchecked")
		 		void insert(int index,T value)
		 {
			 Node node=new Node();
			 Node n=head;
			 node.data=value;
			 node.next=null;
			 
			 for (int i = 0; i < index; i++)
			 {
				n=n.next;
			 }
			 node.next=n.next;
			 n.next=node;
			 size++;
		 }
		  @SuppressWarnings("unchecked")
		  		String pop()
		  {
			Node n;
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=null;
			String s1=(String)n.data;
			return s1;
			  
		  }
		  
		  @SuppressWarnings("unchecked")
		  	String pop(int pos)
		  {
			  Node n;
				Node y;
				n=head;
				y=n.next;
			  String res;
			  if(pos==1)
				{
					res=head.data.toString();
					head.next=head.next;
					
					return res;
				}
			  
			  if(pos<size-1)
		  {
			
			for (int i = 0; i < pos-1; i++) {
				n=n.next;
				y=y.next;
			}
			res=y.data.toString();
			n.next=y.next;
			return res;
			}
			 return null;
		  }
		  int size()
			 {
				 return size;
			 }
		  
		  boolean isempty()
		  {
			  
			  if(size()==0)				//in head node contains 0 it is empty
			  {
				  return true;
			  }else
				  return false;
		  }
		 
		 
		 
		 
		 public void file(String address1)						// to display the list
			{
				
				 Node node=head;					//to iteration 
				 while(node!=null)
				 {
					 printinfile((String)node.data,address1);		//sending word to file
					 node=node.next;						//to iterate next node
				 }
			} 
		 
		 public String readfile(String address)		//reads the content of file 
		 {
			 String data="";

				try {
				 FileReader fr=new FileReader(address);
				BufferedReader br=new BufferedReader(fr); 
				String line=br.readLine();					//to read a whole line
				while(line != null)
				{
					data+=line;
					line=br.readLine();
				}
				br.close();
				fr.close();
				}
				
				catch(Exception e)
				{
					System.out.println("exception catched in catch");
				}
			 return data;
		 }
		 public void printinfile(String s,String address1)			//method to print the result to file
		 {
			
			 boolean h=true;
				try
				{
					File f=new File(address1);
				FileWriter fw=new FileWriter(f,h);
						
				 BufferedWriter r=new BufferedWriter(fw);
				 
					
				
				 r.write(s);
				 r.newLine();
				 r.flush();
				 
				
				 r.close();
				 fw.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		 }
		

}
	
	@SuppressWarnings("rawtypes")
	public
	linkedlist ll1=new linkedlist();
	
	 
	//Simple Balanced Parentheses
	 
	public class Stack<T>{
		@SuppressWarnings("rawtypes")
		Node top;
		
		int size=0;
		@SuppressWarnings("hiding")
		public class Node<T>{
			T data;
			@SuppressWarnings("rawtypes")
			Node next;
		}
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public void push(T data)
		{
			
			Node node=new Node<T>(); // creating new node 
			node.data=data; // assigning value to node
			node.next=null; // assigning value to next field
			if(top==null)
			{
				top=node;
				
				size++;
			}
			else {
			node.next=top;
			top=node;
			
			size++;}
		
		}
		public void peek()

		{
			if (size == 0) {
				System.out.println("  is empty");
			} else {
				@SuppressWarnings("rawtypes")
				Node n = top; // assigning top value to n
				
				System.out.println(n.data); // printing last element
			}

		}
		public boolean isEmpty()
		
		{
			if(size == 0) // comparing if top is null if its is null it is empty
			{
				
				return true; 
			}
				return false;
		}
		
		public int size()
		
		{
			return size; // return size
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
		public T pop() {
			
			if (size == 0) // checking condition wheather top is null are not
			{
				System.out.println("invalid expression ");
				System.exit(0);

			}
			Node n=top;
			T res=(T) top.data;
			top=top.next;
			size--;
			return res;
		}

	}
	
	public Stack<Character> stack=new Stack<Character>();
	
	
	// <---------------------------------------------------------------------------------------------->
	
	
	 
	 
//Prime2DArray and Anagram

public int[] prime()
{	
	int count;
	int value=0;
	int[] arr1=new int[168];
	for (int i = 2; i < 1000; i++) {
		count=0;
		for (int j = 2; j <1000; j++) {
			
		
		if(i%j==0)
		{
			count++;
		}
		}
		if(count==1)
		{
		 arr1[value]=i;
		 value++;
		}
	}
	return arr1;
}


public  static int[] anagram(int[] arr)
{
int[] anagram= new int[56];
int rev=0;
int copy=0;
int no=0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
	no=arr[j];
	rev=0;
	while(no>0)
	{
		rev = rev*10;
		rev = rev+no%10;
		no=no/10;
	}
	if(arr[i]==rev)
	{
		anagram[copy++]=arr[i];
	}	
}
return anagram;
}
return anagram;
}
}





	  