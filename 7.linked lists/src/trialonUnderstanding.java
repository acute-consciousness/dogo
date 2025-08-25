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
		return name + referenceNext;
		
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
	static  cities removeElmnt(String delete,cities africanCpts) {	
		/*the query of the String or item to be removed
		 * 
		 * */
		if(africanCpts==null) {
			return null;
		}
		if(africanCpts.name.equals(delete)) {
			return africanCpts.referenceNext;
		}
		while(africanCpts!=null) {
			cities citiesHold=africanCpts;
			cities nextHold=africanCpts.referenceNext;
			if(africanCpts.name.equals(delete )) {
				citiesHold=nextHold;
				nextHold=citiesHold.referenceNext;				
			}
			if(nextHold!=null) {
				citiesHold.referenceNext=nextHold.referenceNext;
			}
			//a way to transerve first at the bottom, we are deleting and deleting seems like cahnging things then the garbage thing will do its thing
			africanCpts=africanCpts.referenceNext;		
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
	System.out.println(cities.listElements(africanCpts));
	String delete="Kigali"; //and the thing should work if it first, if there is a null extra
	cities.removeElmnt(delete,africanCpts);//we want to find a an object and remove it
	System.out.println("Now");
	System.out.println(cities.listElements(africanCpts));
	
}
}
//mehn! whatever for now
/*I'm not creating another file, let's do it all here and just finish the topic
 * */
