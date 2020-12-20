package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt12 {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		a = xoaAllSoAm(a);
		xuatMang(a);
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

	public static int timCacSoAm(int a[]) {
		int count = 0;
		for (int pt : a) {
			if (pt < 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] xoaAllSoAm(int a[]) {
		int count = timCacSoAm(a);
		if (count > 0) {
			int b[] = new int[a.length - count];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > 0) {
					b[j++] = a[i];
				}
			}
			a = b;
		} else {
			System.out.println("Mảng không có giá tị âm");
		}
		return a;
	}

}
