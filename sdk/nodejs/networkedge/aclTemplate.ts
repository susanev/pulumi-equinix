// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.AclTemplate` allows creation and management of
 * Equinix Network Edge device Access Control List templates.
 *
 * Device ACL templates give possibility to define set of rules will allowed inbound
 * traffic. Templates can be assigned to the network devices.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const aclTemplate = new equinix.networkedge.AclTemplate("aclTemplate", {
 *     name: "test",
 *     description: "Test ACL template",
 *     inboundRules: [
 *         {
 *             subnet: "1.1.1.1/32",
 *             protocol: "IP",
 *             srcPort: "any",
 *             dstPort: "any",
 *             description: "inbound rule description",
 *         },
 *         {
 *             subnet: "2.2.2.2/28",
 *             protocol: "TCP",
 *             srcPort: "any",
 *             dstPort: "any",
 *             description: "inbound rule description",
 *         },
 *     ],
 * });
 * export const templateId = aclTemplate.id;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID: <break><break>```sh<break> $ pulumi import equinix:networkedge/aclTemplate:AclTemplate example {existing_id} <break>```<break><break>
 */
export class AclTemplate extends pulumi.CustomResource {
    /**
     * Get an existing AclTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclTemplateState, opts?: pulumi.CustomResourceOptions): AclTemplate {
        return new AclTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:networkedge/aclTemplate:AclTemplate';

    /**
     * Returns true if the given object is an instance of AclTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclTemplate.__pulumiType;
    }

    /**
     * Inbound rule description, up to 200 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Status of ACL template provisioning process, where template was applied.
     * One of `PROVISIONING`, `PROVISIONED`.
     */
    public /*out*/ readonly deviceAclStatus!: pulumi.Output<string>;
    /**
     * List of the devices where the ACL template is applied.
     */
    public /*out*/ readonly deviceDetails!: pulumi.Output<outputs.networkedge.AclTemplateDeviceDetail[]>;
    /**
     * (Deprecated) Identifier of a network device where template was applied.
     *
     * @deprecated Refer to device details get device information
     */
    public /*out*/ readonly deviceId!: pulumi.Output<string>;
    /**
     * One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     */
    public readonly inboundRules!: pulumi.Output<outputs.networkedge.AclTemplateInboundRule[]>;
    /**
     * ACL template location metro code.
     *
     * @deprecated Metro Code is no longer required
     */
    public readonly metroCode!: pulumi.Output<string | undefined>;
    /**
     * ACL template name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Device uuid.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a AclTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclTemplateArgs | AclTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclTemplateState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceAclStatus"] = state ? state.deviceAclStatus : undefined;
            resourceInputs["deviceDetails"] = state ? state.deviceDetails : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["inboundRules"] = state ? state.inboundRules : undefined;
            resourceInputs["metroCode"] = state ? state.metroCode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as AclTemplateArgs | undefined;
            if ((!args || args.inboundRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inboundRules'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["inboundRules"] = args ? args.inboundRules : undefined;
            resourceInputs["metroCode"] = args ? args.metroCode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["deviceAclStatus"] = undefined /*out*/;
            resourceInputs["deviceDetails"] = undefined /*out*/;
            resourceInputs["deviceId"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclTemplate resources.
 */
export interface AclTemplateState {
    /**
     * Inbound rule description, up to 200 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Status of ACL template provisioning process, where template was applied.
     * One of `PROVISIONING`, `PROVISIONED`.
     */
    deviceAclStatus?: pulumi.Input<string>;
    /**
     * List of the devices where the ACL template is applied.
     */
    deviceDetails?: pulumi.Input<pulumi.Input<inputs.networkedge.AclTemplateDeviceDetail>[]>;
    /**
     * (Deprecated) Identifier of a network device where template was applied.
     *
     * @deprecated Refer to device details get device information
     */
    deviceId?: pulumi.Input<string>;
    /**
     * One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     */
    inboundRules?: pulumi.Input<pulumi.Input<inputs.networkedge.AclTemplateInboundRule>[]>;
    /**
     * ACL template location metro code.
     *
     * @deprecated Metro Code is no longer required
     */
    metroCode?: pulumi.Input<string>;
    /**
     * ACL template name.
     */
    name?: pulumi.Input<string>;
    /**
     * Device uuid.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclTemplate resource.
 */
export interface AclTemplateArgs {
    /**
     * Inbound rule description, up to 200 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     */
    inboundRules: pulumi.Input<pulumi.Input<inputs.networkedge.AclTemplateInboundRule>[]>;
    /**
     * ACL template location metro code.
     *
     * @deprecated Metro Code is no longer required
     */
    metroCode?: pulumi.Input<string>;
    /**
     * ACL template name.
     */
    name?: pulumi.Input<string>;
}
