import java.util.Scanner;	//Java����

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java����
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
        int number = sc.nextInt();
		
		find(number);
	}
	
	public static int zhishu(int x) {
		int flag = 1;
		for(int i = 2; i < x; i++) {
			if(x%i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1)	return x;
		else 			return 0;
	}
	
	public static void find(int n) {
		if(zhishu(n) != 0) {
			System.out.println(n);
		}
		else {
			int i;
			for(i = 2; zhishu(i) == 0 || n % i != 0; i++) ;
			System.out.print(i+"*");
			find(n/i);
		}
	}
}
