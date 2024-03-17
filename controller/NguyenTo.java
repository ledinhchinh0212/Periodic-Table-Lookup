package controller;


public class NguyenTo {
	private String thuocTinh;
	private int soHieuNguyenTu;
	private double nguyenTuKhoiTrungBinh;
	private double doAmDien;
	private String cauHinhElectron;
	private String soOxiHoa;
	private String tenNguyenTo;
	private String kiHieuHoaHoc;
	
	public NguyenTo() {}
	
	public NguyenTo(String kiHieuHoaHoc, String tenNguyenTo, double nguyenTuKhoiTrungBinh,
			double doAmDien, String cauHinhElectron, String soOxiHoa, String thuocTinh, int soHieuNguyenTu) {
		
		this.thuocTinh = thuocTinh;
		this.soHieuNguyenTu = soHieuNguyenTu;
		this.nguyenTuKhoiTrungBinh = nguyenTuKhoiTrungBinh;
		this.doAmDien = doAmDien;
		this.cauHinhElectron = cauHinhElectron;
		this.soOxiHoa = soOxiHoa;
		this.tenNguyenTo = tenNguyenTo;
		this.kiHieuHoaHoc = kiHieuHoaHoc;
		
	}

	public String getThuocTinh() {
		return thuocTinh;
	}

	public void setThuocTinh(String thuocTinh) {
		this.thuocTinh = thuocTinh;
	}

	public int getSoHieuNguyenTu() {
		return soHieuNguyenTu;
	}

	public void setSoHieuNguyenTu(int soHieuNguyenTu) {
		this.soHieuNguyenTu = soHieuNguyenTu;
	}

	public double getNguyenTuKhoiTrungBinh() {
		return nguyenTuKhoiTrungBinh;
	}

	public void setNguyenTuKhoiTrungBinh(double nguyenTuKhoiTrungBinh) {
		this.nguyenTuKhoiTrungBinh = nguyenTuKhoiTrungBinh;
	}

	public double getDoAmDien() {
		return doAmDien;
	}

	public void setDoAmDien(double doAmDien) {
		this.doAmDien = doAmDien;
	}

	public String getCauHinhElectron() {
		return cauHinhElectron;
	}

	public void setCauHinhElectron(String cauHinhElectron) {
		this.cauHinhElectron = cauHinhElectron;
	}

	public String getSoOxiHoa() {
		return soOxiHoa;
	}

	public void setSoOxiHoa(String soOxiHoa) {
		this.soOxiHoa = soOxiHoa;
	}

	public String getTenNguyenTo() {
		return tenNguyenTo;
	}

	public void setTenNguyenTo(String tenNguyenTo) {
		this.tenNguyenTo = tenNguyenTo;
	}

	public String getKiHieuHoaHoc() {
		return kiHieuHoaHoc;
	}

	public void setKiHieuHoaHoc(String kiHieuHoaHoc) {
		this.kiHieuHoaHoc = kiHieuHoaHoc;
	}
	
}
