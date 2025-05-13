public class b_exercise {
	//that we would like to speed up the former(a_exer)
	//by first sorting by the easy way on the array of Book element(Book [] i think) using ISBN
	//then provide a fast dichotomic search for checking where a book is in the collection or not
	//lets try and get access to Book[] from a_exercise
	static void selectionSort(Book array[]) {
		//selection sort using ISBN
		//checked out how we did this you find the smallest element (that the selection stage) then continue that - i think
		int j=array[0];
		for(int i=0;i<array.length-1;++i) {
		}
	}
	public static void main(String[] args) {
		selectionSort(a_exercise.array);

	}

}
/*We would like to speed up the former search function for librarians
that manipulates large collections of books. Implement the selection sort
algorithm on arrays of Book elements using the order of ISBN numbers
(International Standard Book Numbers). What is the time complexity
of this sorting algorithm? Consider the books stored in a sorted array
according to their ISBNs. Provide a fast recursive dichotomic search
method for checking whether a book is inside the collection or not. What
is the time complexity of this search?*/
