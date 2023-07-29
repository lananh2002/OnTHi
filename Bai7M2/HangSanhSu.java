package Bai7M2;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
    private String nhaSX;
    private LocalDate ngayNhapKho;

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        if (!nhaSX.trim().equals("")) {
            this.nhaSX = nhaSX;
        } else {
            System.out.println("nha SX khong duoc bo trong");
        }
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        LocalDate currentDate = LocalDate.now();
        if (ngayNhapKho.isBefore(currentDate)) {
            this.ngayNhapKho = currentDate;
        } else {
            this.ngayNhapKho = ngayNhapKho;
        }
    }

    public HangSanhSu(String maHang, String tenHang, double donGia, double soLuongTon, String nhaSX,
            LocalDate ngayNhapKho) {
        super(maHang, tenHang, donGia, soLuongTon);
        setNhaSX(nhaSX);
        setNgayNhapKho(ngayNhapKho);
    }

    public HangSanhSu() {
        super();
        LocalDate currentDate = LocalDate.now();
        this.ngayNhapKho = currentDate;
    }

    public HangSanhSu(String maHang, String tenHang, double donGia, double soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        LocalDate currentDate = LocalDate.now();
        this.ngayNhapKho = currentDate;
    }

    public String DinhGia() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateTenDaysAgo = currentDate.minusDays(10);

        if (getSoLuongTon() > 50 && getNgayNhapKho().isBefore(dateTenDaysAgo)) {
            return "Bán chậm";
        } else {
            return "Không bán chậm";
        }
    }

	@Override
	public String toString() {
		return "HangSanhSu [nhaSX=" + nhaSX + ", ngayNhapKho=" + ngayNhapKho + ", DinhGia()=" + DinhGia()
				+ ", getMaHang()=" + getMaHang() + ", getTenHang()=" + getTenHang() + ", getDonGia()=" + getDonGia()
				+ ", getSoLuongTon()=" + getSoLuongTon() + "]";
	}


	
    

    
}
