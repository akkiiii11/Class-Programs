package com.lab_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
	
	public static void main(String[] args) throws IOException {
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
			
			String data = null;
			
			while((data = br.readLine()) != null);
			{			
				System.out.println(data);
			}
			
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File is Not Found.");
		}
		
	}

}
