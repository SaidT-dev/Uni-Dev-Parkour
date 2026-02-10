import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteDAO noteDAO = new NoteDAO(5);
        NoteService noteService = new NoteService(noteDAO);
        NoteView noteView = new NoteView();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            noteView.afficherInvite();
            System.out.println("Titre:");
            String titre = sc.nextLine();
            System.out.println("Contenu:");
            String contenu = sc.nextLine();
            noteService.ajouterNote(titre, contenu);
        }

        noteView.afficherNotes(noteService.getNotes(), noteService.getCompteur());
    }
}
