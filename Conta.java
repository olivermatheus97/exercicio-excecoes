package br.com.syonet;

public class Conta {

	private String cpf;
	private String nome;
	private String banco;
	private int agencia;
	private String numConta;
	private Double saldo;

	public Conta(String cpf, String nome, String banco, int agencia, String numConta, Double saldo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.banco = banco;
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nCpf: " + cpf + "\nNome: " + nome + "\nBanco: " + banco + "\nAgencia: " + agencia
				+ "\nNumero da conta: " + numConta + "\nSaldo: " + saldo;

	}
}