// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** String dictionary resource. */
@Fluent
public final class StringDictionaryInner extends ProxyOnlyResource {
    /*
     * Settings.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /** Creates an instance of StringDictionaryInner class. */
    public StringDictionaryInner() {
    }

    /**
     * Get the properties property: Settings.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Settings.
     *
     * @param properties the properties value to set.
     * @return the StringDictionaryInner object itself.
     */
    public StringDictionaryInner withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StringDictionaryInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
