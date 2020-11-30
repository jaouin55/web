package ver_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Beat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	private Image MusicBack;
	
	private JLabel menuBar = new JLabel(new ImageIcon(MainApp.class.getResource("../images/Menu.jpg")));
	
	private ImageIcon StartImage = new ImageIcon(MainApp.class.getResource("../images/start.png"));
	private ImageIcon StartEnteredImage = new ImageIcon(MainApp.class.getResource("../images/StartEntered.png"));
	private ImageIcon QuitImage = new ImageIcon(MainApp.class.getResource("../images/Quit.png"));
	private ImageIcon QuitEnteredImage = new ImageIcon(MainApp.class.getResource("../images/QuitEntered.png"));
	private ImageIcon OptionsImage= new ImageIcon(MainApp.class.getResource("../images/Options.png"));
	private ImageIcon OptionsEnteredImage = new ImageIcon(MainApp.class.getResource("../images/OptionsEntered.png"));
	private ImageIcon ExitButtonImage = new ImageIcon(MainApp.class.getResource("../images/ExitBlack.png"));
	private ImageIcon ExitButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/ExitRed.png"));
	private ImageIcon LeftButtonnImage = new ImageIcon(MainApp.class.getResource("../images/LeftButton.png"));
	private ImageIcon RightButtonImage = new ImageIcon(MainApp.class.getResource("../images/RightButton.png"));

	private JButton StartButton = new JButton(StartImage);
	private JButton QuitButton = new JButton(QuitImage);
	private JButton OptionsButton = new JButton(OptionsImage);
	private JButton exitButton = new JButton(ExitButtonImage);
	private JButton LeftButton = new JButton(LeftButtonnImage);
	private JButton RightButton = new JButton(RightButtonImage);

	private int mouseX , mouseY;
	private boolean isMainScreen = false;
	
	ArrayList<PlayTrack> palyTrackList = new ArrayList<PlayTrack>(); //곡 담은 배열
	
	private Image selectedImage;
	private Music selectedMusic;
	private int nowSelected = 0;
	
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
		
		Music MainSoundHighright = new Music("MainSoundHighright.mp3",true);
		MainSoundHighright.start();
		
		palyTrackList.add(new PlayTrack("GameBack2.jpg","GameBack2.jpg",
										"play3Highright.mp3","play3.mp3"));
		palyTrackList.add(new PlayTrack("GameBack3.jpg","GameBack3.jpg",
										"play4Highright.mp3","play4.mp3"));
		palyTrackList.add(new PlayTrack("GameBack4.jpg","GameBack4.jpg",
										"play5Highright.mp3","play5.mp3"));
		
		
		StartButton.setBounds(50,150,300,200);
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
				selectPlayTrack(0);
				StartButton.setVisible(false);
				QuitButton.setVisible(false);
				OptionsButton.setVisible(false);
				LeftButton.setVisible(true);
				RightButton.setVisible(true);
				MusicBack = new ImageIcon(MainApp.class.getResource("../images/MusicBack2.jpg")).getImage();
				MainSoundHighright.close();
				isMainScreen=true;
				//Music selectedMusic = new Music("play5Highright.mp3",true);
				//selectedMusic.start();
			}
		});
		add(StartButton);
		
		exitButton.setBounds(1245,0,36,36);
		exitButton.setBorderPainted(false); //외각선 delete
		exitButton.setContentAreaFilled(false); //내용영역 delete
		exitButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				exitButton.setIcon(ExitButtonEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				exitButton.setIcon(ExitButtonImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); //누르면 종료
			}
		});
		add(exitButton);
		
		OptionsButton.setBounds(450,150,300,200);
		OptionsButton.setBorderPainted(false); //외각선 delete
		OptionsButton.setContentAreaFilled(false); //내용영역 delete
		OptionsButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		OptionsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				OptionsButton.setIcon(OptionsEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				OptionsButton.setIcon(OptionsImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
		});
		add(OptionsButton);
		
		QuitButton.setBounds(250,150,300,200);
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
		
		LeftButton.setVisible(false);
		LeftButton.setBounds(50,320,80,80);
		LeftButton.setBorderPainted(false); //외각선 delete
		LeftButton.setContentAreaFilled(false); //내용영역 delete
		LeftButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		LeftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				selectLeft();
			}
		});
		add(LeftButton);
		
		RightButton.setVisible(false);
		RightButton.setBounds(1160,320,80,80);
		RightButton.setBorderPainted(false); //외각선 delete
		RightButton.setContentAreaFilled(false); //내용영역 delete
		RightButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		RightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				selectRight();
			}
		});
		add(RightButton);
		
	
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
		if(isMainScreen) {
			g.drawImage(selectedImage,165,110,null);
		}
		paintComponents(g);
		this.repaint();
	}	
	
	public void selectPlayTrack(int nowSelected) {
		if(selectedMusic != null) 
			selectedMusic.close();
			selectedImage = new ImageIcon(MainApp.class.getResource("../images/"+palyTrackList.get(nowSelected).getStartImage())).getImage();
			selectedMusic = new Music(palyTrackList.get(nowSelected).getStartMusic(),true);
			selectedMusic.start();
		}
	
	public void selectLeft() {
		if(nowSelected == 0) {
			nowSelected = palyTrackList.size() -1;
		}else
			nowSelected--;
		selectPlayTrack(nowSelected);
	}
	
	public void selectRight() {
		if(nowSelected == palyTrackList.size() -1) {
			nowSelected = 0;
		}else
			nowSelected++;
		selectPlayTrack(nowSelected);
	}
}