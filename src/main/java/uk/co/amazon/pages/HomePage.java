package uk.co.amazon.pages;

import org.openqa.selenium.By;
import uk.co.amazon.utility.Utility;

public class HomePage extends Utility {



        By searchbutton = By.id("twotabsearchtextbox");


        public void clickOnLoginLink(){
            clickOnElement(searchbutton);
        }




    }


