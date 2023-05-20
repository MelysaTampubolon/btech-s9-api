package data.createProduct;

import org.json.simple.JSONObject;

import java.util.Random;

public class createProduct {
    static Random rand = new Random();
    static String randomCode = String.valueOf(rand.nextInt(1000));

    public static JSONObject newProduct(){
        JSONObject data = new JSONObject();
        data.put("name","coklat");
        data.put("price",3500);
        data.put("cost",3000);
        data.put("stock",5);
        data.put("code",randomCode);
        return data;
    }
}
