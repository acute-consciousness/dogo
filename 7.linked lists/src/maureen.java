public class maureen {
	String human;
	maureen next;
	maureen(String hm, maureen nxt){
		this.human=hm;
		this.next=nxt;
	}
	static maureen insertAtt(String s,maureen nxt) {
		return new maureen(s,nxt);
	}
	public String tostringAgain() {//don't undersand but the 'cramming' is no static keyword(okay) and no arguement(okay) but i do not know if i will remember this
	return human;	
	}
	static int reclistLngth(maureen objIdt) {
		if(objIdt==null) 
			return 0;
		else
			return 1+reclistLngth(objIdt.next);	
	}
	static String display(maureen objIdt) {
		maureen scopeUse=objIdt;
		String result="";
		while(scopeUse.next!=null) {
			result+=scopeUse.human+"-->";
			scopeUse=scopeUse.next;	
		}
		return result;
	}
	static void recDisplay(maureen objIdt) {
		maureen scopeUse=objIdt;
		if(scopeUse==null)
			System.out.println("null");
		else 
			System.out.println(scopeUse.human);
			recDisplay(scopeUse.next);//oh, so no unreachable code error?		
	}
	
}
