package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void accountShouldBeCreated() {
        //ЛОГИН
        //ОТКРЫТЬ СТРАНИЦУ АККАУНТОВ
        //НАЖАТЬ NEW
        //ЗАПОЛНИТЬ ФОРМУ
        //SAVE
        //ПРОВЕРИТЬ ЛИСТ

        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("nastya.martsuta-gugr@force.com", "password97")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");

        Account account = new Account("Test", "no", "tut.by", "",
                "Minsk", "220107", "Minsk", "Belarus",
                "Zelva", "213940", "Zelva", "Belarus",
                "Delivery only on weekdays", "Narodnaya", "Pobedu");

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
