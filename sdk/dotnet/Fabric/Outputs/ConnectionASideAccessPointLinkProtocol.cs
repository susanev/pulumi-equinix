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
    public sealed class ConnectionASideAccessPointLinkProtocol
    {
        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        public readonly string? Type;
        public readonly int? VlanCTag;
        public readonly int? VlanSTag;
        public readonly int? VlanTag;

        [OutputConstructor]
        private ConnectionASideAccessPointLinkProtocol(
            string? type,

            int? vlanCTag,

            int? vlanSTag,

            int? vlanTag)
        {
            Type = type;
            VlanCTag = vlanCTag;
            VlanSTag = vlanSTag;
            VlanTag = vlanTag;
        }
    }
}
