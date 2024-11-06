package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleCode {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Sample Code");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close();

	}

}
