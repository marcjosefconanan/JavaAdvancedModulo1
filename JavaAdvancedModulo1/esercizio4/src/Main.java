//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
//e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.

import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        int [] array = {11,22,33,44,55,66,};
        System.out.println(Arrays.toString(array));

        try {
            System.out.println(provaDivisione(array,-5,4));
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static int provaDivisione (int [] array, int index, int num ){
        if (array.length < index){
            throw new ArrayIndexOutOfBoundsException("errore : index e maggiore della lunghezza");
        }
        else if (num == 0 ) {
            throw new ArithmeticException("errore : non divisibile per 0");
        }
        else if (index < 0){
            throw new ArrayIndexOutOfBoundsException("errore : index negativo");
        }else {
            return array [index] / num;
        }
    }
}
