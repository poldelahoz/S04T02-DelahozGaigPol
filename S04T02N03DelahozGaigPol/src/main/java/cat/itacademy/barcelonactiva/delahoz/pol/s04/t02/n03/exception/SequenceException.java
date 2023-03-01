package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.exception;

public class SequenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errCode;
	private String errMsg;

	public SequenceException(String errMsg) {
		this.errMsg = errMsg;
	}

}