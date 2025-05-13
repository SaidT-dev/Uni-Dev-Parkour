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
         if(moyenne < 0 || moyenne > 20){
             System.out.println("La moyenne dois etre comprise entrer 0 et 20");
         } else {
             this.moyenne = moyenne;
         }
     }
}
