package LAB1;

import java.util.Scanner;

public class HinhTamGiac {
//	Bài 1. Viết chương trình nhập vào 3 cạnh của một tam giác, 
//	sau đó in ra màn hình chu vi và diện tích của tam giác đó.
	
//	Tạo đối tượng TamGiac có các thuộc tính lần lượt là 3 cạnh a,b,c
	public int a;
	public int b;
	public int c;
	
//Tạo công thức tính chu vi
	public int tinhChuvi() {
		int chuvi = this.a+this.b+this.c;
		return chuvi;
	}

//Tạo công thức tính diện tích
		public int tinhDientich() {
			float p = (a+b+c)/2;
			float m = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
			return (int) m;
			
		}	
// Sử dụng Scanner nhập 3 cạnh tam giác
		public static void main(String[] args) {
			HinhTamGiac o = new HinhTamGiac();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Nhap vao canh a: ");
			int a1 = scanner.nextInt();
			o.a = a1;
			
			System.out.print("Nhap vao canh b: ");
			int b1 = scanner.nextInt();
			o.b = b1;
			
			System.out.print("Nhap vao canh c: ");
			int c1 = scanner.nextInt();
			o.c = c1;
			
			int chuvi = o.tinhChuvi();
			int dientich = o.tinhDientich();
			System.out.println("Chu vi hinh tam giac = "+ chuvi);
			System.out.println("Dien tich hinh tam giac = "+ dientich);
		}
}
