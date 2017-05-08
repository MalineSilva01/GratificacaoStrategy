package strategyEnum;



public class Cliente {

	public static void main(String[] args) {
		Funcionario funcionarioDesenvolvedor = new Funcionario(GratificacaoEnum.DESENVOLVEDOR, 300, 2);
		System.out.println(funcionarioDesenvolvedor.calcularGratificacao());
		
		Funcionario funcionarioDesenvolvedorDois = new Funcionario(GratificacaoEnum.DESENVOLVEDOR, 300, 1);
		System.out.println(funcionarioDesenvolvedor.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario(GratificacaoEnum.LIDER, 400, 1);
		System.out.println(funcionarioLider.calcularGratificacao());
		

	
		
	}

}
