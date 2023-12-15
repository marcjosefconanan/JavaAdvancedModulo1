//Traccia su  gestione delle eccezioni in Java
//
//public class HashSetExample {
//    public static void main(String[] args) {
//        // Creazione di un array di stringhe
//        // Aggiunta di elementi all'array
//        // Se l’ultimo elemento dell’array contiene il carattere speciale “#” lancia eccezione (anche generica va bene)
//        // Rimozione dell’elemento con il carattere speciale
//        // Stampa degli elementi presenti nell’array
//
//}
import java.util.HashSet;
public class Main {
    // Creazione di un array di stringhe
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        // Rimozione dell’elemento con il carattere speciale
        try {
            addElement(stringHashSet);
            removeElement(stringHashSet, "Element3#");
        } catch (Exception e) {
            System.out.println("Errore = " + e.getMessage());
        }
    }
    // Aggiunta di elementi all'array
    private static void addElement(HashSet<String> set) {
        set.add("Element1");
        set.add("Element2");
        set.add("Element3#");
    }
    //Se l’ultimo elemento dell’array contiene il carattere speciale “#” lancia eccezione (anche generica va bene)
    private static void removeElement(HashSet<String> set, String element) {
        if (set.remove(element)) {
            System.out.println("element removed");
        } else {
            System.out.println("no element to remove");
        }
    }
    // Stampa degli elementi presenti nell’array
    private static void printElements(HashSet<String> set) {
        System.out.println("Elementi nell'HashSet:");
        for (String elementattuale : set) {
            System.out.println(elementattuale);
        }
    }
}