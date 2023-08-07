package bai2_1;

import java.util.Scanner;

class Bai2_2 {
	public static double phanso(double n)
	{
		if(n==1)
			return 1;
		else
			return 1/n + 1/phanso(n-1);
	}

	public static long giaiThua (int n)
	{
//		if(n==1)
//			return 1;
//		
//		else
//			return n * giaiThua(n-1);
		long res = 0;
        long tmp = 1;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            res += tmp;
        }
        return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		System.out.println("Tong phan so: " + phanso(n));
		System.out.println(n + "! = " + giaiThua(n));
	}

}
