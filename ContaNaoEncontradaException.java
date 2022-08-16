package br.com.syonet;

public class ContaNaoEncontradaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaNaoEncontradaException() {
		super("Conta não encontrada");
	}

}