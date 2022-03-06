// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The List SAS credentials operation response. */
@Immutable
public final class ListAccountSasResponseInner {
    /*
     * List SAS credentials of storage account.
     */
    @JsonProperty(value = "accountSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String accountSasToken;

    /**
     * Get the accountSasToken property: List SAS credentials of storage account.
     *
     * @return the accountSasToken value.
     */
    public String accountSasToken() {
        return this.accountSasToken;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
