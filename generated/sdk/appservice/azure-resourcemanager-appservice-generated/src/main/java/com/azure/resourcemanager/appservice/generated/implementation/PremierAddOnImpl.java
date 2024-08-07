// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnInner;
import com.azure.resourcemanager.appservice.generated.models.PremierAddOn;
import com.azure.resourcemanager.appservice.generated.models.PremierAddOnPatchResource;
import java.util.Collections;
import java.util.Map;

public final class PremierAddOnImpl implements PremierAddOn, PremierAddOn.Definition, PremierAddOn.Update {
    private PremierAddOnInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public String product() {
        return this.innerModel().product();
    }

    public String vendor() {
        return this.innerModel().vendor();
    }

    public String marketplacePublisher() {
        return this.innerModel().marketplacePublisher();
    }

    public String marketplaceOffer() {
        return this.innerModel().marketplaceOffer();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PremierAddOnInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String premierAddOnName;

    private PremierAddOnPatchResource updatePremierAddOn;

    public PremierAddOnImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public PremierAddOn create() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .addPremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public PremierAddOn create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .addPremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PremierAddOnImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new PremierAddOnInner();
        this.serviceManager = serviceManager;
        this.premierAddOnName = name;
    }

    public PremierAddOnImpl update() {
        this.updatePremierAddOn = new PremierAddOnPatchResource();
        return this;
    }

    public PremierAddOn apply() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .updatePremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, updatePremierAddOn, Context.NONE)
            .getValue();
        return this;
    }

    public PremierAddOn apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .updatePremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, updatePremierAddOn, context)
            .getValue();
        return this;
    }

    PremierAddOnImpl(PremierAddOnInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sites");
        this.premierAddOnName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "premieraddons");
    }

    public PremierAddOn refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .getPremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, Context.NONE)
            .getValue();
        return this;
    }

    public PremierAddOn refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .getPremierAddOnWithResponse(resourceGroupName, name, premierAddOnName, context)
            .getValue();
        return this;
    }

    public PremierAddOnImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PremierAddOnImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PremierAddOnImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PremierAddOnImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updatePremierAddOn.withKind(kind);
            return this;
        }
    }

    public PremierAddOnImpl withSku(String sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updatePremierAddOn.withSku(sku);
            return this;
        }
    }

    public PremierAddOnImpl withProduct(String product) {
        if (isInCreateMode()) {
            this.innerModel().withProduct(product);
            return this;
        } else {
            this.updatePremierAddOn.withProduct(product);
            return this;
        }
    }

    public PremierAddOnImpl withVendor(String vendor) {
        if (isInCreateMode()) {
            this.innerModel().withVendor(vendor);
            return this;
        } else {
            this.updatePremierAddOn.withVendor(vendor);
            return this;
        }
    }

    public PremierAddOnImpl withMarketplacePublisher(String marketplacePublisher) {
        if (isInCreateMode()) {
            this.innerModel().withMarketplacePublisher(marketplacePublisher);
            return this;
        } else {
            this.updatePremierAddOn.withMarketplacePublisher(marketplacePublisher);
            return this;
        }
    }

    public PremierAddOnImpl withMarketplaceOffer(String marketplaceOffer) {
        if (isInCreateMode()) {
            this.innerModel().withMarketplaceOffer(marketplaceOffer);
            return this;
        } else {
            this.updatePremierAddOn.withMarketplaceOffer(marketplaceOffer);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
