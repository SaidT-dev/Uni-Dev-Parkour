#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void triBulle(int *T, int taille) {
    for (size_t i = taille - 1; i > 0; i--) {
        for (size_t j = 1; j < i; j++) {
            if (T[j - 1] > T[j]) {
                int tmp = T[j - 1];
                T[j - 1] = T[j];
                T[j] = tmp;
            }
        }
    }
}

void triRapide(int *T, int d, int f) {
    if (d >= f) return;

    int pivot = T[d];
    int mur = d;
    for (int i = d + 1; i <= f; i++) {
        if (T[i] <= pivot) {
            mur++;
            int tmp = T[i];
            T[i] = T[mur];
            T[mur] = tmp;
        }
    }

    int tmp = T[d];
    T[d] = T[mur];
    T[mur] = tmp;

    triRapide(T, d, mur - 1);
    triRapide(T, mur + 1, f);
}

void triHybrid(int *T, int taille) {
    if (taille <= 10) {
        triBulle(T, taille);
    } else {
        triRapide(T, 0, taille - 1);
    }
}

int main() {
    srand(time(NULL));
    int T[100];
    for (int i = 0; i < 100; i++) {
        T[i] = rand() % 1000;
    }

    printf("Tableau avant tri :\n");
    for (int i = 0; i < 100; i++) {
        printf("%d ", T[i]);
    }
    printf("\n\n");

    triHybrid(T, 100);

    printf("Tableau après tri :\n");
    for (int i = 0; i < 100; i++) {
        printf("%d ", T[i]);
    }
    printf("\n");

    return 0;
}
