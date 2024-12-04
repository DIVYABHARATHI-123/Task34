package Task26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAutomation {

	public static void main(String[] args) {
		
		// Initialize the ChromeDriver
        WebDriver driver=new ChromeDriver();    
     
        try {
            // Maximize the browser window
            driver.manage().window().maximize();

    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		
    		 // Navigate to the URL
            driver.get("https://jqueryui.com/datepicker/");
            
    
            // Switch to the iframe that contains the datepicker
            WebElement iframe = driver.findElement(By.className("demo-frame"));
            driver.switchTo().frame(iframe);

            // Click on the datepicker input field to make the calendar visible
            WebElement dateInput = driver.findElement(By.id("datepicker"));
            dateInput.click();

            // Navigate to the next month
            WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextButton.click();

            // Select the date "22"
            WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
            dateToSelect.click();

            // Retrieve the selected date from the input field
            String selectedDate = dateInput.getAttribute("value");

            // Print the selected date
            System.out.println("Selected Date: " + selectedDate);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window and quit the WebDriver instance
            driver.quit();
        }
    }

	}


