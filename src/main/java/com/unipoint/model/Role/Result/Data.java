/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.model.Role.Result;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.unipoint.model.Role.VisibleByAnonymousUsers;
import com.unipoint.model.Role.VisibleByFriends;
import com.unipoint.model.Role.VisibleByRegisteredUsers;
import com.unipoint.model.Role.VisibleByTheUser;
import com.unipoint.model.auth.User;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"visibleByAnonymousUsers",
"user",
"id",
"visibleByTheUser",
"visibleByFriends",
"visibleByRegisteredUsers",
"signUpDate",
"generated_username"
})
public class Data implements Serializable{

@JsonProperty("visibleByAnonymousUsers")
private VisibleByAnonymousUsers visibleByAnonymousUsers;
@JsonProperty("user")
private User user;
@JsonProperty("id")
private String id;
@JsonProperty("visibleByTheUser")
private VisibleByTheUser visibleByTheUser;
@JsonProperty("visibleByFriends")
private VisibleByFriends visibleByFriends;
@JsonProperty("visibleByRegisteredUsers")
private VisibleByRegisteredUsers visibleByRegisteredUsers;
@JsonProperty("signUpDate")
private String signUpDate;
@JsonProperty("generated_username")
private Boolean generatedUsername;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The visibleByAnonymousUsers
*/
@JsonProperty("visibleByAnonymousUsers")
public VisibleByAnonymousUsers getVisibleByAnonymousUsers() {
return visibleByAnonymousUsers;
}

/**
*
* @param visibleByAnonymousUsers
* The visibleByAnonymousUsers
*/
@JsonProperty("visibleByAnonymousUsers")
public void setVisibleByAnonymousUsers(VisibleByAnonymousUsers visibleByAnonymousUsers) {
this.visibleByAnonymousUsers = visibleByAnonymousUsers;
}

/**
*
* @return
* The user
*/
@JsonProperty("user")
public User getUser() {
return user;
}

/**
*
* @param user
* The user
*/
@JsonProperty("user")
public void setUser(User user) {
this.user = user;
}

/**
*
* @return
* The id
*/
@JsonProperty("id")
public String getId() {
return id;
}

/**
*
* @param id
* The id
*/
@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

/**
*
* @return
* The visibleByTheUser
*/
@JsonProperty("visibleByTheUser")
public VisibleByTheUser getVisibleByTheUser() {
return visibleByTheUser;
}

/**
*
* @param visibleByTheUser
* The visibleByTheUser
*/
@JsonProperty("visibleByTheUser")
public void setVisibleByTheUser(VisibleByTheUser visibleByTheUser) {
this.visibleByTheUser = visibleByTheUser;
}

/**
*
* @return
* The visibleByFriends
*/
@JsonProperty("visibleByFriends")
public VisibleByFriends getVisibleByFriends() {
return visibleByFriends;
}

/**
*
* @param visibleByFriends
* The visibleByFriends
*/
@JsonProperty("visibleByFriends")
public void setVisibleByFriends(VisibleByFriends visibleByFriends) {
this.visibleByFriends = visibleByFriends;
}

/**
*
* @return
* The visibleByRegisteredUsers
*/
@JsonProperty("visibleByRegisteredUsers")
public VisibleByRegisteredUsers getVisibleByRegisteredUsers() {
return visibleByRegisteredUsers;
}

/**
*
* @param visibleByRegisteredUsers
* The visibleByRegisteredUsers
*/
@JsonProperty("visibleByRegisteredUsers")
public void setVisibleByRegisteredUsers(VisibleByRegisteredUsers visibleByRegisteredUsers) {
this.visibleByRegisteredUsers = visibleByRegisteredUsers;
}

/**
*
* @return
* The signUpDate
*/
@JsonProperty("signUpDate")
public String getSignUpDate() {
return signUpDate;
}

/**
*
* @param signUpDate
* The signUpDate
*/
@JsonProperty("signUpDate")
public void setSignUpDate(String signUpDate) {
this.signUpDate = signUpDate;
}

/**
*
* @return
* The generatedUsername
*/
@JsonProperty("generated_username")
public Boolean getGeneratedUsername() {
return generatedUsername;
}

/**
*
* @param generatedUsername
* The generated_username
*/
@JsonProperty("generated_username")
public void setGeneratedUsername(Boolean generatedUsername) {
this.generatedUsername = generatedUsername;
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