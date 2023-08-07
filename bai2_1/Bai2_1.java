package bai2_1;

import java.util.Scanner;

public class Bai2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
		int t = n-2;
		while(t>0)
		{
			for(int i=1;i<=n; i++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==n)
				{
					System.out.print("*");
					break;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			--t;
		}
		for(int i =1; i<=n; i++)
		{
			System.out.print("*");
		}
	}
}
