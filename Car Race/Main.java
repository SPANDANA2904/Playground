#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  if(a%d==0)
    cout<<"Car 1 goes into road A";
  else if(b%d==0)
    cout<<"Car 1 goes into road B";
  else if(c%d==0)
    cout<<"Car 1 goes into road C";
  else
    cout<<"No path exist";
  return 0;
}