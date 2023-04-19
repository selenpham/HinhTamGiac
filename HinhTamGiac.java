package LAB1;

import java.util.Scanner;

public class HinhTamGiac {
//	Bài 1. Viết chương trình nhập vào 3 cạnh của một tam giác, 
//	sau đó in ra màn hình chu vi và diện tích của tam giác đó.
	
//	Tạo đối tượng TamGiac có các thuộc tính lần lượt là 3 cạnh a,b,c
	public int a;
	public int b;
	public int c;
// Tạo công thức tính chu vi	
	public int tinhChuvi() {
		int chuvi = this.a + this.b + this.c;
		return chuvi;
	}
// Tạo công thức tính diện tích	
	public int tinhDientich() {
		float p = (a + b + c) / 2;
		float m = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return (int) m;	
	}
	
	public static void main(String[] args) {
		HinhTamGiac o = new HinhTamGiac();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
// Dùng vòng lặp để lập liên tiếp, ấn E thì thoát vòng lặp		
		while (!exit) {
			try {
				System.out.print("Nhap vao canh a (hoac nhap E de thoat): ");
				String aInput = scanner.nextLine();
				
				if (aInput.equalsIgnoreCase("E")) {
					exit = true;
					break;
				}
				
				o.a = Integer.parseInt(aInput);
				
				System.out.print("Nhap vao canh b: ");
				o.b = Integer.parseInt(scanner.nextLine());

				System.out.print("Nhap vao canh c: ");
				o.c = Integer.parseInt(scanner.nextLine());
				
				int chuvi = o.tinhChuvi();
				int dientich = o.tinhDientich();
				System.out.println("Chu vi hinh tam giac = " + chuvi);
				System.out.println("Dien tich hinh tam giac = " + dientich);
			} catch (NumberFormatException ex) {
				System.out.println("Vui long nhap gia tri so hoac E de thoat!");
			}
		}
		System.out.println("Chuong trinh da thoat.");
	}
}
