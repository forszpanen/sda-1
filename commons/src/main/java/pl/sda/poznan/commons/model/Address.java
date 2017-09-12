package pl.sda.poznan.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String number;
    private String street;
    private String city;
    private String postalCode;

}
