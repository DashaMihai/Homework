
public class Task6 {

	public static void main(String[] args) {
		String str = "Hello world Hello people !";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			int count=0;

			    for(int j=0;j<words.length;j++){
			        if(words[i].equals(words[j])){
			        count++;                
			        }
			    }
			    System.out.println(words[i]+": "+count);
			  
			}

			

	}

}
