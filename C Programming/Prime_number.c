// Program to check whether the number is prime number or not
#include <stdio.h>
int main()
{
    int n = 4;
    int prime = 1;
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0 )
        {
            prime = 0;
            break;
        }
    }
    if (prime == 0 && n!=2)
    {
        printf("This is not a prime number");
    }

    else
    {
        printf("This is a prime number");
    }
    return 0;
}