// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.generated.fluent.models.CertificateDescriptionInner;

/**
 * An immutable client-side representation of CertificateDescription.
 */
public interface CertificateDescription {
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
     * Gets the properties property: The description of an X509 CA Certificate.
     * 
     * @return the properties value.
     */
    CertificateProperties properties();

    /**
     * Gets the etag property: The entity tag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.CertificateDescriptionInner object.
     * 
     * @return the inner object.
     */
    CertificateDescriptionInner innerModel();

    /**
     * The entirety of the CertificateDescription definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The CertificateDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the CertificateDescription definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the CertificateDescription definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             * 
             * @param resourceGroupName The name of the resource group that contains the IoT hub.
             * @param resourceName The name of the IoT hub.
             * @return the next definition stage.
             */
            WithCreate withExistingIotHub(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the CertificateDescription definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties, DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            CertificateDescription create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CertificateDescription create(Context context);
        }

        /**
         * The stage of the CertificateDescription definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The description of an X509 CA Certificate..
             * 
             * @param properties The description of an X509 CA Certificate.
             * @return the next definition stage.
             */
            WithCreate withProperties(CertificateProperties properties);
        }

        /**
         * The stage of the CertificateDescription definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Certificate. Do not specify for creating a brand new certificate. Required to update an existing certificate..
             * 
             * @param ifMatch ETag of the Certificate. Do not specify for creating a brand new certificate. Required to update an existing certificate.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the CertificateDescription resource.
     * 
     * @return the stage of resource update.
     */
    CertificateDescription.Update update();

    /**
     * The template for CertificateDescription update.
     */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        CertificateDescription apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CertificateDescription apply(Context context);
    }

    /**
     * The CertificateDescription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the CertificateDescription update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The description of an X509 CA Certificate..
             * 
             * @param properties The description of an X509 CA Certificate.
             * @return the next definition stage.
             */
            Update withProperties(CertificateProperties properties);
        }

        /**
         * The stage of the CertificateDescription update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Certificate. Do not specify for creating a brand new certificate. Required to update an existing certificate..
             * 
             * @param ifMatch ETag of the Certificate. Do not specify for creating a brand new certificate. Required to update an existing certificate.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    CertificateDescription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CertificateDescription refresh(Context context);
}
