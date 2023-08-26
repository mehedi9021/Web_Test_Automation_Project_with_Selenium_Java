package rokomari.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class tc_003_findBookByWritter extends driver_setup{
	
	@Test
	public void test_findBookByWritter() throws InterruptedException {
		driverSetup();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button/i")).click();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[1]/ul/li[1]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"js--notification-permission-modal\"]/div/div/button[1]")).click();
		
		WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"js--authors\"]"));
		Actions actions = new Actions(driver);
		 // Perform the hover action.
        actions.moveToElement(elementToHover).perform();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"js--authors-menu\"]/div/div[1]/li[1]/a")).click();		
		
		String getText = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section[1]/div/div[2]/p")).getText();
		System.out.println(getText);
		String actualtext = "হুমায়ূন আহমেদ\r\n"
				+ "বাংলা সাহিত্যের এক কিংবদন্তী হুমায়ূন আহমেদ। বিংশ শতাব্দীর বাঙালি লেখকদের মধ্যে তিনি অন্যতম স্থান দখল করে আছেন। একাধারে ঔপন্যাসিক, ছোটগল্পকার ও "
				+ "নাট্যকার এ মানুষটিকে বলা হয় বাংলা সায়েন্স ফিকশনের পথিকৃৎ। নাটক ও চলচ্চিত্র পরিচালক হিসেবেও তিনি বেশ সমাদৃত। বাদ যায়নি গীতিকার কিংবা চিত্রশিল্পীর পরিচয়ও। "
				+ "সৃজনশীলতার প্রতিটি শাখায় তাঁর সমান বিচরণ ছিল। অর্জন করেছেন সর্বোচ্চ সফলতা এবং তুমুল জনপ্রিয়তা। স্বাধীনতা পরবর্তী বাঙালি জাতিকে হুমায়ুন আহমেদ উপহার "
				+ "দিয়েছেন তাঁর অসামান্য বই, নাটক এবং চলচ্চিত্র। চলচ্চিত্রের বদৌলতে মানুষকে করেছেন হলমুখী, তৈরি করে গেছেন বিশাল পাঠকশ্রেণীও। তাঁর নির্মিত প্রথম চলচ্চিত্র "
				+ "‘আগুনের পরশমনি’ দেখতে দর্শকের ঢল নামে। এছাড়া শ্যামল ছায়া, শ্রাবণ মেঘের দিন, দুই দুয়ারী, চন্দ্রকথা, ঘেটুপুত্র কমলা প্রভৃতি চলচ্চিত্র সুধীজনের প্রশংসা পেয়েছে। "
				+ "অনন্য কীর্তি হিসেবে আছে তাঁর নাটকগুলো। এইসব দিনরাত্র, বহুব্রীহি, আজ রবিবার, কোথাও কেউ নেই, অয়োময়ো আজও নিন্দিত দর্শকমনে। হিমু, মিসির আলি, "
				+ "শুভ্রর মতো চরিত্রের জনক তিনি। রচনা করেছেন নন্দিত নরকে, শঙ্খনীল কারাগার, জোছনা ও জননীর গল্পের মতো সব মাস্টারপিস। শিশুতোষ গ্রন্থ, মুক্তিযুদ্ধ বিষয়ক রচনা, "
				+ "বৈজ্ঞানিক কল্পকাহিনী মিলিয়ে হুমায়ূন আহমেদ এর বই সমূহ এর পাঠক সারাবিশ্বে ছড়িয়ে আছে। হুমায়ূন আহমেদ এর বই সমগ্র পৃথিবীর নানা ভাষায় অনূদিতও হয়েছে। "
				+ "সৃজনশীল কর্মকাণ্ডের মাধ্যমে অর্জন করেছেন বাংলা একাডেমি পুরস্কার (১৯৮১), একুশে পদক (১৯৯৪), হুমায়ুন কাদির স্মৃতি পুরস্কার (১৯৯০), লেখক শিবির পুরস্কার (১৯৭৩), "
				+ "মাইকেল মধুসূধন দত্ত পুরস্কার (১৯৮৭), জাতীয় চলচ্চিত্র পুরস্কার (১৯৯৩ ও ১৯৯৪), বাচসাস পুরস্কার (১৯৮৮), শিশু একাডেমি পুরস্কার, জয়নুল আবেদীন স্বর্ণপদকসহ নানা সম্মাননা। "
				+ "হুমায়ূন আহমেদ এর বই, চলচ্চিত্র এবং অন্যান্য রচনা দেশের বাইরেও মূল্যায়িত হয়েছে৷ ১৯৪৮ সালের ১৩ই নভেম্বর, তৎকালীন পূর্ব পাকিস্তানে, নেত্রকোনা জেলার কেন্দুয়া উপজেলায় "
				+ "কুতুবপুরে পীরবংশে জন্মগ্রহণ করেন হুমায়ূন আহমেদ। কোলন ক্যান্সারে আক্রান্ত হয়ে দীর্ঘদিন চিকিৎসাধীন থাকার পর নিউ ইয়র্কের ম্যানহাটনের বেলভ্যু হাসপাতালে তিনি ইহলোক ত্যাগ করেন। "
				+ "গাজীপুরে তাঁর প্রিয় নুহাশ-পল্লীতে তাঁকে সমাহিত করা হয়।";
		
		if (actualtext.contains(getText)) {
			System.out.println("Matched!");
		}
		else {
			System.out.println("Not Matched!");
		
		}
		
		 //create an instance of JavascriptExecutor
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //scroll to the bottom of the page using JavaScript
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		//sort by discount
		driver.findElement(By.xpath("//*[@id=\"js--browse-sidebar-form\"]/div[1]/div[2]/div[5]/div/label")).click();
		
		Thread.sleep(5000);
		//sort by stock
		driver.findElement(By.xpath("//*[@id=\"js--browse-sidebar-form\"]/div[2]/div/div[2]/div/label")).click();
		
		//search by category
		driver.findElement(By.xpath("//*[@id=\"js--browse-sidebar-form\"]/div[3]/div[2]/div[1]/div[1]/div/input")).sendKeys("সমকালীন উপন্যাস");
		driver.findElement(By.xpath("//*[@id=\"js--browse-sidebar-form\"]/div[3]/div[2]/div[1]/div[1]/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.quit();
	}

}
