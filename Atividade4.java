package AVSomativa;

import java.util.Scanner;

public class Atividade4 { //nome da classe

	public static void main(String[] args) { //define o metodo e as permissões que será utilizado no programa
		int a[] = new int[15]; //cria uma variavel do tipo inteiro 
        int soma=0;//cria outra variavel do tipo inteiro 
		
		Scanner ler = new Scanner(System.in);//serve para ler e scannear os dados do programa
		
		for (int i =0; i<15; i++) { //for é estrutura de repetição, ou seja esse comando irá se repetir até atingir o valor determinado que seria o 15
			System.out.println("Informe um valor " + i+ "..:"); //pedimos ao usuario para informar um valor
			a[i]= ler.nextInt(); //o valor será armazenado na variavel
			soma= soma+a[i]; //os numeros vão sendo somados até a ultima repetição onde o comando irá parar e fornecer a soma de todos os numeros
		}
			System.out.println("A soma dos números é :" + soma);//mostra ao usuario a soma dos numeros fornecidos
			
        ler.close();//limpa e encerra o codigo

	}



	}
