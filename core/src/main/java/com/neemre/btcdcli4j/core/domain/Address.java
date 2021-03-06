package com.neemre.btcdcli4j.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neemre.btcdcli4j.core.common.Defaults;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address extends Entity {

    @JsonProperty("involvesWatchonly")
    private Boolean involvesWatchOnly;
    private String address;
    private String account;
    @Setter(AccessLevel.NONE)
    private BigDecimal amount;
    private Integer confirmations;
    @JsonProperty("txids")
    private List<String> txIds;


    public Address(Boolean involvesWatchOnly, String address, String account, BigDecimal amount,
                   Integer confirmations, List<String> txIds) {
        setInvolvesWatchOnly(involvesWatchOnly);
        setAddress(address);
        setAccount(account);
        setAmount(amount);
        setConfirmations(confirmations);
        setTxIds(txIds);
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount.setScale(Defaults.DECIMAL_SCALE, Defaults.ROUNDING_MODE);
    }
}