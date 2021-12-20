import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BmiCalculatorTest {
    @Test
    public void kgSmNormalTest(){
        /*
        0.1 Открыть браузер
        0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        1. Вводим вес   80
        2. Вводим высоту  184
        3. Нажимаем на кнопку
        4. Проверяем значение SI Utits
        5. Проверяем значение US Utits
        6. Проверяем значение UK Utits
        7. Проверяем нормальный коэффициент веса
        100. Закрыть браузер
         */

        // 0.1 Открыть браузер
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // 0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 1. Вводим вес 80
        WebElement weightTextField = driver.findElement(By.name("wg"));
        weightTextField.sendKeys("80");
        //2. Вводим высотe 184
        driver.findElement(By.name("ht")).sendKeys("184");
        //3. Нажимаем на кнопку
        driver.findElement(By.name("cc")).click();
        //4. Проверяем значение SI Utits
        String siStatus = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(siStatus, "23.63", "Si статус не правильный");
        //5. Проверяем значение US Utits
        String usStatus = driver.findElement(By.name("us")).getAttribute("value");
        Assert.assertEquals(usStatus, "24.03", "Us статус не правильный");
        //6. Проверяем значение UK Utits
        String ukStatus = driver.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(ukStatus, "150.05", "Uk статус не правильный");

        //7. Проверяем нормальный коэффициент веса
        String actualBmiStatus = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualBmiStatus, "Your category is Normal", "Bmi статус не правильный");

        driver.close();
    }
    @Test
    public void kgSmOverWeightTest(){
        /*
        0.1 Открыть браузер
        0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        1. Вводим вес   100
        2. Вводим высоту  184
        3. Нажимаем на кнопку
        4. Проверяем значение SI Utits
        5. Проверяем значение US Utits
        6. Проверяем значение UK Utits
        7. Проверяем нормальный коэффициент веса
        100. Закрыть браузер
         */
        // 0.1 Открыть браузер
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // 0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 1. Вводим вес 80
        WebElement weightTextField = driver.findElement(By.name("wg"));
        weightTextField.sendKeys("100");
        //2. Вводим высотe 184
        driver.findElement(By.name("ht")).sendKeys("184");
        //3. Нажимаем на кнопку
        driver.findElement(By.name("cc")).click();
        //4. Проверяем значение SI Utits
        String siStatus = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(siStatus, "29.54", "Si статус не правильный");
        //5. Проверяем значение US Utits
        String usStatus = driver.findElement(By.name("us")).getAttribute("value");
        Assert.assertEquals(usStatus, "30.03", "Us статус не правильный");
        //6. Проверяем значение UK Utits
        String ukStatus = driver.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(ukStatus, "187.58", "Uk статус не правильный");
        //7. Проверяем нормальный коэффициент веса

        String actualBmiStatus = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualBmiStatus, "Your category is Overweight", "Bmi статус не правильный");
        driver.close();
    }

    @Test
    public void kgSmUnderweightTest(){
        /*
        0.1 Открыть браузер
        0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        1. Вводим вес   100
        2. Вводим высоту  184
        3. Нажимаем на кнопку
        4. Проверяем значение SI Utits
        5. Проверяем значение US Utits
        6. Проверяем значение UK Utits
        7. Проверяем нормальный коэффициент веса
        100. Закрыть браузер
         */
        // 0.1 Открыть браузер
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // 0.2 Открыть сайт  https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 1. Вводим вес 80
        WebElement weightTextField = driver.findElement(By.name("wg"));
        weightTextField.sendKeys("60");
        //2. Вводим высотe 184
        driver.findElement(By.name("ht")).sendKeys("184");
        //3. Нажимаем на кнопку
        driver.findElement(By.name("cc")).click();
        //4. Проверяем значение SI Utits
        String siStatus = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(siStatus, "17.72", "Si статус не правильный");
        //5. Проверяем значение US Utits
        String usStatus = driver.findElement(By.name("us")).getAttribute("value");
        Assert.assertEquals(usStatus, "18.02", "Us статус не правильный");
        //6. Проверяем значение UK Utits
        String ukStatus = driver.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(ukStatus, "112.52", "Uk статус не правильный");

        //7. Проверяем нормальный коэффициент веса
        String actualBmiStatus = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualBmiStatus, "Your category is Underweight", "Bmi статус не правильный");
        driver.close();
    }
}
