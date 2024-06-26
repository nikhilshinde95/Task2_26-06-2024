package com.org.controller;

import com.org.services.ApplicationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class MyControllerTest {

    @Mock
    private ApplicationService applicationService;

    @InjectMocks
    private CalculationController calculationController;

    @Test
    public void testCalculate_Success() {
        int number = 10;

        // Call the calculate method
        String result = calculationController.calculate(number);

        // Verify that the result matches the expected success message
        assertEquals("Calculations done for number: " + number, result);

        // Verify that each task method was called once with the expected number argument
        verify(applicationService).squareTask(number);
        verify(applicationService).cubeTask(number);
        verify(applicationService).evenTask(number);
        verify(applicationService).primeTask(number);
        verify(applicationService).armstrongTask(number);
        verify(applicationService).palindromeTask(number);
        verify(applicationService).factorialTask(number);
        verify(applicationService).reverseTask(number);

        // Log success message
        System.out.println("Calculation test succeeded for number: " + number);
    }
}
