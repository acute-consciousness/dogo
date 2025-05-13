class Book{
    String title,author;
    int ISBN;
    Book(String title,String author,int ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    Book(Book objectDExample){
    	/*Further equip this class with another
    	 *constructor that takes as its argument a Book object
    	 *don't really know what is required here*/
    }
    public String toString(){
    	return title +","+","+ author+","+"(ISBN:"+ISBN+")";
    }
}
class a_exercise{
	static boolean sequencialSearch(Book array[],int query) {
		boolean result=false;
		for(int i=0;i<array.length-1;i++) {
			if(query==array[i].ISBN) {
				result= true;
				System.out.println(array[i].title+" by "+array[i].author);
			}
		}
		return result;
	}
	static Book []BookByAuthor(Book array[],String str) {
		//that given a string storing an author name,collects all books written by the author
		int aB =0;
		Book []authorBooks;
		authorBooks =new Book[4];
		for(int i=0;i<array.length;++i) {
			if(array[i].author.contains(str)) {
				//we want store to the authorBook variable up there
				//collects all books written by the author			
				System.out.println(authorBooks[aB]= new Book(array[i].title,array[i].author,array[i].ISBN));
				aB++;
			}
		}
		return authorBooks;
	}
	public static void main(String args[]){
        //provide a list of the models
    	int query=0;
    	String str="Piper";
        Book array[];
        array =new Book[9];
        array[0]=new Book("Crime and punishment", "Fyodor Dostoevsky", 8873874);
        array[1]=new Book("Notes from the underground","Fyodor Dostoevsky", 77826);
        array[2]=new Book("I dream of dog's", "Samantha Mackulin", 428278);
        array[3]=new Book("The brothers karamazov", "Fyodor Dostoevsky", 72792);
        array[4]=new Book("Desiring God", "John Piper", 1833288728);
        array[5]=new Book("When i don't desire God", "John Piper", 1232982);
        array[6]=new Book("Spectacular Sins", "John Piper ", 12387346);
        array[7]=new Book("The Idiot","Fyodor Dostoevsky",364638);
        array[8]=new Book("Toast in the machine", "Samantha Mackulin", 3646745);
        System.out.println(sequencialSearch(array,query));
        BookByAuthor(array,str);
    }
}
/*QUESTIONConsider a collection of books in a library with each book modeled by its
(1) title, (2) author(s) and (3) ISBN unique number. Provide a class Book
with an appropriate constructor. Further equip this class with another
constructor that takes as its argument a Book object. Consider an array
of books Book [] array. Give a search function SequentialSearch
that given a query book element searches inside the array whether
the book is present or not by checking ISBN numbers. What is the
time complexity of this method? Design a function static Book []
BookByAuthor(String str) that given a string storing an author name,
collects all books written by the author.*/