package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		
		WebElement Rome=Dr.findElement(By.xpath("//div[@id='box6']"));
		WebElement Italy=Dr.findElement(By.xpath("//div[@id='box106']"));
		
		Actions action=new Actions(Dr);
		
		action.dragAndDrop(Rome, Italy).perform();	
		
		
	}
}
