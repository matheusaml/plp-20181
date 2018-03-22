package questao4;

public class Utils {
	
	double zeroAbsoluto = -459.67;
	
	public void toCelsius(double fah) throws FahrenheitException{
		if(fah > zeroAbsoluto){
			double conta = (5*(fah - 32))/9;
			System.out.println("Fahrenheit: " + fah + ". Celsius: " + conta);
		} else {
			throw new FahrenheitException();
		}
	}

}
