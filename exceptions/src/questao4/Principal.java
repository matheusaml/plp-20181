package questao4;

public class Principal {

	public static void main(String[] args) {
		Utils u = new Utils();
		
		try{
			u.toCelsius(-459.68);
		} catch (FahrenheitException e) {
			e.printMessage();
}
	}
}
