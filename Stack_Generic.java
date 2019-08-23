package com.bridgelabz.datastructure;

public class Stack_Generic<T> // <T> the type of the value stored in this Stack_Generic
{
	int size;
	StackElement<T> top;

	public Stack_Generic() {
		size = 0;
		top = null;
	}
public void push(T newvalue)
{
	StackElement<T> newElement = new StackElement<T>(newvalue,top);
			top = newElement;
	size++;
}
public T pop()
{
	StackElement<T> oldTop = top;
	if(oldTop == null)
	{
		return null;
	}
	top = top.getNext();
	return oldTop.getValue();
}
public T peek()
{
	if(size==0)
	{
		return null;
	}
	return top.getValue();
}
public void empty()
{
	size=0;
	top=null;
}
public static void main(String[] args) {
	Stack_Generic<String> myStringStack = new Stack_Generic<String>();
	myStringStack.push("Java");
	myStringStack.push("Developer");
	System.out.println(myStringStack.peek());
	System.out.println(myStringStack.peek());
	System.out.println(myStringStack.pop());
	System.out.println(myStringStack.pop());
	
}
	

}