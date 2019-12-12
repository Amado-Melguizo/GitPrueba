/*este programa visualiza el máximo 
 * común divisor de 2 números
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Mcd {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		//introducimos por teclado los números.
		System.out.println("introduzca el número1");
		int num1 = entrada.nextInt();
		System.out.println("introduzca el número2");
		int num2 = entrada.nextInt();
		//comparamos número 1 con número 2.
		while(num1 != num2)
		{
			if(num1 > num2)
				num1 = num1 - num2; 
			else 
				num2 = num2 - num1;
		}
		System.out.println("el mcd= "+ num1);
		
	}

}
