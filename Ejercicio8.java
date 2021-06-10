import java.util.*;

public class Ejercicio8{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		String desicion;
		
		System.out.println("Se generaran multiplos del 5 aleatoriamente hasta que ingrese S");
		
		do{
			int num;

			do{
				num = aleatorio.nextInt();
			}while(!((num%5)==0));

			System.out.println("Nuúmero aleatorio multiplo del : "+num);
			System.out.print("Si desea salir escriba 'S' sino escriba cualquier cosa");
			desicion = entrada.next();
		}while(!desicion.equalsIgnoreCase("S"));
		
	}
}