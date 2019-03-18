import java.util.*;
import java.lang.*;
public class Even
{
if(n%2!=0)
return 0;
int res =1;
for(int i=2;i<=Mat.sqrt(n);i++)
{
int count = 0;currentsum=1;
int currentterm=1;
while(n%i== 0)
{
count++;
n=n/i;
if(i==2&&count==1)
currentsum=0;
currentsum+=currentterm;
}
res*=currentsum;
}
if(n>=2)
res*=(1+n);
return res;
}
public static void main(String args[])
{
int n=18;
System.out.println(factorrs(n));
}


