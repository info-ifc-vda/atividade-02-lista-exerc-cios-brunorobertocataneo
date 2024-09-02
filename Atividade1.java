import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cabecalho = "| Valor | Cubo | Raiz Quadrada |\n";
        String separador = "--------------------";
        int contador = 0;
        
        double[] valores = new double[100]; 
        
        System.out.println(cabecalho);
        
        while (true) {
           
            System.out.println("Digite o valor ou (ou 0/negativo para sair)");
            double valor = scanner.nextDouble();
           
            if (valor <= 0) {
                break;
            }
            
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor); 
            
            valores[contador] = valor; 
            
            System.out.printf("| %.2f | %.2f | %.4f |\n", valor, cubo, raizQuadrada);
           
            contador++; 
            if (contador % 20 == 0) { 
                
                System.out.println(cabecalho);
                System.out.println(separador);
            }
        }
        
        System.out.println("Valores inseridos:");
        
        for (int i = 0; i < contador; i++) {
            System.out.printf("| %.2f | %.2f | %.4f |\n", valores[i], Math.pow(valores[i], 3), Math.sqrt(valores[i]));
        }
    }
}