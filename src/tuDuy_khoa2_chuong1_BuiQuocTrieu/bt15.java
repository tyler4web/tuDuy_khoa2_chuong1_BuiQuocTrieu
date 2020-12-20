package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt15 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		int b[] = xoayPhai(a, scan);
		xuatMang(b);

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

	public static int[] xoayPhai(int a[], Scanner scan) {
		int k;
		int tam;

		do {
			System.out.println("Nhap k tu 1 den " + a.length + " = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);

		k = k % a.length;

		for (int i = 0; i < k; i++) {
			// tam bien tam luu a[cuoi cung]
			tam = a[a.length - 1];

			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}

			a[0] = tam;
		}

		return a;
	}

}
