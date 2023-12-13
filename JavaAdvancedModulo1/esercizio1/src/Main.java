//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

public class Main {
    public static void main (String [] args ){
        try {
            System.out.println(range(0,15,9));
        }
        catch (ArithmeticException e){
            System.out.println("Error : the number isn't in range " + e );
        }
    }
    public static boolean range (int min, int num, int max) {
        if (num > min && num < max) {
            return true;
        }
        else throw new ArithmeticException();
    }
}