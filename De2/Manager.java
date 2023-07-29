package De2;

import java.time.LocalDate;

public class Manager extends NhanVien{

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		// TODO Auto-generated constructor stub
	}

	public double tinhTien() {
		return getHetSoLuong() * getLuongCoBan();
	}

	@Override
	public String toString() {
		return "Manager [tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()=" + getTenNV()
				+ ", getNgaySinh()=" + getNgaySinh() + ", getHetSoLuong()=" + getHetSoLuong() + ", getLuongCoBan()="
				+ getLuongCoBan() + "]";
	}

	
}
