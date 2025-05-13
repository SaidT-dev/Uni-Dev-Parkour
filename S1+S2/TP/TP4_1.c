#include <stdio.h>

int main(){
    int v[] = {4,1,6,3,8,1,6,2,8,1,5,7};
    size_t v_size = sizeof(v) / sizeof(v[0]);
    /*--------------------------1--------------------------*/
    float s = 0;
    for(size_t i=0; i < v_size; i++){
        /*do{
            printf("Entrer les valeurs de tableau: ");
            scanf("%d", &v[i]);
        } while(v[i] <0);*/
        s += v[i];
    }
    printf("Le vecteur est: ");
    for(size_t i=0; i < v_size; i++){
        printf("%d,", v[i]);
    }
    /*--------------------------2--------------------------*/
    printf("\nLa somme des valeurs de vecteur est %f\n", s);
    printf("La moyenne somme des valeurs de vecteur est %f\n", s/v_size);

    /*--------------------------3--------------------------*/
    int max=v[0], min=v[0], posM=0, posm=0;
    for(size_t i=0; i < v_size; i++){
        if(v[i] >= max){
            max = v[i];
            posM = i;
        } else if(v[i] <= min){
            min = v[i];
            posm = i;
        }
    }
    printf("Le max est %d et sa pos est %d\n", max, posM+1);
    printf("Le min est %d et sa pos est %d\n", min, posm+1);

    /*--------------------------4--------------------------*/
    int n;
    printf("Entrer une valeur n: ");
    scanf("%d", &n);
    for(size_t i=0; i < v_size; i++){
        if(n == v[i]){
            printf("%d est dans la case %d\n", n, i+1);
        }
    }

    /*--------------------------5--------------------------*/
    int occ; 
    for(int i=0; i<v_size; i++){
        occ = 0;
        for(int j=0; j<v_size; j++){
            if(v[i] == v[j]){
                occ++;
            }
        }
        printf("%d se repete %d fois\n", v[i], occ);
    }

    /*--------------------------6--------------------------*/
    int v1[v_size];
    for(size_t i=0; i < v_size; i++){
        v1[i] = v[i];
    }
    for(int i=0; i<v_size; i++){
        for(int j=0; j<v_size; j++){
            if(v1[i] <= v1[j]){
                int temp = v1[i] ;
                v1[i] = v1[j];
                v1[j] = temp;
            }
        }
    }
    printf("Le vecteur ordonner d'une maniere croissante: ");
    for(size_t i=0; i < v_size; i++){
        printf("%d,", v1[i]);
    }

    /*--------------------------7--------------------------*/
    
    return 0;
}