#include<iostream>
using namespace std;
int main()
{
  char a;
  int b;
  cin>>a;
  b=a;
   if((b>=65&&b<=90)||(b>=97&&b<=122))
   {
  (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')?cout<<"Vowel":cout<<"Consonant";
   }
  else
  {
    cout<<"Not an alphabet";
  }
  return 0;
}