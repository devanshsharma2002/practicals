#include<iostream>
using namespace std;
class bank{
private:
int accno;
int balance;
char bankname[50];
char toa[50];
int amt;
public:
void getdata();
void printdata();
void credit();
void debit();
};
void bank::getdata()
{
cout<<"enter the name of the bank: ";
cin>>bankname;
cout<<"enter the account number: ";
cin>>accno;
cout<<"enter the account type: ";
cin>>toa;
cout<<"enter the balance: ";
cin>>balance;
cout<<"enter the amount: ";
cin>>amt;
}

void bank::printdata(){
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<"bank name :"<<bankname<<endl;
cout<<"account number :"<<accno<<endl;
cout<<"type of account :"<<toa<<endl;
cout<<"balance in the account :"<<balance<<endl;
cout<<"entered amount that has to be credited or debited :"<<amt<<endl;
cout<<""<<endl;
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<""<<endl;


}

void bank::credit(){
int credit;
credit=balance+amt;
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<"total balance after the amount that has been credited :"<<credit<<endl;
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<""<<endl;
cout<<""<<endl;
}

void bank::debit(){
int debit;

if((balance>amt)&&(balance>2000))
{
cout<<"After Withdrawal"<<endl;
cout<<""<<endl;
cout<<""<<endl;
debit=balance-amt;
cout<<"--------------------------------------------------------------------------------------"<<endl;
cout<<"the total balance after the amount that has been debited :"<<debit<<endl;
cout<<"--------------------------------------------------------------------------------------"<<endl;
}
else
{
cout<<"you have limited amount in the account"<<endl;
}
}

int main()
{
bank b1;
b1.getdata();
b1.printdata();
b1.credit();
b1.debit();
}

