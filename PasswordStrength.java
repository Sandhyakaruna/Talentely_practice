#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isStrongPassword(char *password) {
    int hasUpper = 0, hasLower = 0, hasDigit = 0, hasSpecial = 0;
    int length = strlen(password);

    if (length < 10) {
        return 0; 
    }

    for (int i = 0; i < length; i++) {
        if (isupper(password[i])) {
            hasUpper = 1;
        } else if (islower(password[i])) {
            hasLower = 1;
        } else if (isdigit(password[i])) {
            hasDigit = 1;
        } else {
            hasSpecial = 1;
        }
    }

    return hasUpper && hasLower && hasDigit && hasSpecial;
}

int main() {
    char password[100001];
    printf("Enter password: ");
    scanf("%100000s", password);

    if (isStrongPassword(password)) {
        printf("Strong password\n");
    } else {
        printf("Weak password\n");
    }

    return 0;
}
