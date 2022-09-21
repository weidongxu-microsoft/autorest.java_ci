// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of BlobContainer. */
public interface BlobContainer {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the version property: The version of the deleted blob container.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the deleted property: Indicates whether the blob container was deleted.
     *
     * @return the deleted value.
     */
    Boolean deleted();

    /**
     * Gets the deletedTime property: Blob container deletion time.
     *
     * @return the deletedTime value.
     */
    OffsetDateTime deletedTime();

    /**
     * Gets the remainingRetentionDays property: Remaining retention days for soft deleted blob container.
     *
     * @return the remainingRetentionDays value.
     */
    Integer remainingRetentionDays();

    /**
     * Gets the defaultEncryptionScope property: Default the container to use specified encryption scope for all writes.
     *
     * @return the defaultEncryptionScope value.
     */
    String defaultEncryptionScope();

    /**
     * Gets the denyEncryptionScopeOverride property: Block override of encryption scope from the container default.
     *
     * @return the denyEncryptionScopeOverride value.
     */
    Boolean denyEncryptionScopeOverride();

    /**
     * Gets the publicAccess property: Specifies whether data in the container may be accessed publicly and the level of
     * access.
     *
     * @return the publicAccess value.
     */
    PublicAccess publicAccess();

    /**
     * Gets the lastModifiedTime property: Returns the date and time the container was last modified.
     *
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the leaseStatus property: The lease status of the container.
     *
     * @return the leaseStatus value.
     */
    LeaseStatus leaseStatus();

    /**
     * Gets the leaseState property: Lease state of the container.
     *
     * @return the leaseState value.
     */
    LeaseState leaseState();

    /**
     * Gets the leaseDuration property: Specifies whether the lease on a container is of infinite or fixed duration,
     * only when the container is leased.
     *
     * @return the leaseDuration value.
     */
    LeaseDuration leaseDuration();

    /**
     * Gets the metadata property: A name-value pair to associate with the container as metadata.
     *
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * Gets the immutabilityPolicy property: The ImmutabilityPolicy property of the container.
     *
     * @return the immutabilityPolicy value.
     */
    ImmutabilityPolicyProperties immutabilityPolicy();

    /**
     * Gets the legalHold property: The LegalHold property of the container.
     *
     * @return the legalHold value.
     */
    LegalHoldProperties legalHold();

    /**
     * Gets the hasLegalHold property: The hasLegalHold public property is set to true by SRP if there are at least one
     * existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared
     * out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value.
     */
    Boolean hasLegalHold();

    /**
     * Gets the hasImmutabilityPolicy property: The hasImmutabilityPolicy public property is set to true by SRP if
     * ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false
     * by SRP if ImmutabilityPolicy has not been created for this container.
     *
     * @return the hasImmutabilityPolicy value.
     */
    Boolean hasImmutabilityPolicy();

    /**
     * Gets the immutableStorageWithVersioning property: The object level immutability property of the container. The
     * property is immutable and can only be set to true at the container creation time. Existing containers must
     * undergo a migration process.
     *
     * @return the immutableStorageWithVersioning value.
     */
    ImmutableStorageWithVersioning immutableStorageWithVersioning();

    /**
     * Gets the enableNfsV3RootSquash property: Enable NFSv3 root squash on blob container.
     *
     * @return the enableNfsV3RootSquash value.
     */
    Boolean enableNfsV3RootSquash();

    /**
     * Gets the enableNfsV3AllSquash property: Enable NFSv3 all squash on blob container.
     *
     * @return the enableNfsV3AllSquash value.
     */
    Boolean enableNfsV3AllSquash();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.BlobContainerInner object.
     *
     * @return the inner object.
     */
    BlobContainerInner innerModel();

    /** The entirety of the BlobContainer definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The BlobContainer definition stages. */
    interface DefinitionStages {
        /** The first stage of the BlobContainer definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the BlobContainer definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             *     names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the BlobContainer definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDefaultEncryptionScope,
                DefinitionStages.WithDenyEncryptionScopeOverride,
                DefinitionStages.WithPublicAccess,
                DefinitionStages.WithMetadata,
                DefinitionStages.WithImmutableStorageWithVersioning,
                DefinitionStages.WithEnableNfsV3RootSquash,
                DefinitionStages.WithEnableNfsV3AllSquash {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BlobContainer create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BlobContainer create(Context context);
        }
        /** The stage of the BlobContainer definition allowing to specify defaultEncryptionScope. */
        interface WithDefaultEncryptionScope {
            /**
             * Specifies the defaultEncryptionScope property: Default the container to use specified encryption scope
             * for all writes..
             *
             * @param defaultEncryptionScope Default the container to use specified encryption scope for all writes.
             * @return the next definition stage.
             */
            WithCreate withDefaultEncryptionScope(String defaultEncryptionScope);
        }
        /** The stage of the BlobContainer definition allowing to specify denyEncryptionScopeOverride. */
        interface WithDenyEncryptionScopeOverride {
            /**
             * Specifies the denyEncryptionScopeOverride property: Block override of encryption scope from the container
             * default..
             *
             * @param denyEncryptionScopeOverride Block override of encryption scope from the container default.
             * @return the next definition stage.
             */
            WithCreate withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride);
        }
        /** The stage of the BlobContainer definition allowing to specify publicAccess. */
        interface WithPublicAccess {
            /**
             * Specifies the publicAccess property: Specifies whether data in the container may be accessed publicly and
             * the level of access..
             *
             * @param publicAccess Specifies whether data in the container may be accessed publicly and the level of
             *     access.
             * @return the next definition stage.
             */
            WithCreate withPublicAccess(PublicAccess publicAccess);
        }
        /** The stage of the BlobContainer definition allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: A name-value pair to associate with the container as metadata..
             *
             * @param metadata A name-value pair to associate with the container as metadata.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Map<String, String> metadata);
        }
        /** The stage of the BlobContainer definition allowing to specify immutableStorageWithVersioning. */
        interface WithImmutableStorageWithVersioning {
            /**
             * Specifies the immutableStorageWithVersioning property: The object level immutability property of the
             * container. The property is immutable and can only be set to true at the container creation time. Existing
             * containers must undergo a migration process..
             *
             * @param immutableStorageWithVersioning The object level immutability property of the container. The
             *     property is immutable and can only be set to true at the container creation time. Existing containers
             *     must undergo a migration process.
             * @return the next definition stage.
             */
            WithCreate withImmutableStorageWithVersioning(
                ImmutableStorageWithVersioning immutableStorageWithVersioning);
        }
        /** The stage of the BlobContainer definition allowing to specify enableNfsV3RootSquash. */
        interface WithEnableNfsV3RootSquash {
            /**
             * Specifies the enableNfsV3RootSquash property: Enable NFSv3 root squash on blob container..
             *
             * @param enableNfsV3RootSquash Enable NFSv3 root squash on blob container.
             * @return the next definition stage.
             */
            WithCreate withEnableNfsV3RootSquash(Boolean enableNfsV3RootSquash);
        }
        /** The stage of the BlobContainer definition allowing to specify enableNfsV3AllSquash. */
        interface WithEnableNfsV3AllSquash {
            /**
             * Specifies the enableNfsV3AllSquash property: Enable NFSv3 all squash on blob container..
             *
             * @param enableNfsV3AllSquash Enable NFSv3 all squash on blob container.
             * @return the next definition stage.
             */
            WithCreate withEnableNfsV3AllSquash(Boolean enableNfsV3AllSquash);
        }
    }
    /**
     * Begins update for the BlobContainer resource.
     *
     * @return the stage of resource update.
     */
    BlobContainer.Update update();

    /** The template for BlobContainer update. */
    interface Update
        extends UpdateStages.WithDefaultEncryptionScope,
            UpdateStages.WithDenyEncryptionScopeOverride,
            UpdateStages.WithPublicAccess,
            UpdateStages.WithMetadata,
            UpdateStages.WithImmutableStorageWithVersioning,
            UpdateStages.WithEnableNfsV3RootSquash,
            UpdateStages.WithEnableNfsV3AllSquash {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BlobContainer apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BlobContainer apply(Context context);
    }
    /** The BlobContainer update stages. */
    interface UpdateStages {
        /** The stage of the BlobContainer update allowing to specify defaultEncryptionScope. */
        interface WithDefaultEncryptionScope {
            /**
             * Specifies the defaultEncryptionScope property: Default the container to use specified encryption scope
             * for all writes..
             *
             * @param defaultEncryptionScope Default the container to use specified encryption scope for all writes.
             * @return the next definition stage.
             */
            Update withDefaultEncryptionScope(String defaultEncryptionScope);
        }
        /** The stage of the BlobContainer update allowing to specify denyEncryptionScopeOverride. */
        interface WithDenyEncryptionScopeOverride {
            /**
             * Specifies the denyEncryptionScopeOverride property: Block override of encryption scope from the container
             * default..
             *
             * @param denyEncryptionScopeOverride Block override of encryption scope from the container default.
             * @return the next definition stage.
             */
            Update withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride);
        }
        /** The stage of the BlobContainer update allowing to specify publicAccess. */
        interface WithPublicAccess {
            /**
             * Specifies the publicAccess property: Specifies whether data in the container may be accessed publicly and
             * the level of access..
             *
             * @param publicAccess Specifies whether data in the container may be accessed publicly and the level of
             *     access.
             * @return the next definition stage.
             */
            Update withPublicAccess(PublicAccess publicAccess);
        }
        /** The stage of the BlobContainer update allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: A name-value pair to associate with the container as metadata..
             *
             * @param metadata A name-value pair to associate with the container as metadata.
             * @return the next definition stage.
             */
            Update withMetadata(Map<String, String> metadata);
        }
        /** The stage of the BlobContainer update allowing to specify immutableStorageWithVersioning. */
        interface WithImmutableStorageWithVersioning {
            /**
             * Specifies the immutableStorageWithVersioning property: The object level immutability property of the
             * container. The property is immutable and can only be set to true at the container creation time. Existing
             * containers must undergo a migration process..
             *
             * @param immutableStorageWithVersioning The object level immutability property of the container. The
             *     property is immutable and can only be set to true at the container creation time. Existing containers
             *     must undergo a migration process.
             * @return the next definition stage.
             */
            Update withImmutableStorageWithVersioning(ImmutableStorageWithVersioning immutableStorageWithVersioning);
        }
        /** The stage of the BlobContainer update allowing to specify enableNfsV3RootSquash. */
        interface WithEnableNfsV3RootSquash {
            /**
             * Specifies the enableNfsV3RootSquash property: Enable NFSv3 root squash on blob container..
             *
             * @param enableNfsV3RootSquash Enable NFSv3 root squash on blob container.
             * @return the next definition stage.
             */
            Update withEnableNfsV3RootSquash(Boolean enableNfsV3RootSquash);
        }
        /** The stage of the BlobContainer update allowing to specify enableNfsV3AllSquash. */
        interface WithEnableNfsV3AllSquash {
            /**
             * Specifies the enableNfsV3AllSquash property: Enable NFSv3 all squash on blob container..
             *
             * @param enableNfsV3AllSquash Enable NFSv3 all squash on blob container.
             * @return the next definition stage.
             */
            Update withEnableNfsV3AllSquash(Boolean enableNfsV3AllSquash);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BlobContainer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BlobContainer refresh(Context context);

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param legalHold The LegalHold property that will be set to a blob container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container along with {@link Response}.
     */
    Response<LegalHold> setLegalHoldWithResponse(LegalHoldInner legalHold, Context context);

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param legalHold The LegalHold property that will be set to a blob container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    LegalHold setLegalHold(LegalHoldInner legalHold);

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param legalHold The LegalHold property that will be clear from a blob container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container along with {@link Response}.
     */
    Response<LegalHold> clearLegalHoldWithResponse(LegalHoldInner legalHold, Context context);

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param legalHold The LegalHold property that will be clear from a blob container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    LegalHold clearLegalHold(LegalHoldInner legalHold);

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param parameters Lease Container request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema along with {@link Response}.
     */
    Response<LeaseContainerResponse> leaseWithResponse(LeaseContainerRequest parameters, Context context);

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    LeaseContainerResponse lease();

    /**
     * This operation migrates a blob container from container level WORM to object level immutability enabled
     * container. Prerequisites require a container level immutability policy either in locked or unlocked state,
     * Account level versioning must be enabled and there should be no Legal hold on the container.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void objectLevelWorm();

    /**
     * This operation migrates a blob container from container level WORM to object level immutability enabled
     * container. Prerequisites require a container level immutability policy either in locked or unlocked state,
     * Account level versioning must be enabled and there should be no Legal hold on the container.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void objectLevelWorm(Context context);
}
