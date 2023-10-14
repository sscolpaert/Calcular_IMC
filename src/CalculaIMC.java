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

        // Adicione uma condição para classificar o IMC
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25.0) {
            classificacao = "Peso saudável";
        } else if (imc >= 25.0 && imc < 30.0) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }


        //Imprime o resultado
        //Note que pode-se concatenar o resultado com a impressao de texto
        System.out.println("\nClassificação do IMC: " + classificacao);
        System.out.println("\n\tO IMC desta pessoa é " + imc + "\n\n");
    }
}