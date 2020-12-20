package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt4 {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		System.out.println("Cac so co toan la so le.");
		liteKeSoLe(a);

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

	public static boolean kiemTraToanSoLe(int x) {
		boolean laLe = true;
		x = Math.abs(x);
		int soDangTach = 0;

		while (x != 0) {
			soDangTach = x % 10;
			if (soDangTach % 2 == 0) {
				laLe = false;
			}
			x = x / 10;
		}

		return laLe;

	}

	public static void liteKeSoLe(int a[]) {
		int count = 0;
		for (int item : a) {
			if (kiemTraToanSoLe(item)) {
				System.out.print(item + "\t");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Mang Khong Co So Toan So Le.");
		}

	}

}
