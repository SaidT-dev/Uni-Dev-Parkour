public class Note {
    private String nomModule;
    private double noteTP;
    private double noteExamen;

    Note(String nomModule, double noteTP, double noteExamen) {
        this.nomModule = nomModule;
        this.noteTP = noteTP;
        this.noteExamen = noteExamen;
    }

    double moyenne(){
        return (noteTP * 0.4) + (noteExamen * 0.6);
    }

    public String getNomModule() {
        return nomModule;
    }

    public double getNoteTP() {
        return noteTP;
    }
}
