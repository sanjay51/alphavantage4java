package com.sckill.alphavantage4java;

import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public class Demo {

    public static void main(String[] args) throws IOException {
        AlphavantageAPI api = new AlphavantageAPI("0VYAF36W7SUE75W8");
        JSONObject obj = api.fetch("TIME_SERIES_INTRADAY", Map.of(
                "symbol", "IBM",
                "interval", "5min"
        ));
        System.out.println(obj.toString());
    }
}
