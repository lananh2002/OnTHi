package De2;

import java.time.LocalDate;

public class Designer extends NhanVien{
	private double Bonus;

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designer(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		// TODO Auto-generated constructor stub
	}

	public Designer(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan, double bonus) {
		super(maNV, tenNV, ngaySinh, hetSoLuong, luongCoBan);
		Bonus = bonus;
	} 
	
	public double tinhTien() {
		return getLuongCoBan()* getHetSoLuong()*Bonus;
				}

	@Override
	public String toString() {
		return "Designer [Bonus=" + Bonus + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()="
				+ getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getHetSoLuong()=" + getHetSoLuong()
				+ ", getLuongCoBan()=" + getLuongCoBan() + "]";
	}
	
	
	
	
	
}
