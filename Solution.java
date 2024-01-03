import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Solution soln=new Solution();
        System.out.println("Enter the Roman Number: ");
        String s=sc.nextLine();
        System.out.println("The Integer for "+s+" is "+soln.romanToInt(s));
        sc.close();
    }

    public int getval(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int len=s.length();
        int val=0;
        for(int i=0;i<len;i++){
            if(i==len-1){
                val+=getval(s.charAt(i));
            }else{
                if(getval(s.charAt(i))<getval(s.charAt(i+1))){
                    val-=getval(s.charAt(i));
                }else{
                val+=getval(s.charAt(i));
                }
            }
        }
        return val;
    }
}