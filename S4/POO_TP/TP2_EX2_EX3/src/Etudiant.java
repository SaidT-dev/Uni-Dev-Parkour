public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;

     public Etudiant(String nom, int age, double moyenne){
         this.nom = nom;
         this.age = age;
         this.moyenne = moyenne;
     }

     public String getNom(){
         return this.nom;
     }

     public int getAge(){
         return this.age;
     }

     public double getNoteMoyenne(){
         return this.moyenne;
     }

     public void setNoteMoyenne(double moyenne){
        this.moyenne = moyenne;
     }
}
