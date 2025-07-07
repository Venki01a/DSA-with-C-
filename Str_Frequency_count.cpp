#include<iostream>
#include<unordered_map> // Special Feature: Using unordered_map to count character frequency
using namespace std;

int main(){
    string str="Hello";
    unordered_map<char, int> frequency;
    for(char ch : str){  // For each loop
        frequency[ch]++;
    }

    for(auto pair : frequency){
        cout << pair.first << ": " << pair.second << endl;
               // Key                 //value
    }


}