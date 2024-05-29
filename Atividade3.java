package AVSomativa;

import java.util.Scanner;

public class Atividade3 { //nome da classe

	public static void main(String[] args) { //define o metodo e as permissões que serão utilizados no programa
		try (Scanner ler = new Scanner (System.in)) { //serve para ler e scannear os dados que viram a seguir no programa
			System.out.println("Informe um dia da semana de 1 a 7: "); //pede ao usuario para informar um dia da semana e o usuario seleciona um dia
			int dia = ler.nextInt(); //cria uma variavel do tipo inteiro e lê o numero que o usuario informou
			
			switch (dia) { //define o código a ser executado com base em uma comparação de valores
			case 1: //estrutura de controle condicional
				System.out.println("Domingo");//se o numero for 1 mostrará na tela o dia domingo
				break;//informa quando o case deve finalizar
			case 2://estrutura de controle condicional
				System.out.println("Segunda"); //se o numero for 2 mostrará na tela o dia Segunda
				break;//finaliza o case
			case 3://estrutura de controle condicional
				System.out.println("Terça");//se o numero for 3 mostrará na tela o dia Terça
				break;//finaliza o case
			case 4://estrutura de controle condicional
				System.out.println("Quarta");//se o numero for 4 mostrará na tela o dia Quarta
				break;//finaliza o case
			case 5://estrutura de controle condicional
				System.out.println("Quinta");//se o numero for 5 mostrará na tela o dia Quinta
				break;//finaliza o case
			case 6://estrutura de controle condicional
				System.out.println("Sexta");//se o numero for 6 mostrará na tela o dia Sexta
				break;//finaliza o case
			case 7://estrutura de controle condicional 
				System.out.println("Sábado");//se o numero for 7 mostrará na tela o dia Sabado
				break;//finaliza o case
				
			default://se não for nenhum dos case
				System.out.println("Dia inválido");//mostrará na tela dia inválido
				
			}
			ler.close();//limpa e encerra o codigo
		}

	}


	}
