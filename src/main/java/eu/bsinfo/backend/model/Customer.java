package eu.bsinfo.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends Id implements I_Customer {


    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;


}
