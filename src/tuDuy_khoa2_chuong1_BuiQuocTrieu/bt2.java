package tuDuy_khoa2_chuong1_BuiQuocTrieu;

import java.util.Scanner;

public class bt2 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n, scan);
//		int a[] = taoMangRanDom(n);
		xuatMang(a);

		lietKeGTcoKCMin(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhap n > 1 = ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
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

	public static int timKCMin(int a[]) {
		int kcMin = Math.abs(a[0] - a[1]);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (kcMin > Math.abs(a[i] - a[j])) {
					kcMin = Math.abs(a[i] - a[j]);
				}
			}
		}
		return kcMin;
	}

	public static void lietKeGTcoKCMin(int a[]) {
		int kcMin = timKCMin(a);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (kcMin == Math.abs(a[i] - a[j])) {

					System.out.println("Cap so gan nhau nhat la " + a[i] + " va " + a[j]);

				}

			}
		}
	}

}
