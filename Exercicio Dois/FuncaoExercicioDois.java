public class FuncaoExercicioDois {
    
    public void realizaFuncaoExDois(String palavra){


        String nomeInvertido = "";

        System.out.println("A palavra informada é: " + palavra);
        for (int i = palavra.length() - 1 ; i >= 0; i--) {
            nomeInvertido += palavra.charAt(i);
    }
    System.out.println("o nome invertido é " + nomeInvertido.toUpperCase());

    }
}