package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt1 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n, scan);
		xuatMang(a);

		boolean co3k = timVaLietKeDang3k(a);

		if (!co3k) {
			System.out.println("0");
			System.out.println("Mang khong co gia tri 3^k");
		}

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhap n > 0 = ");
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

	public static boolean kTraDang3k(int x) {
		boolean dang3k = true;
		if (x <= 1) {
			dang3k = false;
		}
		while (x > 1) {
			if (x % 3 != 0) {
				dang3k = false;
			}
			x /= 3;
		}
		return dang3k;
	}

	public static boolean timVaLietKeDang3k(int a[]) {
		System.out.println("Dạng 3^k gồm có: ");
		boolean co3K = false;
		for (int pt : a) {
			if (kTraDang3k(pt)) {
				System.out.print(pt + "\t");
				co3K = true;
			}
		}

		return co3K;

	}

}
