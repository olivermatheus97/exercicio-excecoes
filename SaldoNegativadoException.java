package br.com.syonet;

public class SaldoNegativadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoNegativadoException() {
		super("Seu saldo é negativo");
	}

}