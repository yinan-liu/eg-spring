package com.lenicliu.spring.boot;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@WebIntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationIntegrationTests {

	private WebDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
	}

	@After
	public void after() {
		driver.close();
	}

	@Test
	public void testHome() {
		driver.get("http://localhost:8080");
		WebElement body = driver.findElement(By.tagName("body"));
		WebElement p = body.findElement(By.tagName("p"));
		Assert.assertTrue(p.getText().contains("Hello Spring Boot"));
	}
}