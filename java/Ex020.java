package ex.algorithm;

import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {

        int n = 100;

        for (int i = 1; i < n + 1; i++){
		        String tmp = Integer.toString(i);
            if (tmp.matches(".*[369].*")){
                System.out.println(tmp.replaceAll("[0-9&&[^369]]", "").replaceAll("[369]", "짝"));
            } else{
                System.out.println(i);
            }
        }
	}
}