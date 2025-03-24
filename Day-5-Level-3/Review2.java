public class Review2 {
    public static void main(String[] args) {
        String s="aaabbccd";
        char currentChar=s.charAt(0);
        int count=1;
        String output="";
        for(int i=1;i<s.length();i++){
            if(currentChar==s.charAt(i)){
                count++;
            }
            else{
                if(count>1){
                    output+=(currentChar+Integer.toString(count));
                }
                currentChar=s.charAt(i);
                count=1;
                
            }
        }
        System.out.println(output);
    }
    
}
