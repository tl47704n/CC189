
public class StringCompressdion {
	 public StringCompressdion() {
		// TODO Auto-generated constructor stub
	}
	 String compression(String str) {
		 StringBuilder res = new StringBuilder();
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 count++;
			 if(i+1==str.length()||str.charAt(i)!=str.charAt(i+1)) {
				 res.append(str.charAt(i));
				 res.append(count);
				 count=0;
			 }
			 
		 }
		 return res.length()<str.length()? res.toString() :str;
	 }
	 
}
