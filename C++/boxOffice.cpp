/*
	We want our program to calculate the profits of an old time theater - gross profit, net profit, amount paid to distributor.

	Data we need: Movie name, adult tickets sold, child tickets sold
	What we are trying to produce: A revenue, B revenue, C revenue, Total Revenue
	What is our processing: gProfit = (aSold*10) + (cSold*6)
					       aPaid = (gProfit*0.8)
					       nProfit = (gProfit-aPaid)
	Special concerns: Constants, setwidth and iomanip, getline for inputting strings, setprecision
	Variables: movieName, aSold, cSold, gProfit, nProfit, aPaid
*/
#include<iostream>
#include<iomanip>
#include<string>
using namespace std;

int main ()
{

	string movieName;
	float aSold, cSold, gProfit, nProfit, aPaid;
	const float APRICE = 10.00f, CPRICE = 6.00f;
	
	cout << "What is the movie name? ";
	getline(cin, movieName);
	cout << "How many adult tickets were sold? ";
	cin >> aSold;
	cout << "How many child tickets were sold? ";
	cin >> cSold;
	
	gProfit = (aSold*APRICE) + (cSold*CPRICE);
	aPaid = gProfit*0.8;
	nProfit = gProfit - aPaid;
	
	cout << fixed << showpoint << setprecision(2);
	
	cout << "Movie Name:" << setw(49) << movieName << endl;
	cout << "Adult Tickets Sold:" << setw(31) << '$' << setw(10) << aSold << endl;
	cout << "Child Tickets Sold:" << setw(31) << '$' << setw(10) << cSold << endl;
	cout << "Gross Box Office Profit:" << setw(26) << '$' << setw(10) << gProfit << endl;
	cout << "Net Box Office Profit:" << setw(28) << '$' << setw(10) << nProfit << endl;
	cout << "Amount Paid to Distributor:" << setw(23) << '$' << setw(10) << aPaid << endl;
	
	return 0;

}
