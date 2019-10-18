package com.springTest.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Autowired
    private Car autoWiredCar;

    private Car nonAutoWiredCar;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void autowire() throws Exception {
        assertThat(autoWiredCar).isNotNull();
        assertThat(nonAutoWiredCar).isNull();
    }

    @Test
    public void autowire_show_information() {
        autoWiredCar.showInformation();

        assertTrue(outContent.toString().contains("This is a car."));
        assertTrue(outContent.toString().contains("This is the driver of this car."));
    }
}