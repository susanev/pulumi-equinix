// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkedge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get Equinix Network Edge device platform configuration details
// for a given device type. For further details, check supported
// [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkedge.GetDevicePlatform(ctx, &networkedge.GetDevicePlatformArgs{
//				DeviceType: "CSR1000V",
//				Flavor:     pulumi.StringRef("large"),
//				Packages: []string{
//					"IPBASE",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDevicePlatform(ctx *pulumi.Context, args *GetDevicePlatformArgs, opts ...pulumi.InvokeOption) (*GetDevicePlatformResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetDevicePlatformResult
	err := ctx.Invoke("equinix:networkedge/getDevicePlatform:getDevicePlatform", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevicePlatform.
type GetDevicePlatformArgs struct {
	// Number of CPU cores used to limit platform search results.
	CoreCount *int `pulumi:"coreCount"`
	// Device type code
	DeviceType string `pulumi:"deviceType"`
	// Device platform flavor that determines number of CPU cores and memory.
	// Supported values are: `small`, `medium`, `large`, `xlarge`.
	Flavor *string `pulumi:"flavor"`
	// List of device licensing options to limit platform search result.
	// Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
	LicenseOptions []string `pulumi:"licenseOptions"`
	// List of device management types to limit platform search results.
	// Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
	ManagementTypes []string `pulumi:"managementTypes"`
	// List of software package codes to limit platform search results.
	Packages []string `pulumi:"packages"`
}

// A collection of values returned by getDevicePlatform.
type GetDevicePlatformResult struct {
	CoreCount  int    `pulumi:"coreCount"`
	DeviceType string `pulumi:"deviceType"`
	Flavor     string `pulumi:"flavor"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	LicenseOptions  []string `pulumi:"licenseOptions"`
	ManagementTypes []string `pulumi:"managementTypes"`
	// The amount of memory provided by device platform.
	Memory int `pulumi:"memory"`
	// Unit of memory provider by device platform.
	MemoryUnit string   `pulumi:"memoryUnit"`
	Packages   []string `pulumi:"packages"`
}

func GetDevicePlatformOutput(ctx *pulumi.Context, args GetDevicePlatformOutputArgs, opts ...pulumi.InvokeOption) GetDevicePlatformResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDevicePlatformResult, error) {
			args := v.(GetDevicePlatformArgs)
			r, err := GetDevicePlatform(ctx, &args, opts...)
			var s GetDevicePlatformResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDevicePlatformResultOutput)
}

// A collection of arguments for invoking getDevicePlatform.
type GetDevicePlatformOutputArgs struct {
	// Number of CPU cores used to limit platform search results.
	CoreCount pulumi.IntPtrInput `pulumi:"coreCount"`
	// Device type code
	DeviceType pulumi.StringInput `pulumi:"deviceType"`
	// Device platform flavor that determines number of CPU cores and memory.
	// Supported values are: `small`, `medium`, `large`, `xlarge`.
	Flavor pulumi.StringPtrInput `pulumi:"flavor"`
	// List of device licensing options to limit platform search result.
	// Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
	LicenseOptions pulumi.StringArrayInput `pulumi:"licenseOptions"`
	// List of device management types to limit platform search results.
	// Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
	ManagementTypes pulumi.StringArrayInput `pulumi:"managementTypes"`
	// List of software package codes to limit platform search results.
	Packages pulumi.StringArrayInput `pulumi:"packages"`
}

func (GetDevicePlatformOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicePlatformArgs)(nil)).Elem()
}

// A collection of values returned by getDevicePlatform.
type GetDevicePlatformResultOutput struct{ *pulumi.OutputState }

func (GetDevicePlatformResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicePlatformResult)(nil)).Elem()
}

func (o GetDevicePlatformResultOutput) ToGetDevicePlatformResultOutput() GetDevicePlatformResultOutput {
	return o
}

func (o GetDevicePlatformResultOutput) ToGetDevicePlatformResultOutputWithContext(ctx context.Context) GetDevicePlatformResultOutput {
	return o
}

func (o GetDevicePlatformResultOutput) CoreCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) int { return v.CoreCount }).(pulumi.IntOutput)
}

func (o GetDevicePlatformResultOutput) DeviceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) string { return v.DeviceType }).(pulumi.StringOutput)
}

func (o GetDevicePlatformResultOutput) Flavor() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) string { return v.Flavor }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicePlatformResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDevicePlatformResultOutput) LicenseOptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) []string { return v.LicenseOptions }).(pulumi.StringArrayOutput)
}

func (o GetDevicePlatformResultOutput) ManagementTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) []string { return v.ManagementTypes }).(pulumi.StringArrayOutput)
}

// The amount of memory provided by device platform.
func (o GetDevicePlatformResultOutput) Memory() pulumi.IntOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) int { return v.Memory }).(pulumi.IntOutput)
}

// Unit of memory provider by device platform.
func (o GetDevicePlatformResultOutput) MemoryUnit() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) string { return v.MemoryUnit }).(pulumi.StringOutput)
}

func (o GetDevicePlatformResultOutput) Packages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicePlatformResult) []string { return v.Packages }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicePlatformResultOutput{})
}
