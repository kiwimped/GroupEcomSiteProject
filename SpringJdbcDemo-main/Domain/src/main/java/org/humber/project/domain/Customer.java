package org.humber.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 * 
customer_id
number
name
varchar(200)
email
varchar(200)
phone
varchar(200)
postal_code
varchar(10)
NOT NULL
country
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    private String postal_code;
    private String country;

}
