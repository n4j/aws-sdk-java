/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateSubscriptionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** name of the definition */
    private String name;
    /** subscription definition Id */
    private String subscriptionDefinitionId;

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * name of the definition
     * 
     * @return name of the definition
     */

    public String getName() {
        return this.name;
    }

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     */

    public void setSubscriptionDefinitionId(String subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @return subscription definition Id
     */

    public String getSubscriptionDefinitionId() {
        return this.subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionDefinitionRequest withSubscriptionDefinitionId(String subscriptionDefinitionId) {
        setSubscriptionDefinitionId(subscriptionDefinitionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSubscriptionDefinitionId() != null)
            sb.append("SubscriptionDefinitionId: ").append(getSubscriptionDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionDefinitionRequest == false)
            return false;
        UpdateSubscriptionDefinitionRequest other = (UpdateSubscriptionDefinitionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSubscriptionDefinitionId() == null ^ this.getSubscriptionDefinitionId() == null)
            return false;
        if (other.getSubscriptionDefinitionId() != null && other.getSubscriptionDefinitionId().equals(this.getSubscriptionDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionId() == null) ? 0 : getSubscriptionDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionDefinitionRequest clone() {
        return (UpdateSubscriptionDefinitionRequest) super.clone();
    }

}
