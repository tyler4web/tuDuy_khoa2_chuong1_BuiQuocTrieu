package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt16 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);
		int b[] = demPhanTuGiongNhau(a);
		int indexMax = timIndexMax(b);
		int indexMin = timIndexMin(b);
		System.out.println("Phần tử xuất hiện nhiều nhất: " + a[indexMax] + "[" + b[indexMax] + " lần]");
		System.out.println("Phần tử xuất hiện ít nhất: " + a[indexMin] + "[" + b[indexMin] + " lần]");

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

	public static int[] demPhanTuGiongNhau(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}


	public static int timIndexMax(int b[]) {
		int indexMax = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > b[indexMax]) {
				indexMax = i;
			}
		}
		return indexMax;
	}
	
	public static int timIndexMin(int b[]) {
		int indexMin = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				if (b[i] < b[indexMin]) {
					indexMin = i;
				}
			}
		}
		return indexMin;
	}
	

}
