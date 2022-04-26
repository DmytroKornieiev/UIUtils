package com.epam.task.gradle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassInUIUtils {
    public void openPage(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
