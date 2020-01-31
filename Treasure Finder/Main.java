#include<iostream>
using namespace std;
int main()
{
  int a,b,c,hcf,temp;
  cin>>a>>b>>c;
  if(a>=b && a>=c)
    (b>=c)?cout<<"The treasure is in box which has number "<<b<<endl:cout<<"The treasure is in box which has number "<<c<<endl;
  else if(b>=c && b>=a)
    (c>=a)?cout<<"The treasure is in box which has number "<<c<<endl:cout<<"The treasure is in box which has number "<<a<<endl;
  else
    (a>=b)?cout<<"The treasure is in box which has number "<<a<<endl:cout<<"The treasure is in box which has number "<<b<<endl;
  temp=a<b?(a<c?a:c):(b<c?b:c);
  for (hcf=temp;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  cout<<"The code to open the box is "<<hcf;
}