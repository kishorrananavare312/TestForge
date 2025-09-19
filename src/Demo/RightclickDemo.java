package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement Btn=Dr.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action=new Actions(Dr);
		
		action.contextClick(Btn).perform();
		
		Dr.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		Thread.sleep(5000);
		Dr.switchTo().alert().accept();
		
		Dr.close();
		
}

}
