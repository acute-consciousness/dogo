
class veges{
	String vegename;
	veges next;
	veges(String vn,veges nxt){
		this.vegename=vn;
		this.next=nxt;
	}
	public static veges linkedlist=null;
	static String llfromarrays(String []vegetables) {
		for(int i=vegetables.length-1;i>=0;i--) {
			linkedlist= new veges(vegetables[i],linkedlist);
		}
		return displayelements(linkedlist);
	}
	static String displayelements(veges linkedlist) {
		String result="";
		if(linkedlist==null) 
			result = "thing is empty" ;
			else {
				while(linkedlist.next!=null) {
					 result+=linkedlist.vegename + ". ";
					linkedlist=linkedlist.next;
				}
			}
		
		return result;
	}
	static String clonebutinverted(veges linkedlist) {
		veges newlycreated=null;
		if(linkedlist==null)
			return null;
		else {
			while(linkedlist!=null) {
				newlycreated=new veges(linkedlist.vegename,newlycreated);
				linkedlist=linkedlist.next;
		}	
		}
		return displayelements(newlycreated);
	}
	static String recclone(veges linkedlist) {
		veges recursivelynewlyCreated=null;		
		if(linkedlist==null)
			return null;
		else {
			while(linkedlist!=null) {
				recursivelynewlyCreated=new veges(linkedlist.vegename,recclone(linkedlist.next));
				linkedlist=linkedlist.next;
		}	
		}
	}
}
public class llfromarraysANDcloningll {
public static void main(String args[]) {
	String vegetables[]= {"kales","spinach","carrots","onions","tomatoes","dania","hoho","cabbage"};
//	All outputs don't have one element
	System.out.println(veges.llfromarrays(vegetables));
	System.out.println(veges.clonebutinverted(veges.linkedlist));
	System.out.println(veges.recclone(veges.linkedlist));
}
}
