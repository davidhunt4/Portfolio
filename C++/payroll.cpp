/*
	Displays a weekly payroll report based on a valid employee number, gross pay, state tax, federal tax, and FICA withholdings. Use a while sent based on eNum. Use do whiles for eNum, gross, fed, fica, state

	Data we need: Employee number, gross pay, state tax, federal tax, FICA withholdings
	What we are trying to produce: net pay
	What is our processing: nPay = gPay - fTax - sTax - ficaTax
	What is the output: eNum, gPay, fTax, ficaTax, sTax, nPay
	Special concerns: while sent based on eNum, validate all entered data (eNum < 0, gross < 0, fTax ficaTax, sTax cannot be < 0 or > gross), collective cannot be > gross, format output, fixed showpoint setprecision 2, iomanip
	Variables: eNum, gPay, sTax, fTax, ficaTax
*/
#include<iostream>
#include<iomanip>
using namespace std;

int main()
{

	short eNum;
	float gPay, sTax, fTax, ficaTax, nPay;
	
	do
	{
		cout << "Enter employee number or 0 to quit: ";
		cin >> eNum;
	}while(eNum < 0);
	
	while (eNum != 0)
	{
		do
		{
			if (nPay < 0)
				cout << "\nInvalid data, try again.";
			
			do
			{
				cout << "\nEnter gross pay: ";
				cin >> gPay;
			}while(gPay < 0);
			
			do
			{
				cout << "Enter federal tax: ";
				cin >> fTax;
			}while(fTax < 0 || fTax > gPay);
			
			do
			{
				cout << "Enter state tax: ";
				cin >> sTax;
			}while(sTax < 0 || sTax > gPay);
			
			do
			{
				cout << "Enter FICA tax: ";
				cin >> ficaTax;
			}while(ficaTax < 0 || ficaTax > gPay);
			
			nPay = 0;
			nPay = gPay - fTax - sTax - ficaTax;
		}while(nPay < 0);
		
		cout << fixed << showpoint << setprecision(2);
		
		cout << "\nEmployee number:" << setw(44) << eNum << endl;
		cout << "Gross pay:" << setw(40) << '$' << setw(10) << gPay << endl;
		cout << "Federal tax:" << setw(38) << '$' << setw(10) << fTax << endl;
		cout << "State tax:" << setw(40) << '$' << setw(10) << sTax << endl;
		cout << "FICA tax:" << setw(41) << '$' << setw(10) << ficaTax << endl;
		cout << "Net pay:" << setw(42) << '$' << setw(10) << nPay << endl;
		
		
		do
		{
			cout << "\nEnter employee number or 0 to quit: ";
			cin >> eNum;
		}while(eNum < 0);
		
	}
		return 0;

}
