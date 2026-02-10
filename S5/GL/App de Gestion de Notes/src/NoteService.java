public class NoteService {
    private NoteDAO noteDAO;

    public NoteService(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    public void ajouterNote(String titre, String contenu){
        Note nouvelleNote = new Note(titre, contenu);
        noteDAO.ajouterNote(nouvelleNote);
    }

    public Note[] getNotes(){
        return noteDAO.getNotes();
    }

    public int getCompteur(){
        return noteDAO.getCompteur();
    }
}
