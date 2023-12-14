//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {
        Double numeratore = 7.0;
        Double denomiratore  = null;
        try {
            System.out.println(numeratore + "diviso" + denomiratore + "uguale" + div(numeratore, denomiratore));
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("error = " + e );
        }finally {
            System.out.println("end");
        }
    }
    public static double div(Double num, Double denum) {
        if (denum == 0) {
            throw new ArithmeticException("You can't divide by 0. The result doesn't exist.");
        }
        if (num == null || denum == null) {
            throw new NullPointerException("Numerator and denominator can't be null.");
        }
        return num/denum;
    }
}