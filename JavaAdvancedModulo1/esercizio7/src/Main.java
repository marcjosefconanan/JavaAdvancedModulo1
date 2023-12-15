import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
public class Main {
    public static void main(String[] args) {
        //Scrivere una funzione che restituisca un hashset riempito
        HashSet<String> filledHashSet = getFilledHashSet();

        //Leggere l'hashSet e stampre grandezza ed elementi
        System.out.println("hashet riempito" + filledHashSet + filledHashSet.size()); //o + filledHashSet + filledHashSet.size più semplice
        System.out.println("Dimensione dell'HashSet: " + filledHashSet.size());


        //Leggere l'hashSet e stampre grandezza ed elementi
        //for (String element : filledHashSet) {   //questo vuol dire =
        //    System.out.println(element);         // for (int i = 0; i < array.length; i++) {
                                                 //String element = array[i];
                                                 // System.out.println(element);
        //}
    }
    //Scrivere una funzione che restituisca un hashset riempito
    private static HashSet<String> getFilledHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("element0");
        hashSet.add("element1");
        hashSet.add("element2");
        return hashSet;
    }
}