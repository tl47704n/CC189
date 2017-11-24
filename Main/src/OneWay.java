
public class OneWay {
	OneWay(){}
	
	boolean editIsLegal(String first, String second) {
		if(first.length()==second.length()) {
			return replaceIsLegal(first, second);
		}
		else if(first.length()+1==second.length()) {
			return insertIsLegal(first, second);
		}
		else if(first.length()-1==second.length()) {
			return insertIsLegal(second, first);
		}
		return false;
	}
	
	boolean replaceIsLegal(String first,String second) {
		int i=0;
		boolean replaceDone=false;
		while (i<first.length()) {
			if(first.charAt(i)!=second.charAt(i)) {
				if(replaceDone==true) {
					return false;
				}
				replaceDone=true;
			}
			i++;
		}
		return true;
	}
	boolean insertIsLegal(String first, String second) {
		int index1=0;
		int index2=0;
		boolean insertDone=false;
		while (index1<first.length()&&index2<second.length()) {
			if(first.charAt(index1)!=second.charAt(index2)) {
				if(insertDone==true) {
					return false;
				}
				index2++;
				insertDone=true;
			}
			else {
				index1++;
				index2++;
			}
			
		}
		return true;
	}
}
