package org.testng;

import java.io.IOException;

import javax.swing.JComboBox.KeySelectionManager;

import org.baseclass.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestNg extends BaseClass {
	@BeforeSuite
	private void browser() {

		browser("chrome");

	}

	@BeforeMethod
	private void launchurl() throws InterruptedException, IOException {

		url("https://www.amazon.in");
		screenshot("bftest");

	}

	private void signinpage() throws InterruptedException {

		WebElement signinclick = findelement("//span[@id='nav-link-accountList-nav-line-1']");
		signinclick.click();

	}

	private void signin() {
		WebElement typeusername = findelement("//input[@id='ap_email']");
		typeusername.sendKeys("9626640697");
		typeusername.sendKeys(Keys.ENTER);

		WebElement typepassword = findelement("//input[@id='ap_password']");
		typepassword.sendKeys("Nissanjeeva");
		typepassword.sendKeys(Keys.ENTER);

	}

	@Test

	private void iphonesearch() throws InterruptedException {
		WebElement iphone = findelement("//input[@id='twotabsearchtextbox']");
		iphone.sendKeys("iphone");
		iphone.sendKeys(Keys.ENTER);
		WebElement iphoneSe = findelement("//input[@id='twotabsearchtextbox']");
		iphoneSe.clear();

	}

	@Test
	private void watchsearch() {

		WebElement watch = findelement("//input[@id='twotabsearchtextbox']");
		watch.sendKeys("watch");
		watch.sendKeys(Keys.ENTER);
		WebElement watchs = findelement("//input[@id='twotabsearchtextbox']");
		watchs.clear();

	}

	@Test
	private void toyssearch() {

		WebElement toy = findelement("//input[@id='twotabsearchtextbox']");
		toy.sendKeys("toys");
		toy.sendKeys(Keys.ENTER);
		WebElement toys = findelement("//input[@id='twotabsearchtextbox']");
		toys.clear();

	}

	@Test
	private void bagsearch() {

		WebElement bag = findelement("//input[@id='twotabsearchtextbox']");
		bag.sendKeys("bags");
		bag.sendKeys(Keys.ENTER);
		WebElement bags = findelement("//input[@id='twotabsearchtextbox']");
		bags.clear();

	}

	@AfterMethod
	private void aftertest() throws IOException {
		screenshot("aftest");
	}

}
