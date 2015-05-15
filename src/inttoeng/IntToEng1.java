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
    	String[] num = {"zero","one","two","three","four",
    			"five","six","seven","eight","nine","ten"};
    	
    	String[] num2={"eleven","twelve","thirteen","fourteen","fifteen",
    			"sixteen","seventeen","eighteen","nineteen"};

    	String[] num3 = {"twenty","thirty","fourty","fifty",
    			"sixty","seventy","eighty","ninety"};
    	
    	if(n <= 10) return num[n];
    	if(10 < n || n<20) return num2[n-11];
    	return "";
    }
    /*public static String ite(int n){
    	int a = Integer.valueOf(num3[n]).intValue();
    	int b = Integer.valueOf(num[n]);
    	
    	}
    */
}