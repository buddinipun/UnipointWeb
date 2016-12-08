
package com.unipoint.model.Role;

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
    "role",
    "visibleByAnonymousUsers",
    "visibleByTheUser",
    "visibleByFriends",
    "visibleByRegisteredUsers"
})
public class UserRole {

    @JsonProperty("role")
    private String role;
    @JsonProperty("visibleByAnonymousUsers")
    private VisibleByAnonymousUsers visibleByAnonymousUsers;
    @JsonProperty("visibleByTheUser")
    private VisibleByTheUser visibleByTheUser;
    @JsonProperty("visibleByFriends")
    private VisibleByFriends visibleByFriends;
    @JsonProperty("visibleByRegisteredUsers")
    private VisibleByRegisteredUsers visibleByRegisteredUsers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The role
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 
     * @return
     *     The visibleByAnonymousUsers
     */
    @JsonProperty("visibleByAnonymousUsers")
    public VisibleByAnonymousUsers getVisibleByAnonymousUsers() {
        return visibleByAnonymousUsers;
    }

    /**
     * 
     * @param visibleByAnonymousUsers
     *     The visibleByAnonymousUsers
     */
    @JsonProperty("visibleByAnonymousUsers")
    public void setVisibleByAnonymousUsers(VisibleByAnonymousUsers visibleByAnonymousUsers) {
        this.visibleByAnonymousUsers = visibleByAnonymousUsers;
    }

    /**
     * 
     * @return
     *     The visibleByTheUser
     */
    @JsonProperty("visibleByTheUser")
    public VisibleByTheUser getVisibleByTheUser() {
        return visibleByTheUser;
    }

    /**
     * 
     * @param visibleByTheUser
     *     The visibleByTheUser
     */
    @JsonProperty("visibleByTheUser")
    public void setVisibleByTheUser(VisibleByTheUser visibleByTheUser) {
        this.visibleByTheUser = visibleByTheUser;
    }

    /**
     * 
     * @return
     *     The visibleByFriends
     */
    @JsonProperty("visibleByFriends")
    public VisibleByFriends getVisibleByFriends() {
        return visibleByFriends;
    }

    /**
     * 
     * @param visibleByFriends
     *     The visibleByFriends
     */
    @JsonProperty("visibleByFriends")
    public void setVisibleByFriends(VisibleByFriends visibleByFriends) {
        this.visibleByFriends = visibleByFriends;
    }

    /**
     * 
     * @return
     *     The visibleByRegisteredUsers
     */
    @JsonProperty("visibleByRegisteredUsers")
    public VisibleByRegisteredUsers getVisibleByRegisteredUsers() {
        return visibleByRegisteredUsers;
    }

    /**
     * 
     * @param visibleByRegisteredUsers
     *     The visibleByRegisteredUsers
     */
    @JsonProperty("visibleByRegisteredUsers")
    public void setVisibleByRegisteredUsers(VisibleByRegisteredUsers visibleByRegisteredUsers) {
        this.visibleByRegisteredUsers = visibleByRegisteredUsers;
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
