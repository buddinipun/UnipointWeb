/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipoint.model.Role.Result;

/**
 *
 * @author priyamal
 */

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"result",
"data",
"http_code"
})
public class Result implements Serializable{

@JsonProperty("result")
private String result;
@JsonProperty("data")
private Data data;
@JsonProperty("http_code")
private Integer httpCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The result
*/
@JsonProperty("result")
public String getResult() {
return result;
}

/**
*
* @param result
* The result
*/
@JsonProperty("result")
public void setResult(String result) {
this.result = result;
}

/**
*
* @return
* The data
*/
@JsonProperty("data")
public Data getData() {
return data;
}

/**
*
* @param data
* The data
*/
@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

/**
*
* @return
* The httpCode
*/
@JsonProperty("http_code")
public Integer getHttpCode() {
return httpCode;
}

/**
*
* @param httpCode
* The http_code
*/
@JsonProperty("http_code")
public void setHttpCode(Integer httpCode) {
this.httpCode = httpCode;
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