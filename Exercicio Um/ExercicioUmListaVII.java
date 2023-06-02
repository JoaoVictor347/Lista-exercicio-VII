import java.util.Scanner;
public class ExercicioUmListaVII {

    

    public static void main(String[] args) {  
        
        ExercicioUm exercicioUm = new ExercicioUm();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\tPROGRAMAÇÃO DE SOLUÇÕES COMPUTACIONAIS");
        System.out.println("\t\tLISTA VII");

        System.out.println("\n Por favor, informe a primeira palavra.");
        exercicioUm.setPalavraUm(scanner.nextLine());

        System.out.println("\n Por favor, informe a segunda palavra.");
        exercicioUm.setPalavraDois(scanner.nextLine());

        scanner.close();

        exercicioUm.funcaoExercicioUm();
    
    }
}