package bai2_1;

import java.util.Scanner;

class Bai2_3 {
	public static boolean ktraSNT(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		if (ktraSNT(n) == true) {
			System.out.println(n + " la so nguyen to");
		} else
			System.out.println(n + " khong phai so nguyen to");
	}
}
