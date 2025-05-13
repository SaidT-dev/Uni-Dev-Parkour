#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){
    int i,j,k,x,m[3][4]={},v3[4]={1,1,1,1};
    for(j=0;j<4;j++){
        m[0][j]=pow(2,j+1);
        m[1][j]=2*(j+1);
        m[2][j]=2+j+1;
    }
    printf("votre matrice M est :\n");
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            printf("|%d|",m[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<4;i++){
        for(j=0;j<3;j++){
            v3[i]*=m[j][i];
        }
    }
    printf("le vecteur v3 est : ");
    for(i=0;i<4;i++){
        printf("|%d|",v3[i]);
    }
}