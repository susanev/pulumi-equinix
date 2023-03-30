// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Outputs
{

    [OutputType]
    public sealed class DeviceSshKey
    {
        public readonly string KeyName;
        /// <summary>
        /// username associated with given key.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private DeviceSshKey(
            string keyName,

            string username)
        {
            KeyName = keyName;
            Username = username;
        }
    }
}
