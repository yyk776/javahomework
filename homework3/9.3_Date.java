package homework;

public class Date {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time = {10000, 100000, 1000000, 10000000, 100000000, 1000000000};
		long[] timel = {10000000000L,  100000000000L};
		for(int i = 0 ; i < time.length; i++) {
			java.util.Date date = new java.util.Date(time[i]);
			System.out.println("流逝时间为"+time[i]+"的日期为"+date);
		}
		for(int i = 0 ; i < timel.length; i++) {
			java.util.Date date = new java.util.Date(timel[i]);
			System.out.println("流逝时间为"+timel[i]+"的日期为"+date);
		}

	}

}
