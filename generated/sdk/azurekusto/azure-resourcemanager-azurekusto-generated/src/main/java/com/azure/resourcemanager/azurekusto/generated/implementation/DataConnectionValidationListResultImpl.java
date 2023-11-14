// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.azurekusto.generated.models.DataConnectionValidationListResult;
import com.azure.resourcemanager.azurekusto.generated.models.DataConnectionValidationResult;
import java.util.Collections;
import java.util.List;

public final class DataConnectionValidationListResultImpl implements DataConnectionValidationListResult {
    private DataConnectionValidationListResultInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    DataConnectionValidationListResultImpl(DataConnectionValidationListResultInner innerObject,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DataConnectionValidationResult> value() {
        List<DataConnectionValidationResult> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataConnectionValidationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }
}
