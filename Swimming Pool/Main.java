#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  (pow((a*10),3)-b)>=0?cout<<"Can store":cout<<"Cannot store";
}