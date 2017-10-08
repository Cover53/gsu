package by.gsu.lab2;

public class Musical extends Film {
	private String instrument;
	private int count;

	public Musical(String producer, int duration, String audience, String instrument, int count) {
		super(producer, duration, audience);
		this.instrument = instrument;
		this.count = count;
	}

	public Musical() {
		super();
		instrument = "unknown";
		count = 0;
	}

	public Musical(String producer, int duration, String instrument) {
		super(producer, duration);
		this.instrument = instrument;
		count = 0;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Musical " + super.toString() + ", instrument=" + instrument + ", count=" + count;
	}

	@Override
	public String getName() {
		return super.getName()+" "+instrument+" "+count;
	}

}
