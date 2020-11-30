package ver_4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.sun.javafx.scene.control.SelectedCellsMap;

public class Game extends Thread{
	
	private Image GameInfoImage = new ImageIcon(MainApp.class.getResource("../images/GameInfo.jpg")).getImage();
	private Image JudgmentImage = new ImageIcon(MainApp.class.getResource("../images/Judgment.jpg")).getImage();
	private Image RedNoteImage = new ImageIcon(MainApp.class.getResource("../images/RedNote.png")).getImage();
	private Image BlueNoteImage = new ImageIcon(MainApp.class.getResource("../images/BlueNote.png")).getImage();
	private Image YellowNoteImage = new ImageIcon(MainApp.class.getResource("../images/YellowNote.png")).getImage();
	private Image PinkNoteImage = new ImageIcon(MainApp.class.getResource("../images/PinkNote.png")).getImage();
	private Image NoteBackgroundSImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundDImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundFImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundSpaceImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundJImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundKImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteBackgroundLImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	private Image NoteLineImage = new ImageIcon(MainApp.class.getResource("../images/NoteLine.jpg")).getImage();
	private Image PressImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	
	private String titleName;
	private String difficulty;
	
	public Game(String titleName , String difficulty) {
		this.titleName = titleName;
		this.difficulty = difficulty;
	}
	
	public void ScreenDraw(Graphics g) {
		//space bar width : 250
		//basic width : 100
		
		g.drawImage(NoteBackgroundSImage, 150, 0, 100, 650, null);
		g.drawImage(NoteLineImage,250 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundDImage, 270, 0, 100, 650, null);
		g.drawImage(NoteLineImage,370 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundFImage, 390, 0, 100, 650, null);
		g.drawImage(NoteLineImage,490 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundSpaceImage, 510, 0, 250, 650, null);
		g.drawImage(NoteLineImage,760 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundJImage, 780, 0, 100, 650, null);
		g.drawImage(NoteLineImage,880 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundKImage, 900, 0, 100, 650, null);
		g.drawImage(NoteLineImage,1000 , 0 , 20 , 650, null);
		g.drawImage(NoteBackgroundLImage, 1020, 0, 100, 650, null);
		g.drawImage(RedNoteImage, 150, 100, 100, 30, null);
		g.drawImage(BlueNoteImage, 270, 400, 100, 30, null);
		g.drawImage(YellowNoteImage, 510, 370, 250, 30, null);
		g.drawImage(PinkNoteImage, 900, 200, 100, 30, null);
		
		g.drawImage(GameInfoImage, 150, 650, 970, 30, null);
		g.drawImage(JudgmentImage, 150, 620, 970, 30, null);
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString(titleName, 5, 715);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.setColor(Color.BLACK);
		g.drawString(difficulty, 30, 150);
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
	
	public void pressS() {
		NoteBackgroundSImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseS() {
		NoteBackgroundSImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressD() {
		NoteBackgroundDImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseD() {
		NoteBackgroundDImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressF() {
		NoteBackgroundFImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseF() {
		NoteBackgroundFImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressSpace() {
		NoteBackgroundSpaceImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseSpace() {
		NoteBackgroundSpaceImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressJ() {
		NoteBackgroundJImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseJ() {
		NoteBackgroundJImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressK() {
		NoteBackgroundKImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseK() {
		NoteBackgroundKImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	public void pressL() {
		NoteBackgroundLImage = new ImageIcon(MainApp.class.getResource("../images/Press.jpg")).getImage();
	}
	public void releaseL() {
		NoteBackgroundLImage = new ImageIcon(MainApp.class.getResource("../images/NoteBackground.jpg")).getImage();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
	