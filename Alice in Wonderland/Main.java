#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  cout<<"Alice must go in path-"<<(a%10)+(a/10);
  return 0;
}