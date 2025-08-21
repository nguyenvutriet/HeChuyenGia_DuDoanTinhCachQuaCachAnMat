package mypack;

import java.util.Scanner;

public class DuDoanTinhCach {
	public static void main(String[] args) {
		// tập luật (cơ sở tri thức)
		String[][] tapLuat = {
				{"áo sơ mi trắng", "tinh tế"},
				{"áo đen", "nghiêm túc và bí ẩn"},
				{"quần dài", "chuyên nghiệp và cẩn trọng"},
				{"giày thể thao", "năng động và thích phiêu lưu"},
				{"quần đùi", "phóng khoáng"}
		};
		String thoiTrang;
		
		// Nhập thông tin 
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập phong cách thời trang của bạn (nhập 0 để xác nhận thoát)");
			
			thoiTrang = sc.nextLine().toLowerCase();
			
			if(!thoiTrang.equals("0")) {
				// Bắt đầu suy diễn
				String tinhCach = duDoan(thoiTrang, tapLuat);
				System.out.println("Tính cách: " + tinhCach);
			}	
		}while(!thoiTrang.equals("0"));
		System.out.println("đã ngừng dự đoán!");
		
	}
	public static String duDoan(String thoiTrang, String[][] tapLuat) {
		String tinhCach = "Không tìm thấy";
		for(int i = 0; i < tapLuat.length; i++) {
			if(thoiTrang.equals(tapLuat[i][0])) {
				tinhCach = tapLuat[i][1];
				break;
			}
		}
		return tinhCach;
	}
}
