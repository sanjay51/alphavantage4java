package com.sckill.alphavantage4java.utils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {
    public JsonReader() {
    }

    public static JSONObject readJsonFromUrl(URL url) throws IOException, JSONException {
        JSONObject json = new JSONObject(IOUtils.toString(url, Charset.forName("UTF-8")));
        return json;
    }
}
