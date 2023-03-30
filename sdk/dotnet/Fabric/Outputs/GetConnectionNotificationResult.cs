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
    public sealed class GetConnectionNotificationResult
    {
        public readonly ImmutableArray<string> Emails;
        public readonly string SendInterval;
        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetConnectionNotificationResult(
            ImmutableArray<string> emails,

            string sendInterval,

            string type)
        {
            Emails = emails;
            SendInterval = sendInterval;
            Type = type;
        }
    }
}
