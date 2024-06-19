// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Contains all the contact details of the customer.
 */
@Fluent
public final class ContactDetails implements JsonSerializable<ContactDetails> {
    /*
     * The contact person name.
     */
    private String contactPerson;

    /*
     * The name of the company.
     */
    private String companyName;

    /*
     * The phone number.
     */
    private String phone;

    /*
     * The email list.
     */
    private List<String> emailList;

    /**
     * Creates an instance of ContactDetails class.
     */
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property contactPerson in model ContactDetails"));
        }
        if (companyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property companyName in model ContactDetails"));
        }
        if (phone() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property phone in model ContactDetails"));
        }
        if (emailList() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property emailList in model ContactDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContactDetails.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("contactPerson", this.contactPerson);
        jsonWriter.writeStringField("companyName", this.companyName);
        jsonWriter.writeStringField("phone", this.phone);
        jsonWriter.writeArrayField("emailList", this.emailList, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContactDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContactDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContactDetails.
     */
    public static ContactDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContactDetails deserializedContactDetails = new ContactDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("contactPerson".equals(fieldName)) {
                    deserializedContactDetails.contactPerson = reader.getString();
                } else if ("companyName".equals(fieldName)) {
                    deserializedContactDetails.companyName = reader.getString();
                } else if ("phone".equals(fieldName)) {
                    deserializedContactDetails.phone = reader.getString();
                } else if ("emailList".equals(fieldName)) {
                    List<String> emailList = reader.readArray(reader1 -> reader1.getString());
                    deserializedContactDetails.emailList = emailList;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContactDetails;
        });
    }
}
