#include <stdio.h>
#include <math.h>
#include <string.h>

int main() {
    printf("------------------------------ 1 ------------------------------\n");
    float a;
    printf("Entrer un entier: ");
    scanf("%f", &a);
    printf("sa valeur abs: %i;\nson carre: %f;\nsa racine carree: %f;\nsa valeur expo: %f;\nsa partie entiere: %f", abs(a), pow(a,2), sqrt(a), exp(a), floor(a));

    printf("------------------------------ 2 ------------------------------\n");
    char c[100], d[100];
    printf("Entrer deux chaines de caractaire: \n");
    /* --------------- sans espace --------------- */
    scanf("%s%s", c, d);
    printf("La tailles des chaines est: %d et %d \n", strlen(c), strlen(d));
    /* --------------- avec espace --------------- */
    // fgets(c, sizeof(c), stdin);
    // fgets(d, sizeof(d), stdin);
    // printf("La tailles des chaines est: %d et %d \n", strlen(c), strlen(d));

    printf("------------------------------ 3 ------------------------------\n");
    char e[5];
    do {
        printf("Entrer 'univ-': \n");
        scanf("%s", e);
    } while(strcmp(e, "univ-") != 0);
    printf("%sbejaia.dz \n", e);
    printf("%s\n", strcat(e, "bejaia.dz"));

    printf("------------------------------ 4 ------------------------------\n");
    char ch[50] = "le programation est amusante";
    char sub[50];
    strncpy(sub, (ch + 16), 12);
    printf("%s\n", sub);
    printf("------------------------------ 5 ------------------------------\n");
    int x, y, z;
    printf("Entrer deux entier: \n");
    printf("x = "); scanf("%d", &x);
    printf("y = "); scanf("%d", &y);
    z = x;
    x = y;
    y = z;
    printf("La permutation: \nx = %d \ny = %d \n", x, y);

    printf("------------------------------ 6 ------------------------------\n");
    int m, n, o;
    printf("Entrer les entiers: \n");
    do{
        printf("m = (!=0)"); scanf("%d", &m);
    } while (m == 0);
    do{
        printf("n = (!=0)"); scanf("%d", &n);
    }while(n==0);
    do{
        printf("o = (>0)"); scanf("%d", &o);
    }while(o==0);
    printf("(-n+sqrt(pow(n,2)-4mo))/2m = %f\n", ((1-n)+sqrt(pow(n,2)-4*m*o))/(2*m));
    printf("2m*exp(n+o) = %f\n", 2*m*exp(n+o));
    printf("pow(2,4) = %f\n", pow(2,4));
    printf("pow(5,mn)/(no) = %f\n", pow(5,m*n)/(n*o));
}
