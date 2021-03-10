package ver_3;

public class PlayTrack {

	private String startImage; //선택창 이미지 
	private String gmaeImage; //해당곡의 이미지
	private String startMusic; //게임 선택 창 음악
	private String gameMusic; //해당곡 실행 음악
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGmaeImage() {
		return gmaeImage;
	}
	public void setGmaeImage(String gmaeImage) {
		this.gmaeImage = gmaeImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	public PlayTrack(String startImage, String gmaeImage, String startMusic, String gameMusic) {
		super();
		this.startImage = startImage;
		this.gmaeImage = gmaeImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}

	
}
