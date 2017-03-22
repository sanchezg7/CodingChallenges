#include <iostream>
#include <string>

void output(char);

int main()
{

	int topHalfIndex = 0;
	int bottomHalfIndex = 9;

	//for vertical
	int leftHalfIndex = 4;
	int rightHalfIndex = 5;

	char grid[][] = 0;

	char coutput = 'A';

	cin >>


	//compute horizontal
	//traverse outer for loop colums
	for(int i = 0; i < 5; ++i){ //column
		for(int j = 0; j < 5; ++j){ //rows faster traverse
			if(grid[topHalIndex][i] == grid[bottomHalfIndex][i]);
			else {
				coutput = 'A';
			}
		}
		if (i == 4){
			coutput = 'H';
			break;
		}
	}

	//compute vertical
	for(int j = 0; j < 5; ++j){ //traverse row

		for(int i =0; i < 5; ++i){
			if(grid[j][leftIndex] == grid [j][rightIndex]);
			else {
				coutput = 'A';
			}
		}
		if(j ==4){
			coutput = 'V';
			break;
		}
}


	return 0;
}

void output(char orientation){

	cout << orientation;
}
