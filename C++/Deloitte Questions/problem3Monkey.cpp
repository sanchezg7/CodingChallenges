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


