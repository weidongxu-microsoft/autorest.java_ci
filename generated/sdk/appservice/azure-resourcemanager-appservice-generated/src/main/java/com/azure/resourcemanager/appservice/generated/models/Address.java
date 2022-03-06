// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Address information for domain registration. */
@Fluent
public final class Address {
    /*
     * First line of an Address.
     */
    @JsonProperty(value = "address1", required = true)
    private String address1;

    /*
     * The second line of the Address. Optional.
     */
    @JsonProperty(value = "address2")
    private String address2;

    /*
     * The city for the address.
     */
    @JsonProperty(value = "city", required = true)
    private String city;

    /*
     * The country for the address.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /*
     * The postal code for the address.
     */
    @JsonProperty(value = "postalCode", required = true)
    private String postalCode;

    /*
     * The state or province for the address.
     */
    @JsonProperty(value = "state", required = true)
    private String state;

    /**
     * Get the address1 property: First line of an Address.
     *
     * @return the address1 value.
     */
    public String address1() {
        return this.address1;
    }

    /**
     * Set the address1 property: First line of an Address.
     *
     * @param address1 the address1 value to set.
     * @return the Address object itself.
     */
    public Address withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Get the address2 property: The second line of the Address. Optional.
     *
     * @return the address2 value.
     */
    public String address2() {
        return this.address2;
    }

    /**
     * Set the address2 property: The second line of the Address. Optional.
     *
     * @param address2 the address2 value to set.
     * @return the Address object itself.
     */
    public Address withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * Get the city property: The city for the address.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city for the address.
     *
     * @param city the city value to set.
     * @return the Address object itself.
     */
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the country property: The country for the address.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The country for the address.
     *
     * @param country the country value to set.
     * @return the Address object itself.
     */
    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the postalCode property: The postal code for the address.
     *
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: The postal code for the address.
     *
     * @param postalCode the postalCode value to set.
     * @return the Address object itself.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the state property: The state or province for the address.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state or province for the address.
     *
     * @param state the state value to set.
     * @return the Address object itself.
     */
    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (address1() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property address1 in model Address"));
        }
        if (city() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property city in model Address"));
        }
        if (country() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property country in model Address"));
        }
        if (postalCode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property postalCode in model Address"));
        }
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property state in model Address"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Address.class);
}
