package by.gsu.lab2;

public class Runner {

	public static void main(String[] args) {
		String producer = "J.Cameron";
		int duration = 124;
		String audience = "16+";
		String artist = "Abec";
		String style = "Анимация";
		String instrument = "Piano";
		int count = 9;
		String period = "Средние века";
		String degree = "realistic";
		Film mas[] = {
				new Film(),
				new Film(producer, duration),
				new Film(producer, duration, audience),
				new Cartoon(),
				new Cartoon(producer, duration, style),
				new Cartoon(producer, duration, audience, artist, style),
				new Musical(),
				new Musical(producer, duration, instrument),
				new Musical(producer, duration, audience, instrument, count),
				new Historical(producer, duration, audience, period, degree)
				};
		for (int cur = 0; cur < mas.length; cur++){
			System.out.println(cur+" toString: "+mas[cur].toString());
			//System.out.println(cur+" name: "+mas[cur-1].getName());
		}

	}

}
