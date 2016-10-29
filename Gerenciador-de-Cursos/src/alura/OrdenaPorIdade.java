package alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario funcionario, Funcionario outroFUncionario) {
		return funcionario.getIdade() - outroFUncionario.getIdade();
	}

}
