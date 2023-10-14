//importa a classe Scanner para ser utilizada aqui:
import java.util.Scanner;

public class CalculaIMC {

    public static void main(String[] args) {

        //Declaracao do scanner:
        Scanner leitor = new Scanner(System.in);

        //Declaracao das variavies que serao utilizadas:
        float peso, altura, imc;

        //Leitura do teclado:
        //Informacao de instrucoes para o usuário:
        System.out.print("Informe o PESO: ");

        //le e armazena o valor do peso:
        peso = leitor.nextFloat(); //Le um valor de ponto flutuante

        //le e armazena o valor da altura:
        System.out.print("Informe a ALTURA: ");
        altura = leitor.nextFloat(); //Le um valor de ponto flutuante

        //calcula:
        imc = peso / (altura * altura);

        //Adiciona uma condição para classificar o IMC
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        }
        else if (imc >=18.5 && imc <25.0){
            System.out.println("Peso Saudável");
        }
        else if (imc >= 25.0 && imc < 30.0){
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obesidade");
        }

        //Imprime o resultado
        //Note que pode-se concatenar o resultado com a impressao de texto
        System.out.println("\n\tO IMC desta pessoa é " + imc + "\n\n");
    }
}