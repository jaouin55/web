package ver_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Beat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	private Image MusicBack;
	private JLabel menuBar = new JLabel(new ImageIcon(MainApp.class.getResource("../images/Menu.jpg")));
	private ImageIcon exitButtonBlackImage = new ImageIcon(MainApp.class.getResource("../images/ExitBlack.png"));
	private ImageIcon exitButtonRedImage = new ImageIcon(MainApp.class.getResource("../images/ExitRed.png"));
	private ImageIcon StartImage = new ImageIcon(MainApp.class.getResource("../images/Start.png"));
	private ImageIcon StartEnteredImage = new ImageIcon(MainApp.class.getResource("../images/StartEntered.png"));
	private ImageIcon QuitImage = new ImageIcon(MainApp.class.getResource("../images/Quit.png"));
	private ImageIcon QuitEnteredImage = new ImageIcon(MainApp.class.getResource("../images/QuitEntered.png"));
	private JButton exitButton = new JButton(exitButtonBlackImage);
	private JButton StartButton = new JButton(StartImage);
	private JButton QuitButton = new JButton(QuitImage);
	private int mouseX , mouseY;
	
	
	public Beat() {
		setUndecorated(true);//메뉴바 숨김
		setTitle("BeatGame");
		setSize(MainApp.SCREEN_WIDTH,MainApp.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		Music hey = new Music("hey.mp3",true);
		hey.start();
		
		exitButton.setBounds(1245,0,36,36);
		exitButton.setBorderPainted(false); //외각선 delete
		exitButton.setContentAreaFilled(false); //내용영역 delete
		exitButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				exitButton.setIcon(exitButtonRedImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				exitButton.setIcon(exitButtonBlackImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); //누르면 종료
			}
		});
		add(exitButton);
		
		StartButton.setBounds(80,150,150,150);
		StartButton.setBorderPainted(false); //외각선 delete
		StartButton.setContentAreaFilled(false); //내용영역 delete
		StartButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		StartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				StartButton.setIcon(StartEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				StartButton.setIcon(StartImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				StartButton.setVisible(false);
				QuitButton.setVisible(false);
				MusicBack = new ImageIcon(MainApp.class.getResource("../images/MusicBack2.jpg")).getImage();
				Music buttonEnteredMusic = new Music("play3.mp3",false);
				buttonEnteredMusic.start();
				hey.close();
			
		
			
			}
		});
		add(StartButton);
		
		QuitButton.setBounds(350,150,150,150);
		QuitButton.setBorderPainted(false); //외각선 delete
		QuitButton.setContentAreaFilled(false); //내용영역 delete
		QuitButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		QuitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				QuitButton.setIcon(QuitEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				QuitButton.setIcon(QuitImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		add(QuitButton);
		
		menuBar.setBounds(0,0,1250,38); //menuBar position
		menuBar.addMouseListener(new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX , y - mouseY); //menuBar move true
			}
		});
		add(menuBar);
		
		MusicBack = new ImageIcon(MainApp.class.getResource("../images/MusicBack.jpg")).getImage();
	
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(MainApp.SCREEN_WIDTH,MainApp.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(MusicBack, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}	
}