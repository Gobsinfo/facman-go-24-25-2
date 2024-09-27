package eu.bsinfo.backend.model;

import java.time.LocalDate;

public interface I_Customer extends I_Id {

    enum Gender {
        D, // divers
        M, // männlich
        U, // unbekannt
        W // weiblich
    }

    LocalDate getBirthDate();

    String getFirstName();

    Gender getGender();

    String getLastName();

    void setBirthDate(LocalDate birthDate);

    void setFirstName(String firstName);

    void setGender(Gender gender);

    void setLastName(String lastName);
}
