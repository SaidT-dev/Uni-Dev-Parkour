#include <stdio.h>

int main(){
    int a,b,c;

    printf("Entrer la valeur des trois angles de triangle\n");
    scanf("%d%d%d", &a, &b, &c);
    if(a+b+c > 180 || a+b+c<180 || a+b+c==0){
        printf("c'est pas un rectangle ressaye");
        return 1;
    }else if(a == b && a == c){
        printf("c'est un triangle equilateral");
    } else if((a == 90 || b == 90 || c == 90) && (b == c || a == c || b == a)){
        printf("c'est un triangle rectangle isocele");
    } else if(a == 90 || b == 90 || c == 90){
        printf("c'est un triangle rectangle");
    } else if(a ==b || a==c || b ==a || b==c || c==b || c==a){
        printf("c'est un triangle isocele");
    } else {
        printf("c'est un triangle quelconque");
    }

}
