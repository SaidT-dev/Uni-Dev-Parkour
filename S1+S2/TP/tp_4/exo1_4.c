#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,i,j=0,position[12]={},v[12]={4,1,6,3,8,1,6,2,8,1,5,7};
    printf("enter la valeur:");
    scanf("%d",&n);
    for(i=0;i<12;i++){
        if(v[i]==n){
        position[j]=i+1;
        j++;
        }
    }
    if (j==0) printf("\nla valeur %d n'exist pas dans le vecteur",n);
    else{
        printf("sa ou ses position est: ");
        for(i=0;i<j;i++) printf("%d ",position[i]);
    }
}