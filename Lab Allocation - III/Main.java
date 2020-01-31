#include<iostream>
using namespace std;
int main()
{
  int x,y,z,a,count=0;
  cin>>x>>y>>z>>a;
  if(x>=a)
    count+=1;
  if(y>=a)
    count+=1;
  if(z>=a)
    count+=1;
  cout<<count;
}