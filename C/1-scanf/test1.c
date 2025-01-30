#include <stdio.h>


void test1();
void test2();

int main() {
    test1();

    return 0;
}

void test2() {
    // Buffer do teclado: a
    char a, b;
    printf("Enter with 2 letters: ");
    scanf("%c%c", &a, &b);

    printf("a: %c\n", a);
    printf("b: %c\n", b);
}

void test1() {
// Buffer do teclado: 28\n1.77\n64\nm
    char gender;
    int age;
    float weight, height;

    printf("Enter with age, weight, height and gender: ");
    scanf("%d%f%f%c", &age, &weight, &height, &gender);

    printf("*** Infos ***\n");
    printf("Age: %d\n", age);
    printf("Weight: %.2f\n", weight);
    printf("Height: %.2f\n", height);
    printf("Gender: %c\n", gender);
}