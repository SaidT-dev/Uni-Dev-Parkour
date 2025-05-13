#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool testTri(int T[], int n){
    bool test = true;
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (T[j] > T[i]) {
                test = false;
            }
        }
    }
    return test;
}

bool existVal(int T[], int n, int val){
    if(!testTri(T, n)){
        printf("Le tableau n'est pas trie\n");
        return false;
    } else {
        bool exist = false;
        int debut = 0;
        int fin = n-1;
        while(debut <= fin){
            int mid = (debut + fin)/2;
            if(T[mid] == val){
                exist = true;
                return true;
                
            } else if(T[mid] > val){
                fin = mid-1;
            } else {
                debut = mid + 1;
            }
        }
        return exist;
    }
}

int occVal(int T[], int n, int val){
    if(!testTri(T, n)){
        printf("Le tableau n'est pas trie\n");
        return 0;
    } else {
        int occ = 0;
        for (int i = 0; i < n; i++) {
            if (T[i] == val) {
                occ++;
            }
        }
        return occ;
    }
}

int longSeq(int T[], int n){
    if(testTri(T,n)){
        int maxSeq = 1;
        int currentSeq = 1;
        for(int i = 1; i < n; i++){
            if(T[i] == T[i-1] + 1 ){
                currentSeq++;
            } else {
                if(currentSeq >= maxSeq){
                    maxSeq = currentSeq;
                }
                currentSeq = 1;
            }
        }
        return maxSeq;
    } else {
        printf("Le tableau n'st pas trie");
    }
}

int main(){
    int n = 100;
    int T[n];
    for(int i = 0; i < n; i++){
        T[i] = i;
        printf("%d, ", T[i]);
    }
    // Qestion 1
    if(testTri(T, n)){
        printf("\nLe tableau est trie.\n");
    } else {
        printf("\nLe tableau n'est pas trie.\n");
    }

    //Qestion 2
    int val;
    printf("Entrer la valeur a chercher: ");
    scanf("%d", &val);
    if(existVal(T, n, val)){
        printf("La valeur %d existe dans le tableau.\n", val);
    } else {
        printf("La valeur %d n'existe pas dans le tableau.\n", val);
    }
    //Qestion 3
    int occurrences = occVal(T, n, val);
    printf("La valeur %d apparait %d fois dans le tableau.\n", val, occurrences);
    //Qestion 4
    int longestSequence = longSeq(T, n);
    printf("La plus longue sequence a une longueur de %d.\n", longestSequence);

    return 0;
}