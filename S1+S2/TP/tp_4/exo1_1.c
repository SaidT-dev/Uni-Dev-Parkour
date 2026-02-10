#include<stdio.h>
#include<stdlib.h>

int main(){
    int some=0,i,j=0,k=0,posmax[12]={},posmin[12]={},v[12]={4,1,6,3,8,1,6,2,8,1,5,7};
    int max=v[0],min=v[0];
    float moy=0;
    printf("les elemont de vecteur est :");
    for(i=0;i<12;i++){
        printf("|%d|",v[i]);
        some=some+v[i];
    }
        moy=some/12;
        printf("\nla somme est: %d , la moyenne est: %f",some,moy);

    for(i=0;i<12;i++){
        if(v[i]>=max){
            max=v[i];
        }
        if(v[i]<=min){
            min=v[i];
        }
    }    
    for(i=0;i<12;i++){
        if(v[i]==max){
        posmax[j]=i+1;
        j++;
        }
        if(v[i]==min){
        posmin[k]=i+1;
        k++;
        }
    }
    printf("\n le max est: %d\n",max);
    printf("ca ou ces position est: ");
    for(i=0;i<j;i++)  printf("%d,",posmax[i]);
    printf("\n le min est: %d\n",min);
    printf("ca ou ces position est: ");
    for(i=0;i<k;i++)  printf("%d,",posmin[i]);
}