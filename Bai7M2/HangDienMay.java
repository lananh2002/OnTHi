package Bai7M2;

public class HangDienMay extends HangHoa{
	private double thoiGianBH;
	private double congSuat;
	
	
	public double getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(double thoiGianBH) {
		if (thoiGianBH >= 0) {
			this.thoiGianBH = thoiGianBH;	
		} else {
			System.out.println("Thoi gian BH phai lon hon 0");
		}
		
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		if (congSuat >= 0) {
			this.congSuat = congSuat;
		} else {
			System.out.println("Cong suat lon hon 0");
		}
		
	}
	public HangDienMay(String maHang, String tenHang, double donGia, double soLuongTon, double thoiGianBH,
			double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBH(thoiGianBH);
		setCongSuat(congSuat);
	}
	public HangDienMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangDienMay(String maHang, String tenHang, double donGia, double soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	
	public String DinhGia() {
		if (getSoLuongTon()>3) {
			return "Ban duoc";
		} else {
			return "khong ban duoc";
		}
	}
	@Override
	public String toString() {
		return "HangDienMay [thoiGianBH=" + thoiGianBH + ", congSuat=" + congSuat + ", DinhGia()=" + DinhGia()
				+ ", getMaHang()=" + getMaHang() + ", getTenHang()=" + getTenHang() + ", getDonGia()=" + getDonGia()
				+ ", getSoLuongTon()=" + getSoLuongTon() + "]";
	}
	
	
	
	
	
}
