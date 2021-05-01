import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;

public class Local {
	public static void main(String[] args) {
		String cwd = Paths.get("").toAbsolutePath().toString();
		String filePath = cwd + "/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);

		// Launching browser
		WebDriver driver = new ChromeDriver();

		// Loading URL
		driver.get("https://www.maxlifeinsurance.com/term-insurance-plans/premium-calculator");
		System.out.println("setting key and value ");
		WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);

		// using local storage
		LocalStorage localStorage = webStorage.getLocalStorage();
		

		// setting item
		localStorage.setItem("name", "Sakshi Negi");

		// getting keyset of local storage
		System.out.println("getting keyset of localstorage that is:");
		var b = localStorage.keySet();
		System.out.println(b);

		// getting value of name key
		System.out.println("getting value of key name that is:");
		var key = localStorage.getItem("name");
		System.out.println(key);

		// getting value of product key
		System.out.println("getting value of key product that is:");
		var key1 = localStorage.getItem("product");
		System.out.println(key1);

		// getting value of Funnel_Stage key
		System.out.println("getting value of funnel stage:");
		var key2 = localStorage.getItem("Funnel_Stage");
		System.out.println(key2);

		// getting value of eligibilityData key
		System.out.println("getting value of eligibility data:");
		var key3 = localStorage.getItem("eligibilityData");
		System.out.println(key3);

		// getting value of leadData key
		System.out.println("getting value of lead data:");
		var key4 = localStorage.getItem("leadData");
		System.out.println(key4);

		// size of local storage
		System.out.println("getting size of localstorage that is:");
		var a = localStorage.size();
		System.out.println(a);

		// clearing local storage
		System.out.println("clearing local storage------!!:");
		localStorage.clear();

		driver.quit();

	}
}