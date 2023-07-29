package Bai7M2;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private String nhaCC;
    private LocalDate ngaySX;
    private LocalDate ngayHH;

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        if (!nhaCC.trim().equals("")) {
            this.nhaCC = nhaCC;
        } else {
            System.out.println("Khong de trong");
        }
    }

    public LocalDate getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(LocalDate ngaySX) {
        LocalDate currentDate = LocalDate.now();
        if (ngaySX.isBefore(currentDate)) {
            this.ngaySX = currentDate;
        } else {
            this.ngaySX = ngaySX;
        }
    }

    public LocalDate getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(LocalDate ngayHH) {
        LocalDate currentDate = LocalDate.now();
        if (ngayHH.isAfter(currentDate)) {
            this.ngayHH = ngayHH;
        } else {
            this.ngayHH = currentDate;
        }
    }

    public HangThucPham(String maHang, String tenHang, double donGia, double soLuongTon, String nhaCC, LocalDate ngaySX,
            LocalDate ngayHH) {
        super(maHang, tenHang, donGia, soLuongTon);
        setNhaCC(nhaCC);
        setNgaySX(ngaySX);
        setNgayHH(ngayHH);
    }

    public HangThucPham() {
        super();
        LocalDate currentDate = LocalDate.now();
        this.ngaySX = currentDate;
        this.ngayHH = currentDate;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, double soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        LocalDate currentDate = LocalDate.now();
        this.ngaySX = currentDate;
        this.ngayHH = currentDate;
    }

    public String DinhGia() {
        LocalDate currentDate = LocalDate.now();
        if (getSoLuongTon() > 0) {
            if (currentDate.isBefore(getNgayHH())) {
                return "Có khả năng bán";
            } else {
                return "Hết hạn, không thể bán";
            }
        } else {
            return "Hết hàng, không thể bán";
        }
    }

	@Override
	public String toString() {
		return "HangThucPham [nhaCC=" + nhaCC + ", ngaySX=" + ngaySX + ", ngayHH=" + ngayHH + ", DinhGia()=" + DinhGia()
				+ ", getMaHang()=" + getMaHang() + ", getTenHang()=" + getTenHang() + ", getDonGia()=" + getDonGia()
				+ ", getSoLuongTon()=" + getSoLuongTon() + "]";
	}

	
	
    
    
}
