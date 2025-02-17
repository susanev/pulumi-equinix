// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetServiceProfiles(ctx *pulumi.Context, args *GetServiceProfilesArgs, opts ...pulumi.InvokeOption) (*GetServiceProfilesResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetServiceProfilesResult
	err := ctx.Invoke("equinix:fabric/getServiceProfiles:getServiceProfiles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceProfiles.
type GetServiceProfilesArgs struct {
	// Service Profile Search Filter
	Filter *GetServiceProfilesFilter `pulumi:"filter"`
	// Service Profile Sort criteria for Search Request response payload
	Sort []GetServiceProfilesSort `pulumi:"sort"`
}

// A collection of values returned by getServiceProfiles.
type GetServiceProfilesResult struct {
	// List of  Service Profiles
	Data []GetServiceProfilesDatum `pulumi:"data"`
	// Service Profile Search Filter
	Filter *GetServiceProfilesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Service Profile Sort criteria for Search Request response payload
	Sort []GetServiceProfilesSort `pulumi:"sort"`
}

func GetServiceProfilesOutput(ctx *pulumi.Context, args GetServiceProfilesOutputArgs, opts ...pulumi.InvokeOption) GetServiceProfilesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceProfilesResult, error) {
			args := v.(GetServiceProfilesArgs)
			r, err := GetServiceProfiles(ctx, &args, opts...)
			var s GetServiceProfilesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceProfilesResultOutput)
}

// A collection of arguments for invoking getServiceProfiles.
type GetServiceProfilesOutputArgs struct {
	// Service Profile Search Filter
	Filter GetServiceProfilesFilterPtrInput `pulumi:"filter"`
	// Service Profile Sort criteria for Search Request response payload
	Sort GetServiceProfilesSortArrayInput `pulumi:"sort"`
}

func (GetServiceProfilesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceProfilesArgs)(nil)).Elem()
}

// A collection of values returned by getServiceProfiles.
type GetServiceProfilesResultOutput struct{ *pulumi.OutputState }

func (GetServiceProfilesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceProfilesResult)(nil)).Elem()
}

func (o GetServiceProfilesResultOutput) ToGetServiceProfilesResultOutput() GetServiceProfilesResultOutput {
	return o
}

func (o GetServiceProfilesResultOutput) ToGetServiceProfilesResultOutputWithContext(ctx context.Context) GetServiceProfilesResultOutput {
	return o
}

// List of  Service Profiles
func (o GetServiceProfilesResultOutput) Data() GetServiceProfilesDatumArrayOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) []GetServiceProfilesDatum { return v.Data }).(GetServiceProfilesDatumArrayOutput)
}

// Service Profile Search Filter
func (o GetServiceProfilesResultOutput) Filter() GetServiceProfilesFilterPtrOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) *GetServiceProfilesFilter { return v.Filter }).(GetServiceProfilesFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceProfilesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Service Profile Sort criteria for Search Request response payload
func (o GetServiceProfilesResultOutput) Sort() GetServiceProfilesSortArrayOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) []GetServiceProfilesSort { return v.Sort }).(GetServiceProfilesSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceProfilesResultOutput{})
}
