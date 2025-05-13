#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,i,j,v1[12]={},v2[12]={},v[12]={4,1,6,3,8,1,6,2,8,1,5,7};
    for(i=0;i<12;i++)
    v1[i]=v[i];
    printf("les elemont de v sont :");
    for(i=0;i<12;i++){
        printf("%d | ",v[i]);
    }
    for(i=0;i<12;i++){
        for(j=i;j<12;j++){
           if(v1[j]<v1[i]){
            n=v1[j];
            v1[j]=v1[i];
            v1[i]=n;
           }
        }
    }
    printf("\nles elemon de v1 sont :");
    for(i=0;i<12;i++) printf("%d | ",v1[i]);
    j=11;
    i=0;
    while(i<12){
       v2[i]=v[j];
       i++;
       j--;
    }
    printf("\nles elemon de v2 sont :");
    for(i=0;i<12;i++) printf("%d | ",v2[i]);
}