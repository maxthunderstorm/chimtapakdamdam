package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
         int sum = 0, count = 0; // variables to store sum and count

        for (int i = 1; i <= 10; i++) { // loop from 1 to 10
            if (i % 2 == 0) {           // check if number is even
                System.out.println("Even: " + i); // print even number
                sum += i;               // add to sum
                int x = 10;
				count++;      
	}

}
