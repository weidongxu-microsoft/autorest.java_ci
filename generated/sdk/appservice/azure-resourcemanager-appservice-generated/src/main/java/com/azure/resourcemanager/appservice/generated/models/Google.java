// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the Google provider.
 */
@Fluent
public final class Google implements JsonSerializable<Google> {
    /*
     * <code>false</code> if the Google provider should not be enabled despite the set registration; otherwise,
     * <code>true</code>.
     */
    private Boolean enabled;

    /*
     * The configuration settings of the app registration for the Google provider.
     */
    private ClientRegistration registration;

    /*
     * The configuration settings of the login flow.
     */
    private LoginScopes login;

    /*
     * The configuration settings of the Azure Active Directory token validation flow.
     */
    private AllowedAudiencesValidation validation;

    /**
     * Creates an instance of Google class.
     */
    public Google() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the Google object itself.
     */
    public Google withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the app registration for the Google provider.
     * 
     * @return the registration value.
     */
    public ClientRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the app registration for the Google provider.
     * 
     * @param registration the registration value to set.
     * @return the Google object itself.
     */
    public Google withRegistration(ClientRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow.
     * 
     * @return the login value.
     */
    public LoginScopes login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow.
     * 
     * @param login the login value to set.
     * @return the Google object itself.
     */
    public Google withLogin(LoginScopes login) {
        this.login = login;
        return this;
    }

    /**
     * Get the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @return the validation value.
     */
    public AllowedAudiencesValidation validation() {
        return this.validation;
    }

    /**
     * Set the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @param validation the validation value to set.
     * @return the Google object itself.
     */
    public Google withValidation(AllowedAudiencesValidation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
        if (login() != null) {
            login().validate();
        }
        if (validation() != null) {
            validation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("registration", this.registration);
        jsonWriter.writeJsonField("login", this.login);
        jsonWriter.writeJsonField("validation", this.validation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Google from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Google if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Google.
     */
    public static Google fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Google deserializedGoogle = new Google();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedGoogle.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("registration".equals(fieldName)) {
                    deserializedGoogle.registration = ClientRegistration.fromJson(reader);
                } else if ("login".equals(fieldName)) {
                    deserializedGoogle.login = LoginScopes.fromJson(reader);
                } else if ("validation".equals(fieldName)) {
                    deserializedGoogle.validation = AllowedAudiencesValidation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGoogle;
        });
    }
}
