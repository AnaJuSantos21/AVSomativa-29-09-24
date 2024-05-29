package AVSomativa;

import java.util.Scanner;

public class Atividade1 { //nome da classe

	public static void main(String[] args) { //define o metodo e as permissões que seram usadas no programa
		Scanner ler = new Scanner(System.in); //é usado para scannear os dados que vão vir a seguir no codigo
		double a,b,soma,sub,mult,div; //double é usado para inserir variaveis do tipo real no programa
		
		System.out.println("Insira o primeiro valor: "); //usada para que o usuario consiga fornecer o valor que foi pedido
		a = ler.nextDouble(); //aqui armazenamos esse valor na variavel a
		
		System.out.println("Insira o segundo valor: "); //o usuario fornece o segundo valor pedido
		b = ler.nextDouble(); //o valor é armazenado no bloco da variavel b
		
		soma = (a+b); //calculo da soma dos valores inseridos
		sub = (a-b); //calculo da subtração dos valores inseridos
		mult = (a*b); //calculo da multiplicação dos valores inseridos
		div = (a/b); //calculo da divisão dos valores inseridos
		
		System.out.println("O valor da soma é: " + soma); //o programa mostra o resultado da soma para o usuario
		System.out.println("O valor da subtração é: " + sub); //o programa mostra o resultado da subtração para o usuario
		System.out.println("O valor da multiplicação é: " + mult); //o programa mostra o resultado da multiplicação para o usuario
		System.out.println("O valor da divisão é: " + div); //o programa mostra o resultado da divisão para o usuario
		
		
		ler.close(); //usado para finalizar e limpar o codigo após a execução
  }
    
}
