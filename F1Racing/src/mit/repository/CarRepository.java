package mit.repository;

import java.util.List;

import mit.repository.entity.Car;
import mit.utility.Database;

public class CarRepository {

	/**
	 * CRUD Ýþlemlerinini yapýldýðý yer.
	 */
	// Kayýt yapar.
	// public void save(Car Car) {

	// }
	// Kayýt iþlemi yapar. geri bildirim yapar.
	// public boolean save(Car Car,int s) {

	// return false;
	// }
	// Kayýt eder ve kayýt ettiði nesneyi geri döner.
	public Car save(Car car) {
		Database.cars.add(car);
		return car;
	}

	public Car update(Car car) {
		/**
		 * güncelleme iþlemlerinde id kullanýlacak MEvcut olan kayýtlarý tek tek
		 * geziniyoruz. bu esnada, bize güncellenmek için verilen datanýn id si ile
		 * gezinmekte olduðumuz datalardan birisinin id si eþit ise bilgilerini
		 * güncelliyoruz. /* for(Car d: Database.cars) {
		 * if(d.getId().equals(Car.getId())) { d.setAciklama(Car.getAciklama());
		 * d.setAd(Car.getAd()); } }
		 */
		return car;
	}

	public boolean delete(Car Car) {
		return true;
	}

	// tercih edilen yöntem budur.
	public boolean delete(String id) {
		return true;
	}

	public boolean delete(int index) {
		return true;
	}

	public List<Car> findAll() {
		return Database.cars;
	}

	public Car findById(String id) {
		return null;
	}

	public Car findByAd(String ad) {
		return null;
	}

}