package com.sckill.alphavantage4java;

import com.sckill.alphavantage4java.utils.JsonReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;

public class AlphavantageAPI {
    String BASE_URL = "https://www.alphavantage.co/query";
    String apiKey;

    public AlphavantageAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public JSONObject fetch(String function, Map<String, String> parameters) throws IOException {
        URL url = this.buildUrl(function, parameters);
        return JsonReader.readJsonFromUrl(url);
    }

    private URL buildUrl(String function, Map<String, String> parameters) {
        URIBuilder b = null;

        try {
            b = new URIBuilder(this.BASE_URL);
            b.addParameter("apikey", this.apiKey);
            b.addParameter("function", function);
            Iterator var4 = parameters.keySet().iterator();

            while(var4.hasNext()) {
                String param = (String)var4.next();
                b.addParameter(param, (String)parameters.get(param));
            }
        } catch (URISyntaxException var7) {
        }

        URL url = null;

        try {
            url = b.build().toURL();
        } catch (Exception var6) {
            System.out.println(var6);
        }

        return url;
    }
}
