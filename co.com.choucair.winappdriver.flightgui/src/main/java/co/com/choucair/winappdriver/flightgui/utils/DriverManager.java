package co.com.choucair.winappdriver.flightgui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * <h1>Open WinAppDriver</h1>
 * <p>Esta clase fue diseñada para abrir un ejecutable (WinAppDriver.exe)</p>
 * @version: 1.0
 * @author: lvanegasm (Luis Angel Vanegas Martinez)
 * @version: 1.0
 * @since: 10/12/2019
 */

public class DriverManager {
    private static WebDriver driver = null;
    private static DesiredCapabilities capabilities;

    private DriverManager() {
        throw new IllegalStateException("No se puede establecer el driver");
    }

    public static WebDriver abrirCalculadoraWindows() {
        try {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            capabilities.setCapability("platformName", "windows");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}