package com.example.rest.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author martsiomchyk
 */

public class AbstractRestControllerTest {
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
