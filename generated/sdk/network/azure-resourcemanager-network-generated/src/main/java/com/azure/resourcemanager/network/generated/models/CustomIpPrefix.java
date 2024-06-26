// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of CustomIpPrefix.
 */
public interface CustomIpPrefix {
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
     * Gets the extendedLocation property: The extended location of the custom IP prefix.
     * 
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the asn property: The ASN for CIDR advertising. Should be an integer as string.
     * 
     * @return the asn value.
     */
    String asn();

    /**
     * Gets the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix
     * length.
     * 
     * @return the cidr value.
     */
    String cidr();

    /**
     * Gets the signedMessage property: Signed message for WAN validation.
     * 
     * @return the signedMessage value.
     */
    String signedMessage();

    /**
     * Gets the authorizationMessage property: Authorization message for WAN validation.
     * 
     * @return the authorizationMessage value.
     */
    String authorizationMessage();

    /**
     * Gets the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
     * 
     * @return the customIpPrefixParent value.
     */
    SubResource customIpPrefixParent();

    /**
     * Gets the childCustomIpPrefixes property: The list of all Children for IPv6 /48 CustomIpPrefix.
     * 
     * @return the childCustomIpPrefixes value.
     */
    List<SubResource> childCustomIpPrefixes();

    /**
     * Gets the commissionedState property: The commissioned state of the Custom IP Prefix.
     * 
     * @return the commissionedState value.
     */
    CommissionedState commissionedState();

    /**
     * Gets the expressRouteAdvertise property: Whether to do express route advertise.
     * 
     * @return the expressRouteAdvertise value.
     */
    Boolean expressRouteAdvertise();

    /**
     * Gets the geo property: The Geo for CIDR advertising. Should be an Geo code.
     * 
     * @return the geo value.
     */
    Geo geo();

    /**
     * Gets the noInternetAdvertise property: Whether to Advertise the range to Internet.
     * 
     * @return the noInternetAdvertise value.
     */
    Boolean noInternetAdvertise();

    /**
     * Gets the prefixType property: Type of custom IP prefix. Should be Singular, Parent, or Child.
     * 
     * @return the prefixType value.
     */
    CustomIpPrefixType prefixType();

    /**
     * Gets the publicIpPrefixes property: The list of all referenced PublicIpPrefixes.
     * 
     * @return the publicIpPrefixes value.
     */
    List<SubResource> publicIpPrefixes();

    /**
     * Gets the resourceGuid property: The resource GUID property of the custom IP prefix resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the failedReason property: The reason why resource is in failed state.
     * 
     * @return the failedReason value.
     */
    String failedReason();

    /**
     * Gets the provisioningState property: The provisioning state of the custom IP prefix resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner object.
     * 
     * @return the inner object.
     */
    CustomIpPrefixInner innerModel();

    /**
     * The entirety of the CustomIpPrefix definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The CustomIpPrefix definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the CustomIpPrefix definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify location.
         */
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

        /**
         * The stage of the CustomIpPrefix definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the CustomIpPrefix definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithExtendedLocation, DefinitionStages.WithZones,
            DefinitionStages.WithAsn, DefinitionStages.WithCidr, DefinitionStages.WithSignedMessage,
            DefinitionStages.WithAuthorizationMessage, DefinitionStages.WithCustomIpPrefixParent,
            DefinitionStages.WithCommissionedState, DefinitionStages.WithExpressRouteAdvertise,
            DefinitionStages.WithGeo, DefinitionStages.WithNoInternetAdvertise, DefinitionStages.WithPrefixType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            CustomIpPrefix create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomIpPrefix create(Context context);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify tags.
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
         * The stage of the CustomIpPrefix definition allowing to specify extendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the custom IP prefix..
             * 
             * @param extendedLocation The extended location of the custom IP prefix.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify zones.
         */
        interface WithZones {
            /**
             * Specifies the zones property: A list of availability zones denoting the IP allocated for the resource
             * needs to come from..
             * 
             * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify asn.
         */
        interface WithAsn {
            /**
             * Specifies the asn property: The ASN for CIDR advertising. Should be an integer as string..
             * 
             * @param asn The ASN for CIDR advertising. Should be an integer as string.
             * @return the next definition stage.
             */
            WithCreate withAsn(String asn);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify cidr.
         */
        interface WithCidr {
            /**
             * Specifies the cidr property: The prefix range in CIDR notation. Should include the start address and the
             * prefix length..
             * 
             * @param cidr The prefix range in CIDR notation. Should include the start address and the prefix length.
             * @return the next definition stage.
             */
            WithCreate withCidr(String cidr);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify signedMessage.
         */
        interface WithSignedMessage {
            /**
             * Specifies the signedMessage property: Signed message for WAN validation..
             * 
             * @param signedMessage Signed message for WAN validation.
             * @return the next definition stage.
             */
            WithCreate withSignedMessage(String signedMessage);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify authorizationMessage.
         */
        interface WithAuthorizationMessage {
            /**
             * Specifies the authorizationMessage property: Authorization message for WAN validation..
             * 
             * @param authorizationMessage Authorization message for WAN validation.
             * @return the next definition stage.
             */
            WithCreate withAuthorizationMessage(String authorizationMessage);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify customIpPrefixParent.
         */
        interface WithCustomIpPrefixParent {
            /**
             * Specifies the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix..
             * 
             * @param customIpPrefixParent The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
             * @return the next definition stage.
             */
            WithCreate withCustomIpPrefixParent(SubResource customIpPrefixParent);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify commissionedState.
         */
        interface WithCommissionedState {
            /**
             * Specifies the commissionedState property: The commissioned state of the Custom IP Prefix..
             * 
             * @param commissionedState The commissioned state of the Custom IP Prefix.
             * @return the next definition stage.
             */
            WithCreate withCommissionedState(CommissionedState commissionedState);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify expressRouteAdvertise.
         */
        interface WithExpressRouteAdvertise {
            /**
             * Specifies the expressRouteAdvertise property: Whether to do express route advertise..
             * 
             * @param expressRouteAdvertise Whether to do express route advertise.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteAdvertise(Boolean expressRouteAdvertise);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify geo.
         */
        interface WithGeo {
            /**
             * Specifies the geo property: The Geo for CIDR advertising. Should be an Geo code..
             * 
             * @param geo The Geo for CIDR advertising. Should be an Geo code.
             * @return the next definition stage.
             */
            WithCreate withGeo(Geo geo);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify noInternetAdvertise.
         */
        interface WithNoInternetAdvertise {
            /**
             * Specifies the noInternetAdvertise property: Whether to Advertise the range to Internet..
             * 
             * @param noInternetAdvertise Whether to Advertise the range to Internet.
             * @return the next definition stage.
             */
            WithCreate withNoInternetAdvertise(Boolean noInternetAdvertise);
        }

        /**
         * The stage of the CustomIpPrefix definition allowing to specify prefixType.
         */
        interface WithPrefixType {
            /**
             * Specifies the prefixType property: Type of custom IP prefix. Should be Singular, Parent, or Child..
             * 
             * @param prefixType Type of custom IP prefix. Should be Singular, Parent, or Child.
             * @return the next definition stage.
             */
            WithCreate withPrefixType(CustomIpPrefixType prefixType);
        }
    }

    /**
     * Begins update for the CustomIpPrefix resource.
     * 
     * @return the stage of resource update.
     */
    CustomIpPrefix.Update update();

    /**
     * The template for CustomIpPrefix update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        CustomIpPrefix apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomIpPrefix apply(Context context);
    }

    /**
     * The CustomIpPrefix update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the CustomIpPrefix update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
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
    CustomIpPrefix refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomIpPrefix refresh(Context context);
}
