package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Cliente pedro = new Cliente();
		//	quero que o pedro seja estudante -> tenha emprestimo comum
		pedro.setComprar(new ComprarComum());
		pedro.realizarComprar();
		
		System.out.println("--------------------------------");
		
		//agora o pedro virou gerente
		pedro.setComprar(new ComprarEspecial());
		pedro.realizarComprar();
		
		
	}
	
}
