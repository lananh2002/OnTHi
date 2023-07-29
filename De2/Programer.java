package De2;

import java.time.LocalDate;

public class Programer extends NhanVien{
	private double overtime;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public Programer(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan,
			double overtime) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		this.overtime = overtime;
	}

	public Programer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programer(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		// TODO Auto-generated constructor stub
	} 
	
	
	public double tinhTien() {
		return getHetSoLuong()*getLuongCoBan()*overtime;
	}

	@Override
	public String toString() {
		return "Programer [overtime=" + overtime + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV()
				+ ", getTenNV()=" + getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getHetSoLuong()="
				+ getHetSoLuong() + ", getLuongCoBan()=" + getLuongCoBan() + "]";
	}
	
}
