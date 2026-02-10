#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct noeud {
    int val;
    struct noeud* FG;
    struct noeud* FD;
} noeud;

typedef noeud* arbre;

arbre creatA(int* T, int size) {
    arbre A = NULL;
    for (int i = 0; i < size; i++) {
        arbre newNode = (arbre)malloc(sizeof(noeud));
        if (newNode == NULL) {
            printf("Memory allocation failed\n");
            exit(1);
        }
        newNode->val = T[i];
        newNode->FG = NULL;
        newNode->FD = NULL;

        if (A == NULL) {
            A = newNode;
        } else {
            arbre current = A;
            while (1) {
                if (T[i] < current->val) {
                    if (current->FG == NULL) {
                        current->FG = newNode;
                        break;
                    } else {
                        current = current->FG;
                    }
                } else {
                    if (current->FD == NULL) {
                        current->FD = newNode;
                        break;
                    } else {
                        current = current->FD;
                    }
                }
            }
        }
    }
    return A;
}

void prefixe(arbre a) {
    if (a != NULL) {
        printf("%d ", a->val);
        prefixe(a->FG);
        prefixe(a->FD);
    }
}

void infixe(arbre a) {
    if (a != NULL) {
        infixe(a->FG);
        printf("%d ", a->val);
        infixe(a->FD);
    }
}

void postfixe(arbre a) {
    if (a != NULL) {
        postfixe(a->FG);
        postfixe(a->FD);
        printf("%d ", a->val);
    }
}

int maxN(arbre a) {
    if (a->FD != NULL) {
        return maxN(a->FD);
    } else {
        return a->val;
    }
}

int main() {
    srand(time(NULL));
    int t[10];
    for (int i = 0; i < 10; i++) {
        t[i] = rand();
    }
    arbre a = creatA(t, 10);
    prefixe(a);
    printf("\n");
    infixe(a);
    printf("\n");
    postfixe(a);
    printf("\n");
    printf("%d", maxN(a));
}