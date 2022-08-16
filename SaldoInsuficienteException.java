package br.com.syonet;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super("Você não possui saldo");
	}

}