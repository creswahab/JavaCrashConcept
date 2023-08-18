package com.awp.exceptionHandiling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FinallyTryCatchBlock {
	
		static FileReader fr;
		static BufferedReader br;

	public static void main(String[] args) {
		
		try {
			fr = new FileReader("Readme.txt");
			br = new BufferedReader(fr);
			
			String fileContent;
			
			while ((fileContent= br.readLine())!=null) {
				System.out.println(fileContent);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!= null)
					fr.close();
				if(br!=null)
					br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		

	}

}
