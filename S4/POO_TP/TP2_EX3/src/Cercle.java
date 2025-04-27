public class Cercle {
    private double rayon;
    private double centre = new double[2];

    Cercle(double rayon, double[] center){
        this.rayon = rayon;
        this.centre[0] = center[0];
        this.centre[1] = center[1];
    }

    public double getRayon(){
         return this.rayon;
    }


    

}
