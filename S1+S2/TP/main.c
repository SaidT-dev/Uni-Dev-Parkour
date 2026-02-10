#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct {
    int num;
    char nom[20];
    char prenom[20];
    char sexe[10];
    int age;
    char maladie[100];
}  Patient;

/*struct Patient{
    int num;
    char nom[20];
    char prenom[20];
    char sexe;
    int age;
    char maladie[100];
};*/

void createP_file(){
    FILE* p_file = NULL;
    Patient p;
    int n = 0;
    p_file = fopen("Patients.txt", "w");
    do{
        printf("Donner le nombre de patients: ");
        scanf("%d", &n);
    }while(n <= 0);
    for(int i = 0; i < n; i++){
        p.num = i+1;
        printf("Donner le nom de patient: ");
        scanf("%s", &p.nom);
        printf("Donner le prenom de patient: ");
        scanf("%s", &p.prenom);
        printf("Donner le sexe de patient (Feminin ou Masculin): ");
        scanf("%s", &p.sexe);
        printf("Donner l'age de patient: ");
        scanf("%d", &p.age);
        printf("Donner la maladie de patient: ");
        scanf("%s", &p.maladie);
        fprintf(p_file, "%d %s %s %s %d %s\n", p.num, p.nom, p.prenom, p.sexe, p.age, p.maladie);
    }
    fclose(p_file);
}

int nbr_femme(){
    FILE* f = NULL;
    Patient p;
    int cpt = 0;
    f = fopen("Patients.txt", "r");
    if(f == NULL){
        printf("impossible de lire le fichier");
        exit;
    } else {
        char ch[100];
        do{
            fscanf(f, "%d %s %s %s %d %s\n", &p.num, &p.nom, &p.prenom, &p.sexe, &p.age, &p.maladie);
            if(strcasecmp(p.sexe, "Feminin") != 0){
                cpt++;
            }
        }while(fgets(ch, sizeof(ch), f) != NULL);
        return cpt;
    }
    fclose(f);
}

void chercheP(){
    FILE* f = NULL;
    Patient p;
    char nom[20];
    char ch[100];
    f = fopen("Patients.txt", "r");
    if(f == NULL){
        printf("impossible de lire le fichier");
        exit;
    } else {
        printf("Entrer le nom de patient a chercher: ");
        scanf("%s", &nom);
        do{
            fscanf(f, "%d %s %s %s %d %s\n", &p.num, &p.nom, &p.prenom, &p.sexe, &p.age, &p.maladie);
            if(strcasecmp(p.nom, nom) != 0){
                printf("%d %s %s %s %d %s", p.num, p.nom, p.prenom, p.sexe, p.age, p.maladie);
            }
        }while(fgets(ch, sizeof(ch), f) != 0);
    }
    fclose(f);
}

void nom_age(int age){
    FILE* f = NULL;
    Patient p;
    char ch[100];
    f = fopen("Patients.txt", "r");
    if(f == NULL){
        printf("impossible de lire le fichier");
        exit;
    } else {
        
        do{
            fscanf(f, "%d %s %s %s %d %s\n", &p.num, &p.nom, &p.prenom, &p.sexe, &p.age, &p.maladie);
            if(p.age >= age){
                printf("%d %s %s \n", p.num, p.nom, p.prenom);
            }
        }while(fgets(ch, sizeof(ch), f) != 0);
    }
    fclose(f);
}

void chercherL(char c){
    FILE* f = NULL;
    Patient p;
    char ch[100];
    f = fopen("Patients.txt", "r");
    if(f == NULL){
        printf("impossible de lire le fichier");
        exit;
    } else {
        do{
            fscanf(f, "%d %s %s %s %d %s\n", &p.num, &p.nom, &p.prenom, &p.sexe, &p.age, &p.maladie);
            if(p.nom[0] == c){
                printf("%d %s %s \n", p.num, p.nom, p.prenom);
            }
        }while(fgets(ch, sizeof(ch), f) != 0);
    }
    fclose(f);
}

void addP(){
    FILE* f = NULL;
    char ch[100];
    Patient p;
    Patient np;
    f = fopen("Patients.txt", "a");
    if(f == NULL){
        printf("impossible de lire le fichier");
        exit;
    } else {
        do{
            fscanf(f, "%d %s %s %s %d %s\n", &p.num, &p.nom, &p.prenom, &p.sexe, &p.age, &p.maladie);
            np.num = p.num + 1;
        }while(fgets(ch, sizeof(ch), f) != 0);
        printf("Donner le nom de patient: ");
        scanf("%s", &np.nom);
        printf("Donner le prenom de patient: ");
        scanf("%s", &np.prenom);
        printf("Donner le sexe de patient (Feminin ou Masculin): ");
        scanf("%s", &np.sexe);
        printf("Donner l'age de patient: ");
        scanf("%d", &np.age);
        printf("Donner la maladie de patient: ");
        scanf("%s", &np.maladie);
        fprintf(f, "/n%d %s %s %s %d %s\n", np.num, np.nom, np.prenom, np.sexe, np.age, np.maladie);
    }
   fclose(f);
}


int main(){
    //createP_file();
    // int nbr = nbr_femme();
    // printf("%d", nbr);
    // chercheP();
    //nom_age(10);
    //chercherL('m'); 
    addP();
}