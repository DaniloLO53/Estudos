#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    int length = 50;
    double rect[length];

    for (int i = 0; i < length; i++) {
        rect[i] = 95000 + 500*i + rand() % 1000 - 1000;
        printf("%d", &length);
    }

    for (int i = 0; i < length; i++) {
        printf("%f\n", rect[i]);
    }
    return 0;
}