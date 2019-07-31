#include<stdio.h>
int main()
{
  float r,c,l;
  scanf("%f%f",&r,&c);
  l=2*3.14*r*(c/360);
  printf("%.2f",l);
  return 0;
}