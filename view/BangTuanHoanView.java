package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BangTuanHoanController;
import controller.BangTuanHoanKeyController;
import controller.BangTuanHoanMouseController;
import controller.NguyenTo;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class BangTuanHoanView extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public HashMap<String, JButton> buttonsHashMap;
	public JButton Hidro;
	public JButton Liti;
	public JButton Natri;
	public JButton Kali;
	public JButton Rubidi;
	public JButton Xesi;
	public JButton Franxi;
	public JButton Radi;
	public JButton Actini;
	public JButton Dupni;
	public JButton Siboqi;
	public JButton Bori;
	public JButton Hasi;
	public JButton Meitneri;
	public JButton Darmastati;
	public JButton Roentgeni;
	public JButton Copenixi;
	public JButton Ununtri;
	public JButton Flerovi;
	public JButton Ununpenti;
	public JButton Rozofodi;
	public JButton Livemori;
	public JButton Radon;
	public JButton Xenon;
	public JButton Kripton;
	public JButton Agon;
	public JButton Neon;
	public JButton Heli;
	public JButton Bari;
	public JButton Lantan;
	public JButton Beri;
	public JButton Magie;
	public JButton Canxi;
	public JButton Stronti;
	public JButton Scandi;
	public JButton Ytri;
	public JButton Titan;
	public JButton Ziriconi;
	public JButton Vanadi;
	public JButton Niobi;
	public JButton Tantan;
	public JButton Vonfam;
	public JButton Molipden;
	public JButton Crom;
	public JButton Mangan;
	public JButton Tecnexi;
	public JButton Reni;
	public JButton Osimi;
	public JButton Ruteni;
	public JButton Fe;
	public JButton Coban;
	public JButton Rodi;
	public JButton Iridi;
	public JButton Platin;
	public JButton Paladi;
	public JButton Niken;
	public JButton Cu;
	public JButton Ag;
	public JButton Au;
	public JButton Hg;
	public JButton Cadimi;
	public JButton Zn;
	public JButton Tali;
	public JButton Indi;
	public JButton Gali;
	public JButton Pb;
	public JButton Sn;
	public JButton Gemani;
	public JButton Bitmut;
	public JButton Stibi;
	public JButton Asen;
	public JButton Selen;
	public JButton Telu;
	public JButton Poloni;
	public JButton Atatin;
	public JButton Iot;
	public JButton Brom;
	public JButton Clo;
	public JButton S;
	public JButton Photpho;
	public JButton Silic;
	public JButton Al;
	public JButton Bo;
	public JButton Cacbon;
	public JButton Nito;
	public JButton Oxi;
	public JButton Flo;
	public JButton Thori;
	public JButton Xeri;
	public JButton Prazeodim;
	public JButton Protactini;
	public JButton Neodim;
	public JButton Urani;
	public JButton Prometi;
	public JButton Neptuni;
	public JButton Samari;
	public JButton Plutoni;
	public JButton Europi;
	public JButton Amerixi;
	public JButton Gadolini;
	public JButton Beckeli;
	public JButton Tebi;
	public JButton Califoni;
	public JButton Diprozi;
	public JButton Ensteni;
	public JButton Honmi;
	public JButton Eribi;
	public JButton Fecmi;
	public JButton Tuli;
	public JButton Mendelevi;
	public JButton Ytecbi;
	public JButton Nobeli;
	public JButton Lutexi;
	public JButton Lorenxi;
	public JButton Curi;
	public JButton Hafini;
	public JTextField fieldInformation;
	public JLabel soHieuNguyenTuLabel;
	public JLabel nguyenTuKhoiTrungBinhLabel;
	public JLabel kiHieuNguyenToLabel;
	public JPanel panelScreen;
	public JLabel doAmDienLabel;
	public JLabel tenNguyenToLabel;
	public JLabel cauHinhElectronLabel;
	public JLabel soOxiHoaLabel;
	public JLabel labelInfo1;
	public JLabel labelInfo2;
	public JLabel labelInfo3;
	public JLabel labelInfo4;
	public JLabel LabelInfo5;
	public JLabel LabelInfo6;
	public JLabel labelInfo7;
	public JButton buttonOK;
	public JLabel nhapKhongHopLeInfoLabel;
	public JButton xemThuocTinhLabel;
	private NguyenTo hidro;
	private NguyenTo liti;
	private NguyenTo natri;
	private NguyenTo rubidi;
	private NguyenTo kali;
	private NguyenTo xesi;
	private NguyenTo franxi;
	private NguyenTo beri;
	public JLabel printInfoDacTinhLabel;
	public ArrayList<NguyenTo> danhSachNguyenTo;
	private NguyenTo neon;
	private NguyenTo xenon;
	private NguyenTo selen;
	private NguyenTo iot;
	private NguyenTo sn;
	private NguyenTo cu;
	private NguyenTo tantan;
	private NguyenTo samari;
	private NguyenTo nobeli;
	public BangTuanHoanView() {
		
		BangTuanHoanMouseController mouseController = new BangTuanHoanMouseController(this);
		
		danhSachNguyenTo = new ArrayList<NguyenTo>();
		addDanhSachNguyenTo();
		buttonsHashMap = new HashMap<String, JButton>();
		setIconImage(Toolkit.getDefaultToolkit().getImage(BangTuanHoanView.class.getResource("/view/chemistry.png")));
		setTitle("Tra cứu bảng tuần hoàn hoá học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		//setBounds(100, 100, 1700, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.addMouseListener(mouseController);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ActionListener actionListener = new BangTuanHoanController(this);
		
		Hidro = new JButton("H");
		Hidro.setToolTipText("");
		Hidro.setForeground(new Color(64, 159, 255));
		Hidro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Hidro.setFocusable(false);
		Hidro.setBackground(new Color(194, 238, 245));
		Hidro.setBounds(10, 59, 60, 53);
		Hidro.addActionListener(actionListener);
		contentPane.add(Hidro);
		
		Liti = new JButton("Li");
		Liti.setForeground(new Color(26, 139, 5));
		Liti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Liti.setFocusable(false);
		Liti.setBackground(new Color(129, 254, 214));
		Liti.setBounds(10, 123, 60, 53);
		Liti.addActionListener(actionListener);
		contentPane.add(Liti);
		
		Natri = new JButton("Na");
		Natri.setForeground(new Color(26, 139, 5));
		Natri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Natri.setFocusable(false);
		Natri.setBackground(new Color(129, 254, 214));
		Natri.setBounds(10, 187, 60, 53);
		Natri.addActionListener(actionListener);
		contentPane.add(Natri);
		
		Kali = new JButton("K");
		Kali.setForeground(new Color(26, 139, 5));
		Kali.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Kali.setFocusable(false);
		Kali.setBackground(new Color(129, 254, 214));
		Kali.setBounds(10, 251, 60, 53);
		Kali.addActionListener(actionListener);
		contentPane.add(Kali);
		
		Rubidi = new JButton("Rb");
		Rubidi.setForeground(new Color(26, 139, 5));
		Rubidi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Rubidi.setFocusable(false);
		Rubidi.setBackground(new Color(129, 254, 214));
		Rubidi.setBounds(10, 315, 60, 53);
		Rubidi.addActionListener(actionListener);
		contentPane.add(Rubidi);
		
		Xesi = new JButton("Cs");
		Xesi.setForeground(new Color(26, 139, 5));
		Xesi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Xesi.setFocusable(false);
		Xesi.setBackground(new Color(129, 254, 214));
		Xesi.setBounds(10, 379, 60, 53);
		Xesi.addActionListener(actionListener);
		contentPane.add(Xesi);
		
		Franxi = new JButton("Fr");
		Franxi.setForeground(new Color(26, 139, 5));
		Franxi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Franxi.setFocusable(false);
		Franxi.setBackground(new Color(129, 254, 214));
		Franxi.setBounds(10, 443, 60, 53);
		Franxi.addActionListener(actionListener);
		contentPane.add(Franxi);
		
		Radi = new JButton("Ra");
		Radi.setForeground(new Color(183, 10, 0));
		Radi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Radi.setFocusable(false);
		Radi.setBackground(new Color(255, 136, 130));
		Radi.setBounds(80, 443, 60, 53);
		Radi.addActionListener(actionListener);
		contentPane.add(Radi);
		
		Actini = new JButton("Ac");
		Actini.setForeground(new Color(191, 95, 6));
		Actini.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Actini.setFocusable(false);
		Actini.setBackground(new Color(254, 185, 109));
		Actini.setBounds(150, 443, 60, 53);
		Actini.addActionListener(actionListener);
		contentPane.add(Actini);

		Dupni = new JButton("Db");
		Dupni.setForeground(Color.BLACK);
		Dupni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Dupni.setFocusable(false);
		Dupni.setBackground(new Color(98, 146, 217));
		Dupni.setBounds(375, 443, 60, 53);
		Dupni.addActionListener(actionListener);
		contentPane.add(Dupni);
		
		Siboqi = new JButton("Sg");
		Siboqi.setForeground(Color.BLACK);
		Siboqi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Siboqi.setFocusable(false);
		Siboqi.setBackground(new Color(98, 146, 217));
		Siboqi.setBounds(445, 443, 60, 53);
		Siboqi.addActionListener(actionListener);
		contentPane.add(Siboqi);
		
		Bori = new JButton("Bh");
		Bori.setForeground(Color.BLACK);
		Bori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Bori.setFocusable(false);
		Bori.setBackground(new Color(98, 146, 217));
		Bori.setBounds(515, 443, 60, 53);
		contentPane.add(Bori);
		
		Hasi = new JButton("Hs");
		Hasi.setForeground(Color.BLACK);
		Hasi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Hasi.setFocusable(false);
		Hasi.setBackground(new Color(98, 146, 217));
		Hasi.setBounds(585, 443, 60, 53);
		Hasi.addActionListener(actionListener);
		contentPane.add(Hasi);
		
		Meitneri = new JButton("Mt");
		Meitneri.setForeground(new Color(75, 75, 75));
		Meitneri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Meitneri.setFocusable(false);
		Meitneri.setBackground(new Color(221, 221, 221));
		Meitneri.setBounds(655, 443, 60, 53);
		Meitneri.addActionListener(actionListener);
		contentPane.add(Meitneri);
		
		Darmastati = new JButton("Ds");
		Darmastati.setForeground(Color.BLACK);
		Darmastati.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Darmastati.setFocusable(false);
		Darmastati.setBackground(new Color(98, 146, 217));
		Darmastati.setBounds(725, 443, 60, 53);
		Darmastati.addActionListener(actionListener);
		contentPane.add(Darmastati);
		
		Roentgeni = new JButton("Rg");
		Roentgeni.setForeground(Color.BLACK);
		Roentgeni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Roentgeni.setFocusable(false);
		Roentgeni.setBackground(new Color(98, 146, 217));
		Roentgeni.setBounds(795, 443, 60, 53);
		Roentgeni.addActionListener(actionListener);
		contentPane.add(Roentgeni);
		
		Copenixi = new JButton("Cn");
		Copenixi.setForeground(Color.BLACK);
		Copenixi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Copenixi.setFocusable(false);
		Copenixi.setBackground(new Color(98, 146, 217));
		Copenixi.setBounds(865, 443, 60, 53);
		Copenixi.addActionListener(actionListener);
		contentPane.add(Copenixi);
		
		Ununtri = new JButton("Uut");
		Ununtri.setForeground(Color.BLACK);
		Ununtri.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Ununtri.setFocusable(false);
		Ununtri.setBackground(new Color(98, 146, 217));
		Ununtri.setBounds(935, 444, 60, 53);
		Ununtri.addActionListener(actionListener);
		contentPane.add(Ununtri);
		
		Flerovi = new JButton("Fl");
		Flerovi.setForeground(Color.BLACK);
		Flerovi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Flerovi.setFocusable(false);
		Flerovi.setBackground(new Color(98, 146, 217));
		Flerovi.setBounds(1005, 443, 60, 53);
		Flerovi.addActionListener(actionListener);
		contentPane.add(Flerovi);
		
		Ununpenti = new JButton("Uup");
		Ununpenti.setForeground(Color.BLACK);
		Ununpenti.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Ununpenti.setFocusable(false);
		Ununpenti.setBackground(new Color(98, 146, 217));
		Ununpenti.setBounds(1075, 443, 60, 53);
		Ununpenti.addActionListener(actionListener);
		contentPane.add(Ununpenti);
		
		Rozofodi = new JButton("Rf");
		Rozofodi.setForeground(Color.BLACK);
		Rozofodi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Rozofodi.setFocusable(false);
		Rozofodi.setBackground(new Color(98, 146, 217));
		Rozofodi.setBounds(305, 443, 60, 53);
		Rozofodi.addActionListener(actionListener);
		contentPane.add(Rozofodi);
		
		Livemori = new JButton("Lv");
		Livemori.setForeground(Color.BLACK);
		Livemori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Livemori.setFocusable(false);
		Livemori.setBackground(new Color(98, 146, 217));
		Livemori.setBounds(1145, 443, 60, 53);
		Livemori.addActionListener(actionListener);
		contentPane.add(Livemori);
		
		Radon = new JButton("Rn");
		Radon.setForeground(Color.BLACK);
		Radon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Radon.setFocusable(false);
		Radon.setBackground(new Color(98, 146, 217));
		Radon.setBounds(1285, 379, 60, 53);
		Radon.addActionListener(actionListener);
		contentPane.add(Radon);
		
		Xenon = new JButton("Xe");
		Xenon.setForeground(Color.BLACK);
		Xenon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Xenon.setFocusable(false);
		Xenon.setBackground(new Color(98, 146, 217));
		Xenon.setBounds(1285, 315, 60, 53);
		Xenon.addActionListener(actionListener);
		contentPane.add(Xenon);
		
		Kripton = new JButton("Kr");
		Kripton.setForeground(Color.BLACK);
		Kripton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Kripton.setFocusable(false);
		Kripton.setBackground(new Color(98, 146, 217));
		Kripton.setBounds(1285, 251, 60, 53);
		Kripton.addActionListener(actionListener);
		contentPane.add(Kripton);
		
		Agon = new JButton("Ar");
		Agon.setForeground(Color.BLACK);
		Agon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Agon.setFocusable(false);
		Agon.setBackground(new Color(98, 146, 217));
		Agon.setBounds(1285, 187, 60, 53);
		Agon.addActionListener(actionListener);
		contentPane.add(Agon);
		
		Neon = new JButton("Ne");
		Neon.setForeground(Color.BLACK);
		Neon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Neon.setFocusable(false);
		Neon.setBackground(new Color(98, 146, 217));
		Neon.setBounds(1285, 123, 60, 53);
		Neon.addActionListener(actionListener);
		contentPane.add(Neon);
		
		Heli = new JButton("He");
		Heli.setForeground(new Color(177, 5, 18));
		Heli.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Heli.setFocusable(false);
		Heli.setBackground(new Color(253, 179, 181));
		Heli.setBounds(1285, 59, 60, 53);
		Heli.addActionListener(actionListener);
		contentPane.add(Heli);
		
		Bari = new JButton("Ba");
		Bari.setForeground(new Color(183, 10, 0));
		Bari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Bari.setFocusable(false);
		Bari.setBackground(new Color(255, 136, 130));
		Bari.setBounds(80, 379, 60, 53);
		Bari.addActionListener(actionListener);
		contentPane.add(Bari);
		
		Lantan = new JButton("La");
		Lantan.setForeground(new Color(1, 71, 49));
		Lantan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Lantan.setFocusable(false);
		Lantan.setBackground(new Color(129, 254, 214));
		Lantan.setBounds(150, 379, 60, 53);
		Lantan.addActionListener(actionListener);
		contentPane.add(Lantan);

		Beri = new JButton("Be");
		Beri.setForeground(new Color(183, 10, 0));
		Beri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Beri.setFocusable(false);
		Beri.setBackground(new Color(255, 136, 130));
		Beri.setBounds(80, 123, 60, 53);
		Beri.addActionListener(actionListener);
		contentPane.add(Beri);
		
		Magie = new JButton("Mg");
		Magie.setForeground(new Color(183, 10, 0));
		Magie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Magie.setFocusable(false);
		Magie.setBackground(new Color(255, 136, 130));
		Magie.setBounds(80, 187, 60, 53);
		Magie.addActionListener(actionListener);
		contentPane.add(Magie);
		
		Canxi = new JButton("Ca");
		Canxi.setForeground(new Color(183, 10, 0));
		Canxi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Canxi.setFocusable(false);
		Canxi.setBackground(new Color(255, 136, 130));
		Canxi.setBounds(80, 251, 60, 53);
		Canxi.addActionListener(actionListener);
		contentPane.add(Canxi);
		
		Stronti = new JButton("Sr");
		Stronti.setForeground(new Color(183, 10, 0));
		Stronti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Stronti.setFocusable(false);
		Stronti.setBackground(new Color(255, 136, 130));
		Stronti.setBounds(80, 315, 60, 53);
		Stronti.addActionListener(actionListener);
		contentPane.add(Stronti);
		
		Scandi = new JButton("Sc");
		Scandi.setForeground(new Color(1, 17, 126));
		Scandi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Scandi.setFocusable(false);
		Scandi.setBackground(new Color(169, 180, 254));
		Scandi.setBounds(150, 251, 60, 53);
		Scandi.addActionListener(actionListener);
		contentPane.add(Scandi);
		
		Ytri = new JButton("Y");
		Ytri.setForeground(new Color(1, 17, 126));
		Ytri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ytri.setFocusable(false);
		Ytri.setBackground(new Color(169, 180, 254));
		Ytri.setBounds(150, 315, 60, 53);
		Ytri.addActionListener(actionListener);
		contentPane.add(Ytri);
		
		Titan = new JButton("Ti");
		Titan.setForeground(Color.BLACK);
		Titan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Titan.setFocusable(false);
		Titan.setBackground(new Color(169, 180, 254));
		Titan.setBounds(305, 251, 60, 53);
		Titan.addActionListener(actionListener);
		contentPane.add(Titan);
		
		Ziriconi = new JButton("Zr");
		Ziriconi.setForeground(Color.BLACK);
		Ziriconi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ziriconi.setFocusable(false);
		Ziriconi.setBackground(new Color(169, 180, 254));
		Ziriconi.setBounds(305, 315, 60, 53);
		Ziriconi.addActionListener(actionListener);
		contentPane.add(Ziriconi);
		
		Hafini = new JButton("Hf");
		Hafini.setForeground(Color.BLACK);
		Hafini.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Hafini.setFocusable(false);
		Hafini.setBackground(new Color(169, 180, 254));
		Hafini.setBounds(305, 379, 60, 53);
		Hafini.addActionListener(actionListener);
		contentPane.add(Hafini);
		
		Vanadi = new JButton("V");
		Vanadi.setForeground(Color.BLACK);
		Vanadi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Vanadi.setFocusable(false);
		Vanadi.setBackground(new Color(98, 146, 217));
		Vanadi.setBounds(375, 251, 60, 53);
		Vanadi.addActionListener(actionListener);
		contentPane.add(Vanadi);
		
		Niobi = new JButton("Nb");
		Niobi.setForeground(Color.BLACK);
		Niobi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Niobi.setFocusable(false);
		Niobi.setBackground(new Color(98, 146, 217));
		Niobi.setBounds(375, 315, 60, 53);
		Niobi.addActionListener(actionListener);
		contentPane.add(Niobi);
		
		Tantan = new JButton("Ta");
		Tantan.setForeground(Color.BLACK);
		Tantan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Tantan.setFocusable(false);
		Tantan.setBackground(new Color(98, 146, 217));
		Tantan.setBounds(375, 379, 60, 53);
		Tantan.addActionListener(actionListener);
		contentPane.add(Tantan);
		
		Vonfam = new JButton("W");
		Vonfam.setForeground(Color.BLACK);
		Vonfam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Vonfam.setFocusable(false);
		Vonfam.setBackground(new Color(98, 146, 217));
		Vonfam.setBounds(445, 379, 60, 53);
		Vonfam.addActionListener(actionListener);
		contentPane.add(Vonfam);
		
		Molipden = new JButton("Mo");
		Molipden.setForeground(Color.BLACK);
		Molipden.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Molipden.setFocusable(false);
		Molipden.setBackground(new Color(98, 146, 217));
		Molipden.setBounds(445, 315, 60, 53);
		Molipden.addActionListener(actionListener);
		contentPane.add(Molipden);
		
		Crom = new JButton("Cr");
		Crom.setForeground(Color.BLACK);
		Crom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Crom.setFocusable(false);
		Crom.setBackground(new Color(98, 146, 217));
		Crom.setBounds(445, 251, 60, 53);
		Crom.addActionListener(actionListener);
		contentPane.add(Crom);
		
		Mangan = new JButton("Mn");
		Mangan.setForeground(Color.BLACK);
		Mangan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Mangan.setFocusable(false);
		Mangan.setBackground(new Color(98, 146, 217));
		Mangan.setBounds(515, 251, 60, 53);
		Mangan.addActionListener(actionListener);
		contentPane.add(Mangan);
		
		Tecnexi = new JButton("Tc");
		Tecnexi.setForeground(Color.BLACK);
		Tecnexi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Tecnexi.setFocusable(false);
		Tecnexi.setBackground(new Color(98, 146, 217));
		Tecnexi.setBounds(515, 315, 60, 53);
		Tecnexi.addActionListener(actionListener);
		contentPane.add(Tecnexi);
		
		Reni = new JButton("Re");
		Reni.setForeground(Color.BLACK);
		Reni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Reni.setFocusable(false);
		Reni.setBackground(new Color(98, 146, 217));
		Reni.setBounds(515, 379, 60, 53);
		Reni.addActionListener(actionListener);
		contentPane.add(Reni);
		
		Osimi = new JButton("Os");
		Osimi.setForeground(Color.BLACK);
		Osimi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Osimi.setFocusable(false);
		Osimi.setBackground(new Color(98, 146, 217));
		Osimi.setBounds(585, 379, 60, 53);
		Osimi.addActionListener(actionListener);
		contentPane.add(Osimi);
		
		Ruteni = new JButton("Ru");
		Ruteni.setForeground(Color.BLACK);
		Ruteni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ruteni.setFocusable(false);
		Ruteni.setBackground(new Color(98, 146, 217));
		Ruteni.setBounds(585, 315, 60, 53);
		Ruteni.addActionListener(actionListener);
		contentPane.add(Ruteni);
		
		Fe = new JButton("Fe");
		Fe.setForeground(Color.BLACK);
		Fe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Fe.setFocusable(false);
		Fe.setBackground(new Color(98, 146, 217));
		Fe.setBounds(585, 251, 60, 53);
		Fe.addActionListener(actionListener);
		contentPane.add(Fe);
		
		Coban = new JButton("Co");
		Coban.setForeground(Color.BLACK);
		Coban.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Coban.setFocusable(false);
		Coban.setBackground(new Color(98, 146, 217));
		Coban.setBounds(655, 251, 60, 53);
		Coban.addActionListener(actionListener);
		contentPane.add(Coban);
		
		Rodi = new JButton("Rh");
		Rodi.setForeground(Color.BLACK);
		Rodi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Rodi.setFocusable(false);
		Rodi.setBackground(new Color(98, 146, 217));
		Rodi.setBounds(655, 315, 60, 53);
		Rodi.addActionListener(actionListener);
		contentPane.add(Rodi);
		
		Iridi = new JButton("Ir");
		Iridi.setForeground(Color.BLACK);
		Iridi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Iridi.setFocusable(false);
		Iridi.setBackground(new Color(98, 146, 217));
		Iridi.setBounds(655, 379, 60, 53);
		Iridi.addActionListener(actionListener);
		contentPane.add(Iridi);
		
		Platin = new JButton("Pt");
		Platin.setForeground(Color.BLACK);
		Platin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Platin.setFocusable(false);
		Platin.setBackground(new Color(98, 146, 217));
		Platin.setBounds(725, 379, 60, 53);
		Platin.addActionListener(actionListener);
		contentPane.add(Platin);
		
		Paladi = new JButton("Pd");
		Paladi.setForeground(Color.BLACK);
		Paladi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Paladi.setFocusable(false);
		Paladi.setBackground(new Color(98, 146, 217));
		Paladi.setBounds(725, 315, 60, 53);
		Paladi.addActionListener(actionListener);
		contentPane.add(Paladi);
		
		Niken = new JButton("Ni");
		Niken.setForeground(Color.BLACK);
		Niken.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Niken.setFocusable(false);
		Niken.setBackground(new Color(98, 146, 217));
		Niken.setBounds(725, 251, 60, 53);
		Niken.addActionListener(actionListener);
		contentPane.add(Niken);
		
		Cu = new JButton("Cu");
		Cu.setForeground(Color.BLACK);
		Cu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cu.setFocusable(false);
		Cu.setBackground(new Color(98, 146, 217));
		Cu.setBounds(795, 251, 60, 53);
		Cu.addActionListener(actionListener);
		contentPane.add(Cu);
		
		Ag = new JButton("Ag");
		Ag.setForeground(Color.BLACK);
		Ag.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ag.setFocusable(false);
		Ag.setBackground(new Color(98, 146, 217));
		Ag.setBounds(795, 315, 60, 53);
		Ag.addActionListener(actionListener);
		contentPane.add(Ag);
		
		Au = new JButton("Au");
		Au.setForeground(Color.BLACK);
		Au.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Au.setFocusable(false);
		Au.setBackground(new Color(98, 146, 217));
		Au.setBounds(795, 379, 60, 53);
		Au.addActionListener(actionListener);
		contentPane.add(Au);
		
		Hg = new JButton("Hg");
		Hg.setForeground(Color.BLACK);
		Hg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Hg.setFocusable(false);
		Hg.setBackground(new Color(98, 146, 217));
		Hg.setBounds(865, 379, 60, 53);
		Hg.addActionListener(actionListener);
		contentPane.add(Hg);
		
		Cadimi = new JButton("Cd");
		Cadimi.setForeground(Color.BLACK);
		Cadimi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cadimi.setFocusable(false);
		Cadimi.setBackground(new Color(98, 146, 217));
		Cadimi.setBounds(865, 315, 60, 53);
		Cadimi.addActionListener(actionListener);
		contentPane.add(Cadimi);
		
		Zn = new JButton("Zn");
		Zn.setForeground(Color.BLACK);
		Zn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Zn.setFocusable(false);
		Zn.setBackground(new Color(98, 146, 217));
		Zn.setBounds(865, 251, 60, 53);
		Zn.addActionListener(actionListener);
		contentPane.add(Zn);
		
		Tali = new JButton("Tl");
		Tali.setForeground(Color.BLACK);
		Tali.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Tali.setFocusable(false);
		Tali.setBackground(new Color(98, 146, 217));
		Tali.setBounds(935, 380, 60, 53);
		Tali.addActionListener(actionListener);
		contentPane.add(Tali);
		
		Indi = new JButton("In");
		Indi.setForeground(Color.BLACK);
		Indi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Indi.setFocusable(false);
		Indi.setBackground(new Color(98, 146, 217));
		Indi.setBounds(935, 315, 60, 53);
		Indi.addActionListener(actionListener);
		contentPane.add(Indi);
		
		Gali = new JButton("Ga");
		Gali.setForeground(Color.BLACK);
		Gali.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gali.setFocusable(false);
		Gali.setBackground(new Color(98, 146, 217));
		Gali.setBounds(935, 251, 60, 53);
		Gali.addActionListener(actionListener);
		contentPane.add(Gali);
		
		Pb = new JButton("Pb");
		Pb.setForeground(Color.BLACK);
		Pb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Pb.setFocusable(false);
		Pb.setBackground(new Color(98, 146, 217));
		Pb.setBounds(1005, 379, 60, 53);
		Pb.addActionListener(actionListener);
		contentPane.add(Pb);
		
		Sn = new JButton("Sn");
		Sn.setForeground(Color.BLACK);
		Sn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sn.setFocusable(false);
		Sn.setBackground(new Color(98, 146, 217));
		Sn.setBounds(1005, 315, 60, 53);
		Sn.addActionListener(actionListener);
		contentPane.add(Sn);
		
		Gemani = new JButton("Ge");
		Gemani.setForeground(Color.BLACK);
		Gemani.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gemani.setFocusable(false);
		Gemani.setBackground(new Color(98, 146, 217));
		Gemani.setBounds(1005, 251, 60, 53);
		Gemani.addActionListener(actionListener);
		contentPane.add(Gemani);
		
		Bitmut = new JButton("Bi");
		Bitmut.setForeground(Color.BLACK);
		Bitmut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Bitmut.setFocusable(false);
		Bitmut.setBackground(new Color(98, 146, 217));
		Bitmut.setBounds(1075, 379, 60, 53);
		Bitmut.addActionListener(actionListener);
		contentPane.add(Bitmut);
		
		Stibi = new JButton("Sb");
		Stibi.setForeground(Color.BLACK);
		Stibi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Stibi.setFocusable(false);
		Stibi.setBackground(new Color(98, 146, 217));
		Stibi.setBounds(1075, 315, 60, 53);
		Stibi.addActionListener(actionListener);
		contentPane.add(Stibi);
		
		Asen = new JButton("As");
		Asen.setForeground(Color.BLACK);
		Asen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Asen.setFocusable(false);
		Asen.setBackground(new Color(98, 146, 217));
		Asen.setBounds(1075, 251, 60, 53);
		Asen.addActionListener(actionListener);
		contentPane.add(Asen);
		
		Selen = new JButton("Se");
		Selen.setForeground(Color.BLACK);
		Selen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Selen.setFocusable(false);
		Selen.setBackground(new Color(98, 146, 217));
		Selen.setBounds(1145, 251, 60, 53);
		Selen.addActionListener(actionListener);
		contentPane.add(Selen);
		
		Telu = new JButton("Te");
		Telu.setForeground(Color.BLACK);
		Telu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Telu.setFocusable(false);
		Telu.setBackground(new Color(98, 146, 217));
		Telu.setBounds(1145, 315, 60, 53);
		Telu.addActionListener(actionListener);
		contentPane.add(Telu);
		
		Poloni = new JButton("Po");
		Poloni.setForeground(Color.BLACK);
		Poloni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Poloni.setFocusable(false);
		Poloni.setBackground(new Color(98, 146, 217));
		Poloni.setBounds(1145, 379, 60, 53);
		Poloni.addActionListener(actionListener);
		contentPane.add(Poloni);
		
		Atatin = new JButton("At");
		Atatin.setForeground(Color.BLACK);
		Atatin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Atatin.setFocusable(false);
		Atatin.setBackground(new Color(98, 146, 217));
		Atatin.setBounds(1215, 379, 60, 53);
		Atatin.addActionListener(actionListener);
		contentPane.add(Atatin);
		
		Iot = new JButton("I");
		Iot.setForeground(Color.BLACK);
		Iot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Iot.setFocusable(false);
		Iot.setBackground(new Color(98, 146, 217));
		Iot.setBounds(1215, 315, 60, 53);
		Iot.addActionListener(actionListener);
		contentPane.add(Iot);
		
		Brom = new JButton("Br");
		Brom.setForeground(Color.BLACK);
		Brom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Brom.setFocusable(false);
		Brom.setBackground(new Color(98, 146, 217));
		Brom.setBounds(1215, 251, 60, 53);
		Brom.addActionListener(actionListener);
		contentPane.add(Brom);
		
		Clo = new JButton("Cl");
		Clo.setForeground(Color.BLACK);
		Clo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Clo.setFocusable(false);
		Clo.setBackground(new Color(98, 146, 217));
		Clo.setBounds(1215, 187, 60, 53);
		Clo.addActionListener(actionListener);
		contentPane.add(Clo);
		
		S = new JButton("S");
		S.setForeground(Color.BLACK);
		S.setFont(new Font("Tahoma", Font.PLAIN, 20));
		S.setFocusable(false);
		S.setBackground(new Color(98, 146, 217));
		S.setBounds(1145, 187, 60, 53);
		S.addActionListener(actionListener);
		contentPane.add(S);
		
		Photpho = new JButton("P");
		Photpho.setForeground(Color.BLACK);
		Photpho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Photpho.setFocusable(false);
		Photpho.setBackground(new Color(98, 146, 217));
		Photpho.setBounds(1075, 187, 60, 53);
		Photpho.addActionListener(actionListener);
		contentPane.add(Photpho);
		
		Silic = new JButton("Si");
		Silic.setForeground(Color.BLACK);
		Silic.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Silic.setFocusable(false);
		Silic.setBackground(new Color(98, 146, 217));
		Silic.setBounds(1005, 187, 60, 53);
		Silic.addActionListener(actionListener);
		contentPane.add(Silic);
		
		Al = new JButton("Al");
		Al.setForeground(new Color(100, 100, 100));
		Al.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Al.setFocusable(false);
		Al.setBackground(new Color(169, 245, 188));
		Al.setBounds(935, 187, 60, 53);
		Al.addActionListener(actionListener);
		contentPane.add(Al); 
		
		Bo = new JButton("B");
		Bo.setForeground(new Color(157, 80, 2));
		Bo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Bo.setFocusable(false);
		Bo.setBackground(new Color(253, 181, 108));
		Bo.setBounds(935, 123, 60, 53);
		Bo.addActionListener(actionListener);
		contentPane.add(Bo);
		
		Cacbon = new JButton("C");
		Cacbon.setForeground(Color.BLACK);
		Cacbon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cacbon.setFocusable(false);
		Cacbon.setBackground(new Color(98, 146, 217));
		Cacbon.setBounds(1005, 123, 60, 53);
		Cacbon.addActionListener(actionListener);
		contentPane.add(Cacbon);
		
		Nito = new JButton("N");
		Nito.setForeground(Color.BLACK);
		Nito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Nito.setFocusable(false);
		Nito.setBackground(new Color(98, 146, 217));
		Nito.setBounds(1075, 123, 60, 53);
		Nito.addActionListener(actionListener);
		contentPane.add(Nito);
		
		Oxi = new JButton("O");
		Oxi.setForeground(Color.BLACK);
		Oxi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Oxi.setFocusable(false);
		Oxi.setBackground(new Color(98, 146, 217));
		Oxi.setBounds(1145, 123, 60, 53);
		Oxi.addActionListener(actionListener);
		contentPane.add(Oxi);
		
		Flo = new JButton("F");
		Flo.setForeground(Color.BLACK);
		Flo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Flo.setFocusable(false);
		Flo.setBackground(new Color(98, 146, 217));
		Flo.setBounds(1215, 123, 60, 53);
		Flo.addActionListener(actionListener);
		contentPane.add(Flo);
		
		Thori = new JButton("Th");
		Thori.setForeground(Color.BLACK);
		Thori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Thori.setFocusable(false);
		Thori.setBackground(new Color(98, 146, 217));
		Thori.setBounds(305, 597, 60, 53);
		Thori.addActionListener(actionListener);
		contentPane.add(Thori);
		
		Xeri = new JButton("Ce");
		Xeri.setForeground(Color.BLACK);
		Xeri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Xeri.setFocusable(false);
		Xeri.setBackground(new Color(98, 146, 217));
		Xeri.setBounds(305, 533, 60, 53);
		Xeri.addActionListener(actionListener);
		contentPane.add(Xeri);
		
		Prazeodim = new JButton("Pr");
		Prazeodim.setForeground(Color.BLACK);
		Prazeodim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Prazeodim.setFocusable(false);
		Prazeodim.setBackground(new Color(98, 146, 217));
		Prazeodim.setBounds(375, 533, 60, 53);
		Prazeodim.addActionListener(actionListener);
		contentPane.add(Prazeodim);
		
		Protactini = new JButton("Pa");
		Protactini.setForeground(Color.BLACK);
		Protactini.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Protactini.setFocusable(false);
		Protactini.setBackground(new Color(98, 146, 217));
		Protactini.setBounds(375, 597, 60, 53);
		Protactini.addActionListener(actionListener);
		contentPane.add(Protactini);
		
		Neodim = new JButton("Nd");
		Neodim.setForeground(Color.BLACK);
		Neodim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Neodim.setFocusable(false);
		Neodim.setBackground(new Color(98, 146, 217));
		Neodim.setBounds(445, 533, 60, 53);
		Neodim.addActionListener(actionListener);
		contentPane.add(Neodim);
		
		Urani = new JButton("U");
		Urani.setForeground(Color.BLACK);
		Urani.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Urani.setFocusable(false);
		Urani.setBackground(new Color(98, 146, 217));
		Urani.setBounds(445, 597, 60, 53);
		Urani.addActionListener(actionListener);
		contentPane.add(Urani);
		
		Prometi = new JButton("Pm");
		Prometi.setForeground(Color.BLACK);
		Prometi.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Prometi.setFocusable(false);
		Prometi.setBackground(new Color(98, 146, 217));
		Prometi.setBounds(515, 533, 60, 53);
		Prometi.addActionListener(actionListener);
		contentPane.add(Prometi);
		
		Neptuni = new JButton("Np");
		Neptuni.setForeground(Color.BLACK);
		Neptuni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Neptuni.setFocusable(false);
		Neptuni.setBackground(new Color(98, 146, 217));
		Neptuni.setBounds(515, 597, 60, 53);
		Neptuni.addActionListener(actionListener);
		contentPane.add(Neptuni);
		
		Samari = new JButton("Sm");
		Samari.setForeground(Color.BLACK);
		Samari.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Samari.setFocusable(false);
		Samari.setBackground(new Color(98, 146, 217));
		Samari.setBounds(585, 533, 60, 53);
		Samari.addActionListener(actionListener);
		contentPane.add(Samari);
		
		Plutoni = new JButton("Pu");
		Plutoni.setForeground(Color.BLACK);
		Plutoni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Plutoni.setFocusable(false);
		Plutoni.setBackground(new Color(98, 146, 217));
		Plutoni.setBounds(585, 597, 60, 53);
		Plutoni.addActionListener(actionListener);
		contentPane.add(Plutoni);
		
		Europi = new JButton("Eu");
		Europi.setForeground(Color.BLACK);
		Europi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Europi.setFocusable(false);
		Europi.setBackground(new Color(98, 146, 217));
		Europi.setBounds(655, 533, 60, 53);
		Europi.addActionListener(actionListener);
		contentPane.add(Europi);
		
		Amerixi = new JButton("Am");
		Amerixi.setForeground(Color.BLACK);
		Amerixi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Amerixi.setFocusable(false);
		Amerixi.setBackground(new Color(98, 146, 217));
		Amerixi.setBounds(655, 597, 60, 53);
		Amerixi.addActionListener(actionListener);
		contentPane.add(Amerixi);
		
		Curi = new JButton("Cm");
		Curi.setForeground(Color.BLACK);
		Curi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Curi.setFocusable(false);
		Curi.setBackground(new Color(98, 146, 217));
		Curi.setBounds(725, 597, 60, 53);
		Curi.addActionListener(actionListener);
		contentPane.add(Curi);
		
		Gadolini = new JButton("Gd");
		Gadolini.setForeground(Color.BLACK);
		Gadolini.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gadolini.setFocusable(false);
		Gadolini.setBackground(new Color(98, 146, 217));
		Gadolini.setBounds(725, 533, 60, 53);
		Gadolini.addActionListener(actionListener);
		contentPane.add(Gadolini);
		
		Beckeli = new JButton("Bk");
		Beckeli.setForeground(Color.BLACK);
		Beckeli.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Beckeli.setFocusable(false);
		Beckeli.setBackground(new Color(98, 146, 217));
		Beckeli.setBounds(795, 597, 60, 53);
		Beckeli.addActionListener(actionListener);
		contentPane.add(Beckeli);
		
		Tebi = new JButton("Tb");
		Tebi.setForeground(Color.BLACK);
		Tebi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Tebi.setFocusable(false);
		Tebi.setBackground(new Color(98, 146, 217));
		Tebi.setBounds(795, 533, 60, 53);
		Tebi.addActionListener(actionListener);
		contentPane.add(Tebi);
		
		Califoni = new JButton("Cf");
		Califoni.setForeground(Color.BLACK);
		Califoni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Califoni.setFocusable(false);
		Califoni.setBackground(new Color(98, 146, 217));
		Califoni.setBounds(865, 597, 60, 53);
		Califoni.addActionListener(actionListener);
		contentPane.add(Califoni);
		
		Diprozi = new JButton("Dy");
		Diprozi.setForeground(Color.BLACK);
		Diprozi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Diprozi.setFocusable(false);
		Diprozi.setBackground(new Color(98, 146, 217));
		Diprozi.setBounds(865, 533, 60, 53);
		Diprozi.addActionListener(actionListener);
		contentPane.add(Diprozi);
		
		Ensteni = new JButton("Es");
		Ensteni.setForeground(Color.BLACK);
		Ensteni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ensteni.setFocusable(false);
		Ensteni.setBackground(new Color(98, 146, 217));
		Ensteni.setBounds(935, 597, 60, 53);
		Ensteni.addActionListener(actionListener);
		contentPane.add(Ensteni);
		
		Honmi = new JButton("Ho");
		Honmi.setForeground(Color.BLACK);
		Honmi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Honmi.setFocusable(false);
		Honmi.setBackground(new Color(98, 146, 217));
		Honmi.setBounds(935, 533, 60, 53);
		Honmi.addActionListener(actionListener);
		contentPane.add(Honmi);
		
		Eribi = new JButton("Er");
		Eribi.setForeground(Color.BLACK);
		Eribi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Eribi.setFocusable(false);
		Eribi.setBackground(new Color(98, 146, 217));
		Eribi.setBounds(1005, 533, 60, 53);
		Eribi.addActionListener(actionListener);
		contentPane.add(Eribi);
		
		Fecmi = new JButton("Fm");
		Fecmi.setForeground(Color.BLACK);
		Fecmi.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Fecmi.setFocusable(false);
		Fecmi.setBackground(new Color(98, 146, 217));
		Fecmi.setBounds(1005, 597, 60, 53);
		Fecmi.addActionListener(actionListener);
		contentPane.add(Fecmi);
		
		Tuli = new JButton("Tm");
		Tuli.setForeground(Color.BLACK);
		Tuli.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Tuli.setFocusable(false);
		Tuli.setBackground(new Color(98, 146, 217));
		Tuli.setBounds(1075, 533, 60, 53);
		Tuli.addActionListener(actionListener);
		contentPane.add(Tuli);
		
		Mendelevi = new JButton("Md");
		Mendelevi.setForeground(Color.BLACK);
		Mendelevi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Mendelevi.setFocusable(false);
		Mendelevi.setBackground(new Color(98, 146, 217));
		Mendelevi.setBounds(1075, 597, 60, 53);
		Mendelevi.addActionListener(actionListener);
		contentPane.add(Mendelevi);
		
		Ytecbi = new JButton("Yb");
		Ytecbi.setForeground(Color.BLACK);
		Ytecbi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ytecbi.setFocusable(false);
		Ytecbi.setBackground(new Color(98, 146, 217));
		Ytecbi.setBounds(1145, 533, 60, 53);
		Ytecbi.addActionListener(actionListener);
		contentPane.add(Ytecbi);
		
		Nobeli = new JButton("No");
		Nobeli.setForeground(Color.BLACK);
		Nobeli.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Nobeli.setFocusable(false);
		Nobeli.setBackground(new Color(98, 146, 217));
		Nobeli.setBounds(1145, 597, 60, 53);
		Nobeli.addActionListener(actionListener);
		contentPane.add(Nobeli);
		
		Lutexi = new JButton("Lu");
		Lutexi.setForeground(Color.BLACK);
		Lutexi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Lutexi.setFocusable(false);
		Lutexi.setBackground(new Color(98, 146, 217));
		Lutexi.setBounds(1215, 533, 60, 53);
		Lutexi.addActionListener(actionListener);
		contentPane.add(Lutexi);
		
		Lorenxi = new JButton("Lr");
		Lorenxi.setForeground(Color.BLACK);
		Lorenxi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Lorenxi.setFocusable(false);
		Lorenxi.setBackground(new Color(98, 146, 217));
		Lorenxi.setBounds(1215, 597, 60, 53);
		Lorenxi.addActionListener(actionListener);
		contentPane.add(Lorenxi);
		
		// 
		BangTuanHoanKeyController keyController = new BangTuanHoanKeyController(this);
		
		fieldInformation = new JTextField();
		fieldInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldInformation.setForeground(new Color(0, 0, 0));
		fieldInformation.setHorizontalAlignment(SwingConstants.LEFT);
		fieldInformation.setBounds(203, 16, 86, 37);
		fieldInformation.addKeyListener(keyController);
		contentPane.add(fieldInformation);
		fieldInformation.setColumns(10);
		
		JLabel timNguyenToLabel = new JLabel("Tìm nguyên tố:");
		timNguyenToLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timNguyenToLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		timNguyenToLabel.setBounds(80, 16, 124, 37);
		contentPane.add(timNguyenToLabel);
		
		panelScreen = new JPanel();
		panelScreen.setBackground(new Color(232, 232, 232));
		panelScreen.setBounds(514, 23, 181, 202);
		contentPane.add(panelScreen);
		panelScreen.setLayout(null);
		
		soHieuNguyenTuLabel = new JLabel("");
		soHieuNguyenTuLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soHieuNguyenTuLabel.setHorizontalAlignment(SwingConstants.LEFT);
		soHieuNguyenTuLabel.setBounds(10, 11, 60, 14);
		panelScreen.add(soHieuNguyenTuLabel);
		
		nguyenTuKhoiTrungBinhLabel = new JLabel("");
		nguyenTuKhoiTrungBinhLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nguyenTuKhoiTrungBinhLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nguyenTuKhoiTrungBinhLabel.setBounds(111, 11, 60, 14);
		panelScreen.add(nguyenTuKhoiTrungBinhLabel);
		
		kiHieuNguyenToLabel = new JLabel("");
		kiHieuNguyenToLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
		kiHieuNguyenToLabel.setHorizontalAlignment(SwingConstants.LEFT);
		kiHieuNguyenToLabel.setBounds(25, 55, 89, 62);
		panelScreen.add(kiHieuNguyenToLabel);
		
		doAmDienLabel = new JLabel("");
		doAmDienLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		doAmDienLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		doAmDienLabel.setBounds(111, 103, 60, 14);
		panelScreen.add(doAmDienLabel);
		
		tenNguyenToLabel = new JLabel("");
		tenNguyenToLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tenNguyenToLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tenNguyenToLabel.setBounds(-12, 121, 108, 19);
		panelScreen.add(tenNguyenToLabel);
		
		cauHinhElectronLabel = new JLabel("");
		cauHinhElectronLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cauHinhElectronLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cauHinhElectronLabel.setBounds(10, 148, 161, 27);
		panelScreen.add(cauHinhElectronLabel);
		
		soOxiHoaLabel = new JLabel("");
		soOxiHoaLabel.setBackground(new Color(255, 255, 255));
		soOxiHoaLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soOxiHoaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		soOxiHoaLabel.setBounds(0, 176, 181, 27);
		panelScreen.add(soOxiHoaLabel);
		
		labelInfo1 = new JLabel("");
		labelInfo1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInfo1.setBounds(381, 34, 124, 19);
		contentPane.add(labelInfo1);
		
		labelInfo2 = new JLabel("");
		labelInfo2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInfo2.setBounds(381, 106, 124, 19);
		contentPane.add(labelInfo2);
		
		labelInfo3 = new JLabel("");
		labelInfo3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInfo3.setBounds(381, 146, 124, 19);
		contentPane.add(labelInfo3);
		
		labelInfo4 = new JLabel("");
		labelInfo4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInfo4.setBounds(705, 36, 207, 19);
		contentPane.add(labelInfo4);
		
		LabelInfo5 = new JLabel("");
		LabelInfo5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelInfo5.setBounds(707, 123, 124, 19);
		contentPane.add(LabelInfo5);
		
		LabelInfo6 = new JLabel("");
		LabelInfo6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelInfo6.setBounds(705, 176, 124, 19);
		contentPane.add(LabelInfo6);
		
		labelInfo7 = new JLabel("");
		labelInfo7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInfo7.setBounds(707, 210, 124, 19);
		contentPane.add(labelInfo7);
		
		// set mau
		// 1, 17, 126 169, 180, 254
		setThuocTinhButton(Ag, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Titan, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Ziriconi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Hafini, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Rozofodi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Vanadi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Niobi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Tantan, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Dupni, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Siboqi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Vonfam, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Molipden, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Crom, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Mangan, 1, 17, 126, 169, 180, 254);	
		setThuocTinhButton(Tecnexi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Reni, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Bori, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Hasi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Osimi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Ruteni, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Fe, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Coban, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Rodi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Iridi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Paladi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Niken, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Platin, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Au, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Cu, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Zn, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Cadimi, 1, 17, 126, 169, 180, 254);
		setThuocTinhButton(Hg, 1, 17, 126, 169, 180, 254);
		//  0, 0, 255 194, 238, 245
		setThuocTinhButton(Cacbon, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Nito, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Oxi, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Flo, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Clo, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Iot, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Selen, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(S, 64, 159, 255, 194, 238, 245);	
		setThuocTinhButton(Photpho, 64, 159, 255, 194, 238, 245);
		setThuocTinhButton(Brom, 64, 159, 255, 194, 238, 245);
		//// 1, 71, 49 129, 254, 214
		setThuocTinhButton(Xeri, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Prazeodim, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Neodim, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Prometi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Samari, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Europi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Gadolini, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Tebi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Diprozi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Honmi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Eribi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Tuli, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Ytecbi, 1, 71, 49, 129, 254, 214);
		setThuocTinhButton(Lutexi, 1, 71, 49, 129, 254, 214);
		//75, 75, 75 221, 221, 221
		setThuocTinhButton(Darmastati, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Roentgeni, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Copenixi, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Ununpenti, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Ununtri, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Flerovi, 75, 75, 75, 221, 221, 221);
		setThuocTinhButton(Livemori, 75, 75, 75, 221, 221, 221);
		//191, 95, 6 254, 185, 109
		setThuocTinhButton(Thori, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Protactini, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Urani, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Neptuni, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Plutoni, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Amerixi, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Curi, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Beckeli, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Califoni, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Ensteni, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Fecmi, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Mendelevi, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Nobeli, 191, 95, 6, 254, 185, 109);
		setThuocTinhButton(Lorenxi, 191, 95, 6, 254, 185, 109);
		//157, 80, 2 253, 181, 108
		setThuocTinhButton(Silic, 157, 80, 2, 253, 181, 108);
		setThuocTinhButton(Gemani, 157, 80, 2, 253, 181, 108);
		setThuocTinhButton(Silic, 157, 80, 2, 253, 181, 108);
		setThuocTinhButton(Asen, 157, 80, 2, 253, 181, 108);
		setThuocTinhButton(Telu, 157, 80, 2, 253, 181, 108);
		setThuocTinhButton(Stibi, 157, 80, 2, 253, 181, 108);
		
		nhapKhongHopLeInfoLabel = new JLabel("");
		nhapKhongHopLeInfoLabel.setForeground(new Color(38, 36, 36));
		nhapKhongHopLeInfoLabel.setBounds(202, 59, 141, 19);
		contentPane.add(nhapKhongHopLeInfoLabel);
		
		JLabel copyrightLabel = new JLabel("(C) Copyright by Le Dinh Chinh");
		copyrightLabel.setFont(new Font("VN-NTime", Font.PLAIN, 13));
		copyrightLabel.setForeground(new Color(114, 114, 114));
		copyrightLabel.setBounds(10, 624, 200, 26);
		contentPane.add(copyrightLabel);
		
		xemThuocTinhLabel = new JButton("Xem đặc tính");
		xemThuocTinhLabel.setForeground(new Color(0, 0, 0));
		xemThuocTinhLabel.setBackground(new Color(0, 255, 128));
		xemThuocTinhLabel.setBounds(1181, 16, 164, 32);
		xemThuocTinhLabel.setFocusable(false);
		xemThuocTinhLabel.addMouseListener(mouseController);
		contentPane.add(xemThuocTinhLabel);
		
		printInfoDacTinhLabel = new JLabel("");
		printInfoDacTinhLabel.setBackground(new Color(255, 255, 255));
		printInfoDacTinhLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		printInfoDacTinhLabel.setHorizontalAlignment(SwingConstants.CENTER);
		printInfoDacTinhLabel.setBounds(935, 16, 236, 32);
		contentPane.add(printInfoDacTinhLabel);
		
		
		//
		AddButton();
		
		for(Map.Entry<String, JButton> entry : buttonsHashMap.entrySet()) {
			entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
			entry.getValue().setBorder(new LineBorder(new Color(0, 0, 0), 1));
			String temp = entry.getKey();
			if(temp.equals("Al") || temp.equals("Gali") || temp.equals("Indi") ||
					temp.equals("Sn") || temp.equals("Tali") ||
					temp.equals("Pb") || temp.equals("Bitmut") || temp.equals("Poloni") ||
					temp.endsWith("Atatin")) {
				setThuocTinhButton(entry.getValue(), 100, 100, 100, 169, 245, 188);
			}
			// 177, 5, 18 253, 179, 181
			if(temp.equals("Neon") || temp.equals("Agon") || temp.equals("Kripton") ||
					temp.equals("Xenon") || temp.equals("Radon")) {
				setThuocTinhButton(entry.getValue(), 177, 5, 18, 253, 179, 181);
			}
		}
		inThongTinNguyenTo(hidro);
		this.setVisible(true);
	}
	
	public void addDanhSachNguyenTo() {
				// Hidro
				hidro = new NguyenTo("H", "Hidro", 1.008, 2.20, "1s¹", "-1,1", "Kim loại chuyển tiếp", 1);
				danhSachNguyenTo.add(hidro);
				// Liti
				liti = new NguyenTo("Li", "Liti", 6.94, 0.98, "1s² 2s¹", "+1", "Kim loại kiềm", 3);
				danhSachNguyenTo.add(liti);
				// Natri
				natri = new NguyenTo("Na", "Natri", 22.989, 0.93, "[Ne] 3s¹", "+1", "Kim loại kiềm", 11);
				danhSachNguyenTo.add(natri);
				// Rubidi
				rubidi = new NguyenTo("Rb", "Rubidi", 85.47, 0.82, "[Kr] 5s¹", "+1", "Kim loại kiềm", 37);
				danhSachNguyenTo.add(rubidi);
				// kali
				kali = new NguyenTo("K", "Kali", 39.10, 0.82, "[Ar] 4s¹", "+1", "Kim loại kiềm", 19);
				danhSachNguyenTo.add(kali);
				// Xesi
				xesi = new NguyenTo("Cs", "Xesi", 132.91, 0.79, "[Xe] 6s¹", "+1", "Kim loại kiềm", 55);
				danhSachNguyenTo.add(xesi);
				// franxi
				franxi =new NguyenTo ("Fr", "Franxi", 223, 0.7, "[Rn] 7s¹", "+1", "Kim loại kiềm", 87);
				danhSachNguyenTo.add(franxi);
				// Beri
				beri = new NguyenTo("Be", "Beri", 9.01, 1.57, "1s² 2s²", "+2", "Kim loại kiềm thổ", 4);
				danhSachNguyenTo.add(beri);
				// Neon
				neon = new NguyenTo("Ne", "Neon", 20.18, 200, "[He] 2s² 2p⁶", "0", "Khí hiếm", 10);
				danhSachNguyenTo.add(neon);
				// Xenon
				xenon = new NguyenTo("Xe", "Xenon", 131.29, 2.6, "[Kr] 4d¹⁰ 5s² 5p⁶", "0, +2, +4, +6, +8", "Khí quý hiếm", 54);
				danhSachNguyenTo.add(xenon);
				// Selen
				selen = new NguyenTo("Se", "Selen", 78.97, 2.55, "[Ar] 3d¹⁰ 4s² 4p⁴", "-2, +4, +6", "Halogen", 34);
				danhSachNguyenTo.add(selen);
				// Iot
				iot = new NguyenTo("I", "Iot", 126.90, 2.66, "[Kr] 4d¹⁰ 5s² 5p⁵", "-1, +1, +3, +5, +7", "Halogen", 53);
				danhSachNguyenTo.add(iot);
				// Sn
				sn = new NguyenTo("Sn", "Sn", 118.71, 1.96, "[Kr] 4d¹⁰ 5s² 5p²", "+2, +4", "Kim loại chuyển tiếp", 50);
				danhSachNguyenTo.add(sn);
				// Cu
				cu = new NguyenTo("Cu", "Cu", 63.54, 1.90, "[Ar] 3d¹⁰ 4s¹", "+1, +2", "Kim loại chuyển tiếp", 29);
				danhSachNguyenTo.add(cu);
				// Tantan
				tantan = new NguyenTo("Ta", "Tantan", 180.95, 1.5, "[Xe] 4f¹⁴ 5d³ 6s²", "+3, +4, +5", "Kim loại chuyển tiếp", 73);
				danhSachNguyenTo.add(tantan);
				// Samari
				samari = new NguyenTo("Sm", "Samari", 150.36, 1.17, "[Xe] 4f⁶ 6s²", "+2, +3", "Lantanoid", 62);
				danhSachNguyenTo.add(samari);
				// Nobeli
				nobeli = new NguyenTo("No", "Nobeli", 259, 200, "[Rn] 5f¹⁴ 7s²", "+2, +3", "Actinoid", 102);
				danhSachNguyenTo.add(nobeli);





	}
	
	public void setThuocTinhButton(JButton button, int aF, int bF, int cF, int aB, int bB, int cB) {
		button.setForeground(new Color(aF, bF, cF));
		button.setBackground(new Color(aB, bB, cB));
	}
	
	public void AddButton() {
		buttonsHashMap.put("Lorenxi", Lorenxi);
		buttonsHashMap.put("Lutexi", Lutexi);
		buttonsHashMap.put("Heli", Heli);
		buttonsHashMap.put("Tebi", Tebi);
		buttonsHashMap.put("Gadolini", Gadolini);
		buttonsHashMap.put("Europi", Europi);
		buttonsHashMap.put("Hidro", Hidro);
		buttonsHashMap.put("Stibi", Stibi);
		buttonsHashMap.put("Asen", Asen);
		buttonsHashMap.put("Hidro", Hidro);
		buttonsHashMap.put("Liti", Liti);
		buttonsHashMap.put("Natri", Natri);
		buttonsHashMap.put("Kali", Kali);
		buttonsHashMap.put("Rubidi", Rubidi);
		buttonsHashMap.put("Xesi", Xesi);
		buttonsHashMap.put("Franxi", Franxi);
		buttonsHashMap.put("Beri", Beri);
		buttonsHashMap.put("Magie", Magie);
		buttonsHashMap.put("Canxi", Canxi);
		buttonsHashMap.put("Stronti", Stronti);
		buttonsHashMap.put("Bari", Bari);
		buttonsHashMap.put("Radi", Radi);
		buttonsHashMap.put("Scandi", Scandi);
		buttonsHashMap.put("Ytri", Ytri);
		buttonsHashMap.put("Lantan", Lantan);
		buttonsHashMap.put("Actini", Actini);
		buttonsHashMap.put("Titan", Titan);
		buttonsHashMap.put("Ziriconi", Ziriconi);
		buttonsHashMap.put("Hafini", Hafini);
		buttonsHashMap.put("Rozofodi", Rozofodi);
		buttonsHashMap.put("Vanadi", Vanadi);
		buttonsHashMap.put("Niobi", Niobi);
		buttonsHashMap.put("Tantan", Tantan);
		buttonsHashMap.put("Dupni", Dupni);
		buttonsHashMap.put("Crom", Crom);
		buttonsHashMap.put("Molipden", Molipden);
		buttonsHashMap.put("Vonfam", Vonfam);
		buttonsHashMap.put("Siboqi", Siboqi);
		buttonsHashMap.put("Mangan", Mangan);
		buttonsHashMap.put("Tecnexi", Tecnexi);
		buttonsHashMap.put("Reni", Reni);
		buttonsHashMap.put("Bori", Bori);
		buttonsHashMap.put("Fe", Fe);
		buttonsHashMap.put("Ruteni", Ruteni);	
		buttonsHashMap.put("Osimi", Osimi);
		buttonsHashMap.put("Hasi", Hasi);
		buttonsHashMap.put("Coban", Coban);
		buttonsHashMap.put("Rodi", Rodi);
		buttonsHashMap.put("Iridi", Iridi);
		buttonsHashMap.put("Meitneri", Meitneri);
		buttonsHashMap.put("Niken", Niken);
		buttonsHashMap.put("Paladi", Paladi);
		buttonsHashMap.put("Platin", Platin);
		buttonsHashMap.put("Darmastati", Darmastati);
		buttonsHashMap.put("Cu", Cu);
		buttonsHashMap.put("Ag", Ag);
		buttonsHashMap.put("Au", Au);
		buttonsHashMap.put("Roentgeni", Roentgeni);
		buttonsHashMap.put("Zn", Zn);
		buttonsHashMap.put("Cadimi", Cadimi);
		buttonsHashMap.put("Hg", Hg);
		buttonsHashMap.put("Copenixi", Copenixi);
		buttonsHashMap.put("Bo", Bo);
		buttonsHashMap.put("Cacbon", Cacbon);
		buttonsHashMap.put("Nito", Nito);
		buttonsHashMap.put("Oxi", Oxi);
		buttonsHashMap.put("Flo", Flo);
		buttonsHashMap.put("Neon", Neon);
		buttonsHashMap.put("Agon", Agon);
		buttonsHashMap.put("Clo", Clo);
		buttonsHashMap.put("S", S);
		buttonsHashMap.put("Photpho", Photpho);
		buttonsHashMap.put("Silic", Silic);
		buttonsHashMap.put("Al", Al);
		buttonsHashMap.put("Gali", Gali);
		buttonsHashMap.put("Indi", Indi);
		buttonsHashMap.put("Tali", Tali);
		buttonsHashMap.put("Ununtri", Ununtri);
		buttonsHashMap.put("Gemani", Gemani);
		buttonsHashMap.put("Sn", Sn);
		buttonsHashMap.put("Pb", Pb);
		buttonsHashMap.put("Flerovi", Flerovi);
		buttonsHashMap.put("Ununpenti", Ununpenti);
		buttonsHashMap.put("Livemori", Livemori);
		buttonsHashMap.put("Telu", Telu);
		buttonsHashMap.put("Selen", Selen);
		buttonsHashMap.put("Brom", Brom);
		buttonsHashMap.put("Iot", Iot);
		buttonsHashMap.put("Atatin", Atatin);
		buttonsHashMap.put("Radon", Radon);
		buttonsHashMap.put("Xenon", Xenon);
		buttonsHashMap.put("Kripton", Kripton);
		buttonsHashMap.put("Xeri", Xeri);
		buttonsHashMap.put("Prazeodim", Prazeodim);
		buttonsHashMap.put("Thori", Thori);
		buttonsHashMap.put("Protactini", Protactini);
		buttonsHashMap.put("Neodim", Neodim);
		buttonsHashMap.put("Urani", Urani);
		buttonsHashMap.put("Neptuni", Neptuni);
		buttonsHashMap.put("Prometi", Prometi);
		buttonsHashMap.put("Samari", Samari);
		buttonsHashMap.put("Plutoni", Plutoni);
		buttonsHashMap.put("Amerixi", Amerixi);
		buttonsHashMap.put("Curi", Curi);
		buttonsHashMap.put("Beckeli", Beckeli);
		buttonsHashMap.put("Califoni", Califoni);
		buttonsHashMap.put("Diprozi", Diprozi);
		buttonsHashMap.put("Honmi", Honmi);
		buttonsHashMap.put("Ensteni", Ensteni);
		buttonsHashMap.put("Fecmi", Fecmi);
		buttonsHashMap.put("Eribi", Eribi);
		buttonsHashMap.put("Tuli", Tuli);
		buttonsHashMap.put("Mendelevi", Mendelevi);
		buttonsHashMap.put("Nobeli", Nobeli);
		buttonsHashMap.put("Ytecbi", Ytecbi);
		buttonsHashMap.put("Bitmut", Bitmut);
		buttonsHashMap.put("Poloni", Poloni);
		
	}

	public void inThongTinNguyenTo(NguyenTo nt) {
		soHieuNguyenTuLabel.setText(nt.getSoHieuNguyenTu() + "");
		nguyenTuKhoiTrungBinhLabel.setText(nt.getNguyenTuKhoiTrungBinh() + "");
		kiHieuNguyenToLabel.setText(nt.getKiHieuHoaHoc());
		doAmDienLabel.setText(nt.getDoAmDien() + "");
		tenNguyenToLabel.setText(nt.getTenNguyenTo());
		cauHinhElectronLabel.setText(nt.getCauHinhElectron());
		soOxiHoaLabel.setText(nt.getSoOxiHoa());
		nhapKhongHopLeInfoLabel.setText("");
		
		// around()
		
		labelInfo1.setText("Số hiệu nguyên tử");
		labelInfo2.setText("Kí hiệu hoá học");
		labelInfo3.setText("Tên nguyên tố");
		labelInfo4.setText("Nguyên tử khối trung bình");
		LabelInfo5.setText("Độ âm điện");
		LabelInfo6.setText("Cấu hình electron");
		labelInfo7.setText("Số oxi hoá");
		
		panelScreen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		soOxiHoaLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelScreen.setBackground(Color.yellow);
		soOxiHoaLabel.setBackground(Color.white);
		soOxiHoaLabel.setOpaque(true);
	}
}
