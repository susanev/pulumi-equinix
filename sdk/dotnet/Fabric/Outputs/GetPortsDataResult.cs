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
    public sealed class GetPortsDataResult
    {
        public readonly ImmutableArray<Outputs.GetPortsDataAccountResult> Accounts;
        public readonly int AvailableBandwidth;
        public readonly int Bandwidth;
        public readonly ImmutableArray<Outputs.GetPortsDataChangeLogResult> ChangeLogs;
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetPortsDataDeviceResult> Devices;
        public readonly ImmutableArray<Outputs.GetPortsDataEncapsulationResult> Encapsulations;
        public readonly string Href;
        public readonly ImmutableArray<Outputs.GetPortsDataLagResult> Lags;
        public readonly ImmutableArray<Outputs.GetPortsDataLocationResult> Locations;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetPortsDataOperationResult> Operations;
        public readonly ImmutableArray<Outputs.GetPortsDataRedundancyResult> Redundancies;
        public readonly string ServiceType;
        public readonly string State;
        public readonly string Type;
        public readonly int UsedBandwidth;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPortsDataResult(
            ImmutableArray<Outputs.GetPortsDataAccountResult> accounts,

            int availableBandwidth,

            int bandwidth,

            ImmutableArray<Outputs.GetPortsDataChangeLogResult> changeLogs,

            string description,

            ImmutableArray<Outputs.GetPortsDataDeviceResult> devices,

            ImmutableArray<Outputs.GetPortsDataEncapsulationResult> encapsulations,

            string href,

            ImmutableArray<Outputs.GetPortsDataLagResult> lags,

            ImmutableArray<Outputs.GetPortsDataLocationResult> locations,

            string name,

            ImmutableArray<Outputs.GetPortsDataOperationResult> operations,

            ImmutableArray<Outputs.GetPortsDataRedundancyResult> redundancies,

            string serviceType,

            string state,

            string type,

            int usedBandwidth,

            string? uuid)
        {
            Accounts = accounts;
            AvailableBandwidth = availableBandwidth;
            Bandwidth = bandwidth;
            ChangeLogs = changeLogs;
            Description = description;
            Devices = devices;
            Encapsulations = encapsulations;
            Href = href;
            Lags = lags;
            Locations = locations;
            Name = name;
            Operations = operations;
            Redundancies = redundancies;
            ServiceType = serviceType;
            State = state;
            Type = type;
            UsedBandwidth = usedBandwidth;
            Uuid = uuid;
        }
    }
}
