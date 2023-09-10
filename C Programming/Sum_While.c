// Program to sum two numbers of first ten natural numbers using while loop

#include<stdio.h>
int main(){
    int i=1;
int sum=0;
int n= 10;
printf("Sum of first 10 natural numbers using while loop");
// for (int i = 1; i <= n ; i++)
// {
//    sum+=i;
// }

while( i <= n )
{
   sum+=i;
   i++;
}

printf("The value of sum(1 to 10) is %d" , sum);

return 0;
}