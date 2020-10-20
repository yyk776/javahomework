package homework;

//8.2求矩阵主对角线元素的和

import java.util.Scanner;

public class Major {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
		};
		System.out.println("请一行行输入一个4*4的矩阵");
		for(int i = 0; i<4 ; i++) {
			Scanner input = new Scanner (System.in);
			for (int j = 0 ;j <4; j++) {				
				a[i][j] = input.nextInt();					
			}
		}
		sum(a);
	}
	
	
    public static void sum(int a[][]) {
    	int sum = 0;
    	for (int i = 0 ; i<4 ; i++) {
    		sum += a[i][i]; 
    	}
    	System.out.print("对角线的和为" + sum);
    }
}
