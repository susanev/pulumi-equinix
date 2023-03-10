// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetPortDeviceResult
    {
        /// <summary>
        /// Port name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Port redundancy information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortDeviceRedundancyResult> Redundancies;

        [OutputConstructor]
        private GetPortDeviceResult(
            string name,

            ImmutableArray<Outputs.GetPortDeviceRedundancyResult> redundancies)
        {
            Name = name;
            Redundancies = redundancies;
        }
    }
}