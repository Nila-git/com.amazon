package com.amazon.bestSeller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
		
		//this is how we open chromedriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//this is how we open firefox
		//WebDriverManager.firefoxdriver().setup(); driver exe
		//WebDriver driver1= new FirefoxDriver(); browser
		
		
		//this is how we open edegedriver
		WebDriverManager.edgedriver().setup();
		WebDriver driver2= new EdgeDriver();
		
		
		
		//WebDriverManager.iedriver().setup();
		//WebDriver sagarika= new InternetExplorerDriver();
		//sagarika is the variable name of driver interface that means we can give any name;
		//sagarika.get("https://www.amazon.com/");
		
		
		
		//string is a data type
		//amazonTitle is a variable name
		//= is an operator
		//driver.getTitle(); is a selenium WebDriver Interface method, also variable value.
		//System.out.println(title) we are printing the title. 
		
		driver.get("https://www.amazon.com/");
		String amazonTitle=driver.getTitle();
				System.out.println(amazonTitle);	
				
				//this is how to kill a browser
				driver.quit();
	}

}
