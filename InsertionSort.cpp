#include<bits/stdc++.h>
using namespace std;
int main(){

   int a[]={5,4,3,2,1};
   int n=5;
   int j;
   int temp;
   for (int i = 1; i < n; i++)
   {  temp=a[i];
      j=i-1;
      while (j>=0 && a[j]>temp)
      {
         a[j+1]=a[j];
         j--;
      }
      a[j+1]=temp;   
   }

   for (int i = 0; i < n; i++)
   {
      cout<<a[i]<<" ";
   }cout<<endl;

}
