#include <stdio.h>

int main() {
    int a, b;
    printf("Choose a value for a: \n");
    scanf("%d", &a);

    printf("Choose a value for b: \n");
    scanf("%d", &b);

    int temp = a;
    a = b;
    b = temp;

    printf("Now a = %d and b = %d\n", a, b);
    return 0;
}