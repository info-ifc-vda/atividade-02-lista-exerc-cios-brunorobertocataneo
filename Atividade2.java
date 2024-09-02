import java.util.*;

public class Atividade2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 10 numeros do primeiro vetor");
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<10; i++){
            set1.add(scanner.nextInt());
        }

        System.out.println("Digite os 10 numeros do segundo vetor");
        Set<Integer> set2 = new HashSet<>();
        for(int i=0; i<10; i++){
            set2.add(scanner.nextInt());
        }

        Set<Integer> naoComuns = new HashSet<>(set1);
        naoComuns.addAll(set2);
        Set<Integer> intersecao = new HashSet<>(set1);
        intersecao.retainAll(set2);
        naoComuns.removeAll(intersecao);

        System.out.println("Números não comuns: " + naoComuns);
    }
}