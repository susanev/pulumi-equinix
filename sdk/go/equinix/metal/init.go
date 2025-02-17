// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "equinix:metal/bgpSession:BgpSession":
		r = &BgpSession{}
	case "equinix:metal/device:Device":
		r = &Device{}
	case "equinix:metal/deviceNetworkType:DeviceNetworkType":
		r = &DeviceNetworkType{}
	case "equinix:metal/gateway:Gateway":
		r = &Gateway{}
	case "equinix:metal/interconnection:Interconnection":
		r = &Interconnection{}
	case "equinix:metal/ipAttachment:IpAttachment":
		r = &IpAttachment{}
	case "equinix:metal/organization:Organization":
		r = &Organization{}
	case "equinix:metal/organizationMember:OrganizationMember":
		r = &OrganizationMember{}
	case "equinix:metal/port:Port":
		r = &Port{}
	case "equinix:metal/portVlanAttachment:PortVlanAttachment":
		r = &PortVlanAttachment{}
	case "equinix:metal/project:Project":
		r = &Project{}
	case "equinix:metal/projectApiKey:ProjectApiKey":
		r = &ProjectApiKey{}
	case "equinix:metal/projectSshKey:ProjectSshKey":
		r = &ProjectSshKey{}
	case "equinix:metal/reservedIpBlock:ReservedIpBlock":
		r = &ReservedIpBlock{}
	case "equinix:metal/spotMarketRequest:SpotMarketRequest":
		r = &SpotMarketRequest{}
	case "equinix:metal/sshKey:SshKey":
		r = &SshKey{}
	case "equinix:metal/userApiKey:UserApiKey":
		r = &UserApiKey{}
	case "equinix:metal/virtualCircuit:VirtualCircuit":
		r = &VirtualCircuit{}
	case "equinix:metal/vlan:Vlan":
		r = &Vlan{}
	case "equinix:metal/vrf:Vrf":
		r = &Vrf{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := equinix.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/bgpSession",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/device",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/deviceNetworkType",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/gateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/interconnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/ipAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/organization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/organizationMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/port",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/portVlanAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/projectApiKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/projectSshKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/reservedIpBlock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/spotMarketRequest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/sshKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/userApiKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/virtualCircuit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/vlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"metal/vrf",
		&module{version},
	)
}
