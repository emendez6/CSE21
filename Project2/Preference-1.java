
public class Preference {
	private int quietTime;
	private int music;
	private int reading;
	private int chatting;
	
	public Preference() {
		quietTime = 0;
		music = 0;
		reading = 0;
		chatting = 0;
	}
	
	public Preference(int quiet, int music, int reading, int chat) {
		this.quietTime = quiet;
		this.music = music;
		this.reading = reading;
		this.chatting = chat;
	}
	
	public void setquietTime(int quietTime) {
		this.quietTime = quietTime;
	}
	
	public void setMusic(int music) {
		this.music = music;
	}
	
	public void setReading(int reading) {
		this.reading = reading;
	}
	
	public void setChatting(int chatting) {
		this.chatting = chatting;
	}
	
	public int getquiteTime() {
		return quietTime;
	}
	
	public int getMusic() {
		return music;
	}
	
	public int getReading() {
		return reading;
	}
	
	public int getChatting() {
		return chatting;
	}
	
	public int compare(Preference pref) {
		int q = Math.abs(getquiteTime() - pref.getquiteTime());
		int m = Math.abs(getMusic() - pref.getMusic());
		int r = Math.abs(getReading() - pref.getReading());
		int c = Math.abs(getChatting() - pref.getChatting());
		int total = q + m + r + c;
		return total;
	}
}
