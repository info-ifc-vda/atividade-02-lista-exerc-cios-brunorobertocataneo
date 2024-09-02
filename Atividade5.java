import java.util.Random;

public class Atividade5 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];

        int[] maiorLinha = new int[7];
        int[] menorColuna = new int[7];

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiorLinha[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menorColuna[j] = menor;
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maiorLinha[i] + " ");
        }
        System.out.println();

        System.out.println("Menor elemento de cada coluna:");
        for (int i = 0; i < 7; i++) {
            System.out.print(menorColuna[i] + " ");
        }
        System.out.println();
    }
}