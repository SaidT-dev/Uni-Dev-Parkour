#include <stdio.h>
#include <stdlib.h>

void main() {
    int x,y,z;
    printf("Entrer x et y: ");
    scanf("%d%d", &x, &y);
    z = x;
    x = y;
    y = z;

    printf("x=%d y=%d", x, y);


}