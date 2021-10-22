package com.example.restclientdemo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@Slf4j
public class SimpleGetExample {
    private String[] chatId;
    private String text;
    private URL url;
    private URLConnection conn;
    private StringBuilder sb;
    private InputStream is;
    private BufferedReader br;
    private String inputLine;


    public void setUrl(String text) throws IOException {
        chatId = new String[]{"1878896080", "1642507256"};
        this.text = text;

        String urlString = "https://api.telegram.org/bot2054435693:AAGk3UdUisu6RojU0KiF43srBN9q8V36qOg/sendMessage?chat_id=%s&text=%s";

        urlString = String.format(urlString, "1878896080", text);
        url = new URL(urlString);
        conn = url.openConnection();
        is = new BufferedInputStream(conn.getInputStream());

    }

//    public void setThrUrl() throws IOException {
//        chatId = new String[]{"1878896080", "1642507256"};
//        this.text = text;
//
//        String urlString = "http://localhost:3333/api/password/generate?length=%d";
//
//        urlString = String.format(urlString, 15);
//        url = new URL(urlString);
//        conn = url.openConnection();
//        sb = new StringBuilder();
//        is = new BufferedInputStream(conn.getInputStream());
//        br = new BufferedReader(new InputStreamReader(is));
//        inputLine = br.readLine();
//        sb.append(inputLine);
//        System.out.println(sb);
//
//        log.info("Success");
//
//    }
//
}
