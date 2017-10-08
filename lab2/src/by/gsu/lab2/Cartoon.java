package by.gsu.lab2;

public class Cartoon extends Film{
	private String artist;
	private String style;
	
	public Cartoon(String producer, int duration, String audience, String artist, String style) {
		super(producer, duration, audience);
		this.artist = artist;
		this.style = style;
	}

	public Cartoon() {
		super();
		artist = "unknown";
		style = "unknown";
	}

	public Cartoon(String producer, int duration, String style) {
		super(producer, duration);
		this.style = style;
	}

	@Override
	public String getName() {
		return super.getName() + " "+artist + " "+style;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Cartoon " + super.toString() + ", artist=" + artist + 
				", style=" + style;
	}

	
	
	
	
}
