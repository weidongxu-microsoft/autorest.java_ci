// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SitePropertiesInner;
import com.azure.resourcemanager.appservice.generated.models.ClientCertMode;
import com.azure.resourcemanager.appservice.generated.models.CloningInfo;
import com.azure.resourcemanager.appservice.generated.models.DaprConfig;
import com.azure.resourcemanager.appservice.generated.models.FunctionAppConfig;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.HostnameSslState;
import com.azure.resourcemanager.appservice.generated.models.RedundancyMode;
import com.azure.resourcemanager.appservice.generated.models.ResourceConfig;
import com.azure.resourcemanager.appservice.generated.models.SiteAvailabilityState;
import com.azure.resourcemanager.appservice.generated.models.SiteConfig;
import com.azure.resourcemanager.appservice.generated.models.SiteDnsConfig;
import com.azure.resourcemanager.appservice.generated.models.SiteProperties;
import com.azure.resourcemanager.appservice.generated.models.SlotSwapStatus;
import com.azure.resourcemanager.appservice.generated.models.UsageState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class SitePropertiesImpl implements SiteProperties {
    private SitePropertiesInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SitePropertiesImpl(SitePropertiesInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String state() {
        return this.innerModel().state();
    }

    public List<String> hostNames() {
        List<String> inner = this.innerModel().hostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String repositorySiteName() {
        return this.innerModel().repositorySiteName();
    }

    public UsageState usageState() {
        return this.innerModel().usageState();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public List<String> enabledHostNames() {
        List<String> inner = this.innerModel().enabledHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SiteAvailabilityState availabilityState() {
        return this.innerModel().availabilityState();
    }

    public List<HostnameSslState> hostnameSslStates() {
        List<HostnameSslState> inner = this.innerModel().hostnameSslStates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String serverFarmId() {
        return this.innerModel().serverFarmId();
    }

    public Boolean reserved() {
        return this.innerModel().reserved();
    }

    public Boolean isXenon() {
        return this.innerModel().isXenon();
    }

    public Boolean hyperV() {
        return this.innerModel().hyperV();
    }

    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerModel().lastModifiedTimeUtc();
    }

    public SiteDnsConfig dnsConfiguration() {
        return this.innerModel().dnsConfiguration();
    }

    public Boolean vnetRouteAllEnabled() {
        return this.innerModel().vnetRouteAllEnabled();
    }

    public Boolean vnetImagePullEnabled() {
        return this.innerModel().vnetImagePullEnabled();
    }

    public Boolean vnetContentShareEnabled() {
        return this.innerModel().vnetContentShareEnabled();
    }

    public Boolean vnetBackupRestoreEnabled() {
        return this.innerModel().vnetBackupRestoreEnabled();
    }

    public SiteConfig siteConfig() {
        SiteConfigInner inner = this.innerModel().siteConfig();
        if (inner != null) {
            return new SiteConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FunctionAppConfig functionAppConfig() {
        return this.innerModel().functionAppConfig();
    }

    public DaprConfig daprConfig() {
        return this.innerModel().daprConfig();
    }

    public String workloadProfileName() {
        return this.innerModel().workloadProfileName();
    }

    public ResourceConfig resourceConfig() {
        return this.innerModel().resourceConfig();
    }

    public List<String> trafficManagerHostNames() {
        List<String> inner = this.innerModel().trafficManagerHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean scmSiteAlsoStopped() {
        return this.innerModel().scmSiteAlsoStopped();
    }

    public String targetSwapSlot() {
        return this.innerModel().targetSwapSlot();
    }

    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerModel().hostingEnvironmentProfile();
    }

    public Boolean clientAffinityEnabled() {
        return this.innerModel().clientAffinityEnabled();
    }

    public Boolean clientCertEnabled() {
        return this.innerModel().clientCertEnabled();
    }

    public ClientCertMode clientCertMode() {
        return this.innerModel().clientCertMode();
    }

    public String clientCertExclusionPaths() {
        return this.innerModel().clientCertExclusionPaths();
    }

    public Boolean hostNamesDisabled() {
        return this.innerModel().hostNamesDisabled();
    }

    public String customDomainVerificationId() {
        return this.innerModel().customDomainVerificationId();
    }

    public String outboundIpAddresses() {
        return this.innerModel().outboundIpAddresses();
    }

    public String possibleOutboundIpAddresses() {
        return this.innerModel().possibleOutboundIpAddresses();
    }

    public Integer containerSize() {
        return this.innerModel().containerSize();
    }

    public Integer dailyMemoryTimeQuota() {
        return this.innerModel().dailyMemoryTimeQuota();
    }

    public OffsetDateTime suspendedTill() {
        return this.innerModel().suspendedTill();
    }

    public Integer maxNumberOfWorkers() {
        return this.innerModel().maxNumberOfWorkers();
    }

    public CloningInfo cloningInfo() {
        return this.innerModel().cloningInfo();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public Boolean isDefaultContainer() {
        return this.innerModel().isDefaultContainer();
    }

    public String defaultHostname() {
        return this.innerModel().defaultHostname();
    }

    public SlotSwapStatus slotSwapStatus() {
        return this.innerModel().slotSwapStatus();
    }

    public Boolean httpsOnly() {
        return this.innerModel().httpsOnly();
    }

    public RedundancyMode redundancyMode() {
        return this.innerModel().redundancyMode();
    }

    public UUID inProgressOperationId() {
        return this.innerModel().inProgressOperationId();
    }

    public String publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Boolean storageAccountRequired() {
        return this.innerModel().storageAccountRequired();
    }

    public String keyVaultReferenceIdentity() {
        return this.innerModel().keyVaultReferenceIdentity();
    }

    public String virtualNetworkSubnetId() {
        return this.innerModel().virtualNetworkSubnetId();
    }

    public String managedEnvironmentId() {
        return this.innerModel().managedEnvironmentId();
    }

    public SitePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
