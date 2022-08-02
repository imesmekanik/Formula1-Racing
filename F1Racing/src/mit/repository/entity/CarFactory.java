package mit.repository.entity;

import mit.repository.exceptions.CarException;
import mit.utility.Database;

public class CarFactory {

	private static int aracSayisi = 0;

	public static int getAracSayisi() {
		return aracSayisi;
	}

	public static Car getCar(EMarka marka) {

		switch (marka) {
		case FERRARI:

			if (Ferrari.count < 2) {
				Ferrari.count++;
				aracSayisi++;
				Database.cars.add(new Ferrari("Ferrari"));
				return Database.cars.get(aracSayisi - 1);
			} else {
				try {
					throw new CarException("Only 2 cars per same brand allowed in a F1 Race");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			break;

		case MCLAREN:

			if (McLaren.count < 2) {

				McLaren.count++;
				aracSayisi++;
				Database.cars.add(new McLaren("Mclaren"));
				return Database.cars.get(getAracSayisi() - 1);
			} else {
				try {
					throw new CarException("Only 2 cars per same brand allowed in a F1 Race");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			break;

		default:
			break;
		}
		return null;
	}
}
