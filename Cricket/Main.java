#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int ball,runsco,ballbowl;
  float totrun,d,e;
  cin>>ball>>totrun>>runsco>>ballbowl;
  cout<<ball/6<<endl;
  d=ballbowl/6+(ballbowl%6)*0.1;
  cout<<d<<endl;
  cout<<fixed<<setprecision(1)<<runsco/d<<endl;
  e=totrun/(ball/6);
  cout<<e<<endl;
  ((runsco/d)>=e)?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
}