// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains all the contact details of the customer. */
@Fluent
public final class ContactDetails {
    /*
     * The contact person name.
     */
    @JsonProperty(value = "contactPerson", required = true)
    private String contactPerson;

    /*
     * The name of the company.
     */
    @JsonProperty(value = "companyName", required = true)
    private String companyName;

    /*
     * The phone number.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /*
     * The email list.
     */
    @JsonProperty(value = "emailList", required = true)
    private List<String> emailList;

    /** Creates an instance of ContactDetails class. */
    public ContactDetails() {
    }

    /**
     * Get the contactPerson property: The contact person name.
     *
     * @return the contactPerson value.
     */
    public String contactPerson() {
        return this.contactPerson;
    }

    /**
     * Set the contactPerson property: The contact person name.
     *
     * @param contactPerson the contactPerson value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    /**
     * Get the companyName property: The name of the company.
     *
     * @return the companyName value.
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set the companyName property: The name of the company.
     *
     * @param companyName the companyName value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the phone property: The phone number.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: The phone number.
     *
     * @param phone the phone value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the emailList property: The email list.
     *
     * @return the emailList value.
     */
    public List<String> emailList() {
        return this.emailList;
    }

    /**
     * Set the emailList property: The email list.
     *
     * @param emailList the emailList value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withEmailList(List<String> emailList) {
        this.emailList = emailList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactPerson() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property contactPerson in model ContactDetails"));
        }
        if (companyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property companyName in model ContactDetails"));
        }
        if (phone() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property phone in model ContactDetails"));
        }
        if (emailList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property emailList in model ContactDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContactDetails.class);
}
