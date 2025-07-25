class cities{
	String name;
	cities referenceNext;
	cities(String nme,cities nxt){
		this.name=nme;
		this.referenceNext=nxt;
	}
	static cities insert(String name,cities referenceNext) {
		return new cities(name,referenceNext);
	}
	public String toString() {
		return name;
		
	}
	static int lllength(cities africanCpts) {
		cities holdElmnts=africanCpts;
		String toTrnvse="";
		int length=0;
		int result=0;
		while(holdElmnts!=null) {	
			toTrnvse+=holdElmnts.name;
			if(holdElmnts.referenceNext!=null) {		
				result=length++;
			}			
			holdElmnts=holdElmnts.referenceNext;
		}
		return result;
	}
	static String listElements(cities africanCpt) {
		String result="";
		cities current = africanCpt;
		while(current!=null){	
			result+=current.name;
			   if (current.referenceNext != null) {
	                result += " --> ";
	            }
			   current = current.referenceNext;
		}
		return result;
		}
	static  cities removeElmnt(String remove,cities africanCpts) {//we returning the object
		//case:if there is no such element 
		//another thing i'll probably,should ask is if we should be using the 'holistic' object
		if(africanCpts==null)
			return null;
		//what is the other case, if it's the head, for me have a way to remove the thing completely, but here hapa they just return the adjacent element
		//was about to ask, i don't know if this case means its the only element??
		if(africanCpts.name.equals(remove))
			return africanCpts.referenceNext;//yeah, that what they've said we are to return. i think this is the case when its alone without needing of surgery. i think??
		//yeah, what is the other case???. he represents a head and the tail with variables then goes into a loop or something<-no this isn't helping
		cities w=africanCpts;//oaky, this has some questions to answer later
		cities v=africanCpts.referenceNext;//so yeah this is/are the references->i agree_/ does it mean the one up there is the head/represents the head???
		//okay
		while(w!=null&&!(w.name.equals(remove))) {//we need some conceptulization of this
		v=w;
		w=v.referenceNext;
		if(w!=null)
			v.referenceNext=w.referenceNext;
			
	}
		return africanCpts;

	}
}
public class trialonUnderstanding {
	public static void main(String args[]) {
	cities africanCpts=null;
	africanCpts=cities.insert("Nairobi",africanCpts);
	africanCpts=cities.insert("Kampala",africanCpts);
	africanCpts=cities.insert("CapeTown",africanCpts);
	africanCpts=cities.insert("Accra",africanCpts);
	africanCpts=cities.insert("Kigali",africanCpts);
	africanCpts=cities.insert("Cairo",africanCpts);
	africanCpts=cities.insert("Algeirs",africanCpts);
	africanCpts=cities.insert("Dakar",africanCpts);
	africanCpts=cities.insert("Mogadishu",africanCpts);
	africanCpts=cities.insert("Juba",africanCpts);
	africanCpts=cities.insert("Dodoma",africanCpts);
	System.out.println(cities.listElements(africanCpts)+"\n"+"length:"+cities.lllength(africanCpts));
}
}
//mehn! whatever for now
/*I'm not creating another file, let's do it all here and just finish the topic
 * */
