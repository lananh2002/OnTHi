package De2;

import java.time.LocalDate;

public class Tester extends NhanVien{
	private double Error;

	public double getError() {
		return Error;
	}

	public void setError(double error) {
		Error = error;
	}

	public Tester(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan, double error) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		Error = error;
	}

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tester(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		// TODO Auto-generated constructor stub
	}
	
	public double tinhTien() {
		return getHetSoLuong()*getLuongCoBan()*Error*200000;
	}

	@Override
	public String toString() {
		return "Tester [Error=" + Error + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()="
				+ getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getHetSoLuong()=" + getHetSoLuong()
				+ ", getLuongCoBan()=" + getLuongCoBan() + "]";
	}
	
	
	
}
