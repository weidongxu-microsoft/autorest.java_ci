// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DataBoxEdgeDevice. */
public interface DataBoxEdgeDevice {
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
     * Gets the location property: The location of the device. This is a supported and registered Azure geographical
     * region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed
     * once it is created, but if an identical geographical region is specified on update, the request will succeed.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: The list of tags that describe the device. These tags can be used to view and group this
     * device (across resource groups).
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The SKU type.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the etag property: The etag for the devices.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * Gets the kind property: The kind of the device.
     *
     * @return the kind value.
     */
    DataBoxEdgeDeviceKind kind();

    /**
     * Gets the systemData property: DataBoxEdge Resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the systemDataPropertiesSystemData property: DataBoxEdge Device Properties.
     *
     * @return the systemDataPropertiesSystemData value.
     */
    SystemData systemDataPropertiesSystemData();

    /**
     * Gets the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @return the dataBoxEdgeDeviceStatus value.
     */
    DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus();

    /**
     * Gets the serialNumber property: The Serial Number of Data Box Edge/Gateway device.
     *
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @return the modelDescription value.
     */
    String modelDescription();

    /**
     * Gets the deviceType property: The type of the Data Box Edge/Gateway device.
     *
     * @return the deviceType value.
     */
    DeviceType deviceType();

    /**
     * Gets the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the culture property: The Data Box Edge/Gateway device culture.
     *
     * @return the culture value.
     */
    String culture();

    /**
     * Gets the deviceModel property: The Data Box Edge/Gateway device model.
     *
     * @return the deviceModel value.
     */
    String deviceModel();

    /**
     * Gets the deviceSoftwareVersion property: The Data Box Edge/Gateway device software version.
     *
     * @return the deviceSoftwareVersion value.
     */
    String deviceSoftwareVersion();

    /**
     * Gets the deviceLocalCapacity property: The Data Box Edge/Gateway device local capacity in MB.
     *
     * @return the deviceLocalCapacity value.
     */
    Long deviceLocalCapacity();

    /**
     * Gets the timeZone property: The Data Box Edge/Gateway device timezone.
     *
     * @return the timeZone value.
     */
    String timeZone();

    /**
     * Gets the deviceHcsVersion property: The device software version number of the device (eg: 1.2.18105.6).
     *
     * @return the deviceHcsVersion value.
     */
    String deviceHcsVersion();

    /**
     * Gets the configuredRoleTypes property: Type of compute roles configured.
     *
     * @return the configuredRoleTypes value.
     */
    List<RoleTypes> configuredRoleTypes();

    /**
     * Gets the nodeCount property: The number of nodes in the cluster.
     *
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * Gets the resourceMoveDetails property: The details of the move operation on this resource.
     *
     * @return the resourceMoveDetails value.
     */
    ResourceMoveDetails resourceMoveDetails();

    /**
     * Gets the edgeProfile property: The details of Edge Profile for this resource.
     *
     * @return the edgeProfile value.
     */
    EdgeProfile edgeProfile();

    /**
     * Gets the dataResidency property: The details of data-residency related properties for this resource.
     *
     * @return the dataResidency value.
     */
    DataResidency dataResidency();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner object.
     *
     * @return the inner object.
     */
    DataBoxEdgeDeviceInner innerModel();

    /** The entirety of the DataBoxEdgeDevice definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DataBoxEdgeDevice definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataBoxEdgeDevice definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the device. This is a supported and registered Azure geographical region
             *     (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be
             *     changed once it is created, but if an identical geographical region is specified on update, the
             *     request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the device. This is a supported and registered Azure geographical region
             *     (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be
             *     changed once it is created, but if an identical geographical region is specified on update, the
             *     request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the DataBoxEdgeDevice definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithEtag,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithDataResidency {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataBoxEdgeDevice create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataBoxEdgeDevice create(Context context);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The list of tags that describe the device. These tags can be used to view
             * and group this device (across resource groups)..
             *
             * @param tags The list of tags that describe the device. These tags can be used to view and group this
             *     device (across resource groups).
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU type..
             *
             * @param sku The SKU type.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The etag for the devices..
             *
             * @param etag The etag for the devices.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Msi identity of the resource.
             *
             * @param identity Msi identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify dataResidency. */
        interface WithDataResidency {
            /**
             * Specifies the dataResidency property: The details of data-residency related properties for this resource.
             *
             * @param dataResidency The details of data-residency related properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withDataResidency(DataResidency dataResidency);
        }
    }
    /**
     * Begins update for the DataBoxEdgeDevice resource.
     *
     * @return the stage of resource update.
     */
    DataBoxEdgeDevice.Update update();

    /** The template for DataBoxEdgeDevice update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithEdgeProfile {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataBoxEdgeDevice apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataBoxEdgeDevice apply(Context context);
    }
    /** The DataBoxEdgeDevice update stages. */
    interface UpdateStages {
        /** The stage of the DataBoxEdgeDevice update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags attached to the Data Box Edge/Gateway resource..
             *
             * @param tags The tags attached to the Data Box Edge/Gateway resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DataBoxEdgeDevice update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Msi identity of the resource.
             *
             * @param identity Msi identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(ResourceIdentity identity);
        }
        /** The stage of the DataBoxEdgeDevice update allowing to specify edgeProfile. */
        interface WithEdgeProfile {
            /**
             * Specifies the edgeProfile property: Edge Profile property of the Data Box Edge/Gateway device.
             *
             * @param edgeProfile Edge Profile property of the Data Box Edge/Gateway device.
             * @return the next definition stage.
             */
            Update withEdgeProfile(EdgeProfilePatch edgeProfile);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DataBoxEdgeDevice refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataBoxEdgeDevice refresh(Context context);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void downloadUpdates();

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void downloadUpdates(Context context);

    /**
     * Generates certificate for activation key.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow.
     */
    GenerateCertResponse generateCertificate();

    /**
     * Generates certificate for activation key.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow along with {@link Response}.
     */
    Response<GenerateCertResponse> generateCertificateWithResponse(Context context);

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device.
     */
    DataBoxEdgeDeviceExtendedInfo getExtendedInformation();

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device along with {@link
     *     Response}.
     */
    Response<DataBoxEdgeDeviceExtendedInfo> getExtendedInformationWithResponse(Context context);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void installUpdates();

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void installUpdates(Context context);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scanForUpdates();

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scanForUpdates(Context context);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param parameters The patch object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device.
     */
    DataBoxEdgeDeviceExtendedInfo updateExtendedInformation(DataBoxEdgeDeviceExtendedInfoPatch parameters);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param parameters The patch object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device along with {@link
     *     Response}.
     */
    Response<DataBoxEdgeDeviceExtendedInfo> updateExtendedInformationWithResponse(
        DataBoxEdgeDeviceExtendedInfoPatch parameters, Context context);

    /**
     * Uploads registration certificate for the device.
     *
     * @param parameters The upload certificate request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response.
     */
    UploadCertificateResponse uploadCertificate(UploadCertificateRequest parameters);

    /**
     * Uploads registration certificate for the device.
     *
     * @param parameters The upload certificate request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response along with {@link Response}.
     */
    Response<UploadCertificateResponse> uploadCertificateWithResponse(
        UploadCertificateRequest parameters, Context context);
}
