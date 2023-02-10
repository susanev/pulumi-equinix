// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class GetFacilityCapacityInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device plan that must be available in selected location.
        /// </summary>
        [Input("plan", required: true)]
        public Input<string> Plan { get; set; } = null!;

        /// <summary>
        /// Minimun number of devices that must be available in selected location.
        /// Default is `1`.
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        public GetFacilityCapacityInputArgs()
        {
        }
        public static new GetFacilityCapacityInputArgs Empty => new GetFacilityCapacityInputArgs();
    }
}
