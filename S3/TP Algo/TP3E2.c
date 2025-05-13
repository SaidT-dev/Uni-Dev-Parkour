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

employe creeArbre(char nom[50], char prenom[50], int age, char sexe,
                  int nbrH[7], employe *a, employe *b) {
    employe arbre = (employe)malloc(sizeof(employe));
    if (arbre == NULL) {
        fprintf(stderr, "allocation impossible\n");
        exit(-1);
    }
    strcpy(arbre->nom, nom);
    strcpy(arbre->prenom, prenom);
    arbre->age = age;
    arbre->sexe = sexe;
    for (int i = 0; i < 7; i++) {
        arbre->nbrH[i] = nbrH[i];
    }
    arbre->Fg = a;
    arbre->Fd = b;
    return arbre;
}

entreprise creer() {
    int nbr = 0;
    int nbrh = 0;
    employe emp;
    char *semaine[] = {"Dimanche", "Lundi",    "Mardi", "Mercredi",
                       "Jeudi",    "Vendredi", "Samedi"};
    printf("Entrer le nombre d'emplye: ");
    scanf("%d", &nbr);
    for (size_t i = 0; i < nbr; i++) {
        printf("Entrer le nom de l'emplye: ");
        scanf("%s", emp.nom);
        printf("Entrer le prenom de l'emplye: ");
        scanf("%s", emp.prenom);
        printf("Entrer l'age de l'emplye: ");
        scanf("%d", &emp.age);
        do {
            printf("Entrer le sexe de l'emplye[F/M]: ");
            scanf(" %c", &emp.sexe);
        } while (emp.sexe != ('F' || 'M'));
        printf(
            "Entrer le nombre d'horraire que l'emplye a travailler dans chaque "
            "journee:\n");
        for (size_t i = 0; i < 7; i++) {
            printf("%s: ", semaine[i]);
            scanf("%d", &nbrh);
        }
    }
}

int main() { return 0; }
