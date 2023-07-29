package Bai7M2;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLHH ds = new QLHH(); 
		ds.nhap(new HangDienMay("ACCD", "Lan Anh", 90, 10, 04, 60));
		ds.nhap(new HangDienMay("DCD", " Anh", 90, 10, 04, 60));
		ds.nhap(new HangThucPham("BCED", "Hoang", 0, 0, "SADV", LocalDate.of(2023, 7, 7), LocalDate.of(2023, 5, 7)));
		ds.nhap(new HangSanhSu("ABC", "Ngo", 100, 60, "CompanyA", LocalDate.of(2023, 7, 17)));
		
//		ds.xuat();
	 
		
//		//IN TỪNG LOẠI HÀNG HÓA 
//		ds.inHangHoaTheoLoai("Lan Anh");
		
		
		
		//Tìm kiếm hàng hóa khi biết mã hàng 
		String maHangToSearch = "ABC"; 
		HangHoa foundHangHoa = ds.timHangHoaTheoMa(maHangToSearch);

		if (foundHangHoa != null) {
		    System.out.println("Hang hoa tim thay: " + foundHangHoa);
		} else {
		    System.out.println("Khong tim thay hang hoa co MaHang: " + maHangToSearch);
		}
		
		
		 System.out.println("\n"+"Danh sach trước khi  sap xep "+"\n");
		ds.xuat(); // in ds trước khi sắp xếp 
		 System.out.println("\n"+"Danh sach sap xep tăng dan theo tenHang"+"\n");
		ds.sapXepHangHoaTheoTenTangDan(); // sắp xếp
		ds.xuat(); //in ds đã sắp xếp 
	
		 System.out.println("\n"+"Danh sach sap xep giam dan theo tenHang"+"\n");
		ds.sapXepHangHoaTheoTenGiamDan();
		ds.xuat();
	}

}
