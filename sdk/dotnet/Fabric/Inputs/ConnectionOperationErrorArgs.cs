// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionOperationErrorArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalInfo")]
        private InputList<Inputs.ConnectionOperationErrorAdditionalInfoArgs>? _additionalInfo;

        /// <summary>
        /// Connection additional information
        /// </summary>
        public InputList<Inputs.ConnectionOperationErrorAdditionalInfoArgs> AdditionalInfo
        {
            get => _additionalInfo ?? (_additionalInfo = new InputList<Inputs.ConnectionOperationErrorAdditionalInfoArgs>());
            set => _additionalInfo = value;
        }

        [Input("correlationId")]
        public Input<string>? CorrelationId { get; set; }

        [Input("details")]
        public Input<string>? Details { get; set; }

        [Input("errorCode")]
        public Input<string>? ErrorCode { get; set; }

        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("help")]
        public Input<string>? Help { get; set; }

        public ConnectionOperationErrorArgs()
        {
        }
        public static new ConnectionOperationErrorArgs Empty => new ConnectionOperationErrorArgs();
    }
}
