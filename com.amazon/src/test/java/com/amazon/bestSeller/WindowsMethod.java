package com.amazon.bestSeller;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsMethod {

	public static void main(String[] args) {
		
		WebDriverManager .chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		//recommended size is maximize.
		
		/* method chaining is the mechanisim to call maximize method. 
		 * driver is coming from webdriver interface.
		 * manage method is coming from option interface.
		 * window is coming from window interface.
		 * maximize is coming from window interface.
		 * */
		
		driver.manage().window().setPosition(new Point (200,200));
		
		
		
		
		
	

	}

}
