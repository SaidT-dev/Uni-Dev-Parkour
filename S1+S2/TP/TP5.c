#include <stdio.h>

int n = 100;
/*--------------------EX01--------------------*/
float MIN(float a, float b){
    if(a < b){
        return a;
    } else {
        return b;
    }
}

float MAX(float a, float b){
    if(a > b){
        return a;
    } else {
        return b;
    }
}

int Impaire(int a){
    if (a % 2 == 0)
    {
        printf("%d n'est pas impaire", a);
    } else {
        printf("%d est impaire", a);
    }
}

int Absolue(int a){
    if(a < 0){
        return -a;
    } else{
        return a;
    }
}

/*--------------------EX02--------------------*/
int Position(int T[n], int a){
    for(int i = 0; i < n; i++){
        if(T[i] == a){
            return i+1;
        }
    }
    return 0;
}

void Supprimer(int T[n], int k){
    for(int i = k-1; i < n; i++){
        T[i] = T[i+1];
    }
}

/*--------------------EX03--------------------*/
int VerifierPermutation(int T[n]){
    return 0;
}

/*--------------------EX04--------------------*/
int stlen(char string[n]){
    int taille = 0;
    while(string[taille] != '\0'){
        taille++;
    }
    return taille;
}
int Apparition(char string[n], char c){
    int appr = 0;
    for(int i = 0; i < n; i++){
        if(string[i] == c){
            appr++;
        }
    }
    return appr;
}

/*--------------------EX05--------------------*/
char SuppOcc(char ch1[], char ch2[]){
    
}



int main(){
    char ch[] = "Hello world";
    int T[] = {1,5,3,4,9,7,8,2,6,4,9,8};

    printf("%d", Position(T, 8));
}
