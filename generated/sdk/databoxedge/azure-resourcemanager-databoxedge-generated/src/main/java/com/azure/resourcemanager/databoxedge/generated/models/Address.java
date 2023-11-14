// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The shipping address of the customer.
 */
@Fluent
public final class Address {
    /*
     * The address line1.
     */
    @JsonProperty(value = "addressLine1")
    private String addressLine1;

    /*
     * The address line2.
     */
    @JsonProperty(value = "addressLine2")
    private String addressLine2;

    /*
     * The address line3.
     */
    @JsonProperty(value = "addressLine3")
    private String addressLine3;

    /*
     * The postal code.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * The city name.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * The state name.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The country name.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * Creates an instance of Address class.
     */
    public Address() {
    }

    /**
     * Get the addressLine1 property: The address line1.
     * 
     * @return the addressLine1 value.
     */
    public String addressLine1() {
        return this.addressLine1;
    }

    /**
     * Set the addressLine1 property: The address line1.
     * 
     * @param addressLine1 the addressLine1 value to set.
     * @return the Address object itself.
     */
    public Address withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the addressLine2 property: The address line2.
     * 
     * @return the addressLine2 value.
     */
    public String addressLine2() {
        return this.addressLine2;
    }

    /**
     * Set the addressLine2 property: The address line2.
     * 
     * @param addressLine2 the addressLine2 value to set.
     * @return the Address object itself.
     */
    public Address withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the addressLine3 property: The address line3.
     * 
     * @return the addressLine3 value.
     */
    public String addressLine3() {
        return this.addressLine3;
    }

    /**
     * Set the addressLine3 property: The address line3.
     * 
     * @param addressLine3 the addressLine3 value to set.
     * @return the Address object itself.
     */
    public Address withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Get the postalCode property: The postal code.
     * 
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: The postal code.
     * 
     * @param postalCode the postalCode value to set.
     * @return the Address object itself.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the city property: The city name.
     * 
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city name.
     * 
     * @param city the city value to set.
     * @return the Address object itself.
     */
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the state property: The state name.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state name.
     * 
     * @param state the state value to set.
     * @return the Address object itself.
     */
    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the country property: The country name.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The country name.
     * 
     * @param country the country value to set.
     * @return the Address object itself.
     */
    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (country() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property country in model Address"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Address.class);
}
