package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt7 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		int tong = tinhTongSoThoaDK(a);
		System.out.println("Tong cac so thoa dieu kien la: " + tong);

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

	public static boolean kiemTraSoHangChuc(int x) {
		boolean soChucla5 = false;
		x = Math.abs(x);
		while (x != 0 && x > 10) {
			if (x / 10 == 5) {
				soChucla5 = true;
			}
			x = x / 10;
		}

		return soChucla5;
	}

	public static int tinhTongSoThoaDK(int a[]) {
		int tong = 0;
		boolean thoaDk = false;
		for (int pt : a) {
			if (kiemTraSoHangChuc(pt)) {
				System.out.print(pt + "\t");
				tong = tong + pt;
				thoaDk = true;

			}
		}

		System.out.println("\n");

		if (thoaDk == false) {
			System.out.println("Khong co so thoa dieu kien so hang chuc la 5 trong mang.");
		}
		return tong;

	}

}
