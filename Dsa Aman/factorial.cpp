#include <iostream>
using namespace std;

int main(){
    cout<<"*********Factorial of specific number*********\n";
    int n1,n2;
    cout<<"Enter first number :- ";
    cin>>n1;
    cout<<"Enter second number :- ";
    cin>>n2;

    int fact1 = 1;
    for(int i=2; i<=n1; i++){
        fact1 = fact1*i;
    }

    int fact2 = 1;
    for(int i=2;i<=n2;i++){
        fact2 = fact2*i;
    }

    cout<<"Factorial of "<<n1<<" is "<<fact1<<endl;
    cout<<"Factorial of "<<n2<<" is "<<fact2;

    cout<<"\n\n*********Factorials of n numbers*********\n";
    int fact = 1;
    int n;
    cout<<"\nEnter limit : \n";
    cin>>n;

    for(int i=1;i<=n;i++){
        fact = fact*i;
        cout<<"Factorial of number "<<i<< " is "<<fact<<"\n";
    }

    return 0;
}



