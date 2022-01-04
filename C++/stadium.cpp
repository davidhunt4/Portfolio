/*
	We want our program to calculate the revenue for three types of seats based on how many seats sold were input into the program as well as the total revenue.

Data we need: How many A Seats were sold, how many B Seats were sold, how many C seats were sold
What we are trying to produce: A revenue, B revenue, C revenue, Total Revenue
What is our processing: aRev = aSold*15
			       bRev = bSold*12
			       cRev = cSold*9
			       totalRev = aRev+bRev+cRev
Special concerns: Format output according to table, use setw() and iomanip, use constant for prices (ex. const float APRICE = 15.00f;)
Variables: aSold, bSold, cSold, aRev, bRev, cRev, tRev, APRICE, BPRICE, CPRICE
*/
#include<iostream>
#include<iomanip>
using namespace std;

int main()
{

	int aSold, bSold, cSold;
	float aRev, bRev, cRev, tRev;
	const float APRICE = 15.00f, BPRICE = 12.00f, CPRICE = 9.00f;
	
	cout << "How many A seats sold? ";
	cin >> aSold;
	cout << "How many B seats sold? ";
	cin >> bSold;
	cout << "How many C seats sold? ";
	cin >> cSold;
	
	aRev = aSold*APRICE;
	bRev = bSold*BPRICE;
	cRev = cSold*CPRICE;
	tRev = aRev+bRev+cRev;
	
	cout << fixed << showpoint << setprecision(2);
	
	cout << "\nA Revenue:" << setw(40) << '$' << setw(10) << aRev << endl;
	cout << "B Revenue:" << setw(40) << '$' << setw(10) << bRev << endl;
	cout << "C Revenue:" << setw(40) << '$' << setw(10) << cRev << endl;
	cout << "\nTotal Revenue:" << setw(36) << '$' << setw(10) << tRev << endl;
	
	return 0;

}
