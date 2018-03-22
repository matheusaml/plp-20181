package questoes13e5;

public class Principal {
	
	public static void main(String[] args) throws SaldoInsuficienteException, ValorErradoException {
		ContaCorrente c = new ContaCorrente(0);
		try{
			c.depositar(50);
		} catch (ValorErradoException e){
			System.out.println("Valor errado, coloque um número positivo.");
		}

		try{
			c.sacar(200);

		} catch (SaldoInsuficienteException e){
			System.out.println("Você não tem saldo nem limite suficiente para completar a transação.");
		} catch (ValorErradoException e) {
			System.out.println("Valor errado, coloque um número positivo.");
		}
		
		System.out.println(c.getValorLimite());
	}
	
	

}
