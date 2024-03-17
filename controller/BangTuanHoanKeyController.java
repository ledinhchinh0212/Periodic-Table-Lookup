package controller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.border.LineBorder;

import view.BangTuanHoanView;

public class BangTuanHoanKeyController implements KeyListener{
	private BangTuanHoanView bangTuanHoanView;
	
	public BangTuanHoanKeyController(BangTuanHoanView bangTuanHoanView) {
		this.bangTuanHoanView = bangTuanHoanView;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_ENTER) {
			boolean found = false;
			String temp = bangTuanHoanView.fieldInformation.getText();
			for(NguyenTo nt : this.bangTuanHoanView.danhSachNguyenTo) {
				
				if(nt.getKiHieuHoaHoc().equalsIgnoreCase(temp) || nt.getTenNguyenTo().equalsIgnoreCase(temp)) {
					//System.out.println("Yes");
					found = true;
					inThongTinNguyenTo(nt);
					
				}
				
			}
			if(!found) {
				bangTuanHoanView.nhapKhongHopLeInfoLabel.setText("Nhập không hợp lệ");
			}
			else {
				bangTuanHoanView.nhapKhongHopLeInfoLabel.setText("");
			}
			
			if(bangTuanHoanView.fieldInformation.getText().isEmpty()) {
				bangTuanHoanView.nhapKhongHopLeInfoLabel.setText("");
			}			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
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
