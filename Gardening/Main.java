#include<iostream>
using namespace std;
int main()
{
  int r,col,c;
  cin>>r>>col>>c;
  if((c>=(r+1) && c<=(2*r)) || (c>=(col*r-2*r+1) && (c<=col*r-r)))
      cout<<"It is a mango tree";
   else
      cout<<"It is not a mango tree";
      
}