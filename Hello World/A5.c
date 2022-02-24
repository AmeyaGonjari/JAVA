#include<stdio.h>

int Divide(int iNo1,int iNo2)
{
	int iAns = iNo1/iNo2;

	return iAns;
}
int main()
{
	int iValue1 = 10;
	int iValue2 = 2;
	int iret = 0;

	 iret = Divide(iValue1,iValue2);
	 printf("%d",iret);
	return 0;
}