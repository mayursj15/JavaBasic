package org.mayur.data;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
