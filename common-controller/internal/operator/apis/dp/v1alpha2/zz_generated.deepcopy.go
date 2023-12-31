//go:build !ignore_autogenerated
// +build !ignore_autogenerated

/*
 *  Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

// Code generated by controller-gen. DO NOT EDIT.

package v1alpha2

import (
	"k8s.io/apimachinery/pkg/runtime"
)

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *API) DeepCopyInto(out *API) {
	*out = *in
	out.TypeMeta = in.TypeMeta
	in.ObjectMeta.DeepCopyInto(&out.ObjectMeta)
	in.Spec.DeepCopyInto(&out.Spec)
	in.Status.DeepCopyInto(&out.Status)
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new API.
func (in *API) DeepCopy() *API {
	if in == nil {
		return nil
	}
	out := new(API)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyObject is an autogenerated deepcopy function, copying the receiver, creating a new runtime.Object.
func (in *API) DeepCopyObject() runtime.Object {
	if c := in.DeepCopy(); c != nil {
		return c
	}
	return nil
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIList) DeepCopyInto(out *APIList) {
	*out = *in
	out.TypeMeta = in.TypeMeta
	in.ListMeta.DeepCopyInto(&out.ListMeta)
	if in.Items != nil {
		in, out := &in.Items, &out.Items
		*out = make([]API, len(*in))
		for i := range *in {
			(*in)[i].DeepCopyInto(&(*out)[i])
		}
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIList.
func (in *APIList) DeepCopy() *APIList {
	if in == nil {
		return nil
	}
	out := new(APIList)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyObject is an autogenerated deepcopy function, copying the receiver, creating a new runtime.Object.
func (in *APIList) DeepCopyObject() runtime.Object {
	if c := in.DeepCopy(); c != nil {
		return c
	}
	return nil
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIPolicy) DeepCopyInto(out *APIPolicy) {
	*out = *in
	out.TypeMeta = in.TypeMeta
	in.ObjectMeta.DeepCopyInto(&out.ObjectMeta)
	in.Spec.DeepCopyInto(&out.Spec)
	out.Status = in.Status
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIPolicy.
func (in *APIPolicy) DeepCopy() *APIPolicy {
	if in == nil {
		return nil
	}
	out := new(APIPolicy)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyObject is an autogenerated deepcopy function, copying the receiver, creating a new runtime.Object.
func (in *APIPolicy) DeepCopyObject() runtime.Object {
	if c := in.DeepCopy(); c != nil {
		return c
	}
	return nil
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIPolicyList) DeepCopyInto(out *APIPolicyList) {
	*out = *in
	out.TypeMeta = in.TypeMeta
	in.ListMeta.DeepCopyInto(&out.ListMeta)
	if in.Items != nil {
		in, out := &in.Items, &out.Items
		*out = make([]APIPolicy, len(*in))
		for i := range *in {
			(*in)[i].DeepCopyInto(&(*out)[i])
		}
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIPolicyList.
func (in *APIPolicyList) DeepCopy() *APIPolicyList {
	if in == nil {
		return nil
	}
	out := new(APIPolicyList)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyObject is an autogenerated deepcopy function, copying the receiver, creating a new runtime.Object.
func (in *APIPolicyList) DeepCopyObject() runtime.Object {
	if c := in.DeepCopy(); c != nil {
		return c
	}
	return nil
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIPolicySpec) DeepCopyInto(out *APIPolicySpec) {
	*out = *in
	if in.Default != nil {
		in, out := &in.Default, &out.Default
		*out = new(PolicySpec)
		(*in).DeepCopyInto(*out)
	}
	if in.Override != nil {
		in, out := &in.Override, &out.Override
		*out = new(PolicySpec)
		(*in).DeepCopyInto(*out)
	}
	in.TargetRef.DeepCopyInto(&out.TargetRef)
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIPolicySpec.
func (in *APIPolicySpec) DeepCopy() *APIPolicySpec {
	if in == nil {
		return nil
	}
	out := new(APIPolicySpec)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIPolicyStatus) DeepCopyInto(out *APIPolicyStatus) {
	*out = *in
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIPolicyStatus.
func (in *APIPolicyStatus) DeepCopy() *APIPolicyStatus {
	if in == nil {
		return nil
	}
	out := new(APIPolicyStatus)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APISpec) DeepCopyInto(out *APISpec) {
	*out = *in
	if in.Production != nil {
		in, out := &in.Production, &out.Production
		*out = make([]EnvConfig, len(*in))
		for i := range *in {
			(*in)[i].DeepCopyInto(&(*out)[i])
		}
	}
	if in.Sandbox != nil {
		in, out := &in.Sandbox, &out.Sandbox
		*out = make([]EnvConfig, len(*in))
		for i := range *in {
			(*in)[i].DeepCopyInto(&(*out)[i])
		}
	}
	if in.APIProperties != nil {
		in, out := &in.APIProperties, &out.APIProperties
		*out = make([]Property, len(*in))
		copy(*out, *in)
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APISpec.
func (in *APISpec) DeepCopy() *APISpec {
	if in == nil {
		return nil
	}
	out := new(APISpec)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *APIStatus) DeepCopyInto(out *APIStatus) {
	*out = *in
	in.DeploymentStatus.DeepCopyInto(&out.DeploymentStatus)
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new APIStatus.
func (in *APIStatus) DeepCopy() *APIStatus {
	if in == nil {
		return nil
	}
	out := new(APIStatus)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *BackendJWTToken) DeepCopyInto(out *BackendJWTToken) {
	*out = *in
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new BackendJWTToken.
func (in *BackendJWTToken) DeepCopy() *BackendJWTToken {
	if in == nil {
		return nil
	}
	out := new(BackendJWTToken)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *CORSPolicy) DeepCopyInto(out *CORSPolicy) {
	*out = *in
	if in.AccessControlAllowHeaders != nil {
		in, out := &in.AccessControlAllowHeaders, &out.AccessControlAllowHeaders
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
	if in.AccessControlAllowMethods != nil {
		in, out := &in.AccessControlAllowMethods, &out.AccessControlAllowMethods
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
	if in.AccessControlAllowOrigins != nil {
		in, out := &in.AccessControlAllowOrigins, &out.AccessControlAllowOrigins
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
	if in.AccessControlExposeHeaders != nil {
		in, out := &in.AccessControlExposeHeaders, &out.AccessControlExposeHeaders
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
	if in.AccessControlMaxAge != nil {
		in, out := &in.AccessControlMaxAge, &out.AccessControlMaxAge
		*out = new(int)
		**out = **in
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new CORSPolicy.
func (in *CORSPolicy) DeepCopy() *CORSPolicy {
	if in == nil {
		return nil
	}
	out := new(CORSPolicy)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *DeploymentStatus) DeepCopyInto(out *DeploymentStatus) {
	*out = *in
	if in.TransitionTime != nil {
		in, out := &in.TransitionTime, &out.TransitionTime
		*out = (*in).DeepCopy()
	}
	if in.Events != nil {
		in, out := &in.Events, &out.Events
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new DeploymentStatus.
func (in *DeploymentStatus) DeepCopy() *DeploymentStatus {
	if in == nil {
		return nil
	}
	out := new(DeploymentStatus)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *EnvConfig) DeepCopyInto(out *EnvConfig) {
	*out = *in
	if in.HTTPRouteRefs != nil {
		in, out := &in.HTTPRouteRefs, &out.HTTPRouteRefs
		*out = make([]string, len(*in))
		copy(*out, *in)
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new EnvConfig.
func (in *EnvConfig) DeepCopy() *EnvConfig {
	if in == nil {
		return nil
	}
	out := new(EnvConfig)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *InterceptorReference) DeepCopyInto(out *InterceptorReference) {
	*out = *in
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new InterceptorReference.
func (in *InterceptorReference) DeepCopy() *InterceptorReference {
	if in == nil {
		return nil
	}
	out := new(InterceptorReference)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *PolicySpec) DeepCopyInto(out *PolicySpec) {
	*out = *in
	if in.RequestInterceptors != nil {
		in, out := &in.RequestInterceptors, &out.RequestInterceptors
		*out = make([]InterceptorReference, len(*in))
		copy(*out, *in)
	}
	if in.ResponseInterceptors != nil {
		in, out := &in.ResponseInterceptors, &out.ResponseInterceptors
		*out = make([]InterceptorReference, len(*in))
		copy(*out, *in)
	}
	if in.BackendJWTPolicy != nil {
		in, out := &in.BackendJWTPolicy, &out.BackendJWTPolicy
		*out = new(BackendJWTToken)
		**out = **in
	}
	if in.CORSPolicy != nil {
		in, out := &in.CORSPolicy, &out.CORSPolicy
		*out = new(CORSPolicy)
		(*in).DeepCopyInto(*out)
	}
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new PolicySpec.
func (in *PolicySpec) DeepCopy() *PolicySpec {
	if in == nil {
		return nil
	}
	out := new(PolicySpec)
	in.DeepCopyInto(out)
	return out
}

// DeepCopyInto is an autogenerated deepcopy function, copying the receiver, writing into out. in must be non-nil.
func (in *Property) DeepCopyInto(out *Property) {
	*out = *in
}

// DeepCopy is an autogenerated deepcopy function, copying the receiver, creating a new Property.
func (in *Property) DeepCopy() *Property {
	if in == nil {
		return nil
	}
	out := new(Property)
	in.DeepCopyInto(out)
	return out
}
