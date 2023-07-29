package De2;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		QLNC ds  = new QLNC();
		ds.nhap(new Manager("ACD", "Lan Anh", LocalDate.of(2023,8,8), 40, 50));
		ds.nhap( new Programer("ACD", "Hoang", LocalDate.of(2023,8,6), 30, 40, 40));
		ds.nhap(new Designer("DFG", "Nguyen A", LocalDate.of(2022,6,8), 05, 40, 60));
		ds.nhap(new Tester("FDGS", "Le B", LocalDate.of(2002,7,8), 30, 40, 340));
		ds.xuat();
		ds.tinhTongTienNV();
		
	
	}

}
