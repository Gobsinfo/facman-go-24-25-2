package eu.bsinfo.backend.model;

import java.time.LocalDate;

public interface I_Reading extends I_Id {

    enum KindOfMeter {
        HEIZUNG, STROM, UNBEKANNT, WASSER
    }

    String getComment();

    I_Customer getCustomer();

    LocalDate getDateOfReading();

    KindOfMeter getKindOfMeter();

    Double getMeterCount();

    String getMeterId();

    Boolean getSubstitute();

    String printDateOfReading();

    void setComment(String comment);

    void setCustomer(I_Customer customer);

    void setDateOfReading(LocalDate dateOfReading);

    void setKindOfMeter(KindOfMeter kindOfMeter);

    void setMeterCount(Double meterCount);

    void setMeterId(String meterId);

    void setSubstitute(Boolean substitute);

}
