#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void triSelection(int *T, int n){
    int tmp = 0;
    for(int i = 0; i < n - 1; i++){
        int min = i;
        for(int j = i + 1; j < n; j++){
            if(T[j] < T[min]){
                min = j;
            }
        }
        if(min != i){
            tmp = T[i];
            T[i] = T[min];
            T[min] = tmp;
        }
    }
}

void triInsertion(int *T, int n) {
    for (int i = 1; i < n; i++) {
        int cle = T[i];
        int j = i - 1;
        while (j >= 0 && T[j] > cle) {
            T[j + 1] = T[j];
            j = j - 1;
        }
        T[j + 1] = cle;
    }
}

void triBulles(int *T, int n) {
    int tmp, i = n-1;
    while(i != 0){
        for(int j = 0; j < i; j++){
            if(T[j] > T[j+1]){
                tmp = T[j];
                T[j] = T[j+1];
                T[j+1] = tmp;
            }
        }
        i--;
    }
}

void fusionner(int *T, int debut, int milieu, int fin) {
    int i1 = debut, i2 = milieu + 1, k = 0;
    int taille = fin - debut + 1;
    int *tmp = (int*)malloc(taille * sizeof(int));
    if (tmp == NULL) {
        fprintf(stderr, "Impossible d'allouer de la mémoire\n");
        exit(1);
    }
    while (i1 <= milieu && i2 <= fin) {
        if (T[i1] <= T[i2]) {
            tmp[k++] = T[i1++];
        } else {
            tmp[k++] = T[i2++];
        }
    }
    while (i1 <= milieu) {
        tmp[k++] = T[i1++];
    }
    while (i2 <= fin) {
        tmp[k++] = T[i2++];
    }
    for (k = 0; k < taille; k++) {
        T[debut + k] = tmp[k];
    }

    free(tmp);
}

void triFusion(int *T, int debut, int fin){
    if(debut < fin) {
        int milieu = (debut + fin) / 2;
        triFusion(T, debut, milieu);
        triFusion(T, milieu + 1, fin);
        fusionner(T, debut, milieu, fin); 
    }
}

void permuter(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

void triRapide(int *T, int d, int f) {
    int pivot = T[f];
    int i = d - 1;
    for (int j = d; j < f; j++) {
        if (T[j] <= pivot) {
            i++;
            permuter(&T[i], &T[j]);
        }
    }
    permuter(&T[i + 1], &T[f]);
    triRapide(T, d, i);
    triRapide(T, i + 2, f);
}


int* randomTable(int n){
    int *T = (int*)malloc(n * sizeof(int));
    if (T == NULL) {
        fprintf(stderr, "impossible d'allouer de la memoire\n");
        exit(1);
    }
    for(int i = 0; i < n; i++){
        T[i] = rand();
    }
    return T;
}
int main() {
    system("cls");
    clock_t start, end;
    double second = 0;

    // Tri par sélection
    for(int i = 1000; i <= 1000000; i *= 10){
        int *T = randomTable(i);
        start = clock();
        triSelection(T, i);
        end = clock();
        second = (double)(end - start) / CLOCKS_PER_SEC;
        printf("Le tri par sélection sur un tableau de taille %d a pris: %f secondes\n", i, second);
        free(T);
    }
    
    printf("\n\n");

    // Tri par insertion
    for(int i = 1000; i <= 1000000; i *= 10){
        int *T = randomTable(i);
        start = clock();
        triInsertion(T, i);
        end = clock();
        second = (double)(end - start) / CLOCKS_PER_SEC;
        printf("Le tri par insertion sur un tableau de taille %d a pris: %f secondes\n", i, second);
        free(T);
    }

    printf("\n\n");

    // Tri à bulles
    for(int i = 1000; i <= 1000000; i *= 10){
        int *T = randomTable(i);
        start = clock();
        triBulles(T, i);
        end = clock();
        second = (double)(end - start) / CLOCKS_PER_SEC;
        printf("Le tri à bulles sur un tableau de taille %d a pris: %f secondes\n", i, second);
        free(T);
    }

    printf("\n\n");

    // Tri par fusion
    for(int i = 1000; i <= 1000000; i *= 10){
        int *T = randomTable(i);
        start = clock();
        triFusion(T, 0, i - 1);
        end = clock();
        second = (double)(end - start) / CLOCKS_PER_SEC;
        printf("Le tri par fusion sur un tableau de taille %d a pris: %f secondes\n", i, second);
        free(T);
    }
    
    printf("\n\n");

    // Tri rapide
    for(int i = 1000; i <= 1000000; i *= 10){
        int *T = randomTable(i);
        start = clock();
        triRapide(T, 0, i - 1);
        end = clock();
        second = (double)(end - start) / CLOCKS_PER_SEC;
        printf("Le tri rapide sur un tableau de taille %d a pris: %f secondes\n", i, second);
        free(T);
    }
    return 0;
}
