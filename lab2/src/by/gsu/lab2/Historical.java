package by.gsu.lab2;

public class Historical extends Film {
	private String period;
	private String degree;

	public Historical(String producer, int duration, String audience, String period, String degree) {
		super(producer, duration, audience);
		this.period = period;
		this.degree = degree;
	}

	public Historical() {
		super();
		period = "Unknown";
		degree = "Unknown";
	}

	public Historical(String producer, int duration, String audience, String period) {
		super(producer, duration);
		this.period = period;
		degree = "Unknown";
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Historical " + super.toString() + ", period=" + period + ", degree=" + degree;
	}	
	
	@Override
	public String getName() {
		return super.getName()+" "+period+" "+degree;
	}
	
}
