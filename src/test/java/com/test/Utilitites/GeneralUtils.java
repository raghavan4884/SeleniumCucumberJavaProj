package com.test.Utilitites;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class GeneralUtils {
	
	public void getBrokenLink(String link)
	{
		try
		{
			URL url=new URL(link);
			HttpURLConnection hc=(HttpURLConnection) url.openConnection();
			hc.setConnectTimeout(5000);
			hc.connect();
			hc.getResponseCode();
			hc.getResponseMessage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void getBrokenImage(String img)
	{
		try
		{
			HttpClient client=HttpClientBuilder.create().build();
			HttpGet request=new HttpGet(img);
			HttpResponse response=client.execute(request);
			response.getStatusLine().getStatusCode();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getLocalTime()
	{
		String localTime=null;
		try
		{
			DateTimeFormatter dt=DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss");
			LocalDateTime now=LocalDateTime.now();
			localTime=dt.format(now);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return localTime;
	}
	public void addMinutes()
	{
		String s="9:30";
		try
		{
		SimpleDateFormat st=new SimpleDateFormat("HH:mm");
		Date d=st.parse(s);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, 30);
		String z=st.format(cal.getTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
