import java.util.Scanner;	//Java输入

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//分解质因数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
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
			System.out.println(n);		//如果其本身就是质数，则直接输出
		}
		else {
			int i;
			for(i = 2; zhishu(i) == 0 || n % i != 0; i++) ;	//从2开始寻找一个 既是质数又可以将该整数整除的整数i。
			System.out.print(i+"*");
			find(n/i);					//将该整数分解
		}
	}
}
