package Bai7M2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Sản phẩm 1: Hàng hết hạn, không thể bán
        HangThucPham hangThucPham = new HangThucPham("ASC", "GHF", 0, 0, "SADV", LocalDate.of(2023, 7, 7), LocalDate.of(2023, 5, 7));
        System.out.println("Sản phẩm 1: " + hangThucPham.DinhGia());

        // Sản phẩm 2: Có khả năng bán
        HangThucPham hangThucPham1 = new HangThucPham("ASC", "GHF", 40, 50, "SADV", LocalDate.of(2023, 7, 7), LocalDate.of(2023, 9, 7));
        System.out.println("Sản phẩm 2: " + hangThucPham1.DinhGia());
        
        //SP 1 : Bán được 
		HangDienMay dienMay = new HangDienMay("ACCD", "Lan Anh", 90, 10, 04, 60);
		System.out.println("Sản Pham 1: " + dienMay.DinhGia()+"\n");

		
		//SP2 : Khong bán được 
		HangDienMay dienMay1 = new HangDienMay("ACCD", "Lan Anh", 90, 1, 04, 60);
		System.out.println("Sản Pham 2: " +dienMay1.DinhGia()+"\n");
		
		// Tạo một sản phẩm HangSanhSu với số lượng tồn lớn hơn 50 và thời gian lưu kho trước 10 ngày.
		HangSanhSu hangSanhSu1 = new HangSanhSu("ABC", "XYZ", 100, 60, "CompanyA", LocalDate.of(2023, 7, 17));
		System.out.println("Sản phẩm 1: " + hangSanhSu1.DinhGia()); // Kết quả: "Sản phẩm 1: Bán chậm"

		// Tạo một sản phẩm HangSanhSu với số lượng tồn nhỏ hơn hoặc bằng 50 hoặc thời gian lưu kho sau 10 ngày.
		HangSanhSu hangSanhSu2 = new HangSanhSu("DEF", "LMN", 30, 40, "CompanyB", LocalDate.of(2023, 7, 07));
		System.out.println("Sản phẩm 2: " + hangSanhSu2.DinhGia()); // Kết quả: "Sản phẩm 2: Không bán chậm"


	}

}
