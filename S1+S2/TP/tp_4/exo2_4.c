#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){
    int i,j,k,x,m[3][4]={};
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
        printf("les elements sont: ");
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                for(k=1;k<3;k++){
                    if(k<=i) k=i+1;
                    for(x=0;x<4;x++){
                        if(m[i][j]==m[k][x]){
                        printf("%d ",m[i][j]);
                        goto here;
                        }
                    }      
                }
                here:;
            }
        }
}