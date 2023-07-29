package De1;

import java.time.LocalDate;

public class NghienCuuVien extends NhanVien{
	private double soDeTaiNC; 
	private double soBaiBaoKH;
	public double getSoDeTaiNC() {
		return soDeTaiNC;
	}
	public void setSoDeTaiNC(double soDeTaiNC) {
		this.soDeTaiNC = soDeTaiNC;
	}
	public double getSoBaiBaoKH() {
		return soBaiBaoKH;
	}
	public void setSoBaiBaoKH(double soBaiBaoKH) {
		this.soBaiBaoKH = soBaiBaoKH;
	}
	public NghienCuuVien(String maNV, String hoTen, LocalDate ngaySinh, double soDeTaiNC, double soBaiBaoKH) {
		super(maNV, hoTen, ngaySinh);
		this.soDeTaiNC = soDeTaiNC;
		this.soBaiBaoKH = soBaiBaoKH;
	}
	public NghienCuuVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NghienCuuVien(String maNV, String hoTen, LocalDate ngaySinh) {
		super(maNV, hoTen, ngaySinh);
		// TODO Auto-generated constructor stub
	}
	
	
	public String LDTienTien() {
		if (soBaiBaoKH >=2 && soDeTaiNC >=1) {
			return "La Lao dong tien tien ";
		} else {
			return " khong la lao dong tien tien";
		}
	}
	@Override
	public String toString() {
		return "NghienCuuVien [soDeTaiNC=" + soDeTaiNC + ", soBaiBaoKH=" + soBaiBaoKH + ", LDTienTien()=" + LDTienTien()
				+ ", getMaNV()=" + getMaNV() + ", getHoTen()=" + getHoTen() + ", getNgaySinh()=" + getNgaySinh() + "]";
	}
	
	
	
}
