// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.generated.fluent.models.IotHubDescriptionInner;
import java.util.Map;

/** An immutable client-side representation of IotHubDescription. */
public interface IotHubDescription {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the properties property: IotHub properties.
     *
     * @return the properties value.
     */
    IotHubProperties properties();

    /**
     * Gets the sku property: IotHub SKU info.
     *
     * @return the sku value.
     */
    IotHubSkuInfo sku();

    /**
     * Gets the identity property: The managed identities for the IotHub.
     *
     * @return the identity value.
     */
    ArmIdentity identity();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.IotHubDescriptionInner object.
     *
     * @return the inner object.
     */
    IotHubDescriptionInner innerModel();

    /** The entirety of the IotHubDescription definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The IotHubDescription definition stages. */
    interface DefinitionStages {
        /** The first stage of the IotHubDescription definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the IotHubDescription definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the IotHubDescription definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the IoT hub.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the IotHubDescription definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: IotHub SKU info.
             *
             * @param sku IotHub SKU info.
             * @return the next definition stage.
             */
            WithCreate withSku(IotHubSkuInfo sku);
        }
        /**
         * The stage of the IotHubDescription definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithProperties,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IotHubDescription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IotHubDescription create(Context context);
        }
        /** The stage of the IotHubDescription definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the IotHubDescription definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The Etag field is *not* required. If it is provided in the response body, it
             * must also be provided as a header per the normal ETag convention..
             *
             * @param etag The Etag field is *not* required. If it is provided in the response body, it must also be
             *     provided as a header per the normal ETag convention.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the IotHubDescription definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: IotHub properties.
             *
             * @param properties IotHub properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(IotHubProperties properties);
        }
        /** The stage of the IotHubDescription definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed identities for the IotHub..
             *
             * @param identity The managed identities for the IotHub.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ArmIdentity identity);
        }
        /** The stage of the IotHubDescription definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the IoT Hub. Do not specify for creating a brand new IoT Hub.
             * Required to update an existing IoT Hub..
             *
             * @param ifMatch ETag of the IoT Hub. Do not specify for creating a brand new IoT Hub. Required to update
             *     an existing IoT Hub.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the IotHubDescription resource.
     *
     * @return the stage of resource update.
     */
    IotHubDescription.Update update();

    /** The template for IotHubDescription update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IotHubDescription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IotHubDescription apply(Context context);
    }
    /** The IotHubDescription update stages. */
    interface UpdateStages {
        /** The stage of the IotHubDescription update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IotHubDescription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IotHubDescription refresh(Context context);

    /**
     * Get the security metadata for an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security metadata for an IoT hub.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys();

    /**
     * Get the security metadata for an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security metadata for an IoT hub.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(Context context);

    /**
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more
     * information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param exportDevicesParameters The parameters that specify the export devices operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    JobResponse exportDevices(ExportDevicesRequest exportDevicesParameters);

    /**
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more
     * information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param exportDevicesParameters The parameters that specify the export devices operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object along with {@link Response}.
     */
    Response<JobResponse> exportDevicesWithResponse(ExportDevicesRequest exportDevicesParameters, Context context);

    /**
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information,
     * see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param importDevicesParameters The parameters that specify the import devices operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    JobResponse importDevices(ImportDevicesRequest importDevicesParameters);

    /**
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information,
     * see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param importDevicesParameters The parameters that specify the import devices operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object along with {@link Response}.
     */
    Response<JobResponse> importDevicesWithResponse(ImportDevicesRequest importDevicesParameters, Context context);
}
