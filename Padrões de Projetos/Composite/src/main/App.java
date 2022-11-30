package main;

public class App {
	public static void main(String[] args) {
		Esquadrao esq1 = new Esquadrao();
		
		esq1.add(new Soldado("Robson","Bucha de Canhão"));
		esq1.add(new Marinheiro("Geovaldo", "Marinheiro de Água Doce"));
	}
}
