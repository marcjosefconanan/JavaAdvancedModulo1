// //Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
public class Main {
    public static void main (String [] args){
        try {
            System.out.println(dived(1,0));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static int dived (int num, int div){
        if (div !=0){
            return num / 0;
        }
        else {
            throw new ArithmeticException("Error : the number can't be devided by zero");
        }
    }
}
