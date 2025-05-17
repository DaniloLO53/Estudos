#include <stdio.h>

int main() {
    int integer;

    printf("Enter with an integer: ");
    scanf("%d", &integer);

    printf("Number is negative: ");

    if (integer < 0) {
        printf("YES");
    } else if (integer == 0) {
        printf("0");
    } else {
        printf("NO");
    }
    

    return 0;
}