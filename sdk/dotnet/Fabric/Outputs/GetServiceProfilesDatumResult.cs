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
    public sealed class GetServiceProfilesDatumResult
    {
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigResult> AccessPointTypeConfigs;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumAccountResult> Accounts;
        public readonly ImmutableArray<string> AllowedEmails;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumChangeLogResult> ChangeLogs;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumCustomFieldResult> CustomFields;
        public readonly string Description;
        public readonly string Href;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumMarketingInfoResult> MarketingInfos;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumMetroResult> Metros;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumNotificationResult> Notifications;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumPortResult> Ports;
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumProjectResult> Projects;
        public readonly bool SelfProfile;
        public readonly string? State;
        public readonly ImmutableArray<string> Tags;
        public readonly string Type;
        public readonly string? Uuid;
        public readonly string Visibility;

        [OutputConstructor]
        private GetServiceProfilesDatumResult(
            ImmutableArray<Outputs.GetServiceProfilesDatumAccessPointTypeConfigResult> accessPointTypeConfigs,

            ImmutableArray<Outputs.GetServiceProfilesDatumAccountResult> accounts,

            ImmutableArray<string> allowedEmails,

            ImmutableArray<Outputs.GetServiceProfilesDatumChangeLogResult> changeLogs,

            ImmutableArray<Outputs.GetServiceProfilesDatumCustomFieldResult> customFields,

            string description,

            string href,

            ImmutableArray<Outputs.GetServiceProfilesDatumMarketingInfoResult> marketingInfos,

            ImmutableArray<Outputs.GetServiceProfilesDatumMetroResult> metros,

            string name,

            ImmutableArray<Outputs.GetServiceProfilesDatumNotificationResult> notifications,

            ImmutableArray<Outputs.GetServiceProfilesDatumPortResult> ports,

            ImmutableArray<Outputs.GetServiceProfilesDatumProjectResult> projects,

            bool selfProfile,

            string? state,

            ImmutableArray<string> tags,

            string type,

            string? uuid,

            string visibility)
        {
            AccessPointTypeConfigs = accessPointTypeConfigs;
            Accounts = accounts;
            AllowedEmails = allowedEmails;
            ChangeLogs = changeLogs;
            CustomFields = customFields;
            Description = description;
            Href = href;
            MarketingInfos = marketingInfos;
            Metros = metros;
            Name = name;
            Notifications = notifications;
            Ports = ports;
            Projects = projects;
            SelfProfile = selfProfile;
            State = state;
            Tags = tags;
            Type = type;
            Uuid = uuid;
            Visibility = visibility;
        }
    }
}
