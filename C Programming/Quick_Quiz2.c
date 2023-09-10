// Write a program to print first n natural numbers using do-while loop

#include<stdio.h>
int main(){
    int i = 1;
    int n;
     printf("Enter the number");
     scanf("%d",&n);
do{
 
printf("The number is %d\n",i);
  i++;
    
} while (i<=n);

return 0;
}