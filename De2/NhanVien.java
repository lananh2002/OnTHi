package De2;

import java.time.LocalDate;

public class NhanVien {
	private String maNV; 
	private String tenNV; 
	private LocalDate ngaySinh; 
	private double hetSoLuong; 
	private double luongCoBan;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getHetSoLuong() {
		return hetSoLuong;
	}
	public void setHetSoLuong(double hetSoLuong) {
		this.hetSoLuong = hetSoLuong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public NhanVien(String maNV, String tenNV, LocalDate ngaySinh, double hetSoLuong, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaySinh = ngaySinh;
		this.hetSoLuong = hetSoLuong;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	

}
