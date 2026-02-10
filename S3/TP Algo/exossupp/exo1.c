#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

bool rechDicho(int *T, int taille, int val) {
    int debut = 0;
    int fin = taille - 1;
    int mil;
    while (debut <= fin) {
        mil = (debut + fin) / 2;
        if (T[mil] == val) {
            return true;
        } else if (val < T[mil]) {
            fin = mil - 1;
        } else if (val > T[mil]) {
            debut = mil + 1;
        }
    }
    return false;
}

int main() {
    int T[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int taille = sizeof(T) / sizeof(T[0]);
    int val = 10;
    if (rechDicho(T, taille, val)) {
        printf("Value %d found in the array.\n", val);
    } else {
        printf("Value %d not found in the array.\n", val);
    }
}