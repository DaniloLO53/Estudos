#include <stdio.h>

int main() {
    int n = 35;
    int isPrime = 1;

    for(int i = 2; i < n; i++) {
        if (n % i == 0) {
            printf("i: %d\n", i);
            printf("Not prime\n");
            isPrime = 0;
            break;
        }
    }
    if (isPrime) {
        printf("Prime\n");
    }
    
    return 0;
}