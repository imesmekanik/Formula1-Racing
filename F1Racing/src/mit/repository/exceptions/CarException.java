package mit.repository.exceptions;

public class CarException extends RuntimeException {

	String msj;

	public CarException() {
		// TODO Auto-generated constructor stub
	}

	public CarException(String msj) {
		super();
		this.msj = msj;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsj();
	}

}
