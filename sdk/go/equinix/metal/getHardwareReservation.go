// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve a [hardware reservation resource from Equinix Metal](https://metal.equinix.com/developers/docs/deploy/reserved/).
//
// You can look up hardware reservation by its ID or by ID of device which occupies it.
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
//			_, err := metal.GetHardwareReservation(ctx, &metal.GetHardwareReservationArgs{
//				Id: pulumi.StringRef("4347e805-eb46-4699-9eb9-5c116e6a0172"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = metal.GetHardwareReservation(ctx, &metal.GetHardwareReservationArgs{
//				DeviceId: pulumi.StringRef("ff85aa58-c106-4624-8f1c-7c64554047ea"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetHardwareReservation(ctx *pulumi.Context, args *GetHardwareReservationArgs, opts ...pulumi.InvokeOption) (*GetHardwareReservationResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetHardwareReservationResult
	err := ctx.Invoke("equinix:metal/getHardwareReservation:getHardwareReservation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHardwareReservation.
type GetHardwareReservationArgs struct {
	// UUID of device occupying the reservation.
	DeviceId *string `pulumi:"deviceId"`
	// ID of the hardware reservation.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getHardwareReservation.
type GetHardwareReservationResult struct {
	// UUID of device occupying the reservation.
	DeviceId string `pulumi:"deviceId"`
	// Plan type for the reservation.
	Facility string `pulumi:"facility"`
	// ID of the hardware reservation to look up.
	Id string `pulumi:"id"`
	// Plan type for the reservation.
	Plan string `pulumi:"plan"`
	// UUID of project this reservation is scoped to.
	ProjectId string `pulumi:"projectId"`
	// Flag indicating whether the reserved server is provisionable or not. Spare
	// devices can't be provisioned unless they are activated first.
	Provisionable bool `pulumi:"provisionable"`
	// Reservation short ID.
	ShortId string `pulumi:"shortId"`
	// Flag indicating whether the Hardware Reservation is a spare. Spare Hardware
	// Reservations are used when a Hardware Reservations requires service from Metal Equinix.
	Spare bool `pulumi:"spare"`
	// Switch short ID, can be used to determine if two devices are connected to the
	// same switch.
	SwitchUuid string `pulumi:"switchUuid"`
}

func GetHardwareReservationOutput(ctx *pulumi.Context, args GetHardwareReservationOutputArgs, opts ...pulumi.InvokeOption) GetHardwareReservationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHardwareReservationResult, error) {
			args := v.(GetHardwareReservationArgs)
			r, err := GetHardwareReservation(ctx, &args, opts...)
			var s GetHardwareReservationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHardwareReservationResultOutput)
}

// A collection of arguments for invoking getHardwareReservation.
type GetHardwareReservationOutputArgs struct {
	// UUID of device occupying the reservation.
	DeviceId pulumi.StringPtrInput `pulumi:"deviceId"`
	// ID of the hardware reservation.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (GetHardwareReservationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHardwareReservationArgs)(nil)).Elem()
}

// A collection of values returned by getHardwareReservation.
type GetHardwareReservationResultOutput struct{ *pulumi.OutputState }

func (GetHardwareReservationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHardwareReservationResult)(nil)).Elem()
}

func (o GetHardwareReservationResultOutput) ToGetHardwareReservationResultOutput() GetHardwareReservationResultOutput {
	return o
}

func (o GetHardwareReservationResultOutput) ToGetHardwareReservationResultOutputWithContext(ctx context.Context) GetHardwareReservationResultOutput {
	return o
}

// UUID of device occupying the reservation.
func (o GetHardwareReservationResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// Plan type for the reservation.
func (o GetHardwareReservationResultOutput) Facility() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.Facility }).(pulumi.StringOutput)
}

// ID of the hardware reservation to look up.
func (o GetHardwareReservationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Plan type for the reservation.
func (o GetHardwareReservationResultOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.Plan }).(pulumi.StringOutput)
}

// UUID of project this reservation is scoped to.
func (o GetHardwareReservationResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Flag indicating whether the reserved server is provisionable or not. Spare
// devices can't be provisioned unless they are activated first.
func (o GetHardwareReservationResultOutput) Provisionable() pulumi.BoolOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) bool { return v.Provisionable }).(pulumi.BoolOutput)
}

// Reservation short ID.
func (o GetHardwareReservationResultOutput) ShortId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.ShortId }).(pulumi.StringOutput)
}

// Flag indicating whether the Hardware Reservation is a spare. Spare Hardware
// Reservations are used when a Hardware Reservations requires service from Metal Equinix.
func (o GetHardwareReservationResultOutput) Spare() pulumi.BoolOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) bool { return v.Spare }).(pulumi.BoolOutput)
}

// Switch short ID, can be used to determine if two devices are connected to the
// same switch.
func (o GetHardwareReservationResultOutput) SwitchUuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetHardwareReservationResult) string { return v.SwitchUuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHardwareReservationResultOutput{})
}
