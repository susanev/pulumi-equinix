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
    public sealed class GetServiceProfilesDatumAccessPointTypeConfigResult
    {
        public readonly bool AllowBandwidthAutoApproval;
        public readonly bool AllowBandwidthUpgrade;
        public readonly bool AllowCustomBandwidth;
        public readonly bool AllowRemoteConnections;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigApiConfigResult> ApiConfigs;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKeyResult> AuthenticationKeys;
        public readonly double BandwidthAlertThreshold;
        public readonly string ConnectionLabel;
        public readonly bool ConnectionRedundancyRequired;
        public readonly bool EnableAutoGenerateServiceKey;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigLinkProtocolConfigResult> LinkProtocolConfigs;
        public readonly ImmutableArray<int> SupportedBandwidths;
        public readonly string Type;
        public readonly string Uuid;

        [OutputConstructor]
        private GetServiceProfilesDatumAccessPointTypeConfigResult(
            bool allowBandwidthAutoApproval,

            bool allowBandwidthUpgrade,

            bool allowCustomBandwidth,

            bool allowRemoteConnections,

            ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigApiConfigResult> apiConfigs,

            ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKeyResult> authenticationKeys,

            double bandwidthAlertThreshold,

            string connectionLabel,

            bool connectionRedundancyRequired,

            bool enableAutoGenerateServiceKey,

            ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigLinkProtocolConfigResult> linkProtocolConfigs,

            ImmutableArray<int> supportedBandwidths,

            string type,

            string uuid)
        {
            AllowBandwidthAutoApproval = allowBandwidthAutoApproval;
            AllowBandwidthUpgrade = allowBandwidthUpgrade;
            AllowCustomBandwidth = allowCustomBandwidth;
            AllowRemoteConnections = allowRemoteConnections;
            ApiConfigs = apiConfigs;
            AuthenticationKeys = authenticationKeys;
            BandwidthAlertThreshold = bandwidthAlertThreshold;
            ConnectionLabel = connectionLabel;
            ConnectionRedundancyRequired = connectionRedundancyRequired;
            EnableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            LinkProtocolConfigs = linkProtocolConfigs;
            SupportedBandwidths = supportedBandwidths;
            Type = type;
            Uuid = uuid;
        }
    }
}