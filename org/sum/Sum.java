package org.sum;

public class Sum {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	Double average;
	//a= new int[10];
	for (int number:a) 
	{
		sum+=number;
	}
System.out.println("Sum "+sum);
	int arrayLength=a.length;
	
	average=((double)sum/arrayLength);
	
	System.out.println("Average  " +average);
}
}
