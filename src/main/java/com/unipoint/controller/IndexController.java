package com.unipoint.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.unipoint.controller.userSession.CurrentUser;
import com.unipoint.controller.userSession.SessionManagement;
import com.unipoint.model.Role.Result.Result;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class IndexController {
 
	@Autowired
    SessionManagement sessionManagment;    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "login";
    }
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String showDashboard() {
        return "dashboard";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("uname")String uname,@RequestParam("pass")String pass,HttpServletRequest session) {
//        System.out.println("index method worked");
        try {
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost("http://52.4.27.162:9000/login");
//            System.out.println("http post before" + httppost);
//            System.out.println("bashbox try method worked");
// Request parameters and other properties.
            List<NameValuePair> params = new ArrayList<NameValuePair>(3);
            params.add(new BasicNameValuePair("username", uname));
            params.add(new BasicNameValuePair("password", pass));
            params.add(new BasicNameValuePair("appcode", "1234567890"));
            httppost.setEntity(new UrlEncodedFormEntity(params));
            httppost.setHeader("content-type", "application/x-www-form-urlencoded");
//            System.out.println("http post after" + httppost);

         // Execute and get the response.
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
//            	System.out.println("bashbox try method 1");
                InputStream instream=null;
                try {
                    // do something useful
                    instream = entity.getContent();
//                    System.out.println("http response test"+ instream);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
                    StringBuilder out = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
//                    System.out.println("Testinh l ine ........."+line);
//                    System.out.println("bashbox try method 2");
                    out.append(line);
                    }                   
                    
                    ObjectMapper mapper = new ObjectMapper();
                    //converting an json to a java object.
//                    System.out.println("bashbox try method 3");
                    Result user = mapper.readValue(out.toString(), Result.class);
//                    System.out.println(user.getHttpCode());
                    if (user.getHttpCode().intValue() == 200) {
//                    	System.out.println("bashbox try method 4");
                        CurrentUser currentUser = sessionManagment.getCurrentUser(session.getSession());
                        
                        currentUser.setLoggedInUser(user);
                        System.out.println("current user name : "+currentUser.getLoggedInUser().getData().getUser().getName());
                        
                        return "redirect:/Schema";
                        
                    }
                    reader.close();
                } finally {
                    instream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "login";
    }
    
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }
    
    
    @RequestMapping(value = "/noaccess", method = RequestMethod.GET)
    public String accessDenied() {
        return "denied";
    }
    
    
     
}
