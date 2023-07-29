package De1;

import java.time.LocalDate;

public class GiangVien extends NhanVien{
	private double soTietDay; 
	private double soDeTaiKL;
	
	public double getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(double soTietDay) {
		this.soTietDay = soTietDay;
	}
	public double getSoDeTaiKL() {
		return soDeTaiKL;
	}
	public void setSoDeTaiKL(double soDeTaiKL) {
		this.soDeTaiKL = soDeTaiKL;
	}
	public GiangVien(String maNV, String hoTen, LocalDate ngaySinh, double soTietDay, double soDeTaiKL) {
		super(maNV, hoTen, ngaySinh);
		this.soTietDay = soTietDay;
		this.soDeTaiKL = soDeTaiKL;
	}
	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiangVien(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	}
	
	
	public String LDTienTien() {
		if (soTietDay>=300 && soDeTaiKL >=5) {
			return "La lao dong tien tien ";
		} else {
			return "khong La lao dong tien tien ";
		}
	}
	@Override
	public String toString() {
		return "GiangVien [soTietDay=" + soTietDay + ", soDeTaiKL=" + soDeTaiKL + ", LDTienTien()=" + LDTienTien()
				+ ", getMaNV()=" + getMaNV() + ", getHoTen()=" + getHoTen() + ", getNgaySinh()=" + getNgaySinh() + "]";
	}
	
	

}
