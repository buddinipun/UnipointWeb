
package com.unipoint.model.auth;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "user",
    "signUpDate",
    "X-BB-SESSION"
})
public class Data {

    @JsonProperty("user")
    private User user;
    @JsonProperty("signUpDate")
    private String signUpDate;
    @JsonProperty("X-BB-SESSION")
    private String xBBSESSION;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The signUpDate
     */
    @JsonProperty("signUpDate")
    public String getSignUpDate() {
        return signUpDate;
    }

    /**
     * 
     * @param signUpDate
     *     The signUpDate
     */
    @JsonProperty("signUpDate")
    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    /**
     * 
     * @return
     *     The xBBSESSION
     */
    @JsonProperty("X-BB-SESSION")
    public String getXBBSESSION() {
        return xBBSESSION;
    }

    /**
     * 
     * @param xBBSESSION
     *     The X-BB-SESSION
     */
    @JsonProperty("X-BB-SESSION")
    public void setXBBSESSION(String xBBSESSION) {
        this.xBBSESSION = xBBSESSION;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
