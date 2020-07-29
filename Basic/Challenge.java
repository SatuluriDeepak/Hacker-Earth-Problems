// Java program to count 
// pairs with Odd AND 
public class Challenge 
{ 
static void findOddPair(int A[], 
					int N) 
{ 
	// Count total odd numbers in 
	int count = 0,odd=0; 
	for (int i = 0; i < N; i++) 
		if ((A[i] % 2 == 1)) 
			count++; 
		else 
			odd++;
	// return count of even pair 
	System.out.println( count * (count - 1) / 2); 
	System.out.println( odd * (odd - 1) / 2); 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	int a[] = { 1, 2, 3 }; 
	int n = a.length; 

	// calling function findOddPair 
	// and print number of odd pair 
	findOddPair(a, n); 

} 
} 

// This code is contributed 
// by Arnab Kundu 
