// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this datasource to retrieve attributes of a Project SSH Key API resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const myKey = equinix.metal.getProjectSshKey({
 *     search: "username@hostname",
 *     projectId: local.project_id,
 * });
 * ```
 */
export function getProjectSshKey(args: GetProjectSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectSshKeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getProjectSshKey:getProjectSshKey", {
        "id": args.id,
        "projectId": args.projectId,
        "search": args.search,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectSshKey.
 */
export interface GetProjectSshKeyArgs {
    /**
     * The id of the SSH Key to search for in the Equinix Metal project.
     */
    id?: string;
    /**
     * The Equinix Metal project id of the Equinix Metal SSH Key.
     */
    projectId: string;
    /**
     * The name, fingerprint, or publicKey of the SSH Key to search for
     * in the Equinix Metal project.
     */
    search?: string;
}

/**
 * A collection of values returned by getProjectSshKey.
 */
export interface GetProjectSshKeyResult {
    /**
     * The timestamp for when the SSH key was created.
     */
    readonly created: string;
    /**
     * The fingerprint of the SSH key.
     */
    readonly fingerprint: string;
    /**
     * The unique ID of the key.
     */
    readonly id: string;
    /**
     * The name of the SSH key.
     */
    readonly name: string;
    /**
     * The ID of parent project (same as project_id).
     */
    readonly ownerId: string;
    /**
     * The ID of parent project.
     */
    readonly projectId: string;
    /**
     * The text of the public key.
     */
    readonly publicKey: string;
    readonly search?: string;
    /**
     * The timestamp for the last time the SSH key was updated.
     */
    readonly updated: string;
}
/**
 * Use this datasource to retrieve attributes of a Project SSH Key API resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const myKey = equinix.metal.getProjectSshKey({
 *     search: "username@hostname",
 *     projectId: local.project_id,
 * });
 * ```
 */
export function getProjectSshKeyOutput(args: GetProjectSshKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectSshKeyResult> {
    return pulumi.output(args).apply((a: any) => getProjectSshKey(a, opts))
}

/**
 * A collection of arguments for invoking getProjectSshKey.
 */
export interface GetProjectSshKeyOutputArgs {
    /**
     * The id of the SSH Key to search for in the Equinix Metal project.
     */
    id?: pulumi.Input<string>;
    /**
     * The Equinix Metal project id of the Equinix Metal SSH Key.
     */
    projectId: pulumi.Input<string>;
    /**
     * The name, fingerprint, or publicKey of the SSH Key to search for
     * in the Equinix Metal project.
     */
    search?: pulumi.Input<string>;
}
