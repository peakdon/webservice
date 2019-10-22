package com.jikeyun;

import com.alibaba.fastjson.JSON;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XmlJsonMain {
    public static void main(String[] args) throws IOException {

//        Map<String, String> map = new HashMap();
//        map.put("k1", "v1");
//        map.put("k2", "v2");
//
//        //json串
//        String jsonStr = JSON.toJSONString(map);
//        System.out.println("source json : " + jsonStr);
//
//        //json转xml
//        String xml = json2xml(jsonStr);
//        System.out.println("xml  :  " + xml);
//        //xml转json
//        String targetJson = xml2json(xml);
//        System.out.println("target json : " + targetJson);
//    }
//
//    /**
//     * json to xml
//     * @param json
//     * @return
//     */
//    public static String json2xml(String json) {
//        JSONObject jsonObj = new JSONObject(json);
//        return "<xml>" + XML.toString(jsonObj) + "</xml>";
//    }
//
//    /**
//     * xml to json
//     * @param xml
//     * @return
//     */
//    public static String xml2json(String xml) {
//        JSONObject xmlJSONObj = XML.toJSONObject(xml.replace("<xml>", "").replace("</xml>", ""));
//        return xmlJSONObj.toString();



        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\webservice\\webservice-jax-wx\\src\\main\\java\\com\\jikeyun\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte [] bytes=new byte[1024];
        int len;
        while((len=bufferedInputStream.read(bytes))!=-1){
            String s = new String(bytes, 0, len);

        }
    }
}
