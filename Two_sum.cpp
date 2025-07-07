#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> v = {1,2,8,9,10};
    int i,j;
    int target=10;

    for(int i=0;i<v.size();i++){
        for(int j=i+1;j<v.size();j++){
            if(v[i]+v[j]==target){
                cout<<"("<<i<<","<<j<<")";
            }
        }
    }

}