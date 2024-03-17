package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import view.BangTuanHoanView;

public class BangTuanHoanMouseController implements MouseListener{

	private BangTuanHoanView bangTuanHoanView;
	public BangTuanHoanMouseController(BangTuanHoanView bangTuanHoanView) {
		this.bangTuanHoanView = bangTuanHoanView;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		for(Map.Entry<String, JButton> entry : this.bangTuanHoanView.buttonsHashMap.entrySet()) {
////			entry.getValue().setBorder(null);
////			entry.getValue().setBorder(null);
			entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
			entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
		}
		if(e.getSource() == this.bangTuanHoanView.xemThuocTinhLabel) {
			if(this.bangTuanHoanView.xemThuocTinhLabel.getText().equals("Xem đặc tính")) {;
				this.bangTuanHoanView.xemThuocTinhLabel.setText("Thoát");
				this.bangTuanHoanView.xemThuocTinhLabel.setBackground(Color.decode("#ff5c40"));
			}
			else {
				this.bangTuanHoanView.xemThuocTinhLabel.setText("Xem đặc tính");
				this.bangTuanHoanView.xemThuocTinhLabel.setBackground(new Color(0, 255, 128));
				
				this.bangTuanHoanView.printInfoDacTinhLabel.setText("");
				this.bangTuanHoanView.printInfoDacTinhLabel.setBackground(null);
			}
			
		}
		else {
			this.bangTuanHoanView.printInfoDacTinhLabel.setText("");
			this.bangTuanHoanView.printInfoDacTinhLabel.setBackground(null);
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
