#include <stdio.h>

void swapTemp();
void swapXOR();

int main() {
    int n = 1;
    long int li = 36297364972369;
    long long int lli = 362973649723693453;
    float f = 1.11;
    float lf = 1.11;
    double d = 1.11;

    printf("Size of int: %ld bytes\n", sizeof(int));
    printf("Size of int: %ld bytes\n", sizeof n);
    printf("Size of short int: %ld bytes\n", sizeof(short int));
    printf("Size of long int: %ld bytes\n", sizeof li);
    printf("Size of char: %ld bytes\n", sizeof(char));
    printf("Size of float: %ld bytes\n", sizeof(float));
    printf("Size of double: %ld bytes\n", sizeof(double));

    printf("****************\n");

    printf("Long int value: %ld\n", li);
    printf("Long int value: %lld\n", lli);
    printf("Double value: %lf\n", d);

    return 0;
}

void swapTemp() {
    int a = 5, b = 10;
    printf("Antes da troca: a = %d, b = %d\n", a, b);

    int temp = a;
    a = b;
    b = temp;

    printf("Depois da troca: a = %d, b = %d\n", a, b);
}

void swapXOR() {
    int a = 5, b = 10;
    printf("Antes da troca: a = %d, b = %d\n", a, b); // a = 5, b = 10

    //            a = 0101
    //            b = 1010
    // a = XOR(a,b) = 1111
    // b = XOR(a,b) = 0101
    // a = XOR(a,b) = 1010

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    printf("Depois da troca: a = %d, b = %d\n", a, b); // a = 10, b = 5
}