package com.test.Utilitites;

import java.io.*;

public class FileUtils {
	public void createFile(String fileName)
	{
		File file=new File(fileName);
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

	public String readFile(String fileName)
	{
		File file=new File(fileName);
		String value=null;
		String fileValue=null;
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			while((fileValue=br.readLine())!=null)
			{
				value=fileValue;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
		
	}
	public void writeToFile(String fileName,String message)
	{
		File file=new File(fileName);
		
		try
		{
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		pw.print(message);
		pw.flush();
		pw.close();
		bw.close();
		fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
}
