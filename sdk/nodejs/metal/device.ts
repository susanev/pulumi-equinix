// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Equinix Metal device resource. This can be used to create,
 * modify, and delete devices.
 *
 * > **NOTE:** All arguments including the `rootPassword` and `userData` will be stored in
 *  the raw state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const projectId = config.require("projectId");
 * const web = new equinix.metal.Device("web", {
 *     hostname: "webserver1",
 *     plan: "c3.small.x86",
 *     operatingSystem: "ubuntu_20_04",
 *     metro: "sv",
 *     billingCycle: "hourly",
 *     projectId: projectId,
 * });
 * export const webPublicIp = pulumi.interpolate`http://${web.accessPublicIpv4}`;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing device ID: <break><break>```sh<break> $ pulumi import equinix:metal/device:Device equinix_metal_device {existing_device_id} <break>```<break><break>
 */
export class Device extends pulumi.CustomResource {
    /**
     * Get an existing Device resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceState, opts?: pulumi.CustomResourceOptions): Device {
        return new Device(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/device:Device';

    /**
     * Returns true if the given object is an instance of Device.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Device {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Device.__pulumiType;
    }

    /**
     * The ipv4 private IP assigned to the device.
     */
    public /*out*/ readonly accessPrivateIpv4!: pulumi.Output<string>;
    /**
     * The ipv4 maintenance IP assigned to the device.
     */
    public /*out*/ readonly accessPublicIpv4!: pulumi.Output<string>;
    /**
     * The ipv6 maintenance IP assigned to the device.
     */
    public /*out*/ readonly accessPublicIpv6!: pulumi.Output<string>;
    /**
     * If true, a device with OS `customIpxe` will continue to boot via iPXE
     * on reboots.
     */
    public readonly alwaysPxe!: pulumi.Output<boolean | undefined>;
    /**
     * Behavioral overrides that change how the resource handles certain attribute updates. See Behavior below for more details.
     */
    public readonly behavior!: pulumi.Output<outputs.metal.DeviceBehavior | undefined>;
    /**
     * monthly or hourly
     */
    public readonly billingCycle!: pulumi.Output<string>;
    /**
     * The timestamp for when the device was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * A string of the desired Custom Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"customData"`, the device will be updated in-place instead of recreated.
     */
    public readonly customData!: pulumi.Output<string | undefined>;
    /**
     * The facility where the device is deployed
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    public /*out*/ readonly deployedFacility!: pulumi.Output<string>;
    /**
     * ID of hardware reservation where this device was deployed.
     * It is useful when using the `next-available` hardware reservation.
     */
    public /*out*/ readonly deployedHardwareReservationId!: pulumi.Output<string>;
    /**
     * The device description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * List of facility codes with deployment preferences. Equinix Metal API will go through the list and will deploy your
     * device to first facility with free capacity. List items must be facility codes or any (a wildcard). To find the facility
     * code, visit [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth token in the
     * top of the page and see JSON from the API response. Conflicts with metro
     *
     * @deprecated Use metro instead of facilities.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    public readonly facilities!: pulumi.Output<string[] | undefined>;
    /**
     * Delete device even if it has volumes attached. Only applies
     * for destroy action.
     */
    public readonly forceDetachVolumes!: pulumi.Output<boolean | undefined>;
    /**
     * The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
     * next available reservation automatically
     */
    public readonly hardwareReservationId!: pulumi.Output<string | undefined>;
    /**
     * The device hostname used in deployments taking advantage of Layer3 DHCP
     * or metadata service configuration.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * A list of IP address types for the device. See
     * IP address below for more details.
     */
    public readonly ipAddresses!: pulumi.Output<outputs.metal.DeviceIpAddress[] | undefined>;
    /**
     * URL pointing to a hosted iPXE script. More information is in the
     * [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
     */
    public readonly ipxeScriptUrl!: pulumi.Output<string | undefined>;
    /**
     * Whether the device is locked.
     */
    public /*out*/ readonly locked!: pulumi.Output<boolean>;
    /**
     * Metro area for the new device. Conflicts with `facilities`.
     */
    public readonly metro!: pulumi.Output<string | undefined>;
    /**
     * The device's private and public IP (v4 and v6) network details. See
     * Network Attribute below for more details.
     */
    public /*out*/ readonly network!: pulumi.Output<outputs.metal.DeviceNetwork[]>;
    /**
     * (Deprecated) Network type of a device, used in
     * [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Since this
     * attribute is deprecated you should handle Network Type with one of
     * equinix_metal_port,
     * equinix.metal.DeviceNetworkType resources or
     * equinix.metal.Port datasource.
     * See networkTypes guide for more info.
     *
     * @deprecated You should handle Network Type with one of 'equinix_metal_port' or 'equinix_metal_device_network_type' resources. See section 'Guides' for more info
     */
    public /*out*/ readonly networkType!: pulumi.Output<string>;
    /**
     * The operating system slug. To find the slug, or visit
     * [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
     * API auth token in the top of the page and see JSON from the API response.
     */
    public readonly operatingSystem!: pulumi.Output<string>;
    /**
     * The device plan slug. To find the plan slug, visit
     * [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
     * top of the page and see JSON from the API response.
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * List of ports assigned to the device. See Ports Attribute below for
     * more details.
     */
    public /*out*/ readonly ports!: pulumi.Output<outputs.metal.DevicePort[]>;
    /**
     * The ID of the project in which to create the device
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Array of IDs of the project SSH keys which should be added to the device.
     * If you omit this, SSH keys of all the members of the parent project will be added to the device. If
     * you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
     * created with the equinix.metal.ProjectSshKey resource.
     */
    public readonly projectSshKeyIds!: pulumi.Output<string[] | undefined>;
    /**
     * Whether the device should be reinstalled instead of destroyed when
     * modifying user_data, custom_data, or operating system. See Reinstall below for more
     * details.
     */
    public readonly reinstall!: pulumi.Output<outputs.metal.DeviceReinstall | undefined>;
    /**
     * Root password to the server (disabled after 24 hours).
     */
    public /*out*/ readonly rootPassword!: pulumi.Output<string>;
    /**
     * List of IDs of SSH keys deployed in the device, can be both user and project SSH keys.
     */
    public /*out*/ readonly sshKeyIds!: pulumi.Output<string[]>;
    /**
     * The status of the device.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * JSON for custom partitioning. Only usable on reserved hardware. More
     * information in in the
     * [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
     * doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
     * be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
     */
    public readonly storage!: pulumi.Output<string | undefined>;
    /**
     * Tags attached to the device.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
     * If you don't supply timezone info, timestamp is assumed to be in UTC.
     */
    public readonly terminationTime!: pulumi.Output<string | undefined>;
    /**
     * The timestamp for the last time the device was updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;
    /**
     * A string of the desired User Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"userData"`, the device will be updated in-place instead of recreated.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
     */
    public readonly userSshKeyIds!: pulumi.Output<string[] | undefined>;
    /**
     * Only used for devices in reserved hardware. If
     * set, the deletion of this device will block until the hardware reservation is marked provisionable
     * (about 4 minutes in August 2019).
     */
    public readonly waitForReservationDeprovision!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Device resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceArgs | DeviceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceState | undefined;
            resourceInputs["accessPrivateIpv4"] = state ? state.accessPrivateIpv4 : undefined;
            resourceInputs["accessPublicIpv4"] = state ? state.accessPublicIpv4 : undefined;
            resourceInputs["accessPublicIpv6"] = state ? state.accessPublicIpv6 : undefined;
            resourceInputs["alwaysPxe"] = state ? state.alwaysPxe : undefined;
            resourceInputs["behavior"] = state ? state.behavior : undefined;
            resourceInputs["billingCycle"] = state ? state.billingCycle : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["deployedFacility"] = state ? state.deployedFacility : undefined;
            resourceInputs["deployedHardwareReservationId"] = state ? state.deployedHardwareReservationId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["facilities"] = state ? state.facilities : undefined;
            resourceInputs["forceDetachVolumes"] = state ? state.forceDetachVolumes : undefined;
            resourceInputs["hardwareReservationId"] = state ? state.hardwareReservationId : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ipAddresses"] = state ? state.ipAddresses : undefined;
            resourceInputs["ipxeScriptUrl"] = state ? state.ipxeScriptUrl : undefined;
            resourceInputs["locked"] = state ? state.locked : undefined;
            resourceInputs["metro"] = state ? state.metro : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["networkType"] = state ? state.networkType : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["plan"] = state ? state.plan : undefined;
            resourceInputs["ports"] = state ? state.ports : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["projectSshKeyIds"] = state ? state.projectSshKeyIds : undefined;
            resourceInputs["reinstall"] = state ? state.reinstall : undefined;
            resourceInputs["rootPassword"] = state ? state.rootPassword : undefined;
            resourceInputs["sshKeyIds"] = state ? state.sshKeyIds : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["storage"] = state ? state.storage : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["terminationTime"] = state ? state.terminationTime : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["userSshKeyIds"] = state ? state.userSshKeyIds : undefined;
            resourceInputs["waitForReservationDeprovision"] = state ? state.waitForReservationDeprovision : undefined;
        } else {
            const args = argsOrState as DeviceArgs | undefined;
            if ((!args || args.operatingSystem === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operatingSystem'");
            }
            if ((!args || args.plan === undefined) && !opts.urn) {
                throw new Error("Missing required property 'plan'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["alwaysPxe"] = args ? args.alwaysPxe : undefined;
            resourceInputs["behavior"] = args ? args.behavior : undefined;
            resourceInputs["billingCycle"] = args ? args.billingCycle : undefined;
            resourceInputs["customData"] = args?.customData ? pulumi.secret(args.customData) : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["facilities"] = args ? args.facilities : undefined;
            resourceInputs["forceDetachVolumes"] = args ? args.forceDetachVolumes : undefined;
            resourceInputs["hardwareReservationId"] = args ? args.hardwareReservationId : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["ipAddresses"] = args ? args.ipAddresses : undefined;
            resourceInputs["ipxeScriptUrl"] = args ? args.ipxeScriptUrl : undefined;
            resourceInputs["metro"] = args ? args.metro : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["plan"] = args ? args.plan : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["projectSshKeyIds"] = args ? args.projectSshKeyIds : undefined;
            resourceInputs["reinstall"] = args ? args.reinstall : undefined;
            resourceInputs["storage"] = args ? args.storage : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["terminationTime"] = args ? args.terminationTime : undefined;
            resourceInputs["userData"] = args?.userData ? pulumi.secret(args.userData) : undefined;
            resourceInputs["userSshKeyIds"] = args ? args.userSshKeyIds : undefined;
            resourceInputs["waitForReservationDeprovision"] = args ? args.waitForReservationDeprovision : undefined;
            resourceInputs["accessPrivateIpv4"] = undefined /*out*/;
            resourceInputs["accessPublicIpv4"] = undefined /*out*/;
            resourceInputs["accessPublicIpv6"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["deployedFacility"] = undefined /*out*/;
            resourceInputs["deployedHardwareReservationId"] = undefined /*out*/;
            resourceInputs["locked"] = undefined /*out*/;
            resourceInputs["network"] = undefined /*out*/;
            resourceInputs["networkType"] = undefined /*out*/;
            resourceInputs["ports"] = undefined /*out*/;
            resourceInputs["rootPassword"] = undefined /*out*/;
            resourceInputs["sshKeyIds"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["customData", "rootPassword", "userData"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Device.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Device resources.
 */
export interface DeviceState {
    /**
     * The ipv4 private IP assigned to the device.
     */
    accessPrivateIpv4?: pulumi.Input<string>;
    /**
     * The ipv4 maintenance IP assigned to the device.
     */
    accessPublicIpv4?: pulumi.Input<string>;
    /**
     * The ipv6 maintenance IP assigned to the device.
     */
    accessPublicIpv6?: pulumi.Input<string>;
    /**
     * If true, a device with OS `customIpxe` will continue to boot via iPXE
     * on reboots.
     */
    alwaysPxe?: pulumi.Input<boolean>;
    /**
     * Behavioral overrides that change how the resource handles certain attribute updates. See Behavior below for more details.
     */
    behavior?: pulumi.Input<inputs.metal.DeviceBehavior>;
    /**
     * monthly or hourly
     */
    billingCycle?: pulumi.Input<string | enums.metal.BillingCycle>;
    /**
     * The timestamp for when the device was created.
     */
    created?: pulumi.Input<string>;
    /**
     * A string of the desired Custom Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"customData"`, the device will be updated in-place instead of recreated.
     */
    customData?: pulumi.Input<string>;
    /**
     * The facility where the device is deployed
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    deployedFacility?: pulumi.Input<string>;
    /**
     * ID of hardware reservation where this device was deployed.
     * It is useful when using the `next-available` hardware reservation.
     */
    deployedHardwareReservationId?: pulumi.Input<string>;
    /**
     * The device description.
     */
    description?: pulumi.Input<string>;
    /**
     * List of facility codes with deployment preferences. Equinix Metal API will go through the list and will deploy your
     * device to first facility with free capacity. List items must be facility codes or any (a wildcard). To find the facility
     * code, visit [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth token in the
     * top of the page and see JSON from the API response. Conflicts with metro
     *
     * @deprecated Use metro instead of facilities.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facilities?: pulumi.Input<pulumi.Input<string | enums.metal.Facility>[]>;
    /**
     * Delete device even if it has volumes attached. Only applies
     * for destroy action.
     */
    forceDetachVolumes?: pulumi.Input<boolean>;
    /**
     * The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
     * next available reservation automatically
     */
    hardwareReservationId?: pulumi.Input<string>;
    /**
     * The device hostname used in deployments taking advantage of Layer3 DHCP
     * or metadata service configuration.
     */
    hostname?: pulumi.Input<string>;
    /**
     * A list of IP address types for the device. See
     * IP address below for more details.
     */
    ipAddresses?: pulumi.Input<pulumi.Input<inputs.metal.DeviceIpAddress>[]>;
    /**
     * URL pointing to a hosted iPXE script. More information is in the
     * [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
     */
    ipxeScriptUrl?: pulumi.Input<string>;
    /**
     * Whether the device is locked.
     */
    locked?: pulumi.Input<boolean>;
    /**
     * Metro area for the new device. Conflicts with `facilities`.
     */
    metro?: pulumi.Input<string>;
    /**
     * The device's private and public IP (v4 and v6) network details. See
     * Network Attribute below for more details.
     */
    network?: pulumi.Input<pulumi.Input<inputs.metal.DeviceNetwork>[]>;
    /**
     * (Deprecated) Network type of a device, used in
     * [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Since this
     * attribute is deprecated you should handle Network Type with one of
     * equinix_metal_port,
     * equinix.metal.DeviceNetworkType resources or
     * equinix.metal.Port datasource.
     * See networkTypes guide for more info.
     *
     * @deprecated You should handle Network Type with one of 'equinix_metal_port' or 'equinix_metal_device_network_type' resources. See section 'Guides' for more info
     */
    networkType?: pulumi.Input<string | enums.metal.NetworkType>;
    /**
     * The operating system slug. To find the slug, or visit
     * [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
     * API auth token in the top of the page and see JSON from the API response.
     */
    operatingSystem?: pulumi.Input<string | enums.metal.OperatingSystem>;
    /**
     * The device plan slug. To find the plan slug, visit
     * [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
     * top of the page and see JSON from the API response.
     */
    plan?: pulumi.Input<string | enums.metal.Plan>;
    /**
     * List of ports assigned to the device. See Ports Attribute below for
     * more details.
     */
    ports?: pulumi.Input<pulumi.Input<inputs.metal.DevicePort>[]>;
    /**
     * The ID of the project in which to create the device
     */
    projectId?: pulumi.Input<string>;
    /**
     * Array of IDs of the project SSH keys which should be added to the device.
     * If you omit this, SSH keys of all the members of the parent project will be added to the device. If
     * you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
     * created with the equinix.metal.ProjectSshKey resource.
     */
    projectSshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the device should be reinstalled instead of destroyed when
     * modifying user_data, custom_data, or operating system. See Reinstall below for more
     * details.
     */
    reinstall?: pulumi.Input<inputs.metal.DeviceReinstall>;
    /**
     * Root password to the server (disabled after 24 hours).
     */
    rootPassword?: pulumi.Input<string>;
    /**
     * List of IDs of SSH keys deployed in the device, can be both user and project SSH keys.
     */
    sshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of the device.
     */
    state?: pulumi.Input<string>;
    /**
     * JSON for custom partitioning. Only usable on reserved hardware. More
     * information in in the
     * [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
     * doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
     * be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
     */
    storage?: pulumi.Input<string>;
    /**
     * Tags attached to the device.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
     * If you don't supply timezone info, timestamp is assumed to be in UTC.
     */
    terminationTime?: pulumi.Input<string>;
    /**
     * The timestamp for the last time the device was updated.
     */
    updated?: pulumi.Input<string>;
    /**
     * A string of the desired User Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"userData"`, the device will be updated in-place instead of recreated.
     */
    userData?: pulumi.Input<string>;
    /**
     * Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
     */
    userSshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only used for devices in reserved hardware. If
     * set, the deletion of this device will block until the hardware reservation is marked provisionable
     * (about 4 minutes in August 2019).
     */
    waitForReservationDeprovision?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Device resource.
 */
export interface DeviceArgs {
    /**
     * If true, a device with OS `customIpxe` will continue to boot via iPXE
     * on reboots.
     */
    alwaysPxe?: pulumi.Input<boolean>;
    /**
     * Behavioral overrides that change how the resource handles certain attribute updates. See Behavior below for more details.
     */
    behavior?: pulumi.Input<inputs.metal.DeviceBehavior>;
    /**
     * monthly or hourly
     */
    billingCycle?: pulumi.Input<string | enums.metal.BillingCycle>;
    /**
     * A string of the desired Custom Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"customData"`, the device will be updated in-place instead of recreated.
     */
    customData?: pulumi.Input<string>;
    /**
     * The device description.
     */
    description?: pulumi.Input<string>;
    /**
     * List of facility codes with deployment preferences. Equinix Metal API will go through the list and will deploy your
     * device to first facility with free capacity. List items must be facility codes or any (a wildcard). To find the facility
     * code, visit [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth token in the
     * top of the page and see JSON from the API response. Conflicts with metro
     *
     * @deprecated Use metro instead of facilities.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facilities?: pulumi.Input<pulumi.Input<string | enums.metal.Facility>[]>;
    /**
     * Delete device even if it has volumes attached. Only applies
     * for destroy action.
     */
    forceDetachVolumes?: pulumi.Input<boolean>;
    /**
     * The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your
     * next available reservation automatically
     */
    hardwareReservationId?: pulumi.Input<string>;
    /**
     * The device hostname used in deployments taking advantage of Layer3 DHCP
     * or metadata service configuration.
     */
    hostname?: pulumi.Input<string>;
    /**
     * A list of IP address types for the device. See
     * IP address below for more details.
     */
    ipAddresses?: pulumi.Input<pulumi.Input<inputs.metal.DeviceIpAddress>[]>;
    /**
     * URL pointing to a hosted iPXE script. More information is in the
     * [Custom iPXE](https://metal.equinix.com/developers/docs/servers/custom-ipxe/) doc.
     */
    ipxeScriptUrl?: pulumi.Input<string>;
    /**
     * Metro area for the new device. Conflicts with `facilities`.
     */
    metro?: pulumi.Input<string>;
    /**
     * The operating system slug. To find the slug, or visit
     * [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your
     * API auth token in the top of the page and see JSON from the API response.
     */
    operatingSystem: pulumi.Input<string | enums.metal.OperatingSystem>;
    /**
     * The device plan slug. To find the plan slug, visit
     * [Device plans API docs](https://metal.equinix.com/developers/api/plans), set your auth token in the
     * top of the page and see JSON from the API response.
     */
    plan: pulumi.Input<string | enums.metal.Plan>;
    /**
     * The ID of the project in which to create the device
     */
    projectId: pulumi.Input<string>;
    /**
     * Array of IDs of the project SSH keys which should be added to the device.
     * If you omit this, SSH keys of all the members of the parent project will be added to the device. If
     * you specify this array, only the listed project SSH keys will be added. Project SSH keys can be
     * created with the equinix.metal.ProjectSshKey resource.
     */
    projectSshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the device should be reinstalled instead of destroyed when
     * modifying user_data, custom_data, or operating system. See Reinstall below for more
     * details.
     */
    reinstall?: pulumi.Input<inputs.metal.DeviceReinstall>;
    /**
     * JSON for custom partitioning. Only usable on reserved hardware. More
     * information in in the
     * [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/)
     * doc. Please note that the disks.partitions.size attribute must be a string, not an integer. It can
     * be a number string, or size notation string, e.g. "4G" or "8M" (for gigabytes and megabytes).
     */
    storage?: pulumi.Input<string>;
    /**
     * Tags attached to the device.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Timestamp for device termination. For example `2021-09-03T16:32:00+03:00`.
     * If you don't supply timezone info, timestamp is assumed to be in UTC.
     */
    terminationTime?: pulumi.Input<string>;
    /**
     * A string of the desired User Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `"userData"`, the device will be updated in-place instead of recreated.
     */
    userData?: pulumi.Input<string>;
    /**
     * Array of IDs of the user SSH keys which should be added to the device. If you omit this, SSH keys of all the members of the parent project will be added to the device. If you specify this array, only the listed user SSH keys (and any project_ssh_key_ids) will be added. User SSH keys can be created with the equinix.metal.SshKey resource
     */
    userSshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only used for devices in reserved hardware. If
     * set, the deletion of this device will block until the hardware reservation is marked provisionable
     * (about 4 minutes in August 2019).
     */
    waitForReservationDeprovision?: pulumi.Input<boolean>;
}
