package De1;

import java.util.ArrayList;


public class QLNV {
	
	ArrayList<NhanVien> ds;

	public QLNV() {
		ds = new ArrayList<>();
	}
	
	public boolean nhap(NhanVien data) {
		for(NhanVien nv : ds)
			if (data.getMaNV().equals(nv.getMaNV())) {
				System.out.println("Ma trung");
				return false;
			}
		ds.add(data);
		System.out.println("Them thanh cong");
		return true;
	}

	public void xuat() {
	for(NhanVien nv : ds)
		System.out.println(nv);
	}
	}



