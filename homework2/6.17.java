package homework;
// 6.17显示0和1构成的矩阵
import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		printMatrix(a);
    
	}
	
	public static void printMatrix(int n) {
		for (int i = 0 ; i < n; i++) {
			printLine(n);
			System.out.println();
		}
	
	}
	public static void printLine(int n) {
		for (int i = 0 ; i < n; i++) {
			System.out.print((int)(2*Math.random())+" ");
		}
		
	}

}
