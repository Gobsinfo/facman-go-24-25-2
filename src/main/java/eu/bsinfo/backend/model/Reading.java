package eu.bsinfo.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reading extends Id implements I_Reading {

    private LocalDate dateOfReading;
    private String meterId;
    private KindOfMeter kindOfMeter;
    private Boolean substitute;
    private Double meterCount;
    private String comment;
    private I_Customer customer;

    public String printDateOfReading() {
        return dateOfReading.toString();
    }
}
