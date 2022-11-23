package strategypattern;

//Encapsulado em uma classe especifica paranao haver duplicacao de codigo  

public class ComprarEspecial implements Comprar{

	public void comprar() {
		
		System.out.println("Comprar Especial...");
		
	}
	
}
