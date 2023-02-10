// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this datasource to retrieve list of BGP neighbors of a device in the Equinix Metal host.
//
// To have any BGP neighbors listed, the device must be in BGP-enabled project
// and have a BGP session assigned.
//
// To learn more about using BGP in Equinix Metal, see the
// metal.BgpSession resource documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := metal.GetDeviceBgpNeighbors(ctx, &metal.GetDeviceBgpNeighborsArgs{
//				DeviceId: "4c641195-25e5-4c3c-b2b7-4cd7a42c7b40",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bgpNeighborsListing", test.BgpNeighbors)
//			return nil
//		})
//	}
//
// ```
func GetDeviceBgpNeighbors(ctx *pulumi.Context, args *GetDeviceBgpNeighborsArgs, opts ...pulumi.InvokeOption) (*GetDeviceBgpNeighborsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetDeviceBgpNeighborsResult
	err := ctx.Invoke("equinix:metal/getDeviceBgpNeighbors:getDeviceBgpNeighbors", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDeviceBgpNeighbors.
type GetDeviceBgpNeighborsArgs struct {
	// UUID of BGP-enabled device whose neighbors to list.
	DeviceId string `pulumi:"deviceId"`
}

// A collection of values returned by getDeviceBgpNeighbors.
type GetDeviceBgpNeighborsResult struct {
	// array of BGP neighbor records with attributes:
	BgpNeighbors []GetDeviceBgpNeighborsBgpNeighbor `pulumi:"bgpNeighbors"`
	DeviceId     string                             `pulumi:"deviceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetDeviceBgpNeighborsOutput(ctx *pulumi.Context, args GetDeviceBgpNeighborsOutputArgs, opts ...pulumi.InvokeOption) GetDeviceBgpNeighborsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDeviceBgpNeighborsResult, error) {
			args := v.(GetDeviceBgpNeighborsArgs)
			r, err := GetDeviceBgpNeighbors(ctx, &args, opts...)
			var s GetDeviceBgpNeighborsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDeviceBgpNeighborsResultOutput)
}

// A collection of arguments for invoking getDeviceBgpNeighbors.
type GetDeviceBgpNeighborsOutputArgs struct {
	// UUID of BGP-enabled device whose neighbors to list.
	DeviceId pulumi.StringInput `pulumi:"deviceId"`
}

func (GetDeviceBgpNeighborsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeviceBgpNeighborsArgs)(nil)).Elem()
}

// A collection of values returned by getDeviceBgpNeighbors.
type GetDeviceBgpNeighborsResultOutput struct{ *pulumi.OutputState }

func (GetDeviceBgpNeighborsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeviceBgpNeighborsResult)(nil)).Elem()
}

func (o GetDeviceBgpNeighborsResultOutput) ToGetDeviceBgpNeighborsResultOutput() GetDeviceBgpNeighborsResultOutput {
	return o
}

func (o GetDeviceBgpNeighborsResultOutput) ToGetDeviceBgpNeighborsResultOutputWithContext(ctx context.Context) GetDeviceBgpNeighborsResultOutput {
	return o
}

// array of BGP neighbor records with attributes:
func (o GetDeviceBgpNeighborsResultOutput) BgpNeighbors() GetDeviceBgpNeighborsBgpNeighborArrayOutput {
	return o.ApplyT(func(v GetDeviceBgpNeighborsResult) []GetDeviceBgpNeighborsBgpNeighbor { return v.BgpNeighbors }).(GetDeviceBgpNeighborsBgpNeighborArrayOutput)
}

func (o GetDeviceBgpNeighborsResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceBgpNeighborsResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDeviceBgpNeighborsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceBgpNeighborsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDeviceBgpNeighborsResultOutput{})
}
