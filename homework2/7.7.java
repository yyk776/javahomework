package homework;

//7.7统计个位数的数目

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=dom(100);
		for (int i =0; i<10 ;i++) {			
			System.out.println(i+"出现的次数为"+b[i]);    
	    }
	}
	public  static int[] dom(int n)  {
		int a[]= {0,0,0,0,0,0,0,0,0,0};
		System.out.println("生成随机数如下");
		for (int i = 0 ; i<n ; i++) {
			int r=(int)(10*Math.random());
			System.out.print(r+" ");
			a[r]=a[r]+1;
		}
		System.out.println();
		return a;	
	}
		
}


