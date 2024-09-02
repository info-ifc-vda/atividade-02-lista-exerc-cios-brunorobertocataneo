public class Atividade3 {
    public static void main(String[] args) {
        
        int[] vetor1 = new int [10];
        int[] vetor2 = new int [10];

        vetor1[0] = 1; vetor1[1] = 2; vetor1[2] = 3; vetor1[3] = 4; vetor1[4] = 5;
        vetor1[5] = 6; vetor1[6] = 7; vetor1[7] = 8; vetor1[8] = 9; vetor1[9] = 10;
        vetor2[0] = 1; vetor2[1] = 2; vetor2[2] = 3; vetor2[3] = 4; vetor2[4] = 5; 

        int[] vetorResultante1 = new int [vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i]%2 == 0) {
                int soma = 0;
                for (int j =0; j <vetor2.length; j++){
                    soma += vetor2[j];
                }
                vetorResultante1[i] = vetor1[i] + soma;
            }else{
                vetorResultante1[i] = 0;
            }

        }
        int[] vetorResultante2 = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++){
            if (vetor1[i] % 2 != 0){
                int divisores = 0;
                for (int j = 0; j < vetor2.length; j++){
                    if (vetor1[i] % vetor2[j] == 0){
                        divisores++;
                    }
                }
                vetorResultante2[i] = divisores;
            }else {
                vetorResultante2[i] = 0;
            }
        }
        // Mostrar os vetores resultantes
        System.out.println("vetorResultante 1 :");
        for (int i = 0; i  < vetorResultante1.length; i++){
            System.out.print(vetorResultante1[i] + " ");
        }
        System.out.println();

        System.out.println("vetorResultante 2 :");
        for (int i = 0; i  < vetorResultante2.length; i++){
            System.out.print(vetorResultante2[i] + " ");
        }
        System.out.println();
    }
}
