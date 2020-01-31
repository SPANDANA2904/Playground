#include<iostream>
using namespace std;
int main()
{
  float a,b;
  cin>>a>>b;
  b=b*12;
  if(a>b)
    cout<<"Loss : Rs."<<a-b;
  else if(b>a)
    cout<<"Profit : Rs."<<b-a;
  else
    cout<<"No profit nor loss";
}