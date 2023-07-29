package Bai7M2;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private double soLuongTon;
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;	
		} else {
			System.out.println("Ma hang Khong de trong ");
		}
		
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals("")) {
			this.tenHang = tenHang;	
		} else {
			System.out.println("Ten Hang Khong de trong ");
		}
		
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if (donGia>=0) {
			this.donGia = donGia;	
		} else {
			System.out.println("Don Gia Lon hon 0");
		}
	
	}
	public double getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(double soLuongTon) {
		if (soLuongTon>=0) {
			this.soLuongTon = soLuongTon;	
		} else {
			System.out.println("So  luong ton Phai lon hon hoac = 0 ");
		}
	
	}
	public HangHoa(String maHang, String tenHang, double donGia, double soLuongTon) {
		super();
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
