#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct noeud_s {
    int val;
    struct noeud_s* Fg;
    struct noeud_s* Fd;
} noeud_t;

typedef noeud_t* arbre_t;

arbre_t creeArbre(int val, noeud_t* a, noeud_t* b) {
    arbre_t arbre = (arbre_t)malloc(sizeof(noeud_t));
    if (arbre == NULL) {
        fprintf(stderr, "allocation impossible\n");
        exit(-1);
    }
    arbre->val = val;
    arbre->Fg = a;
    arbre->Fd = b;
    return arbre;
}

void detruitArbre(arbre_t arbre) {
    if (arbre != NULL) {
        detruitArbre(arbre->Fg);
        detruitArbre(arbre->Fd);
        free(arbre);
    }
}

int nombreNoeuds(arbre_t arbre) {
    int nbr = 0;
    if (arbre != NULL) {
        nbr = 1 + nombreNoeuds(arbre->Fg) + nombreNoeuds(arbre->Fd);
    }
    return nbr;
}

bool compare(arbre_t arbre1, arbre_t arbre2) {
    bool cmp = false;
    if (arbre1 == NULL && arbre2 == NULL) {
        return true;
    }
    if (arbre1 == NULL || arbre2 == NULL) {
        return false;
    }
    cmp = (arbre1->val == arbre2->val) && compare(arbre1->Fg, arbre2->Fg) &&
          compare(arbre1->Fd, arbre2->Fd);
    return cmp;
}

// arbre_t creeARB(arbre_t arbre, int val) {
//     if (arbre == NULL) {
//         return creeArbre(val, NULL, NULL);
//     }
//     if (val < arbre->val) {
//         arbre->Fg = creeARB(arbre->Fg, val);
//     } else if (val > arbre->val) {
//         arbre->Fd = creeARB(arbre->Fd, val);
//     }
//     return arbre;
// }

void afficheArbre(arbre_t arbre) {
    if (arbre != NULL) {
        printf("%d ", arbre->val);
        afficheArbre(arbre->Fg);
        afficheArbre(arbre->Fd);
    }
}

int main() {
    arbre_t a = creeArbre(10, NULL, NULL);
    arbre_t b = creeArbre(5, NULL, NULL);
    arbre_t arbre = creeArbre(5, a, b);
    afficheArbre(arbre);

    detruitArbre(arbre);
    return 0;
}
