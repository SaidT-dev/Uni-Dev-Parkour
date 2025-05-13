#include <stdio.h>
#include <time.h>

/*-------------EXO1-------------*/
// int rechseq(int T[], int n, int x){
//     int iteration = 0;
//     for(int i=0; i < n; i++){
//         iteration++;
//         if(T[i] == x){
//             return iteration;
//         }
//     }
//     return 0;
// }

// int rechdich(int T[], int n, int x){
//     int iteration = 0;
//     int debut = 0;
//     int fin = n-1;
//     while(debut <= fin){
//         iteration++;
//         int mid = (debut + fin)/2;

//         if(T[mid] == x){
//             return iteration;
//         } else if(T[mid] > x){
//             fin = mid-1;
//         } else {
//             debut = mid + 1;
//         }
//     }
//     return 0;
// }

/*--------2-----EXO2-------------*/
int f1(int n){
    int u0 = 1;
    int u1 = 1, Un;
    if(n <= 1){
        return 1;
    } else {
        for(int i = 2; i <= n; i++){
            Un = u1 + u0;
            u0 = u1;
            u1 = Un;
        }
        return Un;
    }
}

int f2(int n){
    if(n <= 1){
        return 1;
    } else {
        return f2(n-1) + f2(n-2);
    }
}

int main(){
    /*-------------EXO1-------------*/
    // int T[10000], n=10000, n1=0 , n2, x;
    // for(int i=0; i<n; i++){
    //     T[i] = i;
    // }
    // printf("Entrer un nombre entier: ");
    // scanf("%d", &x);
    // n1 = rechseq(T, n, x);
    // n2 = rechdich(T, n, x);
    // printf("Le nombre d'iteration en utilisant une recherche sequetiel: %d\n", n1);
    // printf("Le nombre d'iteration en utilisant une recherche dichotomique: %d\n", n2);

    /*-------------EXO2-------------*/
    clock_t T1, T2;
    int n;
    double temps;

    printf("Entrer un entier n: ");
    scanf("%d", &n);

    T1 = clock();
    f1(n);
    T2 = clock();
    temps = (double)(T2 - T1) / (double)CLOCKS_PER_SEC;
    printf("La fonction f1 a pris %f secondes\n", temps);

    T1 = clock();
    f2(n);
    T2 = clock();
    temps = (double)(T2 - T1) / (double)CLOCKS_PER_SEC;
    printf("La fonction f2 a pris %f secondes", temps);
}