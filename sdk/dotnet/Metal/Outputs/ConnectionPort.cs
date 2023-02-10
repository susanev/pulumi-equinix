// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Outputs
{

    [OutputType]
    public sealed class ConnectionPort
    {
        public readonly string? Id;
        public readonly string? LinkStatus;
        /// <summary>
        /// Name of the connection resource
        /// </summary>
        public readonly string? Name;
        public readonly string? Role;
        /// <summary>
        /// Connection speed - one of 50Mbps, 200Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps.
        /// </summary>
        public readonly int? Speed;
        /// <summary>
        /// Status of the connection resource.
        /// </summary>
        public readonly string? Status;
        public readonly ImmutableArray<object> VirtualCircuitIds;

        [OutputConstructor]
        private ConnectionPort(
            string? id,

            string? linkStatus,

            string? name,

            string? role,

            int? speed,

            string? status,

            ImmutableArray<object> virtualCircuitIds)
        {
            Id = id;
            LinkStatus = linkStatus;
            Name = name;
            Role = role;
            Speed = speed;
            Status = status;
            VirtualCircuitIds = virtualCircuitIds;
        }
    }
}
