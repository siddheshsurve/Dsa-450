#include<iostream>
using namespace std;
int main(){

    int n;
    cout<<"Enter size of array";
    cin>>n;

    int arr[n];
    cout<<"\nEnter elements of array :- \n";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    cout<<"\n Your array :-\n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<"/t";
    }

    int x;
    cout<<"Enter element you want to search for :- ";
    cin>>x;

    int bSearch(arr[n], n, x);



    int bSearch(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        cout<<"Your element's position is "; 

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid]>x)
                high = mid-1;
            else
                low = mid+1;

        }
        return -1;
    }
    return 0;

}

