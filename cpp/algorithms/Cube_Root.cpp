#include <iostream>

using namespace std;

int main()
{
	float x, k=0, p=1;
	scanf("%f", &x);
	while(k*k*k != x)
	{
		if(k*k*k>x)
		{#include <iostream>

using namespace std;

int main()
{
	float x, k=0, p=1;
	scanf("%f", &x);
	while(k*k*k != x && p>=0.000001)
	{
		if(k*k*k > x)
		{
			k=k-p;
			p = p/10.0;
			k=k+p;
		}
		else
		k=k+p;
	}
	printf("Cube root of %f is %f\n", x, k);
	return 0;
}
			k=k-p;
			p=p/10;
		}
		else
		k=k+p;
		if(p==0.0000001)
			break;
	}
	printf("Cube root of %f is %f\n", x, k);
	return 0;
}
