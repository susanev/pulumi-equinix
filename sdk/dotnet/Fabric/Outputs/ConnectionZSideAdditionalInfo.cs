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
    public sealed class ConnectionZSideAdditionalInfo
    {
        /// <summary>
        /// Additional information key
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Additional information value
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ConnectionZSideAdditionalInfo(
            string? key,

            string? value)
        {
            Key = key;
            Value = value;
        }
    }
}
