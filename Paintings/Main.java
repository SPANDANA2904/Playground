#include<iostream>
using namespace std;
int main()
{
  int l,b,l1,b1,l2,b2;
  cin>>l>>b>>l1>>b1>>l2>>b2;
  ((l*b-l1*b1-l2*b2)>=0)?cout<<"Raj can fix both painting":cout<<"Raj cannot fix both painting";
}