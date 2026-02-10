class Etudiant {
    String nom;
    int age;
    double moyenne;

    Etudiant(String n, int a, double m){
        nom = n;
        age = a;
        moyenne = m;
    }

    void afficherInfo(){
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Moyenne : " + moyenne);
    }

    void augmenterMoyenne(double valeur){

        moyenne += valeur;
    }
}
