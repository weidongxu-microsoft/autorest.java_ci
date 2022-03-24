// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.TableSignedIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TableProperties model. */
@Fluent
public final class TableProperties {
    /*
     * Table name under the specified account
     */
    @JsonProperty(value = "tableName", access = JsonProperty.Access.WRITE_ONLY)
    private String tableName;

    /*
     * List of stored access policies specified on the table.
     */
    @JsonProperty(value = "signedIdentifiers")
    private List<TableSignedIdentifier> signedIdentifiers;

    /**
     * Get the tableName property: Table name under the specified account.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Get the signedIdentifiers property: List of stored access policies specified on the table.
     *
     * @return the signedIdentifiers value.
     */
    public List<TableSignedIdentifier> signedIdentifiers() {
        return this.signedIdentifiers;
    }

    /**
     * Set the signedIdentifiers property: List of stored access policies specified on the table.
     *
     * @param signedIdentifiers the signedIdentifiers value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withSignedIdentifiers(List<TableSignedIdentifier> signedIdentifiers) {
        this.signedIdentifiers = signedIdentifiers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (signedIdentifiers() != null) {
            signedIdentifiers().forEach(e -> e.validate());
        }
    }
}
