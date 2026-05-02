package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {

private WebDriver driver;
private WebDriverWait wait;

private By addProductButton = By.cssSelector(".add-to-cart");
private By cartItems = By.cssSelector(".cart-item");
private By checkoutButton = By.id("checkout");
private By quantityField = By.cssSelector(".cart-item-quantity");
private By removeButton = By.cssSelector(".remove-item");

public CartPage(WebDriver driver) {
this.driver = driver;
wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

public void addProductToCart(int index) {
List<WebElement> buttons = driver.findElements(addProductButton);
if (buttons.size() > index) {
wait.until(ExpectedConditions.elementToBeClickable(buttons.get(index))).click();
}
}

public boolean isProductInCart(int index) {
List<WebElement> items = driver.findElements(cartItems);
return items.size() > index;
}

public void removeProduct(int index) {
List<WebElement> removes = driver.findElements(removeButton);
if (removes.size() > index) {
wait.until(ExpectedConditions.elementToBeClickable(removes.get(index))).click();
}
}

public void goToCheckout() {
WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
checkout.click();
}

public int getProductQuantity(int index) {
List<WebElement> quantities = driver.findElements(quantityField);
if (quantities.size() > index) {
return Integer.parseInt(quantities.get(index).getAttribute("value"));
}
return 0;
}
}                          

