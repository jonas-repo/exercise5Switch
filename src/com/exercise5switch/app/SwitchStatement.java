package com.exercise5switch.app;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constants declaration
		
		//variables declaration  
		int nMonth = 0;
		char respuesta = 'n';
		
		//objects declaration
		Scanner input = new Scanner(System.in);
		
		do {
			while(nMonth <= 0 || nMonth > 12)
			{
				System.out.println("Dame un numero de mes: ");
				
				nMonth = input.nextInt();
				
				if(nMonth <= 0 || nMonth > 12)
				{
					System.out.println("Dato no valido");
				}
			}
			switch(nMonth)
			{
				case 1:
					System.out.println("Enero");
					break;
				case 2:
					System.out.println("Febrero");
					break;
				case 3:
					System.out.println("Marzo");
					break;
				case 4:
					System.out.println("Abril");
					break;
				case 5:
					System.out.println("Mayo");
					break;
				case 6:
					System.out.println("Junio");
					break;
				case 7:
					System.out.println("Julio");
					break;
				case 8:
					System.out.println("Agosto");
					break;
				case 9:
					System.out.println("Septiembre");
					break;
				case 10:
					System.out.println("Octubre");
					break;
				case 11:
					System.out.println("Noviembre");
					break;
				case 12:
					System.out.println("Diciembre");
					break;
				default:
					System.out.println("Dato no valido");
			}
			System.out.println("Deseas salir del programa? (s/n)");
			respuesta = input.next().charAt(0);
			nMonth = 0;
			
		}while(respuesta != 's');
		
		
		
		
		
		
		
	}

}
