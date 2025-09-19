package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		Dr.manage().window().maximize();
		
		
		Dr.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		Dr.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\Text2.txt");
		
		
		
		
	}

}
