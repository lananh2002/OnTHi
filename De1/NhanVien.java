package De1;

import java.time.LocalDate;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private LocalDate ngaySinh;
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public NhanVien(String maNV, String hoTen, LocalDate ngaySinh) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

}
