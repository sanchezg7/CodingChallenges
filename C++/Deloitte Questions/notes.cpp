//*********************************
strtok with char example

char fname[32], lname[32], city[32], zip[32], zip[32], country [32]

strcpy(fname, strtok(str, "|"));
//notice subsequent calls are NULL meaning 
//tokenize the SAME string further
strcpy(lname, strtok(NULL, "|")); 
strcpy(city, strtok(NULL, "|"));
strcpy(zip, strtok(NULL, "|"));
strcpy(country, strtok(NULL, "|"));
//***********************************
GET LENGTH OF CHARACTER ARRAY

char input[80];
cout << strlen(input) << endl; //outputs 80

//*************************************
// Binary Monkey Solution
//***********************************
#include <iostream>
#include <iomanip>
#include <fstream>
#include <cstdlib>

using namespace std;

struct binary{
	int age;
	binary* younger;
	binary* older;
};

int leftCount(binary tree, int count)
{
	if(tree.younger == NULL)
		return count;
	else
	{
		count++;
		return leftCount(*tree.younger, count);
	}
}

void addTree(binary &tree, int age){

	binary* nMonk = new binary;
	nMonk->age = age;
	nMonk->younger = NULL;
	nMonk->older = NULL;

	if(nMonk->age < tree.age){
		if(tree.younger == NULL){
			tree.younger = nMonk;
		}
		else
			addTree(*tree.younger, age);
	}
	else if(nMonk->age >= tree.age){
		if(tree.older == NULL)
			tree.older = nMonk;
		else
			addTree(*tree.older, age);
	}
}

int main()
{
	int count = 0;
	int monkey;
	cin >> monkey;

	binary tree;
	tree.age = monkey;
	tree.younger = NULL;
	tree.older = NULL;

	while((cin >> monkey) != false)
	{
		addTree(tree, monkey);
	}
	cout << leftCount(tree, count);
	return 0;
}



