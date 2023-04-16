package com.geekster.SendMailSpring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class GetApiData {
    public String getData() throws Exception{
        URL getUrl= new URL("http://localhost:8080/user");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");
        int respondCode=connection.getResponseCode();
        if(respondCode==200){
            BufferedReader in= new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseData= new StringBuilder();
            String readLine=null;
            while((readLine=in.readLine())!=null){
                responseData.append(readLine);}
            in.close();
//            JSONObject nationalizeSData= new JSONObject(responseData.toString());
            return responseData.toString();

        }

        return "This is not valid URL "+respondCode;

    }


}
