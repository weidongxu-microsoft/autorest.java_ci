// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ConnStringValueTypePair;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** String dictionary resource. */
@Fluent
public final class ConnectionStringDictionaryInner extends ProxyOnlyResource {
    /*
     * Connection strings.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ConnStringValueTypePair> properties;

    /** Creates an instance of ConnectionStringDictionaryInner class. */
    public ConnectionStringDictionaryInner() {
    }

    /**
     * Get the properties property: Connection strings.
     *
     * @return the properties value.
     */
    public Map<String, ConnStringValueTypePair> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Connection strings.
     *
     * @param properties the properties value to set.
     * @return the ConnectionStringDictionaryInner object itself.
     */
    public ConnectionStringDictionaryInner withProperties(Map<String, ConnStringValueTypePair> properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionStringDictionaryInner withKind(String kind) {
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
        if (properties() != null) {
            properties()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
