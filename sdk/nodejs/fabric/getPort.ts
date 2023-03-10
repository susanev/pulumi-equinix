// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

export function getPort(args: GetPortArgs, opts?: pulumi.InvokeOptions): Promise<GetPortResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getPort:getPort", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getPort.
 */
export interface GetPortArgs {
    /**
     * Equinix-assigned port identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getPort.
 */
export interface GetPortResult {
    /**
     * Customer account information that is associated with this port
     */
    readonly accounts: outputs.fabric.GetPortAccount[];
    /**
     * Port available bandwidth in Mbps
     */
    readonly availableBandwidth: number;
    /**
     * Port bandwidth in Mbps
     */
    readonly bandwidth: number;
    /**
     * Captures port lifecycle change information
     */
    readonly changeLogs: outputs.fabric.GetPortChangeLog[];
    /**
     * Port description
     */
    readonly description: string;
    /**
     * Port device
     */
    readonly devices: outputs.fabric.GetPortDevice[];
    /**
     * Port encapsulation protocol
     */
    readonly encapsulations: outputs.fabric.GetPortEncapsulation[];
    /**
     * Port URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Port Lag
     */
    readonly lags: outputs.fabric.GetPortLag[];
    /**
     * Port location information
     */
    readonly locations: outputs.fabric.GetPortLocation[];
    /**
     * Port name
     */
    readonly name: string;
    /**
     * Port specific operational data
     */
    readonly operations: outputs.fabric.GetPortOperation[];
    /**
     * Port redundancy information
     */
    readonly redundancies: outputs.fabric.GetPortRedundancy[];
    /**
     * Port service type
     */
    readonly serviceType: string;
    /**
     * Port state
     */
    readonly state: string;
    /**
     * Port type
     */
    readonly type: string;
    /**
     * Port used bandwidth in Mbps
     */
    readonly usedBandwidth: number;
    /**
     * Equinix-assigned port identifier
     */
    readonly uuid: string;
}
export function getPortOutput(args: GetPortOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPortResult> {
    return pulumi.output(args).apply((a: any) => getPort(a, opts))
}

/**
 * A collection of arguments for invoking getPort.
 */
export interface GetPortOutputArgs {
    /**
     * Equinix-assigned port identifier
     */
    uuid: pulumi.Input<string>;
}