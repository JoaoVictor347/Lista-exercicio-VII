import java.util.Scanner;
public class ExercicioDoisListaVII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExercicioDois exercicioDois = new ExercicioDois();
        FuncaoExercicioDois funcaoDois = new FuncaoExercicioDois();
        
        System.out.println("\tPROGRAMAÇÃO DE SOLUÇÕES COMPUTACIONAIS");
        System.out.println("\t\tLISTA VII");

        System.out.println("\n Por favor, informe a primeira palavra.");
        exercicioDois.setPalavra(scanner.nextLine());

        funcaoDois.realizaFuncaoExDois(exercicioDois.getPalavra());

        scanner.close();
    }
}