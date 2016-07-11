
public class StringOperations {
	public String ReverseStr(String str){
		String str1="";
		char tempArr[] = str.toCharArray();
		int i, j;
		j = str.length()-1;
		
		for (i=0; i<str.length();i++, j--){
			tempArr[i] = str.charAt(j);
		}
	    for (i=0; i<=str.length()-1; i++)
	     str1 = str1 + tempArr[i];
		return str1;
	}
	
	public String ReverseStrSB(String str){
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();
		return str1.toString();
	}
	
}
