package com.hy.powerplatform.my_utils.base;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2018/10/26.
 */

public class MyHttpURLConnection {

    public static String getData(String requestUrl, BaseRequestBackTLisenter baseRequestBackLisenter) {
        try {
            //建立连接
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(false);
            connection.setDoInput(true);
            connection.setConnectTimeout(20000);
            connection.setReadTimeout(20000);
            connection.connect();

            //获取响应状态
            int responseCode = connection.getResponseCode();

            if (200 == responseCode) { //连接成功
                //当正确响应时处理数据
                StringBuffer buffer = new StringBuffer();
                String readLine;
                BufferedReader responseReader;
                //处理响应流
                responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((readLine = responseReader.readLine()) != null) {
                    buffer.append(readLine).append("\n");
                }
                responseReader.close();
                baseRequestBackLisenter.success(buffer.toString());
                Log.d("HttpGET", buffer.toString());
                //JSONObject result = new JSONObject(buffer.toString());
                return buffer.toString();
            }else if (401 == responseCode){
                baseRequestBackLisenter.failF("获取数据失败");
            }else {
                baseRequestBackLisenter.fail("faile");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
