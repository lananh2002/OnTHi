package De1;

import java.time.LocalDate;

public class NhanVienVP extends NhanVien{
	private double soLopBD; 
	private double soGioLD;
	public double getSoLopBD() {
		return soLopBD;
	}
	public void setSoLopBD(double soLopBD) {
		this.soLopBD = soLopBD;
	}
	public double getSoGioLD() {
		return soGioLD;
	}
	public void setSoGioLD(double soGioLD) {
		this.soGioLD = soGioLD;
	}
	public NhanVienVP(String maNV, String hoTen, LocalDate ngaySinh, double soLopBD, double soGioLD) {
		super(maNV, hoTen, ngaySinh);
		this.soLopBD = soLopBD;
		this.soGioLD = soGioLD;
	}
	public NhanVienVP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVienVP(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	} 
	
	public String LDTienTien() {
		if (soLopBD>=1 && soGioLD >=20) {
			return "La lao dong tien tien ";
		} else {
			return "Khong la lao dong tien tien";
		}
	}
	
	@Override
	public String toString() {
		return "NhanVienVP [soLopBD=" + soLopBD + ", soGioLD=" + soGioLD + ", LDTienTien()=" + LDTienTien()
				+ ", getMaNV()=" + getMaNV() + ", getHoTen()=" + getHoTen() + ", getNgaySinh()=" + getNgaySinh() + "]";
	}
	
	
}
