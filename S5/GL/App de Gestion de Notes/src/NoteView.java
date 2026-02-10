public class NoteView {
    public void afficherNotes(Note[] notes, int compteur){
        System.out.println("Liste des notes :");
        for(int i = 0; i < compteur; i++){
            System.out.println("- " + notes[i].getTitre() + ": " + notes[i].getContenu());
        }
    }

    public void afficherInvite(){
        System.out.println("Entrer le titre et le contenu de la note:");
    }
}
