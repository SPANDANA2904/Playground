#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d;
  cin>>a>>b>>c>>d;
  d=a*b-c;
  if(d>=0)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}