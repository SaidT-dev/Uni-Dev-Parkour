#include <stdio.h>
#include <stdlib.h>

typedef struct noeud {
    int val;
    struct noeud* FG;
    struct noeud* FD;
} noeud;

typedef noeud* arbre;

int profA(arbre a) {
    if (a == NULL) {
        return 0;
    } else {
        int profG = profA(a->FG);
        int profD = profA(a->FD);
        if (profG > profD) {
            return (profG + 1);
        } else {
            return (profD + 1);
        }
    }
}

int feuille(arbre a) {
    if (a == NULL) {
        return 0;
    }
    if (a->FG == NULL && a->FD == NULL) {
        return 1;
    } else {
        return feuille(a->FD) + feuille(a->FG);
    }
}

int main() { return 0; }
