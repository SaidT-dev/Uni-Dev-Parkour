#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct noeud {
    int val;
    struct noeud* g;
    struct noeud* d;
} noeud;
typedef noeud* arbre;

bool rechABR(arbre a, int val) {
    if (a != NULL) {
        if (a->val == val) {
            return true;
        } else if (val > a->val) {
            printf(" -> droite");
            return rechABR(a->d, val);
        } else {
            printf(" -> gauche");
            return rechABR(a->g, val);
        }
    }
}
