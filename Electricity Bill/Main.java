#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  if(a<=200)
    cout<<"Rs."<<floor(a*0.5);
  else if(a>200 && a<=400)
    cout<<"Rs."<<floor(a*0.65+100);
  else if(a>400 && a<=600)
    cout<<"Rs."<<floor(a*0.8+200);
  else
    cout<<"Rs."<<floor(a*1.25+425);
  return 0;
}