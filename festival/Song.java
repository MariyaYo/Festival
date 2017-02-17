package festival;

public class Song {
	
	private String title;
	private String text;
	private int time;
	Song (String title, String text, int time ){
		if(title!=null && !title.isEmpty()){
			this.title = title;
		}
		this.text = text;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", text=" + text + "]";
	}
	public String getTitle() {
		return title;
	}
	public double getTime() {
		return time;
	}
	
	
	

}
