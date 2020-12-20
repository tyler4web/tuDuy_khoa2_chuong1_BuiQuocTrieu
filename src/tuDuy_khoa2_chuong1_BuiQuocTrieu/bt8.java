package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt8 {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);
		int sum = tinhTong(a);
		System.out.println("Tong cac gia tri lon hon tri tuyet doi cua gia tri dung lien sau no: " + sum);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap so phan tu n (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static int[] taoMangRanDom(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static int tinhTong(int a[]) {
		int sum = 0;
		System.out.println("Cac so thoa dieu kien: ");
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > Math.abs(a[i + 1])) {
				sum += a[i];

				System.out.print(a[i] + "\t");
			}

		}

		System.out.println("\n");
		return sum;
	}

}
