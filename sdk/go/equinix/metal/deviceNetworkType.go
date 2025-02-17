// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			deviceId := cfg.Require("deviceId")
//			networkType := "hybrid"
//			if param := cfg.Get("networkType"); param != "" {
//				networkType = param
//			}
//			deviceNetwork, err := metal.NewDeviceNetworkType(ctx, "deviceNetwork", &metal.DeviceNetworkTypeArgs{
//				DeviceId: pulumi.String(deviceId),
//				Type:     pulumi.String(networkType),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("deviceNetworkId", deviceNetwork.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can also be imported using existing device ID: <break><break>```sh<break> $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id} <break>```<break><break>
type DeviceNetworkType struct {
	pulumi.CustomResourceState

	// The ID of the device on which the network type should be set.
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
	// and `layer2-bonded`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDeviceNetworkType registers a new resource with the given unique name, arguments, and options.
func NewDeviceNetworkType(ctx *pulumi.Context,
	name string, args *DeviceNetworkTypeArgs, opts ...pulumi.ResourceOption) (*DeviceNetworkType, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DeviceNetworkType
	err := ctx.RegisterResource("equinix:metal/deviceNetworkType:DeviceNetworkType", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceNetworkType gets an existing DeviceNetworkType resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceNetworkType(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceNetworkTypeState, opts ...pulumi.ResourceOption) (*DeviceNetworkType, error) {
	var resource DeviceNetworkType
	err := ctx.ReadResource("equinix:metal/deviceNetworkType:DeviceNetworkType", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceNetworkType resources.
type deviceNetworkTypeState struct {
	// The ID of the device on which the network type should be set.
	DeviceId *string `pulumi:"deviceId"`
	// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
	// and `layer2-bonded`.
	Type *string `pulumi:"type"`
}

type DeviceNetworkTypeState struct {
	// The ID of the device on which the network type should be set.
	DeviceId pulumi.StringPtrInput
	// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
	// and `layer2-bonded`.
	Type pulumi.StringPtrInput
}

func (DeviceNetworkTypeState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceNetworkTypeState)(nil)).Elem()
}

type deviceNetworkTypeArgs struct {
	// The ID of the device on which the network type should be set.
	DeviceId string `pulumi:"deviceId"`
	// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
	// and `layer2-bonded`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DeviceNetworkType resource.
type DeviceNetworkTypeArgs struct {
	// The ID of the device on which the network type should be set.
	DeviceId pulumi.StringInput
	// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
	// and `layer2-bonded`.
	Type pulumi.StringInput
}

func (DeviceNetworkTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceNetworkTypeArgs)(nil)).Elem()
}

type DeviceNetworkTypeInput interface {
	pulumi.Input

	ToDeviceNetworkTypeOutput() DeviceNetworkTypeOutput
	ToDeviceNetworkTypeOutputWithContext(ctx context.Context) DeviceNetworkTypeOutput
}

func (*DeviceNetworkType) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceNetworkType)(nil)).Elem()
}

func (i *DeviceNetworkType) ToDeviceNetworkTypeOutput() DeviceNetworkTypeOutput {
	return i.ToDeviceNetworkTypeOutputWithContext(context.Background())
}

func (i *DeviceNetworkType) ToDeviceNetworkTypeOutputWithContext(ctx context.Context) DeviceNetworkTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceNetworkTypeOutput)
}

// DeviceNetworkTypeArrayInput is an input type that accepts DeviceNetworkTypeArray and DeviceNetworkTypeArrayOutput values.
// You can construct a concrete instance of `DeviceNetworkTypeArrayInput` via:
//
//	DeviceNetworkTypeArray{ DeviceNetworkTypeArgs{...} }
type DeviceNetworkTypeArrayInput interface {
	pulumi.Input

	ToDeviceNetworkTypeArrayOutput() DeviceNetworkTypeArrayOutput
	ToDeviceNetworkTypeArrayOutputWithContext(context.Context) DeviceNetworkTypeArrayOutput
}

type DeviceNetworkTypeArray []DeviceNetworkTypeInput

func (DeviceNetworkTypeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceNetworkType)(nil)).Elem()
}

func (i DeviceNetworkTypeArray) ToDeviceNetworkTypeArrayOutput() DeviceNetworkTypeArrayOutput {
	return i.ToDeviceNetworkTypeArrayOutputWithContext(context.Background())
}

func (i DeviceNetworkTypeArray) ToDeviceNetworkTypeArrayOutputWithContext(ctx context.Context) DeviceNetworkTypeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceNetworkTypeArrayOutput)
}

// DeviceNetworkTypeMapInput is an input type that accepts DeviceNetworkTypeMap and DeviceNetworkTypeMapOutput values.
// You can construct a concrete instance of `DeviceNetworkTypeMapInput` via:
//
//	DeviceNetworkTypeMap{ "key": DeviceNetworkTypeArgs{...} }
type DeviceNetworkTypeMapInput interface {
	pulumi.Input

	ToDeviceNetworkTypeMapOutput() DeviceNetworkTypeMapOutput
	ToDeviceNetworkTypeMapOutputWithContext(context.Context) DeviceNetworkTypeMapOutput
}

type DeviceNetworkTypeMap map[string]DeviceNetworkTypeInput

func (DeviceNetworkTypeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceNetworkType)(nil)).Elem()
}

func (i DeviceNetworkTypeMap) ToDeviceNetworkTypeMapOutput() DeviceNetworkTypeMapOutput {
	return i.ToDeviceNetworkTypeMapOutputWithContext(context.Background())
}

func (i DeviceNetworkTypeMap) ToDeviceNetworkTypeMapOutputWithContext(ctx context.Context) DeviceNetworkTypeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceNetworkTypeMapOutput)
}

type DeviceNetworkTypeOutput struct{ *pulumi.OutputState }

func (DeviceNetworkTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceNetworkType)(nil)).Elem()
}

func (o DeviceNetworkTypeOutput) ToDeviceNetworkTypeOutput() DeviceNetworkTypeOutput {
	return o
}

func (o DeviceNetworkTypeOutput) ToDeviceNetworkTypeOutputWithContext(ctx context.Context) DeviceNetworkTypeOutput {
	return o
}

// The ID of the device on which the network type should be set.
func (o DeviceNetworkTypeOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceNetworkType) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
// and `layer2-bonded`.
func (o DeviceNetworkTypeOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceNetworkType) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DeviceNetworkTypeArrayOutput struct{ *pulumi.OutputState }

func (DeviceNetworkTypeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceNetworkType)(nil)).Elem()
}

func (o DeviceNetworkTypeArrayOutput) ToDeviceNetworkTypeArrayOutput() DeviceNetworkTypeArrayOutput {
	return o
}

func (o DeviceNetworkTypeArrayOutput) ToDeviceNetworkTypeArrayOutputWithContext(ctx context.Context) DeviceNetworkTypeArrayOutput {
	return o
}

func (o DeviceNetworkTypeArrayOutput) Index(i pulumi.IntInput) DeviceNetworkTypeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceNetworkType {
		return vs[0].([]*DeviceNetworkType)[vs[1].(int)]
	}).(DeviceNetworkTypeOutput)
}

type DeviceNetworkTypeMapOutput struct{ *pulumi.OutputState }

func (DeviceNetworkTypeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceNetworkType)(nil)).Elem()
}

func (o DeviceNetworkTypeMapOutput) ToDeviceNetworkTypeMapOutput() DeviceNetworkTypeMapOutput {
	return o
}

func (o DeviceNetworkTypeMapOutput) ToDeviceNetworkTypeMapOutputWithContext(ctx context.Context) DeviceNetworkTypeMapOutput {
	return o
}

func (o DeviceNetworkTypeMapOutput) MapIndex(k pulumi.StringInput) DeviceNetworkTypeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceNetworkType {
		return vs[0].(map[string]*DeviceNetworkType)[vs[1].(string)]
	}).(DeviceNetworkTypeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceNetworkTypeInput)(nil)).Elem(), &DeviceNetworkType{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceNetworkTypeArrayInput)(nil)).Elem(), DeviceNetworkTypeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceNetworkTypeMapInput)(nil)).Elem(), DeviceNetworkTypeMap{})
	pulumi.RegisterOutputType(DeviceNetworkTypeOutput{})
	pulumi.RegisterOutputType(DeviceNetworkTypeArrayOutput{})
	pulumi.RegisterOutputType(DeviceNetworkTypeMapOutput{})
}
