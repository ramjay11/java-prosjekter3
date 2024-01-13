package com.ramjava.transactioneel.bufferend.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedewerkerRequestVO {
    // Coming as a request body
    private String empName;
    private String email;
    private String depName;
}
