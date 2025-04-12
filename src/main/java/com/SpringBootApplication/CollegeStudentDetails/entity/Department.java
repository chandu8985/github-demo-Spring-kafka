package com.SpringBootApplication.CollegeStudentDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "please add department Name is important")
//    @Length(max = 20 , min = 10)
//    @Size(max = 11 , min = 03)
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @NegativeOrZero
//    @Future
//    @Past
//    @PastOrPresent
//    @FutureOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
