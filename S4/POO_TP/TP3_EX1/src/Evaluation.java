public class Evaluation  extends Note{
    private int anneeEvaluation;

    Evaluation(String nomModule, double noteTP, double noteExamen, int anneeEvaluation) {
        super(nomModule, noteTP, noteExamen);
        this.anneeEvaluation = anneeEvaluation;
    }

    int getAnneeEvaluation() {
        return anneeEvaluation;
    }

    void setAnneeEvaluation(int anneeEvaluation) {
        this.anneeEvaluation = anneeEvaluation;
    }

    public void deliberer(){
        if(super.moyenne() >= 10){
            System.out.println("Admis(e)");
        } else {
            System.out.println("Ajourne(e)");
        }
    }

    public double comparerNote(Evaluation ev){
        if(this.getNomModule().equalsIgnoreCase(ev.getNomModule())){
            return (this.getNoteTP() > ev.getNoteTP())? this.getNoteTP() : ev.getNoteTP();
        } else {
            System.out.println("Attention ces deux Evaluations ne concernent pas le meme module");
            return 0;
        }
    }
}
