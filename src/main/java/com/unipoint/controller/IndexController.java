package com.unipoint.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unipoint.controller.userSession.CurrentUser;
import com.unipoint.controller.userSession.SessionManagement;
import com.unipoint.model.Role.Result.Result;
import com.unipoint.model.auth.UserData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("uname")String uname,@RequestParam("pass")String pass,HttpServletRequest session) {
        try {
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost("http://52.220.179.219:9000/login");

// Request parameters and other properties.
            List<NameValuePair> params = new ArrayList<NameValuePair>(3);
            params.add(new BasicNameValuePair("username", uname));
            params.add(new BasicNameValuePair("password", pass));
            params.add(new BasicNameValuePair("appcode", "1234567890"));
            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

// Execute and get the response.
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                InputStream instream=null;
                try {
                    // do something useful
                    instream = entity.getContent();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
                    StringBuilder out = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                    out.append(line);
                    }                   
                    
                    ObjectMapper mapper = new ObjectMapper();
                    //converting an json to a java object.
                    Result user = mapper.readValue(out.toString(), Result.class);
                    if (user.getHttpCode().intValue() == 200) {
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
     
}
