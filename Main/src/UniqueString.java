
public class UniqueString {
	UniqueString(String str){
		
		
	}
	public boolean checkUnique(String str) {
		boolean[] char_set = new boolean[128];
		if(str.length()>128)return false;
		for(int i=0;i<str.length();i++) {
			char val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			else char_set[val]=true;
		}
		return true;
	}
	
}
