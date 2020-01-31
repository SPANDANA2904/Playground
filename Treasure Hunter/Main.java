#include<iostream>
using namespace std;
int main()
{
 int coins,ben,bb,beno,bbo,pir;
  cin>>coins;
  cin>>ben;
  cin>>bb;
  beno=ben*coins/100;
  bbo=bb*(coins-beno)/100;
  pir=(coins-beno-bbo)/3;
  cout<<beno<<"\n";
  cout<<bbo<<"\n";
  cout<<pir<<"\n";
  
}