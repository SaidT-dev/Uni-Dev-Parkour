public class Note {
    private String titre;
    private String contenu;

    public Note(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
    }
    public String getTitre() {
        return titre;
    }
    public String getContenu() {
        return this.contenu;
    }
}
