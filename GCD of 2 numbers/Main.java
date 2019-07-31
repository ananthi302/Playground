// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<math.h>
int main()
{
 int a,b,i,c;
  scanf("%d%d",&a,&b);
  c=a>b?a:b;
  for(i=c;i>=1;i--)
  {
    if(a%i==0&&b%i==0)
    {
      printf("%d",i);
  break;
    }
  }
  return 0;
}
   