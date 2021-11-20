package com.itvdn.json.myJson.entity.Parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.myJson.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {

    public static void parseJackson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = null;
        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
