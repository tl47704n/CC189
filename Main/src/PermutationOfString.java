import java.util.Arrays;

public class PermutationOfString {
		public PermutationOfString() {
			// TODO Auto-generated constructor stub
		}
		boolean isPermutation(String s, String t) {
			if(s.length()!=t.length()) {
				return false;
			}
			
			return sort(s).equals(sort(t));
		}
		String sort(String str) {
			char[] res=str.toCharArray();
			Arrays.sort(res);
			return new String(res);
		}
		boolean isPermutation2(String s, String t) {
			if(s.length()!=t.length())return false;
			int[] res=new int[128];
			for(int i=0;i<s.length();i++) {
				res[s.charAt(i)]++;
			}
			for(int i=0;i<t.length();i++) {
				res[t.charAt(i)]--;
				if(res[t.charAt(i)]<0)return false;
			
			}
			return true;
		}
}
