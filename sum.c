#include<stdio.h>
void main()
{
int number,i,sum=0;
scanf("%d",&number);
for(i=1; i<=number; i++)
{
sum=sum+i;
}
printf("sum of number=%d",sum);
return 0;
} 