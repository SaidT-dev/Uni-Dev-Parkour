#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int triInsertion(int *T, int n) {
    int j, x;
    int cmp = 0;
    for (int i = 2; i <= n; i++) {
        x = T[i];
        j = i - 1;
        while (j > 0 && T[j] > x) {
            cmp++;
            T[j + 1] = T[j];
            j = j - 1;
        }
        T[j + 1] = x;
    }
    return cmp;
}

void fusioner(int *T, int d, int mil, int f) {
    int n = f - d + 1;
    int tmp[n];
    int i = 0, i1 = d, i2 = mil + 1;
    while (i1 <= mil && i2 <= f) {
        if (T[i1] < T[i2]) {
            tmp[i] = T[i1];
            i1++;
        } else {
            tmp[i] = T[i2];
            i2++;
        }
        i++;
    }
    while (i1 <= mil) {
        tmp[i] = T[i1];
        i++;
        i1++;
    }
    while (i2 <= f) {
        tmp[i] = T[i2];
        i++;
        i2++;
    }
    for (i = 0; i < n; i++) {
        T[d + i] = tmp[i];
    }
}

void triFusion(int *T, int d, int f) {
    if (d < f) {
        int mil = (d + f) / 2;
        triFusion(T, d, mil);
        triFusion(T, mil + 1, f);
        fusioner(T, d, mil, f);
    }
}

int main() {
    int n = 1000;
    int T1[n], T2[n];
    srand(time(NULL));
    for (int i = 0; i < n; i++) {
        T1[i] = rand();
        T2[i] = T1[i];
    }

    clock_t start, end;
    double cpu_time_used;

    start = clock();
    int cmp_insertion = triInsertion(T1, n);
    end = clock();
    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Tri par insertion: %d comparaisons, temps: %f secondes\n",
           cmp_insertion, cpu_time_used);

    start = clock();
    triFusion(T2, 0, n - 1);
    end = clock();
    cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Tri par fusion: temps: %f secondes\n", cpu_time_used);

    return 0;
}