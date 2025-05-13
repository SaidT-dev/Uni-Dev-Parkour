
public class Main {
    public static void main(String[] args) {
        // Test de la classe Voiture
        System.out.println("=== Test de la classe Voiture ===");
        Voiture voiture = new Voiture(2024, 200.0, 25000.0, 5);

        // Test des méthodes de la classe Voiture
        voiture.demarer();
        voiture.accelerer();
        System.out.println(voiture.caracteristiqueVehicule());
        System.out.println("Vitesse maximale: " + voiture.VitesseMax());

        // Test des getters et setters
        voiture.setAnnee(2023);
        voiture.setVitesseMax(220);
        voiture.setPrix(24000.0);
        System.out.println("\nAprès modification:");
        System.out.println("Année: " + voiture.getAnnee());
        System.out.println("Vitesse max: " + voiture.getVitesseMax());
        System.out.println("Prix: " + voiture.getPrix());

        System.out.println("\n=== Test de la classe Camion ===");
        Camion camion = new Camion(2024, 160.0, 80000.0, 5000.0);

        // Test des méthodes de la classe Camion
        camion.demarer();
        camion.accelerer();
        camion.chargeCargaison("bois");
        System.out.println(camion.caracteristiqueVehicule());
        System.out.println("Vitesse maximale: " + camion.VitesseMax());

        // Test des getters et setters du camion
        camion.setAnnee(2022);
        camion.setVitesseMax(150);
        camion.setPrix(75000.0);
        System.out.println("\nAprès modification:");
        System.out.println("Année: " + camion.getAnnee());
        System.out.println("Vitesse max: " + camion.getVitesseMax());
        System.out.println("Prix: " + camion.getPrix());
    }
}