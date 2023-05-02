import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            float[] notas = new float[10];
            float aux = 0;
            float media;
            int acima = 0;
            int abaixo = 0;

            for (int i = 0; i < notas.length; i++) {
                notas[i] = teclado.nextFloat();
            }

            for (int j = 0; j < notas.length; j++) {
                aux += notas[j];
            }
            media = aux/(notas.length);

            for (int p = 0; p < notas.length; p++) {
                if (notas[p] > media) {
                    acima += 1;
                } else{
                    abaixo += 1;
                }
            }
            System.out.println("Média: " + media);
            System.out.println("Quantidade de notas acima da média: " + acima);
            System.out.println("Quantidade de notas acima da média: " + abaixo);
        }
    }    
}