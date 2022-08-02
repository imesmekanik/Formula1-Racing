package mit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mit.repository.entity.Parkur;
import mit.repository.entity.Yaris;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parkur parkur = new Parkur(100);

		parkur.getAraclar().stream().forEach(x -> System.out.println(x));
		System.out.println("*************Yaris Basliyor**************");

		yaris();

	}

	public static void yaris() {

		ExecutorService ex = Executors.newFixedThreadPool(Parkur.araclar.size());
		for (int i = 0; i < Parkur.araclar.size(); i++) {
			ex.submit(new Yaris(Parkur.araclar.get(i).getBrand()));
		}
		ex.shutdown();

	}

}
