// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.SshUser` allows creation and management of Equinix Network
 * Edge SSH users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const device1Id = config.require("device1Id");
 * const device2Id = config.require("device2Id");
 * const sshUser = new equinix.networkedge.SshUser("sshUser", {
 *     username: "johnKent",
 *     deviceIds: [
 *         device1Id,
 *         device2Id,
 *     ],
 * });
 * export const sshUserId = sshUser.id;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID: <break><break>```sh<break> $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id} <break>```<break><break>
 */
export class SshUser extends pulumi.CustomResource {
    /**
     * Get an existing SshUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshUserState, opts?: pulumi.CustomResourceOptions): SshUser {
        return new SshUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:networkedge/sshUser:SshUser';

    /**
     * Returns true if the given object is an instance of SshUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshUser.__pulumiType;
    }

    /**
     * list of device identifiers to which user will have access.
     */
    public readonly deviceIds!: pulumi.Output<string[]>;
    /**
     * SSH user password.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * SSH user login name.
     */
    public readonly username!: pulumi.Output<string>;
    /**
     * SSH user unique identifier.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a SshUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshUserArgs | SshUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshUserState | undefined;
            resourceInputs["deviceIds"] = state ? state.deviceIds : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as SshUserArgs | undefined;
            if ((!args || args.deviceIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceIds'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["deviceIds"] = args ? args.deviceIds : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SshUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshUser resources.
 */
export interface SshUserState {
    /**
     * list of device identifiers to which user will have access.
     */
    deviceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * SSH user password.
     */
    password?: pulumi.Input<string>;
    /**
     * SSH user login name.
     */
    username?: pulumi.Input<string>;
    /**
     * SSH user unique identifier.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshUser resource.
 */
export interface SshUserArgs {
    /**
     * list of device identifiers to which user will have access.
     */
    deviceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * SSH user password.
     */
    password: pulumi.Input<string>;
    /**
     * SSH user login name.
     */
    username: pulumi.Input<string>;
}
