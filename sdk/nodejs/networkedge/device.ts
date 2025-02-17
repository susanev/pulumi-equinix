// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.Device` allows creation and management of Equinix Network Edge virtual
 * network devices.
 *
 * Network Edge virtual network devices can be created in two modes:
 *
 * * **managed** - (default) Where Equinix manages connectivity and services in the device and
 *   customer gets limited access to the device.
 * * **self-configured** - Where customer provisions and manages own services in the device with less
 *   restricted access. Some device types are offered only in this mode.
 *
 * In addition to management modes, there are two software license modes available:
 *
 * * **subscription** - Where Equinix provides software license, including end-to-end support, and
 *   bills for the service respectively.
 * * **BYOL** - [bring your own license] Where customer brings his own, already procured device
 *   software license. There are no charges associated with such license. It is the only licensing mode
 *   for `self-configured` devices.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const accountName = config.require("accountName");
 * const licenseToken = config.require("licenseToken");
 * const sshUserName = config.require("sshUserName");
 * const sshKeyName = config.require("sshKeyName");
 * const aclTemplateId = config.require("aclTemplateId");
 * const metro = config.get("metro") || "SV";
 * const devicePackageCode = config.get("devicePackageCode") || "network-essentials";
 * const deviceVersion = config.get("deviceVersion") || "17.06.01a";
 * const sizeInCores = config.getNumber("sizeInCores") || 2;
 * const termLength = config.getNumber("termLength") || 6;
 * const additionalBandwidth = config.getNumber("additionalBandwidth") || 5;
 * const accountNum = equinix.networkedge.getAccount({
 *     name: accountName,
 *     metroCode: metro,
 * }).then(invoke => invoke.number);
 * const c8KRouter = new equinix.networkedge.Device("c8kRouter", {
 *     name: "catalystRouter",
 *     metroCode: metro,
 *     typeCode: "C8000V",
 *     selfManaged: true,
 *     byol: true,
 *     packageCode: devicePackageCode,
 *     notifications: ["example@equinix.com"],
 *     hostname: "C8KV",
 *     accountNumber: accountNum,
 *     version: deviceVersion,
 *     coreCount: sizeInCores,
 *     termLength: termLength,
 *     licenseToken: licenseToken,
 *     additionalBandwidth: additionalBandwidth,
 *     sshKey: {
 *         username: sshUserName,
 *         keyName: sshKeyName,
 *     },
 *     aclTemplateId: aclTemplateId,
 * });
 * export const routerId = c8KRouter.id;
 * export const provisionStatus = c8KRouter.status;
 * export const licenseStatus = c8KRouter.licenseStatus;
 * export const sshIpAddress = c8KRouter.sshIpAddress;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID: <break><break>```sh<break> $ pulumi import equinix:networkedge/device:Device example {existing_id} <break>```<break><break> The `license_token`, `mgmt_acl_template_uuid` and `cloud_init_file_id` fields can not be imported.
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
    public static readonly __pulumiType = 'equinix:networkedge/device:Device';

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
     * Billing account number for a device.
     */
    public readonly accountNumber!: pulumi.Output<string>;
    /**
     * Identifier of a WAN interface ACL template that will be applied on the device.
     */
    public readonly aclTemplateId!: pulumi.Output<string | undefined>;
    /**
     * Additional Internet bandwidth, in Mbps, that will be
     * allocated to the device (in addition to default 15Mbps).
     */
    public readonly additionalBandwidth!: pulumi.Output<number>;
    /**
     * (Autonomous System Number) Unique identifier for a network on the internet.
     */
    public /*out*/ readonly asn!: pulumi.Output<number>;
    /**
     * Boolean value that determines device licensing mode, i.e.,
     * `bring your own license` or `subscription` (default).
     */
    public readonly byol!: pulumi.Output<boolean | undefined>;
    /**
     * Identifier of a cloud init file that will be applied on the device.
     */
    public readonly cloudInitFileId!: pulumi.Output<string | undefined>;
    /**
     * An object that has the cluster details. See
     * Cluster Details below for more details.
     */
    public readonly clusterDetails!: pulumi.Output<outputs.networkedge.DeviceClusterDetails | undefined>;
    /**
     * Number of CPU cores used by device.
     */
    public readonly coreCount!: pulumi.Output<number>;
    /**
     * Device hostname prefix.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * Device location Equinix Business Exchange name.
     */
    public /*out*/ readonly ibx!: pulumi.Output<string>;
    /**
     * Number of network interfaces on a device. If not specified,
     * default number for a given device type will be used.
     */
    public readonly interfaceCount!: pulumi.Output<number>;
    /**
     * List of device interfaces. See Interface Attribute below
     * for more details.
     */
    public /*out*/ readonly interfaces!: pulumi.Output<outputs.networkedge.DeviceInterface[]>;
    /**
     * Path to the license file that will be uploaded and applied on a
     * device. Applicable for some device types in BYOL licensing mode.
     */
    public readonly licenseFile!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a license file that will be applied on the device.
     */
    public readonly licenseFileId!: pulumi.Output<string>;
    /**
     * Device license registration status. Possible values are `APPLYING_LICENSE`,
     * `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     */
    public /*out*/ readonly licenseStatus!: pulumi.Output<string>;
    /**
     * License Token applicable for some device types in BYOL licensing
     * mode.
     */
    public readonly licenseToken!: pulumi.Output<string | undefined>;
    /**
     * Device location metro code.
     */
    public readonly metroCode!: pulumi.Output<string>;
    /**
     * Identifier of an MGMT interface ACL template that will be
     * applied on the device.
     */
    public readonly mgmtAclTemplateUuid!: pulumi.Output<string | undefined>;
    /**
     * Device name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of email addresses that will receive device status
     * notifications.
     */
    public readonly notifications!: pulumi.Output<string[]>;
    /**
     * Name/number used to identify device order on the invoice.
     */
    public readonly orderReference!: pulumi.Output<string | undefined>;
    /**
     * Device software package code.
     */
    public readonly packageCode!: pulumi.Output<string>;
    /**
     * Purchase order number associated with a device order.
     */
    public readonly purchaseOrderNumber!: pulumi.Output<string | undefined>;
    /**
     * Device redundancy type applicable for HA devices, either
     * primary or secondary.
     */
    public /*out*/ readonly redundancyType!: pulumi.Output<string>;
    /**
     * Unique identifier for a redundant device applicable for HA devices.
     */
    public /*out*/ readonly redundantId!: pulumi.Output<string>;
    /**
     * Device location region.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * Definition of secondary device for redundant
     * device configurations. See Secondary Device below for more details.
     */
    public readonly secondaryDevice!: pulumi.Output<outputs.networkedge.DeviceSecondaryDevice | undefined>;
    /**
     * Boolean value that determines device management mode, i.e.,
     * `self-managed` or `Equinix-managed` (default).
     */
    public readonly selfManaged!: pulumi.Output<boolean | undefined>;
    /**
     * IP address of SSH enabled interface on the device.
     */
    public /*out*/ readonly sshIpAddress!: pulumi.Output<string>;
    /**
     * FQDN of SSH enabled interface on the device.
     */
    public /*out*/ readonly sshIpFqdn!: pulumi.Output<string>;
    /**
     * Definition of SSH key that will be provisioned on a device
     */
    public readonly sshKey!: pulumi.Output<outputs.networkedge.DeviceSshKey | undefined>;
    /**
     * interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Device term length.
     */
    public readonly termLength!: pulumi.Output<number>;
    /**
     * Device license throughput.
     */
    public readonly throughput!: pulumi.Output<number | undefined>;
    /**
     * License throughput unit. One of `Mbps` or `Gbps`.
     */
    public readonly throughputUnit!: pulumi.Output<string | undefined>;
    /**
     * Device type code.
     */
    public readonly typeCode!: pulumi.Output<string>;
    /**
     * Device unique identifier.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;
    /**
     * Map of vendor specific configuration parameters for a device
     * (controller1, activationKey, managementType, siteId, systemIpAddress)
     * * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
     * on a device (max one key).  See SSH Key below for more details.
     */
    public readonly vendorConfiguration!: pulumi.Output<{[key: string]: string}>;
    /**
     * Device software software version.
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * device interface id picked for WAN
     */
    public readonly wanInterfaceId!: pulumi.Output<string | undefined>;
    /**
     * Device location zone code.
     */
    public /*out*/ readonly zoneCode!: pulumi.Output<string>;

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
            resourceInputs["accountNumber"] = state ? state.accountNumber : undefined;
            resourceInputs["aclTemplateId"] = state ? state.aclTemplateId : undefined;
            resourceInputs["additionalBandwidth"] = state ? state.additionalBandwidth : undefined;
            resourceInputs["asn"] = state ? state.asn : undefined;
            resourceInputs["byol"] = state ? state.byol : undefined;
            resourceInputs["cloudInitFileId"] = state ? state.cloudInitFileId : undefined;
            resourceInputs["clusterDetails"] = state ? state.clusterDetails : undefined;
            resourceInputs["coreCount"] = state ? state.coreCount : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ibx"] = state ? state.ibx : undefined;
            resourceInputs["interfaceCount"] = state ? state.interfaceCount : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["licenseFile"] = state ? state.licenseFile : undefined;
            resourceInputs["licenseFileId"] = state ? state.licenseFileId : undefined;
            resourceInputs["licenseStatus"] = state ? state.licenseStatus : undefined;
            resourceInputs["licenseToken"] = state ? state.licenseToken : undefined;
            resourceInputs["metroCode"] = state ? state.metroCode : undefined;
            resourceInputs["mgmtAclTemplateUuid"] = state ? state.mgmtAclTemplateUuid : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["orderReference"] = state ? state.orderReference : undefined;
            resourceInputs["packageCode"] = state ? state.packageCode : undefined;
            resourceInputs["purchaseOrderNumber"] = state ? state.purchaseOrderNumber : undefined;
            resourceInputs["redundancyType"] = state ? state.redundancyType : undefined;
            resourceInputs["redundantId"] = state ? state.redundantId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["secondaryDevice"] = state ? state.secondaryDevice : undefined;
            resourceInputs["selfManaged"] = state ? state.selfManaged : undefined;
            resourceInputs["sshIpAddress"] = state ? state.sshIpAddress : undefined;
            resourceInputs["sshIpFqdn"] = state ? state.sshIpFqdn : undefined;
            resourceInputs["sshKey"] = state ? state.sshKey : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["termLength"] = state ? state.termLength : undefined;
            resourceInputs["throughput"] = state ? state.throughput : undefined;
            resourceInputs["throughputUnit"] = state ? state.throughputUnit : undefined;
            resourceInputs["typeCode"] = state ? state.typeCode : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["vendorConfiguration"] = state ? state.vendorConfiguration : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["wanInterfaceId"] = state ? state.wanInterfaceId : undefined;
            resourceInputs["zoneCode"] = state ? state.zoneCode : undefined;
        } else {
            const args = argsOrState as DeviceArgs | undefined;
            if ((!args || args.accountNumber === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountNumber'");
            }
            if ((!args || args.coreCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'coreCount'");
            }
            if ((!args || args.metroCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metroCode'");
            }
            if ((!args || args.notifications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notifications'");
            }
            if ((!args || args.packageCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'packageCode'");
            }
            if ((!args || args.termLength === undefined) && !opts.urn) {
                throw new Error("Missing required property 'termLength'");
            }
            if ((!args || args.typeCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'typeCode'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["accountNumber"] = args ? args.accountNumber : undefined;
            resourceInputs["aclTemplateId"] = args ? args.aclTemplateId : undefined;
            resourceInputs["additionalBandwidth"] = args ? args.additionalBandwidth : undefined;
            resourceInputs["byol"] = args ? args.byol : undefined;
            resourceInputs["cloudInitFileId"] = args ? args.cloudInitFileId : undefined;
            resourceInputs["clusterDetails"] = args ? args.clusterDetails : undefined;
            resourceInputs["coreCount"] = args ? args.coreCount : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["interfaceCount"] = args ? args.interfaceCount : undefined;
            resourceInputs["licenseFile"] = args ? args.licenseFile : undefined;
            resourceInputs["licenseFileId"] = args ? args.licenseFileId : undefined;
            resourceInputs["licenseToken"] = args ? args.licenseToken : undefined;
            resourceInputs["metroCode"] = args ? args.metroCode : undefined;
            resourceInputs["mgmtAclTemplateUuid"] = args ? args.mgmtAclTemplateUuid : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["orderReference"] = args ? args.orderReference : undefined;
            resourceInputs["packageCode"] = args ? args.packageCode : undefined;
            resourceInputs["purchaseOrderNumber"] = args ? args.purchaseOrderNumber : undefined;
            resourceInputs["secondaryDevice"] = args ? args.secondaryDevice : undefined;
            resourceInputs["selfManaged"] = args ? args.selfManaged : undefined;
            resourceInputs["sshKey"] = args ? args.sshKey : undefined;
            resourceInputs["termLength"] = args ? args.termLength : undefined;
            resourceInputs["throughput"] = args ? args.throughput : undefined;
            resourceInputs["throughputUnit"] = args ? args.throughputUnit : undefined;
            resourceInputs["typeCode"] = args ? args.typeCode : undefined;
            resourceInputs["vendorConfiguration"] = args ? args.vendorConfiguration : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["wanInterfaceId"] = args ? args.wanInterfaceId : undefined;
            resourceInputs["asn"] = undefined /*out*/;
            resourceInputs["ibx"] = undefined /*out*/;
            resourceInputs["interfaces"] = undefined /*out*/;
            resourceInputs["licenseStatus"] = undefined /*out*/;
            resourceInputs["redundancyType"] = undefined /*out*/;
            resourceInputs["redundantId"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["sshIpAddress"] = undefined /*out*/;
            resourceInputs["sshIpFqdn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
            resourceInputs["zoneCode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Device.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Device resources.
 */
export interface DeviceState {
    /**
     * Billing account number for a device.
     */
    accountNumber?: pulumi.Input<string>;
    /**
     * Identifier of a WAN interface ACL template that will be applied on the device.
     */
    aclTemplateId?: pulumi.Input<string>;
    /**
     * Additional Internet bandwidth, in Mbps, that will be
     * allocated to the device (in addition to default 15Mbps).
     */
    additionalBandwidth?: pulumi.Input<number>;
    /**
     * (Autonomous System Number) Unique identifier for a network on the internet.
     */
    asn?: pulumi.Input<number>;
    /**
     * Boolean value that determines device licensing mode, i.e.,
     * `bring your own license` or `subscription` (default).
     */
    byol?: pulumi.Input<boolean>;
    /**
     * Identifier of a cloud init file that will be applied on the device.
     */
    cloudInitFileId?: pulumi.Input<string>;
    /**
     * An object that has the cluster details. See
     * Cluster Details below for more details.
     */
    clusterDetails?: pulumi.Input<inputs.networkedge.DeviceClusterDetails>;
    /**
     * Number of CPU cores used by device.
     */
    coreCount?: pulumi.Input<number>;
    /**
     * Device hostname prefix.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Device location Equinix Business Exchange name.
     */
    ibx?: pulumi.Input<string>;
    /**
     * Number of network interfaces on a device. If not specified,
     * default number for a given device type will be used.
     */
    interfaceCount?: pulumi.Input<number>;
    /**
     * List of device interfaces. See Interface Attribute below
     * for more details.
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceInterface>[]>;
    /**
     * Path to the license file that will be uploaded and applied on a
     * device. Applicable for some device types in BYOL licensing mode.
     */
    licenseFile?: pulumi.Input<string>;
    /**
     * Identifier of a license file that will be applied on the device.
     */
    licenseFileId?: pulumi.Input<string>;
    /**
     * Device license registration status. Possible values are `APPLYING_LICENSE`,
     * `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     */
    licenseStatus?: pulumi.Input<string>;
    /**
     * License Token applicable for some device types in BYOL licensing
     * mode.
     */
    licenseToken?: pulumi.Input<string>;
    /**
     * Device location metro code.
     */
    metroCode?: pulumi.Input<string>;
    /**
     * Identifier of an MGMT interface ACL template that will be
     * applied on the device.
     */
    mgmtAclTemplateUuid?: pulumi.Input<string>;
    /**
     * Device name.
     */
    name?: pulumi.Input<string>;
    /**
     * List of email addresses that will receive device status
     * notifications.
     */
    notifications?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name/number used to identify device order on the invoice.
     */
    orderReference?: pulumi.Input<string>;
    /**
     * Device software package code.
     */
    packageCode?: pulumi.Input<string>;
    /**
     * Purchase order number associated with a device order.
     */
    purchaseOrderNumber?: pulumi.Input<string>;
    /**
     * Device redundancy type applicable for HA devices, either
     * primary or secondary.
     */
    redundancyType?: pulumi.Input<string>;
    /**
     * Unique identifier for a redundant device applicable for HA devices.
     */
    redundantId?: pulumi.Input<string>;
    /**
     * Device location region.
     */
    region?: pulumi.Input<string>;
    /**
     * Definition of secondary device for redundant
     * device configurations. See Secondary Device below for more details.
     */
    secondaryDevice?: pulumi.Input<inputs.networkedge.DeviceSecondaryDevice>;
    /**
     * Boolean value that determines device management mode, i.e.,
     * `self-managed` or `Equinix-managed` (default).
     */
    selfManaged?: pulumi.Input<boolean>;
    /**
     * IP address of SSH enabled interface on the device.
     */
    sshIpAddress?: pulumi.Input<string>;
    /**
     * FQDN of SSH enabled interface on the device.
     */
    sshIpFqdn?: pulumi.Input<string>;
    /**
     * Definition of SSH key that will be provisioned on a device
     */
    sshKey?: pulumi.Input<inputs.networkedge.DeviceSshKey>;
    /**
     * interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     */
    status?: pulumi.Input<string>;
    /**
     * Device term length.
     */
    termLength?: pulumi.Input<number>;
    /**
     * Device license throughput.
     */
    throughput?: pulumi.Input<number>;
    /**
     * License throughput unit. One of `Mbps` or `Gbps`.
     */
    throughputUnit?: pulumi.Input<string | enums.networkedge.ThroughputUnit>;
    /**
     * Device type code.
     */
    typeCode?: pulumi.Input<string>;
    /**
     * Device unique identifier.
     */
    uuid?: pulumi.Input<string>;
    /**
     * Map of vendor specific configuration parameters for a device
     * (controller1, activationKey, managementType, siteId, systemIpAddress)
     * * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
     * on a device (max one key).  See SSH Key below for more details.
     */
    vendorConfiguration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device software software version.
     */
    version?: pulumi.Input<string>;
    /**
     * device interface id picked for WAN
     */
    wanInterfaceId?: pulumi.Input<string>;
    /**
     * Device location zone code.
     */
    zoneCode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Device resource.
 */
export interface DeviceArgs {
    /**
     * Billing account number for a device.
     */
    accountNumber: pulumi.Input<string>;
    /**
     * Identifier of a WAN interface ACL template that will be applied on the device.
     */
    aclTemplateId?: pulumi.Input<string>;
    /**
     * Additional Internet bandwidth, in Mbps, that will be
     * allocated to the device (in addition to default 15Mbps).
     */
    additionalBandwidth?: pulumi.Input<number>;
    /**
     * Boolean value that determines device licensing mode, i.e.,
     * `bring your own license` or `subscription` (default).
     */
    byol?: pulumi.Input<boolean>;
    /**
     * Identifier of a cloud init file that will be applied on the device.
     */
    cloudInitFileId?: pulumi.Input<string>;
    /**
     * An object that has the cluster details. See
     * Cluster Details below for more details.
     */
    clusterDetails?: pulumi.Input<inputs.networkedge.DeviceClusterDetails>;
    /**
     * Number of CPU cores used by device.
     */
    coreCount: pulumi.Input<number>;
    /**
     * Device hostname prefix.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Number of network interfaces on a device. If not specified,
     * default number for a given device type will be used.
     */
    interfaceCount?: pulumi.Input<number>;
    /**
     * Path to the license file that will be uploaded and applied on a
     * device. Applicable for some device types in BYOL licensing mode.
     */
    licenseFile?: pulumi.Input<string>;
    /**
     * Identifier of a license file that will be applied on the device.
     */
    licenseFileId?: pulumi.Input<string>;
    /**
     * License Token applicable for some device types in BYOL licensing
     * mode.
     */
    licenseToken?: pulumi.Input<string>;
    /**
     * Device location metro code.
     */
    metroCode: pulumi.Input<string>;
    /**
     * Identifier of an MGMT interface ACL template that will be
     * applied on the device.
     */
    mgmtAclTemplateUuid?: pulumi.Input<string>;
    /**
     * Device name.
     */
    name?: pulumi.Input<string>;
    /**
     * List of email addresses that will receive device status
     * notifications.
     */
    notifications: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name/number used to identify device order on the invoice.
     */
    orderReference?: pulumi.Input<string>;
    /**
     * Device software package code.
     */
    packageCode: pulumi.Input<string>;
    /**
     * Purchase order number associated with a device order.
     */
    purchaseOrderNumber?: pulumi.Input<string>;
    /**
     * Definition of secondary device for redundant
     * device configurations. See Secondary Device below for more details.
     */
    secondaryDevice?: pulumi.Input<inputs.networkedge.DeviceSecondaryDevice>;
    /**
     * Boolean value that determines device management mode, i.e.,
     * `self-managed` or `Equinix-managed` (default).
     */
    selfManaged?: pulumi.Input<boolean>;
    /**
     * Definition of SSH key that will be provisioned on a device
     */
    sshKey?: pulumi.Input<inputs.networkedge.DeviceSshKey>;
    /**
     * Device term length.
     */
    termLength: pulumi.Input<number>;
    /**
     * Device license throughput.
     */
    throughput?: pulumi.Input<number>;
    /**
     * License throughput unit. One of `Mbps` or `Gbps`.
     */
    throughputUnit?: pulumi.Input<string | enums.networkedge.ThroughputUnit>;
    /**
     * Device type code.
     */
    typeCode: pulumi.Input<string>;
    /**
     * Map of vendor specific configuration parameters for a device
     * (controller1, activationKey, managementType, siteId, systemIpAddress)
     * * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
     * on a device (max one key).  See SSH Key below for more details.
     */
    vendorConfiguration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device software software version.
     */
    version: pulumi.Input<string>;
    /**
     * device interface id picked for WAN
     */
    wanInterfaceId?: pulumi.Input<string>;
}
