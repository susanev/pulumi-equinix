// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get Equinix Metal Operating System image.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := metal.GetOperatingSystem(ctx, &metal.GetOperatingSystemArgs{
//				Distro:          pulumi.StringRef("ubuntu"),
//				Version:         pulumi.StringRef("20.04"),
//				ProvisionableOn: pulumi.StringRef("c3.medium.x86"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = metal.NewDevice(ctx, "server", &metal.DeviceArgs{
//				Hostname: pulumi.String("tf.ubuntu"),
//				Plan:     pulumi.String("c3.medium.x86"),
//				Facilities: pulumi.StringArray{
//					pulumi.String("ny5"),
//				},
//				OperatingSystem: example.Id.ApplyT(func(x *string) metal.OperatingSystem { return metal.OperatingSystem(*x) }).(metal.OperatingSystemOutput),
//				BillingCycle:    pulumi.String("hourly"),
//				ProjectId:       pulumi.Any(local.Project_id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOperatingSystem(ctx *pulumi.Context, args *GetOperatingSystemArgs, opts ...pulumi.InvokeOption) (*GetOperatingSystemResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetOperatingSystemResult
	err := ctx.Invoke("equinix:metal/getOperatingSystem:getOperatingSystem", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOperatingSystem.
type GetOperatingSystemArgs struct {
	// Name of the OS distribution.
	Distro *string `pulumi:"distro"`
	// Name or part of the name of the distribution. Case insensitive.
	Name *string `pulumi:"name"`
	// Plan name.
	ProvisionableOn *string `pulumi:"provisionableOn"`
	// Version of the distribution.
	Version *string `pulumi:"version"`
}

// A collection of values returned by getOperatingSystem.
type GetOperatingSystemResult struct {
	Distro *string `pulumi:"distro"`
	// The provider-assigned unique ID for this managed resource.
	Id              string  `pulumi:"id"`
	Name            *string `pulumi:"name"`
	ProvisionableOn *string `pulumi:"provisionableOn"`
	// Operating system slug (same as `id`).
	Slug    string  `pulumi:"slug"`
	Version *string `pulumi:"version"`
}

func GetOperatingSystemOutput(ctx *pulumi.Context, args GetOperatingSystemOutputArgs, opts ...pulumi.InvokeOption) GetOperatingSystemResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOperatingSystemResult, error) {
			args := v.(GetOperatingSystemArgs)
			r, err := GetOperatingSystem(ctx, &args, opts...)
			var s GetOperatingSystemResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOperatingSystemResultOutput)
}

// A collection of arguments for invoking getOperatingSystem.
type GetOperatingSystemOutputArgs struct {
	// Name of the OS distribution.
	Distro pulumi.StringPtrInput `pulumi:"distro"`
	// Name or part of the name of the distribution. Case insensitive.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Plan name.
	ProvisionableOn pulumi.StringPtrInput `pulumi:"provisionableOn"`
	// Version of the distribution.
	Version pulumi.StringPtrInput `pulumi:"version"`
}

func (GetOperatingSystemOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOperatingSystemArgs)(nil)).Elem()
}

// A collection of values returned by getOperatingSystem.
type GetOperatingSystemResultOutput struct{ *pulumi.OutputState }

func (GetOperatingSystemResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOperatingSystemResult)(nil)).Elem()
}

func (o GetOperatingSystemResultOutput) ToGetOperatingSystemResultOutput() GetOperatingSystemResultOutput {
	return o
}

func (o GetOperatingSystemResultOutput) ToGetOperatingSystemResultOutputWithContext(ctx context.Context) GetOperatingSystemResultOutput {
	return o
}

func (o GetOperatingSystemResultOutput) Distro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) *string { return v.Distro }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOperatingSystemResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOperatingSystemResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetOperatingSystemResultOutput) ProvisionableOn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) *string { return v.ProvisionableOn }).(pulumi.StringPtrOutput)
}

// Operating system slug (same as `id`).
func (o GetOperatingSystemResultOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) string { return v.Slug }).(pulumi.StringOutput)
}

func (o GetOperatingSystemResultOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOperatingSystemResult) *string { return v.Version }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOperatingSystemResultOutput{})
}
