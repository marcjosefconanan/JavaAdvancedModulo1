import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
public class Main {
    public static void main(String[] args) {
        //Scrivere una funzione che restituisca un hashset riempito
        HashSet<String> fillHasSet = getFilledHashSet();
        System.out.println("hashSet riempito: " + fillHasSet);

        String verifica = "elemento1";
        System.out.println("elemento da verificare: " + verifica);

        //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        boolean rimosso = verificaElemento(fillHasSet,verifica);
        if (rimosso){
            System.out.println("elemento rimosso!!");
        }else{
            System.out.println("elemento non trovato");
        }
        System.out.println("Hashset dopo elemento rimosso: " + fillHasSet);

        //Svuotare l'hashset, verificarlo e stampare il risultato
        fillHasSet.clear();
        System.out.println("HashSet dopo lo svuotamento: " + fillHasSet);
    }
    private static HashSet<String> getFilledHashSet() {
        //Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("elemento0");
        hashSet.add("elemento1");
        hashSet.add("elemento2");
        return hashSet;
    }
    private static boolean verificaElemento(HashSet<String> hashSet, String elemento) {
        return hashSet.remove(elemento);
    }
}
