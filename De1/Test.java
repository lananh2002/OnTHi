package De1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNV ds = new QLNV();
		
		ds.nhap(new GiangVien("ACCS", "Lan Anh", LocalDate.of(2023,9,5), 300, 30));
		ds.nhap(new GiangVien("ACCS", "Lan Anh", LocalDate.of(2023,9,5), 300, 30));
		ds.nhap(new NghienCuuVien("SAX", "Hoang", LocalDate.of(2023,1,20), 02, 02));
		ds.nhap(new NhanVienVP("DSSD", "Nguyen A", LocalDate.of(2023,10,21), 0, 30));
		
		ds.xuat();
	}

}
