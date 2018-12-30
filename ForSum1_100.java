package Practice;

public class ForSum1_100 {
	public static void main(String[] args) {
		/*
		 * 题目：计算1~100所有数字之和
		 */
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			a = a + i;
			
		}
		System.out.println("100以内所有数字之和等于： " + a);
		/*
		 * 题目：求100以内所有偶数和
		 */
		int b = 0;
		for (int i = 0; i <= 100; i=i+2) {
			b = b + i;
		}
		System.out.println("100以内所有偶数之和等于： " + b);
		/*
		 * 题目：求100以内所有奇数和
		 */
		int c = 0;
		for (int i = 1; i <= 100; i=i + 2) {
			c = c + i;
		}
		System.out.println("100以内所有奇数之和等于： " + c);
	}

}
