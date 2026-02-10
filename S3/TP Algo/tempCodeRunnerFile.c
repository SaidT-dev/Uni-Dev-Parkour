#include <stdio.h>
#include <assert.h>
#include "C:\Users\SaidT\Documents\Fac\TP\L2\exossupp\exo6.c"

void test_rechABR() {
    // Create nodes
    noeud n1 = {1, NULL, NULL};
    noeud n3 = {3, NULL, NULL};
    noeud n2 = {2, &n1, &n3};
    noeud n7 = {7, NULL, NULL};
    noeud n5 = {5, &n2, &n7};
    
    arbre root = &n5;

    // Test cases
    assert(rechABR(root, 5) == true);
    printf("\n");
    assert(rechABR(root, 2) == true);
    printf("\n");
    assert(rechABR(root, 7) == true);
    printf("\n");
    assert(rechABR(root, 1) == true);
    printf("\n");
    assert(rechABR(root, 3) == true);
    printf("\n");
    assert(rechABR(root, 4) == false);
    printf("\n");
    assert(rechABR(root, 6) == false);
    printf("\n");
    assert(rechABR(root, 8) == false);

    printf("\nAll tests passed!\n");
}

int main() {
    test_rechABR();
    return 0;
}