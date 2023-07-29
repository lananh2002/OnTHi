package Bai7M2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class QLHH {
	ArrayList<HangHoa> ds;

	public QLHH() {
		ds = new ArrayList<>();
	}
	
	public boolean nhap(HangHoa data) {
		for(HangHoa hh : ds)
			if(data.getMaHang().equals(hh.getMaHang())) {
				System.out.println("Ma Hang bi trung");
				return false;
			}
	
	ds.add(data); 
	System.out.println("Them Thanh Cong");
	return true;
	}
	
	public void xuat() {
		
		for(HangHoa hh : ds)
			System.out.println(hh);
	}
	
	 public void inHangHoaTheoLoai(String loai) {
	        System.out.println("\nDanh sach hang hoa loai " + loai + ":");
	        for (HangHoa hh : ds) {
	            if (hh.getMaHang().equalsIgnoreCase(loai)) {
	                System.out.println(hh);
	            }
	        }
	    }
	
	 
	 public HangHoa timHangHoaTheoMa(String maHang) {
	        for (HangHoa hh : ds) {
	            if (hh.getMaHang().equalsIgnoreCase(maHang)) {
	                return hh;
	            }
	        }
	        return null; 
	    }
	 
	 
	 public void sapXepHangHoaTheoTenTangDan() {
	        Comparator<HangHoa> tenHangHoaComparator = new Comparator<HangHoa>() {
	        	@Override
	            public int compare(HangHoa hh1, HangHoa hh2) {
	                return hh1.getTenHang().compareTo(hh2.getTenHang());
	            }
	        };

	        Collections.sort(ds, tenHangHoaComparator);
	       
	    }
	 
	  public void sapXepHangHoaTheoTenGiamDan() {
	        // Create a custom Comparator to compare HangHoa objects by TenHangHoa in reverse order
	        Comparator<HangHoa> tenHangHoaComparator = new Comparator<HangHoa>() {
	            @Override
	            public int compare(HangHoa hh1, HangHoa hh2) {
	                return hh2.getTenHang().compareTo(hh1.getTenHang());
	            }
	        };

	        // Sort the list using the custom comparator
	        Collections.sort(ds, tenHangHoaComparator);
	    }

}
