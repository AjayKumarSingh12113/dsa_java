package String;
public class SentenceisPangram {
    public static boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        int count = 0;
        for(int i = 0 ; i<sentence.length(); i++){
            int curr = sentence.charAt(i);
            int index = curr-'a';
            // arr[index]++;
            if (arr[index]==0) {
                arr[index]++;
                count++;
            }
        }
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==0){
        //         return false;
        //     }
        // }
        if (count == 26) {
            return true;
        } else {
            return false;
        }

        
        
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
        
    }
    
}
