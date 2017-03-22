#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    cout << "this is a test" << endl;
    ofstream myfile;
    myfile.open("example.docx");
    myfile << "Writing this to a file. \n";
    myfile << "Now writing this to a file.\n";
    myfile.close();

    return 0;
}
