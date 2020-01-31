#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  float r,h,w,t;
  float v,a;
  cin>>r>>h>>w>>t;
  v=3.14*r*r*h;
  v=v/w;
 a=ceil(v);
  (t>=a)?cout<<"The tank can be filled within "<<t<<" hours":cout<<"The tank cannot be filled within "<<t<<" hours";
  
  
}