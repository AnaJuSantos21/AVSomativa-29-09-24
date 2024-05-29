package AVSomativa;

import java.util.Scanner;

public class Atividade2 { //nome da classe

	public static void main(String[] args) { //define o metodo e as permissões que serão utilizados no programa
		Scanner ler = new Scanner(System.in); //serve para ler e scannear os dados que viram a seguir no programa
		double area,b,h; //aqui criamos variaveis do tipo real no codigo
		
		System.out.println("Insira o valor da base do objeto: "); //pedimos ao usuario para informar o valor da base e ele insere um numero
		b = ler.nextDouble(); //ele lê e armazena o valor da base na variavel b 
		
		System.out.println("Insira o valor da altura do objeto: "); //pedimos ao usuario para informar o valor da altura e ele insere um numero 
		h = ler.nextDouble(); //ele lê o valor e armazena na variavel h
		
		area = (b*h/2); //calcula a area do objeto
		
		System.out.println("A área desse obejto é: " + area); //informa ao usuario a area do objeto
		
		ler.close();//limpa e encerra o codigo
	}

}
