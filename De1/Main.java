package De1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GiangVien giangVien = new GiangVien("ACCS", "Lan Anh", LocalDate.of(2023,9,5), 300, 30);
		System.out.println(giangVien);
		System.out.println("Giang vien 1 : "+giangVien.LDTienTien());
		
		
		NghienCuuVien cuuVien = new NghienCuuVien("SAX", "Hoang", LocalDate.of(2023,1,20), 02, 02);
		System.out.println(cuuVien);
		System.out.println("NHan vien nghien cuu 1 : " +cuuVien.LDTienTien());
		
		NhanVienVP nhanVienVP = new NhanVienVP("DSSD", "Nguyen A", LocalDate.of(2023,10,21), 0, 30);
		System.out.println(nhanVienVP);
		System.out.println("Nhan vien VP 1 : " + nhanVienVP.LDTienTien());
		
		
	}

}
