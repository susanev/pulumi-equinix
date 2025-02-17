// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage organization resource in Equinix Metal.
//
// ## Example Usage
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
//			orgResource, err := metal.NewOrganization(ctx, "org", &metal.OrganizationArgs{
//				Name: pulumi.String("Foo Organization"),
//				Address: &metal.OrganizationAddressArgs{
//					Address: pulumi.String("org street"),
//					City:    pulumi.String("london"),
//					Country: pulumi.String("GB"),
//					ZipCode: pulumi.String("12345"),
//				},
//				Description: pulumi.String("An organization"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("org", orgResource.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing organization ID: <break><break>```sh<break> $ pulumi import equinix:metal/organization:Organization equinix_metal_organization {existing_organization_id} <break>```<break><break>
type Organization struct {
	pulumi.CustomResourceState

	// An object that has the address information. See Address
	// below for more details.
	Address OrganizationAddressOutput `pulumi:"address"`
	// The timestamp for when the organization was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// Description string.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Logo URL.
	Logo pulumi.StringPtrOutput `pulumi:"logo"`
	// The name of the Organization.
	Name pulumi.StringOutput `pulumi:"name"`
	// Twitter handle.
	Twitter pulumi.StringPtrOutput `pulumi:"twitter"`
	// The timestamp for the last time the organization was updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
	// Website link.
	Website pulumi.StringPtrOutput `pulumi:"website"`
}

// NewOrganization registers a new resource with the given unique name, arguments, and options.
func NewOrganization(ctx *pulumi.Context,
	name string, args *OrganizationArgs, opts ...pulumi.ResourceOption) (*Organization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Organization
	err := ctx.RegisterResource("equinix:metal/organization:Organization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganization gets an existing Organization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationState, opts ...pulumi.ResourceOption) (*Organization, error) {
	var resource Organization
	err := ctx.ReadResource("equinix:metal/organization:Organization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Organization resources.
type organizationState struct {
	// An object that has the address information. See Address
	// below for more details.
	Address *OrganizationAddress `pulumi:"address"`
	// The timestamp for when the organization was created.
	Created *string `pulumi:"created"`
	// Description string.
	Description *string `pulumi:"description"`
	// Logo URL.
	Logo *string `pulumi:"logo"`
	// The name of the Organization.
	Name *string `pulumi:"name"`
	// Twitter handle.
	Twitter *string `pulumi:"twitter"`
	// The timestamp for the last time the organization was updated.
	Updated *string `pulumi:"updated"`
	// Website link.
	Website *string `pulumi:"website"`
}

type OrganizationState struct {
	// An object that has the address information. See Address
	// below for more details.
	Address OrganizationAddressPtrInput
	// The timestamp for when the organization was created.
	Created pulumi.StringPtrInput
	// Description string.
	Description pulumi.StringPtrInput
	// Logo URL.
	Logo pulumi.StringPtrInput
	// The name of the Organization.
	Name pulumi.StringPtrInput
	// Twitter handle.
	Twitter pulumi.StringPtrInput
	// The timestamp for the last time the organization was updated.
	Updated pulumi.StringPtrInput
	// Website link.
	Website pulumi.StringPtrInput
}

func (OrganizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationState)(nil)).Elem()
}

type organizationArgs struct {
	// An object that has the address information. See Address
	// below for more details.
	Address OrganizationAddress `pulumi:"address"`
	// Description string.
	Description *string `pulumi:"description"`
	// Logo URL.
	Logo *string `pulumi:"logo"`
	// The name of the Organization.
	Name *string `pulumi:"name"`
	// Twitter handle.
	Twitter *string `pulumi:"twitter"`
	// Website link.
	Website *string `pulumi:"website"`
}

// The set of arguments for constructing a Organization resource.
type OrganizationArgs struct {
	// An object that has the address information. See Address
	// below for more details.
	Address OrganizationAddressInput
	// Description string.
	Description pulumi.StringPtrInput
	// Logo URL.
	Logo pulumi.StringPtrInput
	// The name of the Organization.
	Name pulumi.StringPtrInput
	// Twitter handle.
	Twitter pulumi.StringPtrInput
	// Website link.
	Website pulumi.StringPtrInput
}

func (OrganizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationArgs)(nil)).Elem()
}

type OrganizationInput interface {
	pulumi.Input

	ToOrganizationOutput() OrganizationOutput
	ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput
}

func (*Organization) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (i *Organization) ToOrganizationOutput() OrganizationOutput {
	return i.ToOrganizationOutputWithContext(context.Background())
}

func (i *Organization) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationOutput)
}

// OrganizationArrayInput is an input type that accepts OrganizationArray and OrganizationArrayOutput values.
// You can construct a concrete instance of `OrganizationArrayInput` via:
//
//	OrganizationArray{ OrganizationArgs{...} }
type OrganizationArrayInput interface {
	pulumi.Input

	ToOrganizationArrayOutput() OrganizationArrayOutput
	ToOrganizationArrayOutputWithContext(context.Context) OrganizationArrayOutput
}

type OrganizationArray []OrganizationInput

func (OrganizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (i OrganizationArray) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return i.ToOrganizationArrayOutputWithContext(context.Background())
}

func (i OrganizationArray) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationArrayOutput)
}

// OrganizationMapInput is an input type that accepts OrganizationMap and OrganizationMapOutput values.
// You can construct a concrete instance of `OrganizationMapInput` via:
//
//	OrganizationMap{ "key": OrganizationArgs{...} }
type OrganizationMapInput interface {
	pulumi.Input

	ToOrganizationMapOutput() OrganizationMapOutput
	ToOrganizationMapOutputWithContext(context.Context) OrganizationMapOutput
}

type OrganizationMap map[string]OrganizationInput

func (OrganizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (i OrganizationMap) ToOrganizationMapOutput() OrganizationMapOutput {
	return i.ToOrganizationMapOutputWithContext(context.Background())
}

func (i OrganizationMap) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMapOutput)
}

type OrganizationOutput struct{ *pulumi.OutputState }

func (OrganizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (o OrganizationOutput) ToOrganizationOutput() OrganizationOutput {
	return o
}

func (o OrganizationOutput) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return o
}

// An object that has the address information. See Address
// below for more details.
func (o OrganizationOutput) Address() OrganizationAddressOutput {
	return o.ApplyT(func(v *Organization) OrganizationAddressOutput { return v.Address }).(OrganizationAddressOutput)
}

// The timestamp for when the organization was created.
func (o OrganizationOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// Description string.
func (o OrganizationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Logo URL.
func (o OrganizationOutput) Logo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.Logo }).(pulumi.StringPtrOutput)
}

// The name of the Organization.
func (o OrganizationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Twitter handle.
func (o OrganizationOutput) Twitter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.Twitter }).(pulumi.StringPtrOutput)
}

// The timestamp for the last time the organization was updated.
func (o OrganizationOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

// Website link.
func (o OrganizationOutput) Website() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.Website }).(pulumi.StringPtrOutput)
}

type OrganizationArrayOutput struct{ *pulumi.OutputState }

func (OrganizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) Index(i pulumi.IntInput) OrganizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].([]*Organization)[vs[1].(int)]
	}).(OrganizationOutput)
}

type OrganizationMapOutput struct{ *pulumi.OutputState }

func (OrganizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (o OrganizationMapOutput) ToOrganizationMapOutput() OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) MapIndex(k pulumi.StringInput) OrganizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].(map[string]*Organization)[vs[1].(string)]
	}).(OrganizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationInput)(nil)).Elem(), &Organization{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationArrayInput)(nil)).Elem(), OrganizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMapInput)(nil)).Elem(), OrganizationMap{})
	pulumi.RegisterOutputType(OrganizationOutput{})
	pulumi.RegisterOutputType(OrganizationArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMapOutput{})
}
