// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Devices. */
public interface Devices {
    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a subscription.
     */
    PagedIterable<DataBoxEdgeDevice> list();

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a subscription.
     *
     * @param expand Specify $expand=details to populate additional fields related to the resource or Specify
     *     $skipToken=&lt;token&gt; to populate the next page in the list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a subscription.
     */
    PagedIterable<DataBoxEdgeDevice> list(String expand, Context context);

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a resource group.
     */
    PagedIterable<DataBoxEdgeDevice> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param expand Specify $expand=details to populate additional fields related to the resource or Specify
     *     $skipToken=&lt;token&gt; to populate the next page in the list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a resource group.
     */
    PagedIterable<DataBoxEdgeDevice> listByResourceGroup(String resourceGroupName, String expand, Context context);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device.
     */
    DataBoxEdgeDevice getByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    Response<DataBoxEdgeDevice> getByResourceGroupWithResponse(
        String resourceGroupName, String deviceName, Context context);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String deviceName, Context context);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void downloadUpdates(String deviceName, String resourceGroupName);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void downloadUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Generates certificate for activation key.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow.
     */
    GenerateCertResponse generateCertificate(String deviceName, String resourceGroupName);

    /**
     * Generates certificate for activation key.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow along with {@link Response}.
     */
    Response<GenerateCertResponse> generateCertificateWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device.
     */
    DataBoxEdgeDeviceExtendedInfo getExtendedInformation(String deviceName, String resourceGroupName);

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device along with {@link
     *     Response}.
     */
    Response<DataBoxEdgeDeviceExtendedInfo> getExtendedInformationWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void installUpdates(String deviceName, String resourceGroupName);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void installUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the network settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network settings of the specified Data Box Edge/Data Box Gateway device.
     */
    NetworkSettings getNetworkSettings(String deviceName, String resourceGroupName);

    /**
     * Gets the network settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network settings of the specified Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    Response<NetworkSettings> getNetworkSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scanForUpdates(String deviceName, String resourceGroupName);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scanForUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createOrUpdateSecuritySettings(String deviceName, String resourceGroupName, SecuritySettings securitySettings);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings, Context context);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The patch object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device.
     */
    DataBoxEdgeDeviceExtendedInfo updateExtendedInformation(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceExtendedInfoPatch parameters);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The patch object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device along with {@link
     *     Response}.
     */
    Response<DataBoxEdgeDeviceExtendedInfo> updateExtendedInformationWithResponse(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceExtendedInfoPatch parameters, Context context);

    /**
     * Gets information about the availability of updates based on the last scan of the device. It also gets information
     * about any ongoing download or install jobs on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the availability of updates based on the last scan of the device.
     */
    UpdateSummary getUpdateSummary(String deviceName, String resourceGroupName);

    /**
     * Gets information about the availability of updates based on the last scan of the device. It also gets information
     * about any ongoing download or install jobs on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the availability of updates based on the last scan of the device along with {@link
     *     Response}.
     */
    Response<UpdateSummary> getUpdateSummaryWithResponse(String deviceName, String resourceGroupName, Context context);

    /**
     * Uploads registration certificate for the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The upload certificate request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response.
     */
    UploadCertificateResponse uploadCertificate(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters);

    /**
     * Uploads registration certificate for the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The upload certificate request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response along with {@link Response}.
     */
    Response<UploadCertificateResponse> uploadCertificateWithResponse(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters, Context context);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    DataBoxEdgeDevice getById(String id);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    Response<DataBoxEdgeDevice> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DataBoxEdgeDevice resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataBoxEdgeDevice definition.
     */
    DataBoxEdgeDevice.DefinitionStages.Blank define(String name);
}
