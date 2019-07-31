#include<stdio.h>
int main()
{
int a,b,h,i,l;
  scanf("%d%d",&a,&b);
  h=(a>b)?b:a;
  for(i=h;i>=1;i--)
  {
    if(a%i==0&&b%i==0)
    {
      h=i;
      break;
    }
  }
    l=(a*b)/h;
    printf("%d",l);
  return 0;
}