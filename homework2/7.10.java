package homework;

//7.10找出最小元素下标

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {0,0,0,0,0,0,0,0,0,0};
		for (int i=0;i<10;i++) {
		    System.out.println("请输入第"+(i+1)+"个整数");
		    Scanner input=new Scanner(System.in);
		    arr1[i]=input.nextInt();
		}
		int index = find(arr1);
		System.out.println("最小的数字的下标为"+ index);
		
			
			
		

	}
	public static int find(int a[]) {
		int b = 0, c = 1;
		while ( c <= 9) {
			if (a[b]<=a[c]) {
				c+=1;
			}
			else {
				b=c;
				c+=1;	
			}
		}
		return b;
	}
}
