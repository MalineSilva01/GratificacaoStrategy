package map;

public class Cliente {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,
				1700, 1);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario funcionarioGerente = new Funcionario(Funcionario.GERENTE,
				3000, 2);
		System.out.println(funcionarioGerente.calcularGratificacao());
		
		
	}

}
