package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt10 {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);

		System.out.println("Nhap gia tri x = ");
		int x = Integer.parseInt(scan.nextLine());

		tinhTrungBinhCong(a, x);
		

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

	public static void tinhTrungBinhCong(int a[], int x) {
		float TBC = 0;
		int sum = 0;
		int count = 0;
		System.out.println("Cac so thoa dieu kien ( >" + x + " ) : = ");
		for (int item : a) {
			if (item > x) {
				System.out.print(item + " \t");
				sum += item;
				count++;

			}
		}
		if (count == 0) {
			System.out.println("Khong co so thoa dieu kien. Ngung chuong trinh.");
		} else {
			TBC =  (float) sum / count;
			System.out.println("\n");
			System.out.println("Trung binh cong cua cac so trong mang la: " + TBC);
		}

		System.out.println("\n");
		
	}

}
