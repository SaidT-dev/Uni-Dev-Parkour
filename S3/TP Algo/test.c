#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct noeud_s {
    char nom[50];
    char prenom[50];
    int age;
    char sexe;
    int nbrH[7];
    struct noeud_s *Fg;
    struct noeud_s *Fd;
} employe;

typedef employe *entreprise;

entreprise creer() {
    entreprise A = NULL;
    employe *nouveau;
    char reponse;
    char *semaine[] = {"Dimanche", "Lundi",    "Mardi", "Mercredi",
                       "Jeudi",    "Vendredi", "Samedi"};
    do {
        nouveau = (employe *)malloc(sizeof(employe));
        if (nouveau == NULL) {
            printf("Erreur d'allocation de memoire\n");
            exit(1);
        }

        printf("Nom: ");
        scanf("%s", nouveau->nom);
        printf("Prenom: ");
        scanf("%s", nouveau->prenom);
        printf("Age: ");
        scanf("%d", &nouveau->age);
        printf("Sexe (M/F): ");
        scanf(" %c", &nouveau->sexe);
        for (int i = 0; i < 7; i++) {
            printf("Nombre d'heures jour %s: ", semaine[i]);
            scanf("%d", &nouveau->nbrH[i]);
        }

        nouveau->Fg = NULL;
        nouveau->Fd = NULL;

        if (A == NULL) {
            A = nouveau;
        } else {
            employe *courant = A;
            employe *parent;
            while (courant != NULL) {
                parent = courant;
                if (nouveau->age < courant->age) {
                    courant = courant->Fg;
                } else {
                    courant = courant->Fd;
                }
            }
            if (nouveau->age < parent->age) {
                parent->Fg = nouveau;
            } else {
                parent->Fd = nouveau;
            }
        }

        printf("Voulez-vous ajouter un autre employe? (O/N): ");
        scanf(" %c", &reponse);
    } while (reponse == 'O' || reponse == 'o');

    return A;
}