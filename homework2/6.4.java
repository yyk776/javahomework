package homework;

//6.4 反序显示一个整数
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
	}
	
	public static void reverse(int number) {
		String str = number + "";
		char[] number1 = str.toCharArray();
        String n = "";
		for (int i = number1.length - 1; i >= 0; i--) {
			n=n+number1[i];
		}
		int number2 = Integer.parseInt(n);
		System.out.println("反序数为" + number2);
		}

}
