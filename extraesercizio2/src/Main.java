import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creazione di un array di stringhe
        String[] stringArray = new String[3];

        try {
            // Aggiunta di elementi all'array
            addElements(stringArray);

            // Se l'ultimo elemento dell'array contiene il carattere speciale "#" lancia eccezione
            checkSpecialCharacter(stringArray);

            // Rimozione dell'elemento con il carattere speciale
            removeElement(stringArray, "Elemento3#");

            // Stampa degli elementi presenti nell'array
        } catch (Exception e) {
            // Gestione generica dell'eccezione
            System.err.println("Errore: " + e.getMessage());
        }
    }

    private static void addElements(String[] array) {
        array[0] = "Elemento1";
        array[1] = "Elemento2";
        array[2] = "Elemento3#"; // Eccezione sarà lanciata qui
    }

    private static void checkSpecialCharacter(String[] array) throws Exception {
        if (array[array.length - 1].contains("#")) {
            throw new Exception("Carattere speciale '#' trovato nell'ultimo elemento dell'array.");
        }
    }

    private static void removeElement(String[] array, String element) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                array[i] = null;
                System.out.println("Elemento rimosso con successo!");
                break;
            }
        }
    }
}
