package com.example.lightproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student oleg = new Student(
                    "Oleg",
                    "theolegka@gmail.com",
                    LocalDate.of(2002, Month.MARCH,8)
            );
            Student alex = new Student(
                    "Alex",
                    "thealex@gmail.com",
                    LocalDate.of(2002, Month.DECEMBER,8)
            );
            repository.saveAll(
                    List.of(oleg, alex)
            );
        };
    }
}
