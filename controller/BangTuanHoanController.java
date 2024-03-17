package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import view.BangTuanHoanView;

public class BangTuanHoanController implements ActionListener{
	
	private BangTuanHoanView bangTuanHoanView;
	private ArrayList<String> kimloaiKiem;
	private ArrayList<String> kimloaiKiemTho;
	private ArrayList<String> phiKim;
	private ArrayList<String> kimLoaiHauChuyenTiep;
	private ArrayList<String> aKim;
	private ArrayList<String> khiHiem;
	private ArrayList<String> actini;
	private ArrayList<String> lantan;
	private ArrayList<String> dacTinhKhongXacDinh;
	private ArrayList<String> kimLoaiChuyenTiep;
	public boolean dacTinhON = false;
	public BangTuanHoanController(BangTuanHoanView bangTuanHoanView) {
		kimLoaiChuyenTiep = new ArrayList<String>();
		dacTinhKhongXacDinh = new ArrayList<String>();
		lantan = new ArrayList<String>();
		actini = new ArrayList<String>();
		khiHiem = new ArrayList<String>();
		aKim = new ArrayList<String>();
		kimLoaiHauChuyenTiep = new ArrayList<String>();
		kimloaiKiem = new ArrayList<String>();
		kimloaiKiemTho = new ArrayList<String>();
		phiKim = new ArrayList<String>();
		this.bangTuanHoanView = bangTuanHoanView;
		khoiTaoDacTinhNguyenTo();
	}

	
	public void khoiTaoDacTinhNguyenTo() {
		// kim loại kiềm
		kimloaiKiem.add("Natri");
		kimloaiKiem.add("Kali");
		kimloaiKiem.add("Rubidi");
		kimloaiKiem.add("Xesi");
		kimloaiKiem.add("Franxi");
		kimloaiKiem.add("Liti");
		// kim loại kiềm thổ
		kimloaiKiemTho.add("Beri");
		kimloaiKiemTho.add("Magie");
		kimloaiKiemTho.add("Canxi");
		kimloaiKiemTho.add("Stronti");
		kimloaiKiemTho.add("Bari");
		kimloaiKiemTho.add("Radi");
		// phi kim
		phiKim.add("Hidro");
		phiKim.add("Cacbon");
		phiKim.add("Nito");
		phiKim.add("Oxi");
		phiKim.add("Flo");
		phiKim.add("Clo");
		phiKim.add("S");
		phiKim.add("Photpho");
		phiKim.add("Selen");
		phiKim.add("Brom");
		phiKim.add("Iot");
		// kim loại hậu chuyển tiếp
		kimLoaiHauChuyenTiep.add("Al");
		kimLoaiHauChuyenTiep.add("Gali");
		kimLoaiHauChuyenTiep.add("Indi");
		kimLoaiHauChuyenTiep.add("Tali");
		kimLoaiHauChuyenTiep.add("Sn");
		kimLoaiHauChuyenTiep.add("Pb");
		kimLoaiHauChuyenTiep.add("Bitmut");
		kimLoaiHauChuyenTiep.add("Poloni");
		kimLoaiHauChuyenTiep.add("Atatin");
		// Á kim
		aKim.add("Silic");
		aKim.add("Gemani");
		aKim.add("Silic");
		aKim.add("Asen");
		aKim.add("Telu");
		aKim.add("Stibi");
		aKim.add("Bo");
		// khí hiếm
		khiHiem.add("Heli");
		khiHiem.add("Neon");
		khiHiem.add("Agon");
		khiHiem.add("Kripton");
		khiHiem.add("Xenon");
		khiHiem.add("Radon");
		// Actini
		actini.add("Actini");
		actini.add("Thori");
		actini.add("Protactini");
		actini.add("Urani");
		actini.add("Neptuni");
		actini.add("Plutoni");
		actini.add("Amerixi");
		actini.add("Curi");
		actini.add("Beckeli");
		actini.add("Califoni");
		actini.add("Ensteni");
		actini.add("Fecmi");
		actini.add("Mendelevi");
		actini.add("Nobeli");
		actini.add("Lorenxi");
		// Lantan
		lantan.add("Lantan");
		lantan.add("Xeri");
		lantan.add("Prazeodim");
		lantan.add("Neodim");
		lantan.add("Prometi");
		lantan.add("Samari");
		lantan.add("Europi");
		lantan.add("Gadolini");
		lantan.add("Tebi");
		lantan.add("Diprozi");
		lantan.add("Honmi");
		lantan.add("Eribi");
		lantan.add("Tuli");
		lantan.add("Ytecbi");
		lantan.add("Lutexi");
		// Đặc tính không xác định
		dacTinhKhongXacDinh.add("Meitneri");
		dacTinhKhongXacDinh.add("Darmastati");
		dacTinhKhongXacDinh.add("Roentgeni");
		dacTinhKhongXacDinh.add("Copenixi");
		dacTinhKhongXacDinh.add("Ununtri");
		dacTinhKhongXacDinh.add("Flerovi");
		dacTinhKhongXacDinh.add("Ununpenti");
		dacTinhKhongXacDinh.add("Livemori");
		// Kim loại chuyển tiếp
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(this.bangTuanHoanView.xemThuocTinhLabel.getText().equals("Thoát")) {
			this.dacTinhON = true;
		}
		else {
			this.dacTinhON = false;
		}
		if(this.dacTinhON) {
			
			for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
				String temp = entry.getKey();
				if(!kimloaiKiem.contains(temp) && !kimloaiKiemTho.contains(temp) && !phiKim.contains(temp) &&
						!kimLoaiHauChuyenTiep.contains(temp) && !aKim.contains(temp) &&
						!khiHiem.contains(temp) && !actini.contains(temp) && !lantan.contains(temp) &&
						!dacTinhKhongXacDinh.contains(temp)) {
					kimLoaiChuyenTiep.add(temp);
					System.out.println(temp);
				}
			}
			lietKeDacTinhButton(e);
		}
		// search
		// search
		for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
			if(e.getSource() == entry.getValue()) {
				for(NguyenTo nguyento : this.bangTuanHoanView.danhSachNguyenTo) {
					if(entry.getKey().equals(nguyento.getTenNguyenTo())) {
						inThongTinNguyenTo(nguyento);
						break;
					}
				}
			}
		}
	}
	
	public void lietKeDacTinhButtonsPlus(ActionEvent e, String parttern) {
		for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
			String temp = entry.getKey();
			if(parttern.equalsIgnoreCase(temp)) {
				if(kimloaiKiem.contains(temp)){
					enableDacTinhButton(kimloaiKiem);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại kiềm");
				}
				if(kimloaiKiemTho.contains(temp)) {
					enableDacTinhButton(kimloaiKiemTho);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại kiềm thổ");
				}
				if(phiKim.contains(temp)){
					enableDacTinhButton(phiKim);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Phi kim");
				}
				if(kimLoaiHauChuyenTiep.contains(temp)) {
					enableDacTinhButton(kimLoaiHauChuyenTiep);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại hậu chuyển tiếp");
				}
				if(aKim.contains(temp)) {
					enableDacTinhButton(aKim);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Á kim");
				}
				if(khiHiem.contains(temp)) {
					enableDacTinhButton(khiHiem);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Khí hiếm");
				}
				if(actini.contains(temp)) {
					enableDacTinhButton(actini);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Actini");
				}
				if(lantan.contains(temp)) {
					enableDacTinhButton(lantan);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Lantan");
				}
				if(dacTinhKhongXacDinh.contains(temp)) {
					enableDacTinhButton(dacTinhKhongXacDinh);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Đặc tính không xác định");
				}
				if(kimLoaiChuyenTiep.contains(temp)) {
					enableDacTinhButton(kimLoaiChuyenTiep);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại chuyển tiếp");
				}
				this.bangTuanHoanView.printInfoDacTinhLabel.setBackground(Color.white);
				this.bangTuanHoanView.printInfoDacTinhLabel.setOpaque(true);
			}
		}
	}
	
	public void lietKeDacTinhButton(ActionEvent e) {
		for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
			String temp = entry.getKey();
			if(e.getSource() == entry.getValue()) {
				if(kimloaiKiem.contains(temp)){
					enableDacTinhButton(kimloaiKiem);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại kiềm");
				}
				if(kimloaiKiemTho.contains(temp)) {
					enableDacTinhButton(kimloaiKiemTho);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại kiềm thổ");
				}
				if(phiKim.contains(temp)){
					enableDacTinhButton(phiKim);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Phi kim");
				}
				if(kimLoaiHauChuyenTiep.contains(temp)) {
					enableDacTinhButton(kimLoaiHauChuyenTiep);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại hậu chuyển tiếp");
				}
				if(aKim.contains(temp)) {
					enableDacTinhButton(aKim);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Á kim");
				}
				if(khiHiem.contains(temp)) {
					enableDacTinhButton(khiHiem);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Khí hiếm");
				}
				if(actini.contains(temp)) {
					enableDacTinhButton(actini);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Actini");
				}
				if(lantan.contains(temp)) {
					enableDacTinhButton(lantan);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Lantan");
				}
				if(dacTinhKhongXacDinh.contains(temp)) {
					enableDacTinhButton(dacTinhKhongXacDinh);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Đặc tính không xác định");
				}
				if(kimLoaiChuyenTiep.contains(temp)) {
					enableDacTinhButton(kimLoaiChuyenTiep);
					this.bangTuanHoanView.printInfoDacTinhLabel.setText("Kim loại chuyển tiếp");
				}
				this.bangTuanHoanView.printInfoDacTinhLabel.setBackground(Color.white);
				this.bangTuanHoanView.printInfoDacTinhLabel.setOpaque(true);
			}
		}
	}
	
	public void enableDacTinhButton(ArrayList<String> list) {
		for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
			String temp = entry.getKey();
			if(list.contains(temp)) {
				entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 2));
				entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 2));
			}
			else {
				entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
				entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
			}
		}
	}
	
	public void inThongTinNguyenTo(NguyenTo nt) {
		bangTuanHoanView.soHieuNguyenTuLabel.setText(nt.getSoHieuNguyenTu() + "");
		bangTuanHoanView.nguyenTuKhoiTrungBinhLabel.setText(nt.getNguyenTuKhoiTrungBinh() + "");
		bangTuanHoanView.kiHieuNguyenToLabel.setText(nt.getKiHieuHoaHoc());
		
		String cmp = Double.toString(nt.getDoAmDien());
		if(cmp.equals("200.0")) {
			bangTuanHoanView.doAmDienLabel.setText("");
		}
		else bangTuanHoanView.doAmDienLabel.setText(nt.getDoAmDien() + "");
		
		bangTuanHoanView.tenNguyenToLabel.setText(nt.getTenNguyenTo());
		bangTuanHoanView.cauHinhElectronLabel.setText(nt.getCauHinhElectron());
		bangTuanHoanView.soOxiHoaLabel.setText(nt.getSoOxiHoa());
		bangTuanHoanView.nhapKhongHopLeInfoLabel.setText("");
		
		// around()
		
		bangTuanHoanView.labelInfo1.setText("Số hiệu nguyên tử");
		bangTuanHoanView.labelInfo2.setText("Kí hiệu hoá học");
		bangTuanHoanView.labelInfo3.setText("Tên nguyên tố");
		bangTuanHoanView.labelInfo4.setText("Nguyên tử khối trung bình");
		bangTuanHoanView.LabelInfo5.setText("Độ âm điện");
		bangTuanHoanView.LabelInfo6.setText("Cấu hình electron");
		bangTuanHoanView.labelInfo7.setText("Số oxi hoá");
		
		bangTuanHoanView.panelScreen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		bangTuanHoanView.soOxiHoaLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		bangTuanHoanView.panelScreen.setBackground(Color.yellow);
		bangTuanHoanView.soOxiHoaLabel.setBackground(Color.white);
		bangTuanHoanView.soOxiHoaLabel.setOpaque(true);
	}
	
}
