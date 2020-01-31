#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  ((a<b) && (a<c))?cout<<"L1":((b<c)?cout<<"L2":cout<<"L3");
}