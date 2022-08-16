package br.com.syonet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio02 {

	public static void main(String[] args) {

		List<Conta> contaBanco = Arrays.asList(

				new Conta("002.201.970-75", "João Antonio", "itau", 0000, "00000-0", 55.5),
				new Conta("732.521.612-96", "Zilda", "itau", 0000, "00003-1", 1000000.5),
				new Conta("022.401.976-85", "Silvia", "itau", 0000, "00002-2", 0.0),
				new Conta("102.251.950-20", "Jean", "itau", 0000, "00001-3", -3000.5));

		try {
			consultaConta(contaBanco);
		} catch (ContaNaoEncontradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void consultaConta(List<Conta> contas) throws ContaNaoEncontradaException {
		List contasFiltradas = contas.stream().filter(conta -> "022.401.976-85" == conta.getCpf())
				.collect(Collectors.toList());
		if (contasFiltradas.size() == 0) {
			throw new ContaNaoEncontradaException();
		} else {
			System.out.println(contasFiltradas.get(0).toString());
		}
	}

//	private double buscaSaldo(String contas) {
//		Conta conta = consultaConta(contas);
//		if (conta.getSaldo() < 0) {
//			throw new SaldoNegativadoException();
//		} else
//			return conta.getSaldo();
//	}

}