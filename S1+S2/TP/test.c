#include <stdio.h>
#include <stdlib.h>

int main() {
    int tab1[5] = {5,7,3,4,6};
    int tab2[5] = {2,5,1,8,7};

    int new_tab[2];

    for(int i=0; i<5; i++){
        for(int j = 0; j<2; j++){
            if(i == 2 && j == 0){
                new_tab[j] = tab1[i];
            } else if(i == 2 && j == 1){
                new_tab[j] = tab2[i];
            } 
        }
    }

    for(int i=0; i<2; i++){
        printf("%d ", new_tab[i]);
    }


    int rep = 0;
    int tab[5] ={5,2,1,20,4};
    for(size_t i=0; i<sizeof(tab); i++ ){
        if(tab[i] == 10 || tab[i] == 20){
            rep++;
        }
    }
    if (rep == 2 )
    {
        printf("Le tableau  contient 2 fois la valeur 10 ou 20");
    }
    
}

