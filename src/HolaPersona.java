import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {
		
		Scanner ec = new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduce tu nombre:");
		nombre = ec.next();
		
		System.out.println("Hola"+nombre);
	}

}
