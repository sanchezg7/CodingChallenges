/*fibbonacci.cpp
  this will calculate the fibonacci number of integer n
  Author: Gerardo Sanchez
  Date: 11/23/2014
  Freelance project
*/
#include <iostream>

using namespace std;
int fib(int);

int main (){

    int actFib = -1;

    do
    {
        cout << "Calculate fibonacci for integer n: (-1 to terminate) ";
        cin >> actFib;

        cout << "fibonacci of " << actFib <<": " << fib(actFib) << endl;
    }while(actFib >= 0);

    return 0;
}

int fib (int n)
{
    if(n==0 || n==1)
    {
        return n;
    }
    else {
        return fib(n-1) + fib(n-2);
    }

}
