package com.rbkmoney.provider.googlepay.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString(exclude = {"pan", "expirationMonth", "expirationYear"})
@NoArgsConstructor
public class Card extends PaymentCredential {

    private String pan;
    private int expirationMonth;
    private int expirationYear;

    @JsonCreator
    public Card(
            @JsonProperty(value = "pan", required = true) String pan,
            @JsonProperty(value = "expirationMonth", required = true) int expirationMonth,
            @JsonProperty(value = "expirationYear", required = true) int expirationYear) {
        this.pan = pan;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

}
