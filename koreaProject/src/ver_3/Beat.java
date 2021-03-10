package ver_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

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
	private ImageIcon StartButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/StartButtonEntered.png"));
	private ImageIcon QuitImage = new ImageIcon(MainApp.class.getResource("../images/QuitButton.png"));
	private ImageIcon QuitEnteredImage = new ImageIcon(MainApp.class.getResource("../images/QuitButtonEntered.png"));
	private ImageIcon OptionsImage= new ImageIcon(MainApp.class.getResource("../images/Options.png"));
	private ImageIcon OptionsEnteredImage = new ImageIcon(MainApp.class.getResource("../images/OptionsEntered.png"));
	private ImageIcon ExitButtonImage = new ImageIcon(MainApp.class.getResource("../images/ExitButton.png"));
	private ImageIcon ExitButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/ExitButtonEntered.png"));
	private ImageIcon CreditsButtonImage = new ImageIcon(MainApp.class.getResource("../images/CreditsButton.png"));
	private ImageIcon CreditsButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/CreditsButtonEntered.png"));
	private ImageIcon RockButtonImage = new ImageIcon(MainApp.class.getResource("../images/RockButton.png"));
	private ImageIcon RockButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/RockButtonEntered.png"));
	private ImageIcon LeftButtonnImage = new ImageIcon(MainApp.class.getResource("../images/LeftButton.png"));
	private ImageIcon RightButtonImage = new ImageIcon(MainApp.class.getResource("../images/RightButton.png"));
	private ImageIcon EasyButtonImage = new ImageIcon(MainApp.class.getResource("../images/EasyButton.png"));
	private ImageIcon HardButtonImage = new ImageIcon(MainApp.class.getResource("../images/HardButton.png"));
	private ImageIcon BackButtonImage = new ImageIcon(MainApp.class.getResource("../images/BackButton.png"));
	private ImageIcon BackButtonEnteredImage = new ImageIcon(MainApp.class.getResource("../images/BackButtonEntered.png"));

	private Image GameInfoImage = new ImageIcon(MainApp.class.getResource("../images/GameInfo.jpg")).getImage();
	private Image JudgmentImage = new ImageIcon(MainApp.class.getResource("../images/Judgment.jpg")).getImage();
	private Image RedNoteImage = new ImageIcon(MainApp.class.getResource("../images/RedNote.png")).getImage();
	private Image BlueNoteImage = new ImageIcon(MainApp.class.getResource("../images/BlueNote.png")).getImage();
	private Image YellowNoteImage = new ImageIcon(MainApp.class.getResource("../images/YellowNote.png")).getImage();
	private Image PinkNoteImage = new ImageIcon(MainApp.class.getResource("../images/PinkNote.png")).getImage();
	private Image NoteBackgroundImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteLineImage = new ImageIcon(MainApp.class.getResource("../images/NoteLine.jpg")).getImage();
	
	
	private JButton StartButton = new JButton(StartImage);
	private JButton QuitButton = new JButton(QuitImage);
	private JButton OptionsButton = new JButton(OptionsImage);
	private JButton ExitButton = new JButton(ExitButtonImage);
	private JButton LeftButton = new JButton(LeftButtonnImage);
	private JButton RightButton = new JButton(RightButtonImage);
	private JButton EasyButton = new JButton(EasyButtonImage);
	private JButton HardButton = new JButton(HardButtonImage);
	private JButton CreditsButton = new JButton(CreditsButtonImage);
	private JButton RockButton = new JButton(RockButtonImage);
	private JButton BackButton = new JButton(BackButtonImage);
	
	private int mouseX , mouseY;
	private boolean isMainScreen = false;
	private boolean isGameScreen = false;
	
	ArrayList<PlayTrack> playTrackList = new ArrayList<PlayTrack>(); //곡 담은 배열
	
	private Image selectedImage;
	private Music selectedMusic;
	Music MainSoundHighright = new Music("MainSoundHighright.mp3",true);
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
		
		MainSoundHighright.start();
		
		playTrackList.add(new PlayTrack("GameBack2.png","GameBack2.png",
										"play5Highright.mp3","play5.mp3"));
		playTrackList.add(new PlayTrack("GameBack3.png","GameBack3.png",
										"play4Highright.mp3","play4.mp3"));
		playTrackList.add(new PlayTrack("GameBack4.png","GameBack4.png",
										"play3Highright.mp3","play3.mp3"));
	
		StartButton.setBounds(50,100,300,100);
		StartButton.setBorderPainted(false); //외각선 delete
		StartButton.setContentAreaFilled(false); //내용영역 delete
		StartButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		StartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				StartButton.setIcon(StartButtonEnteredImage); //올리면 이미지변경
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
				CreditsButton.setVisible(false);
				RockButton.setVisible(false);
				LeftButton.setVisible(true);
				RightButton.setVisible(true);
				EasyButton.setVisible(true);
				HardButton.setVisible(true);
				MusicBack = new ImageIcon(MainApp.class.getResource("../images/MusicBack2.jpg")).getImage();
				MainSoundHighright.close();
				isMainScreen=true;
			}
		});
		add(StartButton);
		
		QuitButton.setBounds(50,200,300,100);
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
		
		OptionsButton.setBounds(350,85,300,50);
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
		
		CreditsButton.setBounds(350,185,300,50);
		CreditsButton.setBorderPainted(false); //외각선 delete
		CreditsButton.setContentAreaFilled(false); //내용영역 delete
		CreditsButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		CreditsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				CreditsButton.setIcon(CreditsButtonEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				CreditsButton.setIcon(CreditsButtonImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
		add(CreditsButton);
		
		RockButton.setBounds(350,285,300,50);
		RockButton.setBorderPainted(false); //외각선 delete
		RockButton.setContentAreaFilled(false); //내용영역 delete
		RockButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		RockButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				RockButton.setIcon(RockButtonEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				RockButton.setIcon(RockButtonImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
		add(RockButton);
		
		ExitButton.setBounds(1240,0,36,36);
		ExitButton.setBorderPainted(false); //외각선 delete
		ExitButton.setContentAreaFilled(false); //내용영역 delete
		ExitButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		ExitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				ExitButton.setIcon(ExitButtonEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				ExitButton.setIcon(ExitButtonImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); //누르면 종료
			}
		});
		add(ExitButton);
		
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
		
		EasyButton.setVisible(false);
		EasyButton.setBounds(390,600,250,100);
		EasyButton.setBorderPainted(false); //외각선 delete
		EasyButton.setContentAreaFilled(false); //내용영역 delete
		EasyButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		EasyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				gameStart(nowSelected,"Easy");
			}
		});
		add(EasyButton);
		
		HardButton.setVisible(false);
		HardButton.setBounds(635,600,250,100);
		HardButton.setBorderPainted(false); //외각선 delete
		HardButton.setContentAreaFilled(false); //내용영역 delete
		HardButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		HardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				gameStart(nowSelected,"Hard");
			}
		});
		add(HardButton);
	
		menuBar.setBounds(0,0,1280,38); //menuBar position
		menuBar.addMouseListener(new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		BackButton.setVisible(false);
		BackButton.setBounds(20,50,80,80);
		BackButton.setBorderPainted(false); //외각선 delete
		BackButton.setContentAreaFilled(false); //내용영역 delete
		BackButton.setFocusPainted(false); //선택(focus)될때 생기는 테두리 delete
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				BackButton.setIcon(BackButtonEnteredImage); //올리면 이미지변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				BackButton.setIcon(BackButtonImage); //땟을때 basic으로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				BackMain();
			}
		});
		add(BackButton);
		
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
			g.drawImage(selectedImage, 320, 100, 700, 500, null);
		}
		if(isGameScreen) {
			g.drawImage(NoteBackgroundImage, 150, 0, 100, 650, null);
			g.drawImage(NoteLineImage,250 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 270, 0, 100, 650, null);
			g.drawImage(NoteLineImage,370 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 390, 0, 100, 650, null);
			g.drawImage(NoteLineImage,490 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 510, 0, 250, 650, null);
			g.drawImage(NoteLineImage,760 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 780, 0, 100, 650, null);
			g.drawImage(NoteLineImage,880 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 900, 0, 100, 650, null);
			g.drawImage(NoteLineImage,1000 , 0 , 20 , 650, null);
			g.drawImage(NoteBackgroundImage, 1020, 0, 100, 650, null);
			
			g.drawImage(GameInfoImage, 150, 650, 970, 30, null);
			g.drawImage(JudgmentImage, 150, 620, 970, 30, null);
			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.drawString("Curves Of Road - All I WANT IS YOUR LOVE", 5, 715);
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.setColor(Color.BLACK);
			g.drawString("EasyMode", 30, 150);
			g.setFont(new Font("Arial", Font.BOLD, 30));
			g.drawString("000000", 30, 240);
			g.setColor(Color.RED);
			g.drawString("Score", 30, 200);
			g.setColor(Color.LIGHT_GRAY);
			g.drawString("S",190,676);
			g.drawString("D",310,676);
			g.drawString("F",430,676);
			g.drawString("Space Bar",560,676);
			g.drawString("J",820,676);
			g.drawString("K",940,676);
			g.drawString("L",1060,676);
		}
		paintComponents(g);
		this.repaint();
	}	
	
	public void selectPlayTrack(int nowSelected) {
		if(selectedMusic != null) 
			selectedMusic.close();
			selectedImage = new ImageIcon(MainApp.class.getResource("../images/"+playTrackList.get(nowSelected).getStartImage())).getImage();
			selectedMusic = new Music(playTrackList.get(nowSelected).getStartMusic(),true);
			selectedMusic.start();
		}
	
	public void selectLeft() {
		if(nowSelected == 0) {
			nowSelected = playTrackList.size() -1;
		}else
			nowSelected--;
		selectPlayTrack(nowSelected);
	}
	
	public void selectRight() {
		if(nowSelected == playTrackList.size() -1) {
			nowSelected = 0;
		}else
			nowSelected++;
		selectPlayTrack(nowSelected);
	}
	
	public void gameStart(int nowSelected , String difficulty) {
		if (selectedMusic != null)
			selectedMusic.close();
			isMainScreen = false;
			LeftButton.setVisible(false);
			RightButton.setVisible(false);
			EasyButton.setVisible(false);
			HardButton.setVisible(false);
			BackButton.setVisible(true);
			selectedImage = new ImageIcon(MainApp.class.getResource("../images/"+playTrackList.get(nowSelected).getGmaeImage())).getImage();	
			isGameScreen = true;
	}
	
	public void BackMain() {
		isMainScreen = true;
		LeftButton.setVisible(true);
		RightButton.setVisible(true);
		EasyButton.setVisible(true);
		HardButton.setVisible(true);
		selectedImage = new ImageIcon(MainApp.class.getResource("../images/"+playTrackList.get(nowSelected).getGmaeImage())).getImage();	
		BackButton.setVisible(false);
		selectPlayTrack(nowSelected);
		isGameScreen = false;
	}
}