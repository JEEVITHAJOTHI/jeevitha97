#include<stdio.h>
#include<conio.h>
int main()
{
int a;
printf("enter the year:");
scanf("%d",&a);
if(a%4==0)
    printf("\nthe year is leap year");
else
    printf("\nthe year is not leap year");
return 0;
}
