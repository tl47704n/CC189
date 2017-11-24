
public class PermutationOfPalindrome {
		public PermutationOfPalindrome() {
			// TODO Auto-generated constructor stub
		}
		boolean checkPOP(String str){
			int[] res=new int[26];
			int count=0;
			for(char c:str.toCharArray()) {
				int x=getCharNumber(c);
				res[x]++;
				if(res[x]%2==1) {
					count++;
				}
				else count--;
			}
			return count<=1;
			
		}
		
		int getCharNumber(char c) {
			int a=Character.getNumericValue('a');
			int value=Character.getNumericValue(c);
			return value-a;
		}
		 
}
