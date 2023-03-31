// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get Equinix Metal Operating System image.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getOperatingSystem({
 *     distro: "ubuntu",
 *     version: "20.04",
 *     provisionableOn: "c3.medium.x86",
 * });
 * const server = new equinix.metal.Device("server", {
 *     hostname: "tf.ubuntu",
 *     plan: "c3.medium.x86",
 *     facilities: ["ny5"],
 *     operatingSystem: example.then(example => example.id).apply((x) => @equinix-labs/pulumi-equinix.metal.operatingsystem.OperatingSystem[x]),
 *     billingCycle: "hourly",
 *     projectId: local.project_id,
 * });
 * ```
 */
export function getOperatingSystem(args?: GetOperatingSystemArgs, opts?: pulumi.InvokeOptions): Promise<GetOperatingSystemResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getOperatingSystem:getOperatingSystem", {
        "distro": args.distro,
        "name": args.name,
        "provisionableOn": args.provisionableOn,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getOperatingSystem.
 */
export interface GetOperatingSystemArgs {
    /**
     * Name of the OS distribution.
     */
    distro?: string;
    /**
     * Name or part of the name of the distribution. Case insensitive.
     */
    name?: string;
    /**
     * Plan name.
     */
    provisionableOn?: string;
    /**
     * Version of the distribution.
     */
    version?: string;
}

/**
 * A collection of values returned by getOperatingSystem.
 */
export interface GetOperatingSystemResult {
    readonly distro?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly provisionableOn?: string;
    /**
     * Operating system slug (same as `id`).
     */
    readonly slug: string;
    readonly version?: string;
}
/**
 * Use this data source to get Equinix Metal Operating System image.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getOperatingSystem({
 *     distro: "ubuntu",
 *     version: "20.04",
 *     provisionableOn: "c3.medium.x86",
 * });
 * const server = new equinix.metal.Device("server", {
 *     hostname: "tf.ubuntu",
 *     plan: "c3.medium.x86",
 *     facilities: ["ny5"],
 *     operatingSystem: example.then(example => example.id).apply((x) => @equinix-labs/pulumi-equinix.metal.operatingsystem.OperatingSystem[x]),
 *     billingCycle: "hourly",
 *     projectId: local.project_id,
 * });
 * ```
 */
export function getOperatingSystemOutput(args?: GetOperatingSystemOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOperatingSystemResult> {
    return pulumi.output(args).apply((a: any) => getOperatingSystem(a, opts))
}

/**
 * A collection of arguments for invoking getOperatingSystem.
 */
export interface GetOperatingSystemOutputArgs {
    /**
     * Name of the OS distribution.
     */
    distro?: pulumi.Input<string>;
    /**
     * Name or part of the name of the distribution. Case insensitive.
     */
    name?: pulumi.Input<string>;
    /**
     * Plan name.
     */
    provisionableOn?: pulumi.Input<string>;
    /**
     * Version of the distribution.
     */
    version?: pulumi.Input<string>;
}
