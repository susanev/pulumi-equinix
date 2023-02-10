// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class OrganizationAddressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Postal address.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// City name.
        /// </summary>
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        /// <summary>
        /// Two letter country code (ISO 3166-1 alpha-2), e.g. US.
        /// </summary>
        [Input("country", required: true)]
        public Input<string> Country { get; set; } = null!;

        /// <summary>
        /// State name.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Zip Code.
        /// </summary>
        [Input("zipCode", required: true)]
        public Input<string> ZipCode { get; set; } = null!;

        public OrganizationAddressGetArgs()
        {
        }
        public static new OrganizationAddressGetArgs Empty => new OrganizationAddressGetArgs();
    }
}
