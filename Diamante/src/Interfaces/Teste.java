package Interfaces;

public class Teste implements ClasseUm, ClasseDois, ClasseTres{

	@Override
	public void fazAlgo() {
		System.out.println("fazendo algo e tale");		
	}
	
	public static void main(String[] args) {
		ClasseUm um = new Teste();
		
		um.fazAlgo();
	}

}
