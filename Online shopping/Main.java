#include<iostream>
using namespace std;
int main()
{
  int a1,b1,c1,a2,b2,c2,a3,b3,c3,a,b,c;
  cin>>a1>>b1>>c1>>a2>>b2>>c2>>a3>>b3>>c3;
  a=a1-(b1*a1/100)+c1;
  b=a2-(b2*a2/100)+c2;
  c=a3-(b3*a3/100)+c3;
  cout<<"In Flipkart Rs."<<a<<endl;
  cout<<"In Snapdeal Rs."<<b<<endl;
  cout<<"In Amazon Rs."<<c<<endl;
  ((a<=b) && (a<=c))?cout<<"He will prefer Flipkart":((b<=c)?cout<<"He will prefer Snapdeal":cout<<"He will prefer Amazon");
}