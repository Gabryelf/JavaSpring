package com.example;

import com.example.domen.Person;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();
        person.setFirstName("Vladimir");
        person.setLastName("Sokolov");
        person.setAge(30);

        //toString, equals, and hashCode
        System.out.println("toString: " + person.toString());
        System.out.println("Equals: " + person.equals(new Person()));
        System.out.println("HashCode: " + person.hashCode());

        //serialization and deserialization
        Gson gson = new Gson();

        // Serialize to JSON
        String json = gson.toJson(person);
        System.out.println("Serialized JSON: " + json);

        // Deserialize from JSON
        String jsonToDeserialize = "{\"firstName\":\"Alice\",\"lastName\":\"Smith\",\"age\":25}";
        Person deserializedPerson = gson.fromJson(jsonToDeserialize, Person.class);
        System.out.println("Deserialized object: " + deserializedPerson);
    }
}

