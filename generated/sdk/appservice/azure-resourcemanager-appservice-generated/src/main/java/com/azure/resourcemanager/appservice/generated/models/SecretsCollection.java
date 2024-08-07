// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SecretsCollectionInner;
import java.util.List;

/**
 * An immutable client-side representation of SecretsCollection.
 */
public interface SecretsCollection {
    /**
     * Gets the value property: Collection of resources.
     * 
     * @return the value value.
     */
    List<ContainerAppSecret> value();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SecretsCollectionInner object.
     * 
     * @return the inner object.
     */
    SecretsCollectionInner innerModel();
}
