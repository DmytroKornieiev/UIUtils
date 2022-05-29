package com.epam.task.drivers;

import org.openqa.selenium.WebDriver;

import java.io.PrintStream;
import java.time.Duration;

import static jdk.nashorn.internal.runtime.Context.err;

public abstract class DriverManager {
    protected ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
    protected abstract WebDriver createDriver();

    public void quitDriver() {
        if (null != drivers.get()) {
            try {
                drivers.get().quit();
                drivers.remove();
            } catch (Exception e) {
                PrintStream err = System.err;
                err("Unable to gracefully quit WebDriver.");
            }

        }
    }

    public WebDriver getDriver() {
        if (null == drivers.get()) {
            drivers.set(this.createDriver());
        }
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(1L));
        return drivers.get();
    }
}
