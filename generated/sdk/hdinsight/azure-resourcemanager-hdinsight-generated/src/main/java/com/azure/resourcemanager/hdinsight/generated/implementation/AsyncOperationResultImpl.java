// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.resourcemanager.hdinsight.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.generated.models.AsyncOperationResult;
import com.azure.resourcemanager.hdinsight.generated.models.AsyncOperationState;
import com.azure.resourcemanager.hdinsight.generated.models.Errors;

public final class AsyncOperationResultImpl implements AsyncOperationResult {
    private AsyncOperationResultInner innerObject;

    private final com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager;

    AsyncOperationResultImpl(
        AsyncOperationResultInner innerObject,
        com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public AsyncOperationState status() {
        return this.innerModel().status();
    }

    public Errors error() {
        return this.innerModel().error();
    }

    public AsyncOperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.generated.HDInsightManager manager() {
        return this.serviceManager;
    }
}
