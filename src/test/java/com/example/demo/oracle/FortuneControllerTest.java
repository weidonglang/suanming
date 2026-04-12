package com.example.demo.oracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FortuneControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnsFortunePayload() throws Exception {
        mockMvc.perform(get("/api/fortune"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").isString())
                .andExpect(jsonPath("$.prophecy").isString())
                .andExpect(jsonPath("$.mood").isString())
                .andExpect(jsonPath("$.survivalTip").isString())
                .andExpect(jsonPath("$.dangerLevel").isNumber())
                .andExpect(jsonPath("$.color").isString())
                .andExpect(jsonPath("$.glitchMessage").isString());
    }
}
