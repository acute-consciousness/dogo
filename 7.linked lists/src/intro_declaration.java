class List{
	int container;
	List next;
	List(int head,List tail){
		this.container=head;//this.field has been reminded
		this.next=tail;
	}
	public boolean isEmpty(List query) {
		return query==null?true:false;
		}
	public int head(List query) {
		return  query.container;
	}
	public List tail(List query) {
		return query.next;
	}
}
public class intro_declaration {

	public static void main(String[] args) {
		
	}

}
/*
 L i s t S t r i n g l=new L i s t S t r i n g ( " Paris " , null ) ;
l=new L i s t S t r i n g ( " Tokyo " , l ) ;
l=new L i s t S t r i n g ( " Berlin " , l ) ;
l=new L i s t S t r i n g ( " Porto " , l ) ;
l=new L i s t S t r i n g ( " Cambridge " , l ) ;
l=new L i s t S t r i n g ( " Roma " , l ) ;
L i s t S t r i n g . Display ( l ) ;
L i s t S t r i n g . D is p la y R ec ( l ) ;
L i s t S t r i n g . DisplayRecRev ( l ) ;
System . out . p r i n t l n ( "" ) ;
 */
