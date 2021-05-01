import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;

public class session {
	public static void main(String[] args) {
		String cwd = Paths.get("").toAbsolutePath().toString();
		String filePath = cwd + "/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);

		// Launching browser
		WebDriver driver = new ChromeDriver();

		// Loading URL
		driver.get("https://www.maxlifeinsurance.com/term-insurance-plans/premium-calculator");
		WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);

		// using session storage
		SessionStorage sessionStorage = webStorage.getSessionStorage();
		sessionStorage.setItem("name", "Sam");

		// getting keyset of local storage
		System.out.println("getting keyset of session storage that is:");
		var b = sessionStorage.keySet();
		System.out.println(b);

		// getting value of name key
		System.out.println("getting value of name key that is:");
		var key = sessionStorage.getItem("name");
		System.out.println(key);

		//getting value of  utmCode
		System.out.println("getting value of utm key that is:");
		var key1 = sessionStorage.getItem("utmCode");
		System.out.println(key1);

		//getting value of  lastRoute
		System.out.println("getting value of last route key that is:");
		var key2 = sessionStorage.getItem("lastRoute");
		System.out.println(key2);

		// getting value of lead
		System.out.println("getting value of lead key that is:");
		var key3 = sessionStorage.getItem("lead");
		System.out.println(key3);

		// size of session storage
		System.out.println("getting size of session storage that is:");
		var a = sessionStorage.size();
		System.out.println(a);

		// for removing item
		System.out.println("removing item name:");
		sessionStorage.removeItem("name");

		// clearing local storage
		System.out.println("clearing session storage------!!:");
		sessionStorage.clear();

		driver.quit();
	}
}