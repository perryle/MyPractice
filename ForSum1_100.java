package Practice;

public class ForSum1_100 {
	public static void main(String[] args) {
		/*
		 * ��Ŀ������1~100��������֮��
		 */
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			a = a + i;
			
		}
		System.out.println("100������������֮�͵��ڣ� " + a);
		/*
		 * ��Ŀ����100��������ż����
		 */
		int b = 0;
		for (int i = 0; i <= 100; i=i+2) {
			b = b + i;
		}
		System.out.println("100��������ż��֮�͵��ڣ� " + b);
		/*
		 * ��Ŀ����100��������������
		 */
		int c = 0;
		for (int i = 1; i <= 100; i=i + 2) {
			c = c + i;
		}
		System.out.println("100������������֮�͵��ڣ� " + c);
	}

}
