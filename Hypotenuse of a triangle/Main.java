#include<stdio.h>
#include<math.h>
int main()
{
  float opp,adj,hup;
  scanf("%f%f",&opp,&adj);
  hup=sqrt((adj*adj)+(opp*opp));
  printf("%.2f",hup);
  return 0;
}