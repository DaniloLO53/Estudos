#include <stdio.h>

int main() {
    int x;
    int y;

    printf("x: ");
    scanf("%d", &x);
    
    printf("\ny: ");
    scanf("%d", &y);

    if (x > 0 && y > 0) {
        printf("1\n");
    }
    if (x < 0 && y > 0) {
        printf("2\n");
    }
    if (x < 0 && y < 0) {
        printf("3\n");
    }
    if (x > 0 && y < 0) {
        printf("4\n");
    }
    return 0;
}