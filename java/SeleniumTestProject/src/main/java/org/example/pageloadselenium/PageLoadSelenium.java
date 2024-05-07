package org.example.pageloadselenium;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class Ocp {}
  class Oca extends Ocp {

    char ch;
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver);

        Oca oc = new Oca();

        String s = new String(":gh");

        StringBuilder s1 = new StringBuilder("aaaaaaaaaaaaaaaaa");

        System.out.println(s1.capacity());

        short apples = 10;

        System.out.println();

        System.out.println("char is " +oc.ch);

        {
System.out.println("code block 1 inside main");
        }

        {
            System.out.println("code block 2 inside main");

        }


    }

      {
          System.out.println("code block 3 inside main");

      }

      public Oca() {
          var x = 10;
          System.out.println("my constructor");
      }

      {

          var x = 10;
      }


  }