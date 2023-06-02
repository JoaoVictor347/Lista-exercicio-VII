package models;

public class FuncaoExercicioQuatro {

    public void escrevePorExtenso(){
        int numeroInt = ExercicioQuatro.getNumeroUsuario();
        String numerosMaiores = "";
        String[] numerosPorExtenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", 
        "nove", "dez", "onze", "doze", "treze", "quatorze" , "quinze" ," dezesseis ", " dezessete", "dezoito ",
        "dezenove"," vinte", " trinta " , " quarenta " , " cinquenta " , " sessenta " , "setenta " , "oitenta ", "noventa"};

        if (numeroInt < 19){
            System.out.println("O número informado é: " + numerosPorExtenso[numeroInt]);
        }
        
        if (numeroInt > 19 && numeroInt <= 99){
            int dezena = numeroInt / 10;
            int unidade = numeroInt % 10;
            numerosMaiores = numerosPorExtenso[dezena+18];
            if (unidade > 0){
                numerosMaiores += " e " + numerosPorExtenso[unidade];
            }
            System.out.println("O número informado é: " + numerosMaiores);
        }
    }
    
}
