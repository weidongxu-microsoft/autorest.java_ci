// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Classic Administrators. */
@Fluent
public final class ClassicAdministratorInner {
    /*
     * The ID of the administrator.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the administrator.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the administrator.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Properties for the classic administrator.
     */
    @JsonProperty(value = "properties")
    private ClassicAdministratorProperties innerProperties;

    /** Creates an instance of ClassicAdministratorInner class. */
    public ClassicAdministratorInner() {
    }

    /**
     * Get the id property: The ID of the administrator.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the administrator.
     *
     * @param id the id value to set.
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the administrator.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the administrator.
     *
     * @param name the name value to set.
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the administrator.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the administrator.
     *
     * @param type the type value to set.
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: Properties for the classic administrator.
     *
     * @return the innerProperties value.
     */
    private ClassicAdministratorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the emailAddress property: The email address of the administrator.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAddress();
    }

    /**
     * Set the emailAddress property: The email address of the administrator.
     *
     * @param emailAddress the emailAddress value to set.
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withEmailAddress(String emailAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClassicAdministratorProperties();
        }
        this.innerProperties().withEmailAddress(emailAddress);
        return this;
    }

    /**
     * Get the role property: The role of the administrator.
     *
     * @return the role value.
     */
    public String role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Set the role property: The role of the administrator.
     *
     * @param role the role value to set.
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withRole(String role) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClassicAdministratorProperties();
        }
        this.innerProperties().withRole(role);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
