package De2;

import java.util.ArrayList;
import java.util.Iterator;

public class QLNC {
	ArrayList<NhanVien> ds;

	public QLNC() {
		ds = new ArrayList<>();
	} 
	
	
	public boolean nhap(NhanVien data) {
		for(NhanVien nv : ds)
			if(data.getMaNV().equals(nv.getMaNV())) {
				System.out.println("Ma nhan vien bi trung");
				return false;
	}
	ds.add(data);
	System.out.println("Them thanh cong");
	return true;
	}
	
	
	
	public void xuat() {
		System.out.println("\nDanh sach nhan  vien: ");
		
		for(NhanVien nv : ds)
		System.out.println(nv);
		
	}




}
