#include<stdio.h>

int main(){
    int n,m,i,j;
    scanf("%d%d",&n,&m);
    int t[n][m];
    for(i=0;i<n;i++){
        for( j=0;j<m;j++)
        scanf("%d",&t[i][j]);
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
        printf("%d|",t[i][j]);}
    printf("\n");
    }
}