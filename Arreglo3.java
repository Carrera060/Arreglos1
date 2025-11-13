import java.util.Scanner;
public class Arreglo1{
	public static void main (String args[]){
	int spike[] = new int[5];
	Scanner sc = new Scanner(System.in);
	 for(int i=0;i<5;i++){
	  System.out.println("\tIntroduzca un número entero: ");
	   spike[i]= sc.nextInt();
	  System.out.println("\t--El valor del arreglo es: " + spike[i] + "--");
	 }
	}
}