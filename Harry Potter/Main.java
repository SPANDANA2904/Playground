#include<iostream>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int x=((int)s[0]-48);
    int y=((int)s[3]-48);
    cout<<x+y;
  /*
  int a,b,c,d,rev,rem,i=4;
  cin>>a;
  b=a;
  c=a%10;
  for(rev=0;i>=1;a/=10,i--)    
  {    
     rem=a%10;      
     rev=rev*10+rem;    
  }    
  d=rev%10;
  cout<<c+d;
  return 0;
*/}