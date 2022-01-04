/*
Calculate balance due based on how many software packages sold. Each package costs 99.00 without discounts.

Data we need: How many software units were sold
What we are trying to produce: actual purchase price per unit and total price
What is our processing: 	if units is 10-19 → pricePer = PRICE*0.8
				if units is 20-49 → pricePer = PRICE*0.7
				if units is 50-99 → pricePer = PRICE*0.6
				if units is 100+ → pricePer = PRICE*0.5
				balDue = pricePer * sold
Special concerns: formatting price correctly and constant for price. Format output end at column 60 - use $ when needed and money in field 10 chars wide. Allow only positive responses - 0 and negative are bad data
Variables: sold, pricePer, balDue, PRICE
*/

#include<iostream>
#include<iomanip>
using namespace std;

int main()
{

	int sold;
	float pricePer, balDue;
	const float PRICE = 99.00f;
	
	cout << "How many units sold: ";
	cin >> sold;
	
	
	if (sold <= 0)
		cout << "Invalid data, run program again.";
	else
	{
		if (sold < 10)
			pricePer = PRICE;
		else if (sold < 20)
			pricePer = PRICE * 0.8;
		else if (sold < 50)
			pricePer = PRICE * 0.7;
		else if (sold < 100)
			pricePer = PRICE * 0.6;
		else
			pricePer = PRICE * 0.5;
			
		balDue = pricePer * sold;
		
		cout << fixed << showpoint << setprecision(2);
		
		cout << "\nUnits sold:" << setw(49) << sold << endl;
		cout << "Actual Purchase Price/Unit:" << setw(23) << '$' << setw(10) << pricePer << endl;
		cout << "Balance Due:" << setw(38) << '$' << setw(10) << balDue << endl;	
	}
	
	return 0;	

}
