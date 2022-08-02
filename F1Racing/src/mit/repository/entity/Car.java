package mit.repository.entity;

public abstract class Car {
	private String brand;
	double score;
	private int engine;

	public Car(String brand) {
		super();
		this.brand = brand;
		this.score = 0;
		this.engine = 0;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getscore() {
		return score;
	}

	public void setscore(double score) {
		this.score = score;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", score=" + score + ", engine=" + engine + "]";
	}

}
