package mit.repository.entity;

import java.util.HashMap;
import java.util.Map;

public class Yaris extends Thread {
	String name;

	Map<String, Double> skorTablosu = new HashMap<String, Double>();

	public Yaris(String name) {
		this.name = name;
	}

	public void run() {
		try {
			long zaman = System.currentTimeMillis();
			int k = 0;

			for (int i = 0; i < 100; i++) {
				// System.out.println("Selam ben " + this.name + "sira: " + i);
				try {

					Thread.sleep(3100 - Parkur.araclar.get(k).getEngine());
					k++;
					k = k % 4;

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("hata");
					e.printStackTrace();
				}
				if (i % 10 == 0) {
					System.out.println(name + "-->" + i + ".metrede");
				}

			}
			zaman = System.currentTimeMillis() - zaman;
			System.out.println(name + " yarisi " + (zaman) + " surede tamamladi. ");

			for (Car car : Parkur.araclar) {
				if (name.equals(car.getBrand())) {
					car.setscore(40000 - zaman);

					skorTablosu.put(name, car.score);
				}
			}

			skorTablosu.entrySet().forEach(s -> System.out.println(s.getKey() + "skoru: " + s.getValue()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
