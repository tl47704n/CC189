
public class ReplaceSpace {
	public ReplaceSpace() {
		// TODO Auto-generated constructor stub
	}
	
	void replaceSpace(char[] str, int truelength) {
		int spacecount=0,index,i;
		for(i=0;i<truelength;i++) {
			if(str[i]==' ') {
				spacecount++;
			}
		}
		
		index = spacecount*2 + truelength;
		if(truelength<str.length) {str[truelength]='\0';}
		for(i=truelength-1;i>=0;i--) {
			if(str[i]==' ') {
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index=index-3;
			}
			else {
				str[index-1] = str[i];
				index--;
			}
		}
	}
}
