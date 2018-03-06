package com.experitest.auto;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.appium.SeeTestClient;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class WP_Cadastro extends BaseTest {
	protected AndroidDriver<AndroidElement> driver = null;
	protected SeeTestClient client;
	
	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='android'") String deviceQuery) throws Exception{
		init(deviceQuery);
		// Init application / device capabilities
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.consul.android.smartbeer.staging/com.whirlpool.ted.View.SplashActivity");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.consul.android.smartbeer.staging");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.whirlpool.ted.View.SplashActivity");
		//dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability("testName", "AndroidDemoTest");
		dc.setCapability("deviceQuery", "@serialnumber='ad06160309316a7a49'");
		driver = new AndroidDriver<>(new URL(getProperty("url",cloudProperties) +"/wd/hub"), dc);
		client = new SeeTestClient(driver);
		
	}
	
//@Test
//public void uninstall()
//{
////		client.uninstall("com.consul.android.smartbeer.staging/com.whirlpool.ted.View.SplashActivity");
//		client.install("cloud:com.consul.android.smartbeer.staging/com.whirlpool.ted.View.SplashActivity", false, false);
////		client.applicationClearData("com.consul.android.smartbeer.staging");
//	}
		
	@Test 
	public void testing() {
		  client.applicationClearData("com.consul.android.smartbeer.staging");
		  driver.startActivity("com.consul.android.smartbeer.staging", "com.whirlpool.ted.View.SplashActivity");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Cadastre-se com seu e-mail pessoal']")));
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@text='Cadastre-se com seu e-mail pessoal']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@id='emailView']")).sendKeys("tedusp07@mailinator.com");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.swipe(165, 759, 175, 534, 1234);
		  driver.findElement(By.xpath("//*[@id='password_view']")).sendKeys("Smart2000");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@id='confirm_password_view']")).sendKeys("Smart2000");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.swipe(309, 856, 390, 406, 888);
		  driver.findElement(By.xpath("//*[@id='name_and_surname_view']")).sendKeys("TED USP");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@id='cpfView']")).sendKeys("41801452865");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.swipe(168, 946, 334, 615, 2240);
	      driver.findElement(By.xpath("//*[@id='dobView']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@text='OK']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.swipe(84, 887, 259, 493, 1461);
		  driver.findElement(By.xpath("//*[@id='phoneView']")).sendKeys("13982133161");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.swipe(450, 812, 500, 640, 1292);
		  driver.findElement(By.xpath("//*[@text='Cadastrar']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Verificar valida��o']")));
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@text='Verificar valida��o']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.pressKeyCode(AndroidKeyCode.HOME);
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.startActivity("com.android.chrome", "com.google.android.apps.chrome.Main");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.executeScript("client:client.swipeWhileNotFound(\"Right\", 0, 2000, \"NATIVE\", \"xpath=//*[@id='url_bar']\", 0, 6000, 2, true)");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@id='url_bar']")).sendKeys("www.mailinator.com/v2/inbox.jsp?zone=public&query=tedusp07");
		  try{Thread.sleep(5000);} catch(Exception ignore){}
		  driver.getKeyboard().sendKeys("{ENTER}");
		  driver.executeScript("client:client.swipeWhileNotFound(\"Right\", 0, 2000, \"NATIVE\", \"xpath=//*[@text='Confirmation Mail Subject']\", 0, 6000, 7, true)");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.executeScript("client:client.swipeWhileNotFound(\"Right\", 0, 2000, \"NATIVE\", \"xpath=//*[@text='Confirmar conta']\", 0, 6000, 7, true)");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.pressKeyCode(AndroidKeyCode.HOME);
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  client.applicationClearData("com.consul.android.smartbeer.staging");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.startActivity("com.consul.android.smartbeer.staging", "com.whirlpool.ted.View.SplashActivity");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@text='Acesse sua conta']")).click();
		  try{Thread.sleep(4000);} catch(Exception ignore){}
	      new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='edPassword']")));
		  driver.findElement(By.xpath("//*[@id='edEmail']")).sendKeys("tedusp07@mailinator.com");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@id='edPassword']")).sendKeys("Smart2000");
		  try{Thread.sleep(4000);} catch(Exception ignore){}
		  driver.findElement(By.xpath("//*[@text='Entrar']")).click();
		  try{Thread.sleep(5000);} catch(Exception ignore){}
        
	}
	
//	@AfterMethod
//	public void tearDown(ITestResult tr) throws Exception{
////		if (driver!=null)
////		{
////			if (tr.isSuccess()) 
////			{
////				driver.executeScript("client:client.setTestData(true,'passed')");
////			}
////			else {
////				driver.executeScript("client:client.setTestData(false,'failed')");
////			}
////			System.out.println("report URL : " + driver.getCapabilities().getCapability("reportUrl"));
////			driver.quit();
////		}
//			driver.wait(8000);
//	}
//
	
}

