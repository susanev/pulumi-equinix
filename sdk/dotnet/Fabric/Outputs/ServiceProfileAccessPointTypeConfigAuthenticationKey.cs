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
    public sealed class ServiceProfileAccessPointTypeConfigAuthenticationKey
    {
        /// <summary>
        /// User-provided service description
        /// </summary>
        public readonly string? Description;
        public readonly string? Label;
        public readonly bool? Required;

        [OutputConstructor]
        private ServiceProfileAccessPointTypeConfigAuthenticationKey(
            string? description,

            string? label,

            bool? required)
        {
            Description = description;
            Label = label;
            Required = required;
        }
    }
}
