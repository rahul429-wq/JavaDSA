#include<bits/stdc++.h>
using namespace std;
int main(){
   int arr[]={5,4,3,2,1};
   int n=5,min_idx;
   for (int i = 0; i < n-1; i++)
   {
      int min=i;
      for (int j = i+1;  j<n; j++)
      {
         if(arr[j]<arr[min]){
            min=arr[j];
         }
      }
      if(min!=i){
         swap(arr[i],arr[min]);
      }
   }
   for (int i = 0; i < n; i++)
   {
      cout<<arr[i]<<" ";
   }cout<<endl;
}
