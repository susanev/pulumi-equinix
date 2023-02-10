// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

export function getConnection(args?: GetConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("equinix:fabric/getConnection:getConnection", {
        "projects": args.projects,
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionArgs {
    /**
     * Project information
     */
    projects?: inputs.fabric.GetConnectionProject[];
    /**
     * Equinix-assigned connection identifier
     */
    uuid?: string;
}

/**
 * A collection of values returned by getConnection.
 */
export interface GetConnectionResult {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    readonly aSides: outputs.fabric.GetConnectionASide[];
    /**
     * Customer account information that is associated with this connection
     */
    readonly accounts: outputs.fabric.GetConnectionAccount[];
    /**
     * Connection additional information
     */
    readonly additionalInfos: outputs.fabric.GetConnectionAdditionalInfo[];
    /**
     * Connection bandwidth in Mbps
     */
    readonly bandwidth: number;
    /**
     * Captures connection lifecycle change information
     */
    readonly changeLogs: outputs.fabric.GetConnectionChangeLog[];
    /**
     * Customer-provided connection description
     */
    readonly description: string;
    /**
     * Connection directionality from the requester point of view
     */
    readonly direction: string;
    /**
     * Connection URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Connection property derived from access point locations
     */
    readonly isRemote: boolean;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    readonly name: string;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    readonly notifications: outputs.fabric.GetConnectionNotification[];
    /**
     * Connection specific operational data
     */
    readonly operations: outputs.fabric.GetConnectionOperation[];
    /**
     * Order related to this connection information
     */
    readonly orders: outputs.fabric.GetConnectionOrder[];
    /**
     * Project information
     */
    readonly projects?: outputs.fabric.GetConnectionProject[];
    /**
     * Redundancy Information
     */
    readonly redundancies: outputs.fabric.GetConnectionRedundancy[];
    /**
     * Connection overall state
     */
    readonly state: string;
    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     */
    readonly type: string;
    /**
     * Equinix-assigned connection identifier
     */
    readonly uuid?: string;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    readonly zSides: outputs.fabric.GetConnectionZSide[];
}

export function getConnectionOutput(args?: GetConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionResult> {
    return pulumi.output(args).apply(a => getConnection(a, opts))
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionOutputArgs {
    /**
     * Project information
     */
    projects?: pulumi.Input<pulumi.Input<inputs.fabric.GetConnectionProjectArgs>[]>;
    /**
     * Equinix-assigned connection identifier
     */
    uuid?: pulumi.Input<string>;
}
