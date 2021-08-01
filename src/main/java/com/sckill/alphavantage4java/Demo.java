package com.sckill.alphavantage4java;

import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) throws IOException {
        AlphavantageAPI api = new AlphavantageAPI("0VYAF36W7SUE75W8");
        JSONObject obj = api.fetch("EARNINGS", Map.of("symbol", "IBM"));
        System.out.println(obj.toString());
    }
}
