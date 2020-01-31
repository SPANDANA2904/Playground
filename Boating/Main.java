#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  (a-(b*75)-(c*30))>=0?cout<<"Boat is stable":cout<<"Boat will drow";
  return 0;
}