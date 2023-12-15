import java.util.HashSet;

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
        HashSet<String> filledHashSet = getFilledHashSet();
        System.out.println("HashSet riempito: " + filledHashSet + " Dimensione: " + filledHashSet.size());

        String verifica = "elemento1";
        System.out.println("elemento da verificare: " + verifica);

        boolean isPresente = verificaElemento(filledHashSet, verifica);
        System.out.println("L'elemento " + verifica + " è presente nel Set: " + isPresente);
    }
    private static HashSet<String> getFilledHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("elemento0");
        hashSet.add("elemento1");
        hashSet.add("elemento2");
        return hashSet;
    }

    private static boolean verificaElemento(HashSet<String> hashSet, String elemento) {
        return hashSet.contains(elemento);
    }
}
