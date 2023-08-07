package bai2_1;
import java.util.Scanner;
class Bai2_5 {
	 public static int sum(int a, int b, int c){
	        int res = 0;
	        for(int i = a; i > 0; i--){
	            if(b >= i * 2 && c >= i * 4){
	                res = 7 * i;
	                break;
	            }
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Chanh: ");
	        int a = sc.nextInt();
	        System.out.print("Tao: ");
	        int b = sc.nextInt();
	        System.out.print("le: ");
	        int c = sc.nextInt();
	        System.out.println(sum(a, b, c));
	    }
}
