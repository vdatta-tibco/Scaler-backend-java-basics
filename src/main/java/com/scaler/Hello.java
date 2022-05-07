package com.scaler;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Hello {
    static OkHttpClient client = new OkHttpClient();
    public static void main(String[] args) {
        System.out.println("Hello there!");
        Person P1 = Person.builder().age(35).Name("Tiku").build();
        System.out.println("The name of the first person is " + P1.getName() + " and the age is " + P1.getAge());

        try {
            System.out.println(getUrl("https://www.example.com"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
    static String getUrl(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
