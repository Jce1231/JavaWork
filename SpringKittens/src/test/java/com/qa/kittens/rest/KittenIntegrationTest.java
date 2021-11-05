package com.qa.kittens.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.kittens.domain.Kitten;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:Kitten-Schema.sql",
		"classpath:Kitten-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class KittenIntegrationTest {
	@Autowired
	private MockMvc mvc;
	@Autowired
	private ObjectMapper mapper;

	// Test creation
	@Test
	void testCreate() throws Exception {
		Kitten requestBody = new Kitten("Alfie", "Ginger", 120);
		String requestAsJson = this.mapper.writeValueAsString(requestBody);
		RequestBuilder request = post("/cats/create").contentType(MediaType.APPLICATION_JSON).content(requestAsJson);

		Kitten responseBody = new Kitten(1, "Alfie", "Ginger", 120);
		String responseAsJSON = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isCreated();
		ResultMatcher checkBody = content().json(responseAsJSON);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody); // performs request and checks the
	}

	@Test
	void testGet() throws Exception {
		RequestBuilder request = get("/cats/get/1");
		Kitten responseBody = new Kitten(1, "Bonno", "Ginger", 140);
		String responseAsJson = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(responseAsJson);
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testGetAll() throws Exception {
		RequestBuilder request = get("/cats/getAll");
		Kitten responseBody = new Kitten(1, "Bonno", "Ginger", 140);
		List<Kitten> kitten = List.of(responseBody);
		String responseAsJson = this.mapper.writeValueAsString(kitten);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(responseAsJson);
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testUpdate() throws Exception {
		Kitten requestBody = new Kitten("Alfie", "Ginger", 120);
		String requestAsJson = this.mapper.writeValueAsString(requestBody);
		RequestBuilder request = put("/cats/update/1").contentType(MediaType.APPLICATION_JSON).content(requestAsJson);
		Kitten responseBody = new Kitten(1, "Alfie", "Ginger", 120);
		String responseAsJSON = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().json(responseAsJSON);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testDelete() throws Exception {
		RequestBuilder request = delete("/cats/delete/1");
		ResultMatcher checkStatus = status().isNoContent();
		this.mvc.perform(request).andExpect(checkStatus);
	}
}
