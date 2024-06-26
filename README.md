# Calculation API

This project is a REST API built using Spring Boot to perform various calculations on integers (0 to 9999). The calculations include finding the square, cube, checking if the number is even or odd, prime, Armstrong, palindrome, factorial, and reversing the number. Each calculation is performed using multithreading with different tasks for each calculation implemented using `Runnable`.

## Features

- **Square Calculation**: Calculates the square of a given number.
- **Cube Calculation**: Calculates the cube of a given number.
- **Even/Odd Check**: Checks if a given number is even or odd.
- **Prime Check**: Checks if a given number is prime.
- **Armstrong Check**: Checks if a given number is an Armstrong number.
- **Palindrome Check**: Checks if a given number is a palindrome.
- **Factorial Calculation**: Calculates the factorial of a given number.
- **Reverse Number**: Reverses the digits of a given number.

## Requirements

- Java 8 or higher
- Maven or Gradle
- Spring Boot 2.x

## Installation

1. **Clone the repository**:
    
    git clone https://github.com/your-username/calculation-api.git
    cd calculation-api
    

2. **Build the project using gradle**:
    
3. **Run the application**:

## Usage

The API provides the following endpoints:

1. **Calculation**
    - **URL**: `http://localhost:9090/calculate?number=10`
    - **Method**: `POST`
    - **Parameters**: `number` (int)
    - **Example**: `http://localhost:9090/calculate?number=10`


 **Swagger Testing**
    - **URL**: `http://localhost:9090/swagger-ui/index.html#/calculation-controller/calculate`

**Swagger Testing Screenshot**

![Swagger1](https://github.com/nikhilshinde95/Task2_26-06-2024/assets/171656624/08cec701-aece-426c-826c-a9835f861906)
![Swagger2](https://github.com/nikhilshinde95/Task2_26-06-2024/assets/171656624/d5899097-0d2c-4922-910b-f4fbf5237ea7)
![Swagger3](https://github.com/nikhilshinde95/Task2_26-06-2024/assets/171656624/64d1f2c4-85af-44f5-a30d-8ff6ce6eefa2)
![Swagger4](https://github.com/nikhilshinde95/Task2_26-06-2024/assets/171656624/fc4f4990-0a9f-4aef-a6f8-8ba56658479d)
