package inttoeng;

import java.util.Scanner;

public class IntToEng1 {
	// メインメソッド
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	if((n >2147483646)||(n<0))return("out of range!!");
    	else if (n/1000000000 > 0) return tenth(n);//1000000~2147483646
    	else if (n/1000000 > 0) return seventh(n);//10000~999999
    	else if(n/1000 > 0)return forth(n);//1000~9999
    	else if(n/100 > 0)return third(n);//100~999
    	else if (n/10 > 0)return second(n); 		
    	else return first(n);
    }
    static String first(int n) {
    	String[] num = {"zero","one","two","three","four",
    			"five","six","seven","eight","nine"};
    	return num[n];   
    }
    static String second(int n) {
    	String[] num2={"ten","eleven","twelve","thirteen","fourteen","fifteen",
    			"sixteen","seventeen","eighteen","nineteen"};
    	String[] num3 = {"","","twenty","thirty","forty","fifty",
    			"sixty","seventy","eighty","ninety"};
    	if (n/10 == 1) {//10~19
    		return num2[n%10];
    	} else if (n/10 > 1) {//20~90
    		if (n%10 == 0) return num3[n/10];
    		else return num3[n/10] +" " +first(n%10);
    	} else {return first(n%10);
    	}
    }
    static String third(int n) {//100~999
    	if((n/100)==0)return second(n%100);
    	else if((n%100)==0)return first(n/100)+" hundred";
		else return first(n/100)+" hundred and "+second(n%100);		
    }
    static String forth(int n) {//1000~9999
    	if((n/1000)==0)return third(n%1000);
    	else if((n%1000)==0)return third(n/1000)+" thousand";
		else return third(n/1000)+" thousand "+third(n%1000);		
    }
    static String seventh(int n) {//10000~999999
    	if((n%1000000)==0)return third(n/1000000)+" million";
		else return third(n/1000000)+" million "+forth(n%1000000);		
    }
    static String tenth(int n) {//1000000~2147483646
    	if((n%1000000000)==0)return seventh(n/1000000000)+" billion";
		else return third(n/1000000000)+" billion "+seventh(n%1000000000);
    }
}