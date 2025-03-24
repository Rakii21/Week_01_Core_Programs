public class Review3 {
    public static void main(String[] args) {
        String s="I$$am$$aman";
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='$'){
                if(i>0 && s.charAt(i-1)=='$'){
                    result+=" ";
                }
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
