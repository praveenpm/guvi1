#include<stdio.h>
void main()
{
int n,rem,count=0;
scanf("%d"&n);
while(n>0)
{
n=n/10;
count=count+1;
}
printf("number of digit in a given number");
return 0;
}