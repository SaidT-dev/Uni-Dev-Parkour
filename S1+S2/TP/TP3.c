#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int main(){
    /*printf("------------------- 1 -------------------\n");
    int N;
    int note;
    int notesup = 0;
    do{
        printf("Entrer le nombre de note: ");
        scanf("%d", &N);
    }while(N <= 0);
    for(int i = 0; i < N; i++){
        do{
            printf("Entrer la note %d: ", i + 1);
            scanf( "%d", &note );
        } while(note < 0 || note > 20);

        if(note >= 10){
            notesup++;
        }
    }
    printf("Les notes >= 10 sont : %d \n", notesup);

    printf("------------------- 2 -------------------\n");
    int x;
    int nb = 0;
    int somme = 0;
    printf("Entrer un nombre: ");
    scanf("%d", &x);

    printf("%d se compose de ", x);
    while(x != 0){
        somme += x % 10;
        x /= 10;
        nb++;
    }
    printf("%d chiffre et la somme de chiffre est %d \n", nb, somme);

    printf("------------------- 3 -------------------\n");
    int y;
    int invers = 0;
    printf("Entrer un nombre: ");
    scanf("%d", &y);

    while(y != 0){
        invers = invers * 10 + y % 10;
        y /= 10;
    }
    printf("L'inverse de nombre %d\n", invers);

    printf("------------------- 4 -------------------\n");
    int z;
    bool premier = true;
    printf("Entrer un nombre: ");
    scanf("%d", &z);
    for(int i = 2; i <= sqrt(z); i++){
        if(z % i == 0){
            premier = false;
        }
    }
    if (premier){
        printf("%d est un nombre premier", z);
    } else {
        printf("%d n'est pas un nombre premier", z);
    }
    printf("\n");

    printf("------------------- 5 -------------------\n");
    int w;
    int v;
    int max;
    int pos = 0;
    int k = 0;

    do{
        v = w;
        printf("Entrer un nombre: ");
        scanf( "%d", &w );


        if(w > v ){
            max = w;
            pos = k;
        }
        k++;
    }while(w != 0);
    printf("La plus grande valeur entrer est %d et sa position est %d \n", max, pos + 1);

    printf("------------------- 6 -------------------\n");
    int b, d = 0;
    int l = 0;
    bool binaire = true;
    printf("Entrer un nombre en binaire: ");
    scanf("%d", &b);
    while(b != 0){
        if(b % 10 > 1 || b % 10 < 0){
            binaire = false;
        }
        d +=  (b % 10) * pow(2, l);
        b /= 10;
        l++;
    }
    if(binaire == true){
        printf("En decimal %d \n", d);
    } else {
        printf("Un nombre binaire se compose seulement de 1 et 0");
    }


    printf("------------------- 7 -------------------\n");
    int e, f;
    printf("Entrer deux entier: \n");
    printf("x = "); scanf("%d", &e);
    printf("y = "); scanf("%d", &f);

    while (e - f >= f ){
        e -= f;
    }
    printf("Le reste est r = %d \n");
    */
    printf("-------------------  -------------------\n");
    int q, f=1;
    scanf("%d", &q);

    while(q != 0){
        f *= q;
        q--;
    }
    printf("%d",f);

    return 0;
}
