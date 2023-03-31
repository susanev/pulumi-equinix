// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manage the membership of existing and new invitees within an Equinix Metal organization and its projects.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const organizationId = config.require("organizationId");
 * const projectId = config.require("projectId");
 * const userEmailAddress = config.require("userEmailAddress");
 * const member = new equinix.metal.OrganizationMember("member", {
 *     invitee: userEmailAddress,
 *     roles: ["limited_collaborator"],
 *     projectsIds: [projectId],
 *     organizationId: organizationId,
 * });
 * export const memberId = member.id;
 * export const memberState = member.state;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the `invitee` and `organization_id` as colon separated arguments: <break><break>```sh<break> $ pulumi import equinix:metal/organizationMember:OrganizationMember resource_name {invitee}:{organization_id} <break>```<break><break>
 */
export class OrganizationMember extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationMemberState, opts?: pulumi.CustomResourceOptions): OrganizationMember {
        return new OrganizationMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/organizationMember:OrganizationMember';

    /**
     * Returns true if the given object is an instance of OrganizationMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationMember.__pulumiType;
    }

    /**
     * When the invitation was created (only known in the invitation stage)
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The userId of the user that sent the invitation (only known in the invitation stage)
     */
    public /*out*/ readonly invitedBy!: pulumi.Output<string>;
    /**
     * The email address of the user to invite
     */
    public readonly invitee!: pulumi.Output<string>;
    /**
     * A message to include in the emailed invitation.
     */
    public readonly message!: pulumi.Output<string | undefined>;
    /**
     * The nonce for the invitation (only known in the invitation stage)
     */
    public /*out*/ readonly nonce!: pulumi.Output<string>;
    /**
     * The organization to invite the user to
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
     */
    public readonly projectsIds!: pulumi.Output<string[]>;
    /**
     * Organization roles (admin, collaborator, limited_collaborator, billing)
     */
    public readonly roles!: pulumi.Output<string[]>;
    /**
     * The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * When the invitation was updated (only known in the invitation stage)
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a OrganizationMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationMemberArgs | OrganizationMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationMemberState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["invitedBy"] = state ? state.invitedBy : undefined;
            resourceInputs["invitee"] = state ? state.invitee : undefined;
            resourceInputs["message"] = state ? state.message : undefined;
            resourceInputs["nonce"] = state ? state.nonce : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["projectsIds"] = state ? state.projectsIds : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as OrganizationMemberArgs | undefined;
            if ((!args || args.invitee === undefined) && !opts.urn) {
                throw new Error("Missing required property 'invitee'");
            }
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.projectsIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectsIds'");
            }
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            resourceInputs["invitee"] = args ? args.invitee : undefined;
            resourceInputs["message"] = args ? args.message : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["projectsIds"] = args ? args.projectsIds : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["invitedBy"] = undefined /*out*/;
            resourceInputs["nonce"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationMember resources.
 */
export interface OrganizationMemberState {
    /**
     * When the invitation was created (only known in the invitation stage)
     */
    created?: pulumi.Input<string>;
    /**
     * The userId of the user that sent the invitation (only known in the invitation stage)
     */
    invitedBy?: pulumi.Input<string>;
    /**
     * The email address of the user to invite
     */
    invitee?: pulumi.Input<string>;
    /**
     * A message to include in the emailed invitation.
     */
    message?: pulumi.Input<string>;
    /**
     * The nonce for the invitation (only known in the invitation stage)
     */
    nonce?: pulumi.Input<string>;
    /**
     * The organization to invite the user to
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
     */
    projectsIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Organization roles (admin, collaborator, limited_collaborator, billing)
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
     */
    state?: pulumi.Input<string>;
    /**
     * When the invitation was updated (only known in the invitation stage)
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationMember resource.
 */
export interface OrganizationMemberArgs {
    /**
     * The email address of the user to invite
     */
    invitee: pulumi.Input<string>;
    /**
     * A message to include in the emailed invitation.
     */
    message?: pulumi.Input<string>;
    /**
     * The organization to invite the user to
     */
    organizationId: pulumi.Input<string>;
    /**
     * Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
     */
    projectsIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Organization roles (admin, collaborator, limited_collaborator, billing)
     */
    roles: pulumi.Input<pulumi.Input<string>[]>;
}
