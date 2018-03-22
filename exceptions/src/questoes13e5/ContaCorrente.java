package questoes13e5;

public class ContaCorrente {
	
	private float limite;
	private float saldo;
	private float valorLimite;

	public ContaCorrente( float saldo){
		this.limite = saldo;
		this.saldo = saldo;
	}
	
	public void sacar(float valor) throws SaldoInsuficienteException, ValorErradoException{
		int f1 = Float.compare(valor, 0.0f);
		
		if(valor>saldo && f1>=0){
			float v1 = (saldo - valor)*(-1);
			if(limite>=v1 && v1>0){
				this.saldo = 0.0f;
				System.out.println("Saque realizado com sucesso, porém você consumiu R$ " + (v1) + " de R$ " + limite + " e agora você tem " + (limite-v1) + " de limite e " + this.saldo + " de saldo, além de ter uma dívida de " + (saldo-v1));
				this.valorLimite = saldo-v1;
				this.limite = limite-v1;
			} else {
				throw new SaldoInsuficienteException();
			}
			
		} else if(f1<0){
			throw new ValorErradoException();
		}
		else if (valor <= saldo){
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso. Seu saldo é " + saldo);
		} else {
			System.out.println("Tenha certeza que você está procurando a coisa certa no canto certo.");
		}
	}

	public void depositar(float valor) throws ValorErradoException{
		int f1 = Float.compare(valor, 0.0f);
		if(f1>=0){
			this.saldo = saldo + valor;
			//this.limite = saldo + (saldo*0.1f);
			System.out.println("Seu saldo é " + this.saldo);
		} else if(f1<0){
			throw new ValorErradoException();
		} else	{ 
			System.out.println("Erro desconhecido");
		}
		
		
	}
	
	public void setValorLimite(float valor){
		this.valorLimite = valor;
	}
	
	public int getSaldo(){
		int saldo2 = Float.compare(this.saldo, 0.0f);
		if(saldo2>0){
			return (int) this.saldo;
		} else if (saldo2==0) {
			return 0;
		} else {
			return -1;
		}		
	}


	public float getLimite() {
		return this.limite;
	}
	
	public int getValorLimite() {
		return (int) this.valorLimite*(-1);
	}
}
