//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati
public class Main {
    public static void main(String[] args) {

        //PRIMITIVI:
        int intPrimitive = 1;
        double doublePrimitive = 2.50;
        char charPrimitive = 'm';

        //AUTOBOXING DEI PRIMITIVI:
        //CON I VALORI "AUTOBOXATI" HO ACCESSO A DEI METODI A CUI NON POSSO ACCEDERE CON I VALORI PRIMITIVI
        Integer myInteger = intPrimitive;
        Double myDouble = doublePrimitive;
        Character myCharacters = charPrimitive;

        //UNBOXING (LI FACCIO DI NUOVO PRIMITIVI)
        int diNuovoPrimitiviInt = myInteger;
        double diNuovoPrimitiviDouble = myDouble;
        char diNuovoPrimitiviCharacter = myCharacters;
    }

    //Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    public static void intSum(int num1, int num2) {
        System.out.println(num1+num2);
    }

    //Scrivere una funzione che accetti in input 1 char lo stampi
    public static void charPrint(char myChar) {
        System.out.println(myChar);
    }

    //Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    public static void myIntegerSum(Integer num1, Integer num2) {
        System.out.println(num1+num2);
    }

    //Scrivere una funzione che accetti in input 1 Character lo stampi
    public static void myCharacterPrint(Character myChar) {
        System.out.println(myChar);
    }
}
