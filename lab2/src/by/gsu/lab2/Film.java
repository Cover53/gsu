package by.gsu.lab2;

public class Film {
	private String producer;
	private int duration;
	private String audience;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public String getName() {
		return producer + " " + duration + " " + audience;
	}

	public Film(String producer, int duration, String audience) {
		this.producer = producer;
		this.duration = duration;
		this.audience = audience;
	}

	public Film() {
		producer = "Unknown";
		duration = 0;
		audience = "Unknown";
	}

	public Film(String producer, int duration) {
		this.producer = producer;
		this.duration = duration;
		audience = "unknown";
	}

	@Override
	public String toString() {
		return "film producer=" + producer + ", duration=" + duration + 
				", audience=" + audience;
	}
	
	

}
