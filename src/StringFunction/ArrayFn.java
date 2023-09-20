package StringFunction;

import java.util.Arrays;

public class ArrayFn {

	public static void main(String[] args) {
		
		//Array
		//datatype variable name[]= new datatype[length];
		
		int a[] = new int[5];
		int b;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[4]=5;
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(b = a.length);
		
		for(int n =0; n<a.length;n++)
		{
			System.out.println(a[n]);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
