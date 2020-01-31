#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,x,y,d,e;
  cin>>x;
  cin>>y;
  (a>x)?d=a-x:d=x-a;
  (b>y)?e=b-y:e=y-b;
  (d>e)?cout<<d:cout<<e;
  return 0;
}