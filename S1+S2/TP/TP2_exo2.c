#include <stdio.h>
#include <string.h>
#include <math.h>

int main(){
    printf("------------------------------ 1 ------------------------------\n");
    int x;
    printf("Entrer un entier x = ");
    scanf("%d", &x);
    printf("sa valeur absolue est |x| = ", x);
    if(x < 0){
        printf("%d\n", -x);
    } else{
        printf("%d\n", x);
    }

    printf("------------------------------ 2 ------------------------------\n");
    int a,b,c;
    printf("Entrer trois entier: \n");
    scanf("%d%d%d", &a,&b,&c);
    if(a>b && a>c){
        printf("Le max est %d\n", a);
    } else if(b>a && b>c){
        printf("Le max est %d\n", b);
    } else if(c>a && c>b){
        printf("Le max est %d\n", c);
    } else{
        printf("Les trois valeur sont egaux\n");
    }

    /*printf("------------------------------ 3 ------------------------------\n");
    char ch[50][50] = {"mother", "father", "brother"};
    char tri[50][50]= {};
    for(int i=0; i<3; i++){
        if(strcmp(ch[i], ch[i+1]) < 0){
            strcpy(tri[i+1], ch[i]);
       } else if(strcmp(ch[i], ch[i+1]) > 0){
            strcpy(tri[i], ch[i]);
       } else {
            strcpy(tri[i], ch[i]);
       }
    }
    for(int i=0; i<3; i++){
        printf("%s \n", tri[i]);
    }*/
}
