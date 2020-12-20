package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt3 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		lietKeSoChan(a, scan);

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

	public static void lietKeSoChan(int a[], Scanner scan) {
		boolean flag = false;
		System.out.println("Nhap gia tri duoi");
		int duoi = Integer.parseInt(scan.nextLine());

		System.out.println("Nhap gia tri tren");
		int tren = Integer.parseInt(scan.nextLine());
		System.out.println("Cac so chan nam trong doan [" + duoi + "," + tren + "]");
		for (int item : a) {

			if (item >= duoi && item <= tren && item % 2 == 0) {
				flag = true;
				System.out.print(item + " ");
			}
		}
		if (flag == false) {
			System.out.println("Khong co so thoa dieu kien");
		}
	}

}
