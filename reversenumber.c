#include<stdio.h>
#include<conio.h>
int main()
{
int n.rev=0;r;
printf("enter an number");
scanf("%d",&n);
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n/=10;
}
printf("rev=%d",rev);
return 0;
}
