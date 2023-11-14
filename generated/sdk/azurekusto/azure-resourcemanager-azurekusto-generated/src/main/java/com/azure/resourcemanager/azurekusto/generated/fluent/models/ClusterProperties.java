// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurekusto.generated.models.AcceptedAudiences;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterNetworkAccessFlag;
import com.azure.resourcemanager.azurekusto.generated.models.EngineType;
import com.azure.resourcemanager.azurekusto.generated.models.KeyVaultProperties;
import com.azure.resourcemanager.azurekusto.generated.models.LanguageExtensionsList;
import com.azure.resourcemanager.azurekusto.generated.models.MigrationClusterProperties;
import com.azure.resourcemanager.azurekusto.generated.models.OptimizedAutoscale;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.azure.resourcemanager.azurekusto.generated.models.PublicIpType;
import com.azure.resourcemanager.azurekusto.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.azurekusto.generated.models.State;
import com.azure.resourcemanager.azurekusto.generated.models.TrustedExternalTenant;
import com.azure.resourcemanager.azurekusto.generated.models.VirtualNetworkConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Class representing the Kusto cluster properties.
 */
@Fluent
public final class ClusterProperties {
    /*
     * The state of the resource.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The cluster URI.
     */
    @JsonProperty(value = "uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * The cluster data ingestion URI.
     */
    @JsonProperty(value = "dataIngestionUri", access = JsonProperty.Access.WRITE_ONLY)
    private String dataIngestionUri;

    /*
     * The reason for the cluster's current state.
     */
    @JsonProperty(value = "stateReason", access = JsonProperty.Access.WRITE_ONLY)
    private String stateReason;

    /*
     * The cluster's external tenants.
     */
    @JsonProperty(value = "trustedExternalTenants")
    private List<TrustedExternalTenant> trustedExternalTenants;

    /*
     * Optimized auto scale definition.
     */
    @JsonProperty(value = "optimizedAutoscale")
    private OptimizedAutoscale optimizedAutoscale;

    /*
     * A boolean value that indicates if the cluster's disks are encrypted.
     */
    @JsonProperty(value = "enableDiskEncryption")
    private Boolean enableDiskEncryption;

    /*
     * A boolean value that indicates if the streaming ingest is enabled.
     */
    @JsonProperty(value = "enableStreamingIngest")
    private Boolean enableStreamingIngest;

    /*
     * Virtual network definition.
     */
    @JsonProperty(value = "virtualNetworkConfiguration")
    private VirtualNetworkConfiguration virtualNetworkConfiguration;

    /*
     * KeyVault properties for the cluster encryption.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * A boolean value that indicates if the purge operations are enabled.
     */
    @JsonProperty(value = "enablePurge")
    private Boolean enablePurge;

    /*
     * List of the cluster's language extensions.
     */
    @JsonProperty(value = "languageExtensions")
    private LanguageExtensionsList languageExtensions;

    /*
     * A boolean value that indicates if double encryption is enabled.
     */
    @JsonProperty(value = "enableDoubleEncryption")
    private Boolean enableDoubleEncryption;

    /*
     * Public network access to the cluster is enabled by default. When disabled, only private endpoint connection to
     * the cluster is allowed
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The list of ips in the format of CIDR allowed to connect to the cluster.
     */
    @JsonProperty(value = "allowedIpRangeList")
    private List<String> allowedIpRangeList;

    /*
     * The engine type
     */
    @JsonProperty(value = "engineType")
    private EngineType engineType;

    /*
     * The cluster's accepted audiences.
     */
    @JsonProperty(value = "acceptedAudiences")
    private List<AcceptedAudiences> acceptedAudiences;

    /*
     * A boolean value that indicates if the cluster could be automatically stopped (due to lack of data or no activity
     * for many days).
     */
    @JsonProperty(value = "enableAutoStop")
    private Boolean enableAutoStop;

    /*
     * Whether or not to restrict outbound network access. Value is optional but if passed in, must be 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "restrictOutboundNetworkAccess")
    private ClusterNetworkAccessFlag restrictOutboundNetworkAccess;

    /*
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     */
    @JsonProperty(value = "allowedFqdnList")
    private List<String> allowedFqdnList;

    /*
     * Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6)
     */
    @JsonProperty(value = "publicIPType")
    private PublicIpType publicIpType;

    /*
     * Virtual Cluster graduation properties
     */
    @JsonProperty(value = "virtualClusterGraduationProperties")
    private String virtualClusterGraduationProperties;

    /*
     * A list of private endpoint connections.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Properties of the peer cluster involved in a migration to/from this cluster.
     */
    @JsonProperty(value = "migrationCluster", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationClusterProperties migrationCluster;

    /**
     * Creates an instance of ClusterProperties class.
     */
    public ClusterProperties() {
    }

    /**
     * Get the state property: The state of the resource.
     * 
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uri property: The cluster URI.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the dataIngestionUri property: The cluster data ingestion URI.
     * 
     * @return the dataIngestionUri value.
     */
    public String dataIngestionUri() {
        return this.dataIngestionUri;
    }

    /**
     * Get the stateReason property: The reason for the cluster's current state.
     * 
     * @return the stateReason value.
     */
    public String stateReason() {
        return this.stateReason;
    }

    /**
     * Get the trustedExternalTenants property: The cluster's external tenants.
     * 
     * @return the trustedExternalTenants value.
     */
    public List<TrustedExternalTenant> trustedExternalTenants() {
        return this.trustedExternalTenants;
    }

    /**
     * Set the trustedExternalTenants property: The cluster's external tenants.
     * 
     * @param trustedExternalTenants the trustedExternalTenants value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants) {
        this.trustedExternalTenants = trustedExternalTenants;
        return this;
    }

    /**
     * Get the optimizedAutoscale property: Optimized auto scale definition.
     * 
     * @return the optimizedAutoscale value.
     */
    public OptimizedAutoscale optimizedAutoscale() {
        return this.optimizedAutoscale;
    }

    /**
     * Set the optimizedAutoscale property: Optimized auto scale definition.
     * 
     * @param optimizedAutoscale the optimizedAutoscale value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale) {
        this.optimizedAutoscale = optimizedAutoscale;
        return this;
    }

    /**
     * Get the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are encrypted.
     * 
     * @return the enableDiskEncryption value.
     */
    public Boolean enableDiskEncryption() {
        return this.enableDiskEncryption;
    }

    /**
     * Set the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are encrypted.
     * 
     * @param enableDiskEncryption the enableDiskEncryption value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEnableDiskEncryption(Boolean enableDiskEncryption) {
        this.enableDiskEncryption = enableDiskEncryption;
        return this;
    }

    /**
     * Get the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     * 
     * @return the enableStreamingIngest value.
     */
    public Boolean enableStreamingIngest() {
        return this.enableStreamingIngest;
    }

    /**
     * Set the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     * 
     * @param enableStreamingIngest the enableStreamingIngest value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEnableStreamingIngest(Boolean enableStreamingIngest) {
        this.enableStreamingIngest = enableStreamingIngest;
        return this;
    }

    /**
     * Get the virtualNetworkConfiguration property: Virtual network definition.
     * 
     * @return the virtualNetworkConfiguration value.
     */
    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }

    /**
     * Set the virtualNetworkConfiguration property: Virtual network definition.
     * 
     * @param virtualNetworkConfiguration the virtualNetworkConfiguration value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration) {
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        return this;
    }

    /**
     * Get the keyVaultProperties property: KeyVault properties for the cluster encryption.
     * 
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: KeyVault properties for the cluster encryption.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     * 
     * @return the enablePurge value.
     */
    public Boolean enablePurge() {
        return this.enablePurge;
    }

    /**
     * Set the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     * 
     * @param enablePurge the enablePurge value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEnablePurge(Boolean enablePurge) {
        this.enablePurge = enablePurge;
        return this;
    }

    /**
     * Get the languageExtensions property: List of the cluster's language extensions.
     * 
     * @return the languageExtensions value.
     */
    public LanguageExtensionsList languageExtensions() {
        return this.languageExtensions;
    }

    /**
     * Set the languageExtensions property: List of the cluster's language extensions.
     * 
     * @param languageExtensions the languageExtensions value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withLanguageExtensions(LanguageExtensionsList languageExtensions) {
        this.languageExtensions = languageExtensions;
        return this;
    }

    /**
     * Get the enableDoubleEncryption property: A boolean value that indicates if double encryption is enabled.
     * 
     * @return the enableDoubleEncryption value.
     */
    public Boolean enableDoubleEncryption() {
        return this.enableDoubleEncryption;
    }

    /**
     * Set the enableDoubleEncryption property: A boolean value that indicates if double encryption is enabled.
     * 
     * @param enableDoubleEncryption the enableDoubleEncryption value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEnableDoubleEncryption(Boolean enableDoubleEncryption) {
        this.enableDoubleEncryption = enableDoubleEncryption;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Public network access to the cluster is enabled by default. When disabled,
     * only private endpoint connection to the cluster is allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Public network access to the cluster is enabled by default. When disabled,
     * only private endpoint connection to the cluster is allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the allowedIpRangeList property: The list of ips in the format of CIDR allowed to connect to the cluster.
     * 
     * @return the allowedIpRangeList value.
     */
    public List<String> allowedIpRangeList() {
        return this.allowedIpRangeList;
    }

    /**
     * Set the allowedIpRangeList property: The list of ips in the format of CIDR allowed to connect to the cluster.
     * 
     * @param allowedIpRangeList the allowedIpRangeList value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withAllowedIpRangeList(List<String> allowedIpRangeList) {
        this.allowedIpRangeList = allowedIpRangeList;
        return this;
    }

    /**
     * Get the engineType property: The engine type.
     * 
     * @return the engineType value.
     */
    public EngineType engineType() {
        return this.engineType;
    }

    /**
     * Set the engineType property: The engine type.
     * 
     * @param engineType the engineType value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEngineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * Get the acceptedAudiences property: The cluster's accepted audiences.
     * 
     * @return the acceptedAudiences value.
     */
    public List<AcceptedAudiences> acceptedAudiences() {
        return this.acceptedAudiences;
    }

    /**
     * Set the acceptedAudiences property: The cluster's accepted audiences.
     * 
     * @param acceptedAudiences the acceptedAudiences value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withAcceptedAudiences(List<AcceptedAudiences> acceptedAudiences) {
        this.acceptedAudiences = acceptedAudiences;
        return this;
    }

    /**
     * Get the enableAutoStop property: A boolean value that indicates if the cluster could be automatically stopped
     * (due to lack of data or no activity for many days).
     * 
     * @return the enableAutoStop value.
     */
    public Boolean enableAutoStop() {
        return this.enableAutoStop;
    }

    /**
     * Set the enableAutoStop property: A boolean value that indicates if the cluster could be automatically stopped
     * (due to lack of data or no activity for many days).
     * 
     * @param enableAutoStop the enableAutoStop value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEnableAutoStop(Boolean enableAutoStop) {
        this.enableAutoStop = enableAutoStop;
        return this;
    }

    /**
     * Get the restrictOutboundNetworkAccess property: Whether or not to restrict outbound network access. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @return the restrictOutboundNetworkAccess value.
     */
    public ClusterNetworkAccessFlag restrictOutboundNetworkAccess() {
        return this.restrictOutboundNetworkAccess;
    }

    /**
     * Set the restrictOutboundNetworkAccess property: Whether or not to restrict outbound network access. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @param restrictOutboundNetworkAccess the restrictOutboundNetworkAccess value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withRestrictOutboundNetworkAccess(ClusterNetworkAccessFlag restrictOutboundNetworkAccess) {
        this.restrictOutboundNetworkAccess = restrictOutboundNetworkAccess;
        return this;
    }

    /**
     * Get the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     * 
     * @return the allowedFqdnList value.
     */
    public List<String> allowedFqdnList() {
        return this.allowedFqdnList;
    }

    /**
     * Set the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     * 
     * @param allowedFqdnList the allowedFqdnList value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withAllowedFqdnList(List<String> allowedFqdnList) {
        this.allowedFqdnList = allowedFqdnList;
        return this;
    }

    /**
     * Get the publicIpType property: Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4
     * and IPv6).
     * 
     * @return the publicIpType value.
     */
    public PublicIpType publicIpType() {
        return this.publicIpType;
    }

    /**
     * Set the publicIpType property: Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4
     * and IPv6).
     * 
     * @param publicIpType the publicIpType value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withPublicIpType(PublicIpType publicIpType) {
        this.publicIpType = publicIpType;
        return this;
    }

    /**
     * Get the virtualClusterGraduationProperties property: Virtual Cluster graduation properties.
     * 
     * @return the virtualClusterGraduationProperties value.
     */
    public String virtualClusterGraduationProperties() {
        return this.virtualClusterGraduationProperties;
    }

    /**
     * Set the virtualClusterGraduationProperties property: Virtual Cluster graduation properties.
     * 
     * @param virtualClusterGraduationProperties the virtualClusterGraduationProperties value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withVirtualClusterGraduationProperties(String virtualClusterGraduationProperties) {
        this.virtualClusterGraduationProperties = virtualClusterGraduationProperties;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: A list of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the migrationCluster property: Properties of the peer cluster involved in a migration to/from this cluster.
     * 
     * @return the migrationCluster value.
     */
    public MigrationClusterProperties migrationCluster() {
        return this.migrationCluster;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trustedExternalTenants() != null) {
            trustedExternalTenants().forEach(e -> e.validate());
        }
        if (optimizedAutoscale() != null) {
            optimizedAutoscale().validate();
        }
        if (virtualNetworkConfiguration() != null) {
            virtualNetworkConfiguration().validate();
        }
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
        if (languageExtensions() != null) {
            languageExtensions().validate();
        }
        if (acceptedAudiences() != null) {
            acceptedAudiences().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (migrationCluster() != null) {
            migrationCluster().validate();
        }
    }
}
