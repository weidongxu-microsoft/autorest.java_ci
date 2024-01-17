// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.OperationsClient;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.Operation;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.sqlvirtualmachine.generated.SqlVirtualMachineManager serviceManager;

    public OperationsImpl(OperationsClient innerClient,
        com.azure.resourcemanager.sqlvirtualmachine.generated.SqlVirtualMachineManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> list() {
        PagedIterable<OperationInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> list(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sqlvirtualmachine.generated.SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }
}
