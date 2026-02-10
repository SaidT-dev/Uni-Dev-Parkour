#include<stdio.h>
#include<stdlib.h>

int main(){
    int i,k,j,v[12]={4,1,6,3,8,1,6,2,8,1,5,7};
    printf("les elemont de vecteur est :");
    for(i=0;i<12;i++){
        printf("|%d|",v[i]);
    }
    for(i=0;i<12;i++){
        k=0;
        for(j=0;j<12;j++){
           if(v[j]==v[i]){
           if(j<i)goto here;
           k++;
           }
        }
        printf("\n%d this number apeared %d times",v[i],k);
        here:;
    }
}