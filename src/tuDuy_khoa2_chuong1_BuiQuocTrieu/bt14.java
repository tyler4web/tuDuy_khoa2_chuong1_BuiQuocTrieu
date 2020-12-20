package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt14 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n, scan);
//		int a[] = taoMangRanDom(n);
		xuatMang(a);
		
		int b[] = xoaCacSoChinhPhuong(a);
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

	public static int timCacSoChinhPhuong(int a[]) {
		int count = 0;
		for (int pt : a) {
			if (Math.sqrt((float) (pt)) == (int) Math.sqrt(pt)) {
				count++;
			}
		}
		return count;
	}

	public static int[] xoaCacSoChinhPhuong(int a[]) {
		int count = timCacSoChinhPhuong(a);
		if (count > 0) {
			int b[] = new int[a.length - count];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (Math.sqrt((float) (a[i])) != (int) Math.sqrt(a[i])) {
					b[j++] = a[i];
				}
			}
			a = b;

		} else {
			System.out.println("Khong co so chinh phuong trong mang.");
		}
		
		return a;
	}

}
