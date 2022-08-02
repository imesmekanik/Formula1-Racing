package mit.repository.entity;

import java.util.ArrayList;
import java.util.List;

public class Parkur {

	public static int yolUzunlugu = 100;
	public static List<Car> araclar = new ArrayList<Car>();
	public static int aracSayisi = CarFactory.getAracSayisi();

	public Parkur() {
		super();
		this.aracSayisi = CarFactory.getAracSayisi();
		this.yolUzunlugu = 100;
		this.araclariEkle();
	}

	public Parkur(int yolUzunlugu) {
		super();
		this.aracSayisi = CarFactory.getAracSayisi();
		this.yolUzunlugu = yolUzunlugu;
		this.araclariEkle();
	}

	public List<Car> getAraclar() {
		return araclar;
	}

	public void setAraclar(List<Car> araclar) {
		this.araclar = araclar;
	}

	public int getAracSayisi() {
		return aracSayisi;
	}

	public void setAracSayisi(int aracSayisi) {
		this.aracSayisi = aracSayisi;
	}

	public int getYolUzunlugu() {
		return yolUzunlugu;
	}

	public void setYolUzunlugu(int yolUzunlugu) {
		this.yolUzunlugu = yolUzunlugu;
	}

	public void araclariEkle() {
		Car ferrari1 = new Ferrari("Ferrari1");
		Car mclaren1 = new McLaren("Mclaren1");
		Car ferrari2 = new Ferrari("Ferrari2");
		Car mclaren2 = new McLaren("Mclaren2");

		System.out.println("-----");
		this.araclar.add(ferrari1);
		this.araclar.add(mclaren1);
		this.araclar.add(mclaren2);
		this.araclar.add(ferrari2);
	}

	@Override
	public String toString() {
		return "Parkur [aracSayisi=" + aracSayisi + ", yolUzunlugu=" + yolUzunlugu + "]";
	}

}
