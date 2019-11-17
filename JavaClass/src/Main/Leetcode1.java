//Qinyao Zhang 11.17.19
package Main;

public class Leetcode1 {

	int value(char a){
        if(a == 'I'){
            return 1;
        }
        if(a == 'V'){
            return 5;
        }
        if(a == 'X'){
            return 10;
        }
        if(a == 'L'){
            return 50;
        }
        if(a == 'C'){
            return 100;
        }
        if(a == 'D'){
            return 500;
        }
        if(a == 'M'){
            return 1000;
        }
        return 0;
    }
    
    public int romanToInt(String s) {
        
        int ans = 0;
        
        for(int i=0;i<s.length();i++){
            
            int n1 = value(s.charAt(i));
            
            if(i+1<s.length()){
                int n2 = value(s.charAt(i+1));
                
                if(n1>=n2){
                    ans += n1;
                    System.out.println(i);
                    System.out.println(ans);
                }else{
                    ans = n2 - n1 + ans;
                    i++; //due to we add n2, jump 1 more further
                    System.out.println(i);
                    System.out.println(ans);
                }
            }else{
                ans += n1;
                System.out.println(i);
                System.out.println(ans);
            }
        }
        
        return ans;
    }
    
    public static void main(String args[]) 
    { 
	Leetcode1 test = new Leetcode1();
	String x = "MCMXCIV";
	System.out.println(test.romanToInt(x));
    }
}
