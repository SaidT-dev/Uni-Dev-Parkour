public class NoteDAO {
    private Note[] notes;
    private int compteur;

    public NoteDAO(int capacite) {
        notes = new Note[capacite];
        compteur = 0;
    }

    public void ajouterNote(Note note) {
        if(compteur < notes.length) {
            notes[compteur] = note;
            compteur++;
        } else {
            System.out.println("Capacite max atteinte");
        }
    }

    public Note[] getNotes() {
        return notes;
    }

    public int getCompteur() {
        return compteur;
    }
}
