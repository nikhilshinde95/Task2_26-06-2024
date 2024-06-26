package com.org.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.org.services.ApplicationService;

@RestController
public class CalculationController {

    private static final Logger log = LoggerFactory.getLogger(CalculationController.class);

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/calculate")
    public String calculate(@RequestParam("number") int number) {
        log.info("Received request to calculate for number: {}", number);

        try {
            Thread threadSquare = new Thread(applicationService.squareTask(number));
            Thread threadCube = new Thread(applicationService.cubeTask(number));
            Thread threadEven = new Thread(applicationService.evenTask(number));
            Thread threadPrime = new Thread(applicationService.primeTask(number));
            Thread threadArmstrong = new Thread(applicationService.armstrongTask(number));
            Thread threadPalindrome = new Thread(applicationService.palindromeTask(number));
            Thread threadFactorial = new Thread(applicationService.factorialTask(number));
            Thread threadReverse = new Thread(applicationService.reverseTask(number));

            threadSquare.start();
            threadCube.start();
            threadEven.start();
            threadPrime.start();
            threadArmstrong.start();
            threadPalindrome.start();
            threadFactorial.start();
            threadReverse.start();

            log.info("Calculation threads started for number: {}", number);
        } catch (Exception e) {
            log.error("Exception occurred while performing calculations for number {}: {}", number, e.getMessage());
            return "Error occurred during calculations for number: " + number;
        }

        return "Calculations done for number: " + number;
    }
}
