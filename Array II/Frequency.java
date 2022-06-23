class Frequency {

	// Function to print the frequency
	// of each element of the sorted array
	static void printFreq(int arr[], int N)
	{

		// Stores the frequency of an element
		int freq = 1;

		// Traverse the array arr[]
		for (int i = 1; i < N; i++) {
			// If the current element is equal
			// to the previous element
			if (arr[i] == arr[i - 1]) {
				// Increment the freq by 1
				freq++;
			}

			// Otherwise,
			else {
				System.out.println("Frequency of "
								+ arr[i - 1]
								+ " is: " + freq);
				// Update freq
				freq = 1;
			}
		}

		// Print the frequency of the last element
		System.out.println("Frequency of "
						+ arr[N - 1]
						+ " is: " + freq);
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given Input
		int arr[]
			= { 1, 1, 1, 2, 3, 3, 5, 5,
				8, 8, 8, 9, 9, 10 };
		int N = arr.length;

		// Function Call
		printFreq(arr, N);
	}
}

