// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnInner;
import java.util.Map;

/**
 * An immutable client-side representation of PremierAddOn.
 */
public interface PremierAddOn {
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
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the sku property: Premier add on SKU.
     * 
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the product property: Premier add on Product.
     * 
     * @return the product value.
     */
    String product();

    /**
     * Gets the vendor property: Premier add on Vendor.
     * 
     * @return the vendor value.
     */
    String vendor();

    /**
     * Gets the marketplacePublisher property: Premier add on Marketplace publisher.
     * 
     * @return the marketplacePublisher value.
     */
    String marketplacePublisher();

    /**
     * Gets the marketplaceOffer property: Premier add on Marketplace offer.
     * 
     * @return the marketplaceOffer value.
     */
    String marketplaceOffer();

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
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnInner object.
     * 
     * @return the inner object.
     */
    PremierAddOnInner innerModel();

    /**
     * The entirety of the PremierAddOn definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The PremierAddOn definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PremierAddOn definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             * 
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the PremierAddOn definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithKind, DefinitionStages.WithSku,
            DefinitionStages.WithProduct, DefinitionStages.WithVendor, DefinitionStages.WithMarketplacePublisher,
            DefinitionStages.WithMarketplaceOffer {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PremierAddOn create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PremierAddOn create(Context context);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: Premier add on SKU..
             * 
             * @param sku Premier add on SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(String sku);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify product.
         */
        interface WithProduct {
            /**
             * Specifies the product property: Premier add on Product..
             * 
             * @param product Premier add on Product.
             * @return the next definition stage.
             */
            WithCreate withProduct(String product);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify vendor.
         */
        interface WithVendor {
            /**
             * Specifies the vendor property: Premier add on Vendor..
             * 
             * @param vendor Premier add on Vendor.
             * @return the next definition stage.
             */
            WithCreate withVendor(String vendor);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify marketplacePublisher.
         */
        interface WithMarketplacePublisher {
            /**
             * Specifies the marketplacePublisher property: Premier add on Marketplace publisher..
             * 
             * @param marketplacePublisher Premier add on Marketplace publisher.
             * @return the next definition stage.
             */
            WithCreate withMarketplacePublisher(String marketplacePublisher);
        }

        /**
         * The stage of the PremierAddOn definition allowing to specify marketplaceOffer.
         */
        interface WithMarketplaceOffer {
            /**
             * Specifies the marketplaceOffer property: Premier add on Marketplace offer..
             * 
             * @param marketplaceOffer Premier add on Marketplace offer.
             * @return the next definition stage.
             */
            WithCreate withMarketplaceOffer(String marketplaceOffer);
        }
    }

    /**
     * Begins update for the PremierAddOn resource.
     * 
     * @return the stage of resource update.
     */
    PremierAddOn.Update update();

    /**
     * The template for PremierAddOn update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithSku, UpdateStages.WithProduct,
        UpdateStages.WithVendor, UpdateStages.WithMarketplacePublisher, UpdateStages.WithMarketplaceOffer {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PremierAddOn apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PremierAddOn apply(Context context);
    }

    /**
     * The PremierAddOn update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PremierAddOn update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the PremierAddOn update allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: Premier add on SKU..
             * 
             * @param sku Premier add on SKU.
             * @return the next definition stage.
             */
            Update withSku(String sku);
        }

        /**
         * The stage of the PremierAddOn update allowing to specify product.
         */
        interface WithProduct {
            /**
             * Specifies the product property: Premier add on Product..
             * 
             * @param product Premier add on Product.
             * @return the next definition stage.
             */
            Update withProduct(String product);
        }

        /**
         * The stage of the PremierAddOn update allowing to specify vendor.
         */
        interface WithVendor {
            /**
             * Specifies the vendor property: Premier add on Vendor..
             * 
             * @param vendor Premier add on Vendor.
             * @return the next definition stage.
             */
            Update withVendor(String vendor);
        }

        /**
         * The stage of the PremierAddOn update allowing to specify marketplacePublisher.
         */
        interface WithMarketplacePublisher {
            /**
             * Specifies the marketplacePublisher property: Premier add on Marketplace publisher..
             * 
             * @param marketplacePublisher Premier add on Marketplace publisher.
             * @return the next definition stage.
             */
            Update withMarketplacePublisher(String marketplacePublisher);
        }

        /**
         * The stage of the PremierAddOn update allowing to specify marketplaceOffer.
         */
        interface WithMarketplaceOffer {
            /**
             * Specifies the marketplaceOffer property: Premier add on Marketplace offer..
             * 
             * @param marketplaceOffer Premier add on Marketplace offer.
             * @return the next definition stage.
             */
            Update withMarketplaceOffer(String marketplaceOffer);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PremierAddOn refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PremierAddOn refresh(Context context);
}
