#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  ((n>=1 && n<=r) || (n%r==1) || (n%c==0))?cout<<"Yes":cout<<"No";
}