#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){
    int mm[3][3], m[3][4], mt[4][3];
    for(int j=0; j<4; j++){
        m[0][j] = pow(2,j+1);
        m[1][j] = 2*(j+1);
        m[2][j] = 2+j+1;
    }
    printf("votre matrice M est :\n");
    for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            printf("%d\t",m[i][j]);
        }
        printf("\n");
    }
    for(int j=0; j<4; j++){
        mt[j][0] = pow(2,j+1);
        mt[j][1] = 2*(j+1);
        mt[j][2] = 2+j+1;
    }
    printf("votre matrice transpose MT est :\n");
    for(int j=0; j<4; j++){
            for(int i=0; i<3; i++){
        printf("%d\t",mt[j][i]);
        }
        printf("\n");
    }

    for(int i=0; i<3; i++){
        for(int k=0; k<3; k++){
            for(int j=0; j<4; j++){
                mm[i][k] +=m [i][j] * mt[j][k];
            }
        }
    }
    printf("votre matrice MM est :\n");
    for(int i=0; i<3; i++){
        for(j=0; j<3; j++){
            printf("%d\t",mm[i][j]);
        }
        printf("\n");
    }
}