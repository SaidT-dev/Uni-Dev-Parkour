public class AnalyseurRecursive {

    private String input;       // La chaîne d'entrée
    private int pos;            // La position actuelle dans la chaîne
    private char currentToken;  // Le caractère actuel

    public AnalyseurRecursive(String input) {
        this.input = input;
        this.pos = 0;
        this.currentToken = (input.length() > 0) ? input.charAt(0) : '\0';
    }

    // --- Méthodes de l'Analyseur ---

    // Point d'entrée de l'analyse
    public void parse() throws Exception {
        X(); // On commence par le symbole de départ X

        // À la fin, on doit avoir tout consommé (caractère nul)
        if (currentToken != '\0') {
            throw new Exception("Erreur : Fin de chaîne attendue, mais trouvé '" + currentToken + "'");
        }
        System.out.println("Succès : La chaîne \"" + input + "\" est valide !");
    }

    // Règle : X -> NM | 2
    private void X() throws Exception {
        System.out.println("Appel X()");
        if (currentToken == '2') {
            match('2');
        } else {
            // Si ce n'est pas '2', on suppose que c'est NM
            // Note : On pourrait vérifier si currentToken est dans First(N) ou First(M)
            N();
            M();
        }
    }

    // Règle : M -> 0N0 | 1
    private void M() throws Exception {
        System.out.println("Appel M()");
        if (currentToken == '0') {
            match('0');
            N();
            match('0');
        } else if (currentToken == '1') {
            match('1');
        } else {
            throw new Exception("Erreur dans M : attendu '0' ou '1', trouvé '" + currentToken + "'");
        }
    }

    // Règle : N -> 1N1 | epsilon
    private void N() throws Exception {
        System.out.println("Appel N()");
        // First(N) = {1, epsilon}
        if (currentToken == '1') {
            /* * ATTENTION : Ici réside une difficulté de cette grammaire spécifique.
             * N commence par 1, mais M commence aussi par 1.
             * Dans un analyseur simple, si on voit '1', on entre dans 1N1.
             */
            match('1');
            N();
            match('1');
        } else {
            // Production epsilon (chaîne vide)
            // On ne fait rien, on ne consomme rien.
            System.out.println("-> N produit epsilon");
        }
    }

    // --- Méthodes Utilitaires ---

    // Vérifie si le caractère actuel correspond à celui attendu et avance
    private void match(char expected) throws Exception {
        if (currentToken == expected) {
            pos++;
            if (pos < input.length()) {
                currentToken = input.charAt(pos);
            } else {
                currentToken = '\0'; // Fin de chaîne
            }
        } else {
            throw new Exception("Erreur de syntaxe : attendu '" + expected + "', trouvé '" + currentToken + "' à la position " + pos);
        }
    }

    // --- Main pour tester ---
    public static void main(String[] args) {
        // Exemples de tests
        String[] tests = {
                "2",       // Valide (X -> 2)
                "1",       // Valide théoriquement (X -> N M -> eps 1), mais risque d'échec si N est gourmand
                "00",      // Valide (X -> N M -> eps 0N0 -> 0eps0)
                "111",     // Valide (X -> N M -> 1N1 M -> 1eps1 1)
                "0110",    // Valide (X -> N M -> eps 0N0 -> 0 1N1 0 -> 0 1eps1 0)
                "3"        // Invalide
        };

        for (String t : tests) {
            try {
                System.out.println("--- Test de : \"" + t + "\" ---");
                AnalyseurRecursive parser = new AnalyseurRecursive(t);
                parser.parse();
            } catch (Exception e) {
                System.out.println("Échec : " + e.getMessage());
            }
            System.out.println();
        }
    }
}