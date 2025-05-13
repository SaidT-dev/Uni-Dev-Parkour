#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int main(){
    printf("-------------------- 1 --------------------\n");
    int M[3][4];
    for(int j=0; j<4; j++){
        M[0][j] = pow(2, j+1);
        M[1][j] = 2*(j+1);
        M[2][j] = 2+j+1;
    }

    for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            printf("|%d|", M[i][j]);
        }
        printf("\n");
    }

    printf("-------------------- 2 --------------------\n");
    int MT[4][3];
    for(int i=0; i<4; i++){
        for(int j=0; j<3; j++){
            MT[i][j] = M[j][i];
        }
    }
    for(int i=0; i<4; i++){
        for(int j=0; j<3; j++){
            printf("|%d|", MT[i][j]);
        }
        printf("\n");
    }

    printf("-------------------- 3 --------------------\n");
    int MM[3][3]= {0};
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            for(int k=0; k<4; k++){
                MM[i][j] += M[i][k]*MT[k][j];
            }
        }
    }
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            printf("|%d|", MM[i][j]);
        }
        printf("\n");
    }

    printf("-------------------- 4 --------------------\n");
    //parcourire les element de la matrice
    for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            //parcourire une deuxieme fois a partire de la ligne qui suit l'actuel pour comparer
            for(int k=i+1; k<3; k++){
                for(int l=0; l<4; l++){
                    if(M[i][j] == M[k][l]){ //si l'element actual est present dans la ligne suivante alors l'afficher
                        printf("%d ", M[k][l]);
                    }
                }
            }
        }
    }
    printf("\n");
    printf("-------------------- 5 --------------------\n");
    int V3[4] = {1,1,1,1};
    for(int j=0; j<4; j++){
        for(int i=0; i<3; i++){
            V3[j] *= M[i][j];
        }
    }
    for(int i=0; i<4; i++){
        printf("%d ", V3[i]);
    }
    return 0;
}
