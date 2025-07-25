public class b_exercise {
	//that we would like to speed up the former(a_exer)
	//by first sorting by the easy way on the array of Book element(Book [] i think) using ISBN
	//then provide a fast dichotomic search for checking where a book is in the collection or not
	//lets try and get access to Book[] from a_exercise
	//static Book hld[]=new Book[1];
	static int minimum_by_isbn(Book[] array) {
		Book the_object=null;	
		int result=0;
		//to update the minimum or something, THE STARTING POINT IS WHAT NEEDS TO BE UPDATED	
		for(int i=0;i<array.length-1;++i) {			
			int to_the_next_step=i+1;
			int smallest=array[to_the_next_step].ISBN;
			if(array[i].ISBN<smallest) {
				smallest=array[i].ISBN;
				result=smallest;
				the_object=array[i];
			}	
			to_the_next_step++;
			
		}	
		just_a_function(array,the_object);
		return result;	
	}	
	static void just_a_function(Book array[], Book the_object) {
		for(int i=0;i<array.length-1;++i) {
			for (int j=i+1;j<array.length;++j){
				minimum_by_isbn(array);
			swap(i,j,the_object,array);
			}
		}
	}
	static void swap(int i,int j,Book the_object,Book [] array) {
		Book hold=array[i];
		array[i]=the_object;
		array[j]=hold;		
	}
		
	public static void main(String[] args) {
		a_exercise.main(null);//mmhi remember what this was, to call the main in the a_exercise file to run
		//a_exercise.main as is the main method, as i forget it actually is a method and having 
		//the null thing makes sense as, asasasassasasass yeah, we just want it to run or something
		System.out.println(minimum_by_isbn(a_exercise.array));	
	}

}
/*We would like to speed up the former search function for librarians
that manipulates large collections of books. Implement the selection sort -> whihc eric remember is or will be the first thing inorder to use this(most) of this search algorithms
algorithm on arrays of Book elements using the order of ISBN numbers
(International Standard Book Numbers). 
What is the time complexity of this sorting algorithm? 
Consider the books stored in a sorted array according to their ISBNs. 
Provide a fast recursive dichotomic search method for checking whether a book is inside the collection or not. 
What
is the time complexity of this search?*/
