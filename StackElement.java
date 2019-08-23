package com.bridgelabz.datastructure;

public class StackElement<T> 
{
	T value;
	StackElement<T> next;
	StackElement(T value,StackElement<T> next)
	{
this.value = value;
this.next = next;
	}
	public StackElement<T> getNext()
	{
		return next;
	}
	public T getValue()
	{
		return value;
	}
}
