// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.BlobContainersClient;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.generated.fluent.models.ImmutabilityPolicyInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LeaseContainerResponseInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;
import com.azure.resourcemanager.storage.generated.fluent.models.ListContainerItemInner;
import com.azure.resourcemanager.storage.generated.models.BlobContainer;
import com.azure.resourcemanager.storage.generated.models.BlobContainers;
import com.azure.resourcemanager.storage.generated.models.BlobContainersDeleteImmutabilityPolicyResponse;
import com.azure.resourcemanager.storage.generated.models.BlobContainersExtendImmutabilityPolicyResponse;
import com.azure.resourcemanager.storage.generated.models.BlobContainersGetImmutabilityPolicyResponse;
import com.azure.resourcemanager.storage.generated.models.BlobContainersLockImmutabilityPolicyResponse;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicy;
import com.azure.resourcemanager.storage.generated.models.LeaseContainerRequest;
import com.azure.resourcemanager.storage.generated.models.LeaseContainerResponse;
import com.azure.resourcemanager.storage.generated.models.LegalHold;
import com.azure.resourcemanager.storage.generated.models.ListContainerItem;
import com.azure.resourcemanager.storage.generated.models.ListContainersInclude;

public final class BlobContainersImpl implements BlobContainers {
    private static final ClientLogger LOGGER = new ClientLogger(BlobContainersImpl.class);

    private final BlobContainersClient innerClient;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public BlobContainersImpl(BlobContainersClient innerClient,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ListContainerItem> list(String resourceGroupName, String accountName) {
        PagedIterable<ListContainerItemInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ListContainerItemImpl(inner1, this.manager()));
    }

    public PagedIterable<ListContainerItem> list(String resourceGroupName, String accountName, String maxpagesize,
        String filter, ListContainersInclude include, Context context) {
        PagedIterable<ListContainerItemInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, maxpagesize, filter, include, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ListContainerItemImpl(inner1, this.manager()));
    }

    public Response<BlobContainer> getWithResponse(String resourceGroupName, String accountName, String containerName,
        Context context) {
        Response<BlobContainerInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, containerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BlobContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BlobContainer get(String resourceGroupName, String accountName, String containerName) {
        BlobContainerInner inner = this.serviceClient().get(resourceGroupName, accountName, containerName);
        if (inner != null) {
            return new BlobContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String containerName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, containerName, context);
    }

    public void delete(String resourceGroupName, String accountName, String containerName) {
        this.serviceClient().delete(resourceGroupName, accountName, containerName);
    }

    public Response<LegalHold> setLegalHoldWithResponse(String resourceGroupName, String accountName,
        String containerName, LegalHoldInner legalHold, Context context) {
        Response<LegalHoldInner> inner = this.serviceClient()
            .setLegalHoldWithResponse(resourceGroupName, accountName, containerName, legalHold, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LegalHoldImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LegalHold setLegalHold(String resourceGroupName, String accountName, String containerName,
        LegalHoldInner legalHold) {
        LegalHoldInner inner
            = this.serviceClient().setLegalHold(resourceGroupName, accountName, containerName, legalHold);
        if (inner != null) {
            return new LegalHoldImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LegalHold> clearLegalHoldWithResponse(String resourceGroupName, String accountName,
        String containerName, LegalHoldInner legalHold, Context context) {
        Response<LegalHoldInner> inner = this.serviceClient()
            .clearLegalHoldWithResponse(resourceGroupName, accountName, containerName, legalHold, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LegalHoldImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LegalHold clearLegalHold(String resourceGroupName, String accountName, String containerName,
        LegalHoldInner legalHold) {
        LegalHoldInner inner
            = this.serviceClient().clearLegalHold(resourceGroupName, accountName, containerName, legalHold);
        if (inner != null) {
            return new LegalHoldImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ImmutabilityPolicy> getImmutabilityPolicyWithResponse(String resourceGroupName, String accountName,
        String containerName, String ifMatch, Context context) {
        BlobContainersGetImmutabilityPolicyResponse inner = this.serviceClient()
            .getImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImmutabilityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImmutabilityPolicy getImmutabilityPolicy(String resourceGroupName, String accountName,
        String containerName) {
        ImmutabilityPolicyInner inner
            = this.serviceClient().getImmutabilityPolicy(resourceGroupName, accountName, containerName);
        if (inner != null) {
            return new ImmutabilityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ImmutabilityPolicy> deleteImmutabilityPolicyWithResponse(String resourceGroupName,
        String accountName, String containerName, String ifMatch, Context context) {
        BlobContainersDeleteImmutabilityPolicyResponse inner = this.serviceClient()
            .deleteImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImmutabilityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImmutabilityPolicy deleteImmutabilityPolicy(String resourceGroupName, String accountName,
        String containerName, String ifMatch) {
        ImmutabilityPolicyInner inner
            = this.serviceClient().deleteImmutabilityPolicy(resourceGroupName, accountName, containerName, ifMatch);
        if (inner != null) {
            return new ImmutabilityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ImmutabilityPolicy> lockImmutabilityPolicyWithResponse(String resourceGroupName, String accountName,
        String containerName, String ifMatch, Context context) {
        BlobContainersLockImmutabilityPolicyResponse inner = this.serviceClient()
            .lockImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImmutabilityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImmutabilityPolicy lockImmutabilityPolicy(String resourceGroupName, String accountName, String containerName,
        String ifMatch) {
        ImmutabilityPolicyInner inner
            = this.serviceClient().lockImmutabilityPolicy(resourceGroupName, accountName, containerName, ifMatch);
        if (inner != null) {
            return new ImmutabilityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ImmutabilityPolicy> extendImmutabilityPolicyWithResponse(String resourceGroupName,
        String accountName, String containerName, String ifMatch, ImmutabilityPolicyInner parameters, Context context) {
        BlobContainersExtendImmutabilityPolicyResponse inner = this.serviceClient()
            .extendImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch, parameters,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImmutabilityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImmutabilityPolicy extendImmutabilityPolicy(String resourceGroupName, String accountName,
        String containerName, String ifMatch) {
        ImmutabilityPolicyInner inner
            = this.serviceClient().extendImmutabilityPolicy(resourceGroupName, accountName, containerName, ifMatch);
        if (inner != null) {
            return new ImmutabilityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LeaseContainerResponse> leaseWithResponse(String resourceGroupName, String accountName,
        String containerName, LeaseContainerRequest parameters, Context context) {
        Response<LeaseContainerResponseInner> inner = this.serviceClient()
            .leaseWithResponse(resourceGroupName, accountName, containerName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LeaseContainerResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LeaseContainerResponse lease(String resourceGroupName, String accountName, String containerName) {
        LeaseContainerResponseInner inner = this.serviceClient().lease(resourceGroupName, accountName, containerName);
        if (inner != null) {
            return new LeaseContainerResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void objectLevelWorm(String resourceGroupName, String accountName, String containerName) {
        this.serviceClient().objectLevelWorm(resourceGroupName, accountName, containerName);
    }

    public void objectLevelWorm(String resourceGroupName, String accountName, String containerName, Context context) {
        this.serviceClient().objectLevelWorm(resourceGroupName, accountName, containerName, context);
    }

    public BlobContainer getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, containerName, Context.NONE).getValue();
    }

    public Response<BlobContainer> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, containerName, context);
    }

    public ImmutabilityPolicy getImmutabilityPolicyById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String localIfMatch = null;
        return this
            .getImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, localIfMatch,
                Context.NONE)
            .getValue();
    }

    public Response<ImmutabilityPolicy> getImmutabilityPolicyByIdWithResponse(String id, String ifMatch,
        Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        return this.getImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, containerName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, containerName, context);
    }

    public ImmutabilityPolicy deleteImmutabilityPolicyById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String localIfMatch = null;
        return this
            .deleteImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, localIfMatch,
                Context.NONE)
            .getValue();
    }

    public Response<ImmutabilityPolicy> deleteImmutabilityPolicyByIdWithResponse(String id, String ifMatch,
        Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = ResourceManagerUtils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        return this.deleteImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, ifMatch,
            context);
    }

    private BlobContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    public BlobContainerImpl define(String name) {
        return new BlobContainerImpl(name, this.manager());
    }

    public ImmutabilityPolicyImpl defineImmutabilityPolicy() {
        return new ImmutabilityPolicyImpl(this.manager());
    }
}
