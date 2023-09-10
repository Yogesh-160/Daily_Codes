// Program to find factorial of any number using C language
#include <stdio.h>
int main()
{
    int i, fact = 1;
    int n;
    printf("Enter the number : \n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        fact *= i;
    }
    printf("The factorial of the number %d is %d", n, fact);
    return 0;
}