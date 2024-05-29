package AVSomativa;

import java.util.Scanner;

public class Atividade5 {

     public static void main(String[] args) { //define o metodo e as permissões que serão utilizados no programa
    	 Scanner ler = new Scanner(System.in); //serve para ler e scannear os dados que viram a seguir no programa
    	 String garagem[] = new String[7]; //cria uma variavel do tipo String
    	 
    	 System.out.println("----GARAGEM----"); //Mostra na tela a palavra garagem
    	 
    	 for (int i = 1; i<7; i++) { //estrutura de repetição, o comando irá se repetir até atingir o valor determinado
    		 System.out.println("Quais carros você deseja estacionar: "); //pergunta ao usuario sobre os carros que deseja estacionar, ganhando um resposta
    		 garagem[i] = ler.next();//garagem é um vetor que pode guardar mais de uma variavel determinada pelo i
    	 }
    	 
    	 for(int i=1; i<7; i++) { //estrutura de repetição, o comando irá se repetir até atingir o valor determinado
    		 System.out.println("O carro estacionado na vaga " + i + " é: " + garagem[i]); //Mostra o resultado na ordem que os carros foram colocados
    	 }
        ler.close();//limpa e encerra o codigo
     }
}