// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RetrieveBootDiagnosticsDataResultInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandResultInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.InstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.RetrieveBootDiagnosticsDataResult;
import com.azure.resourcemanager.compute.generated.models.RunCommandInput;
import com.azure.resourcemanager.compute.generated.models.RunCommandResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVM;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMReimageParameters;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMs;

public final class VirtualMachineScaleSetVMsImpl implements VirtualMachineScaleSetVMs {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetVMsImpl.class);

    private final VirtualMachineScaleSetVMsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineScaleSetVMsImpl(
        VirtualMachineScaleSetVMsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMReimageParameters vmScaleSetVMReimageInput) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName, instanceId, vmScaleSetVMReimageInput);
    }

    public void reimage(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMReimageParameters vmScaleSetVMReimageInput,
        Context context) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName, instanceId, vmScaleSetVMReimageInput, context);
    }

    public void reimageAll(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().reimageAll(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void reimageAll(String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().reimageAll(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public void deallocate(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().deallocate(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void deallocate(String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().deallocate(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public VirtualMachineScaleSetVM update(
        String resourceGroupName, String vmScaleSetName, String instanceId, VirtualMachineScaleSetVMInner parameters) {
        VirtualMachineScaleSetVMInner inner =
            this.serviceClient().update(resourceGroupName, vmScaleSetName, instanceId, parameters);
        if (inner != null) {
            return new VirtualMachineScaleSetVMImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineScaleSetVM update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMInner parameters,
        Context context) {
        VirtualMachineScaleSetVMInner inner =
            this.serviceClient().update(resourceGroupName, vmScaleSetName, instanceId, parameters, context);
        if (inner != null) {
            return new VirtualMachineScaleSetVMImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId, Boolean forceDeletion) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, forceDeletion);
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, Boolean forceDeletion, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, forceDeletion, context);
    }

    public Response<VirtualMachineScaleSetVM> getWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, InstanceViewTypes expand, Context context) {
        Response<VirtualMachineScaleSetVMInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vmScaleSetName, instanceId, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetVMImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineScaleSetVM get(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMInner inner = this.serviceClient().get(resourceGroupName, vmScaleSetName, instanceId);
        if (inner != null) {
            return new VirtualMachineScaleSetVMImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetVMInstanceView> getInstanceViewWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        Response<VirtualMachineScaleSetVMInstanceViewInner> inner =
            this.serviceClient().getInstanceViewWithResponse(resourceGroupName, vmScaleSetName, instanceId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetVMInstanceViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineScaleSetVMInstanceView getInstanceView(
        String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMInstanceViewInner inner =
            this.serviceClient().getInstanceView(resourceGroupName, vmScaleSetName, instanceId);
        if (inner != null) {
            return new VirtualMachineScaleSetVMInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineScaleSetVM> list(String resourceGroupName, String virtualMachineScaleSetName) {
        PagedIterable<VirtualMachineScaleSetVMInner> inner =
            this.serviceClient().list(resourceGroupName, virtualMachineScaleSetName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetVMImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSetVM> list(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String filter,
        String select,
        String expand,
        Context context) {
        PagedIterable<VirtualMachineScaleSetVMInner> inner =
            this.serviceClient().list(resourceGroupName, virtualMachineScaleSetName, filter, select, expand, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetVMImpl(inner1, this.manager()));
    }

    public void powerOff(String resourceGroupName, String vmScaleSetName, String instanceId, Boolean skipShutdown) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName, instanceId, skipShutdown);
    }

    public void powerOff(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void powerOff(
        String resourceGroupName, String vmScaleSetName, String instanceId, Boolean skipShutdown, Context context) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName, instanceId, skipShutdown, context);
    }

    public void restart(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().restart(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void restart(String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().restart(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public void start(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().start(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void start(String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().start(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public void redeploy(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().redeploy(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void redeploy(String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().redeploy(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public Response<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        Integer sasUriExpirationTimeInMinutes,
        Context context) {
        Response<RetrieveBootDiagnosticsDataResultInner> inner =
            this
                .serviceClient()
                .retrieveBootDiagnosticsDataWithResponse(
                    resourceGroupName, vmScaleSetName, instanceId, sasUriExpirationTimeInMinutes, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RetrieveBootDiagnosticsDataResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RetrieveBootDiagnosticsDataResult retrieveBootDiagnosticsData(
        String resourceGroupName, String vmScaleSetName, String instanceId) {
        RetrieveBootDiagnosticsDataResultInner inner =
            this.serviceClient().retrieveBootDiagnosticsData(resourceGroupName, vmScaleSetName, instanceId);
        if (inner != null) {
            return new RetrieveBootDiagnosticsDataResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void performMaintenance(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().performMaintenance(resourceGroupName, vmScaleSetName, instanceId);
    }

    public void performMaintenance(
        String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        this.serviceClient().performMaintenance(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public Response<Void> simulateEvictionWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, Context context) {
        return this
            .serviceClient()
            .simulateEvictionWithResponse(resourceGroupName, vmScaleSetName, instanceId, context);
    }

    public void simulateEviction(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.serviceClient().simulateEviction(resourceGroupName, vmScaleSetName, instanceId);
    }

    public RunCommandResult runCommand(
        String resourceGroupName, String vmScaleSetName, String instanceId, RunCommandInput parameters) {
        RunCommandResultInner inner =
            this.serviceClient().runCommand(resourceGroupName, vmScaleSetName, instanceId, parameters);
        if (inner != null) {
            return new RunCommandResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RunCommandResult runCommand(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        RunCommandInput parameters,
        Context context) {
        RunCommandResultInner inner =
            this.serviceClient().runCommand(resourceGroupName, vmScaleSetName, instanceId, parameters, context);
        if (inner != null) {
            return new RunCommandResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private VirtualMachineScaleSetVMsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
