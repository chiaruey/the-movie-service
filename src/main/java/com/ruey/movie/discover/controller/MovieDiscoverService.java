package com.ruey.movie.discover.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ruey.movie.model.MovieList;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movie-discover")
public class MovieDiscoverService {

	private String POPULAR_PATH = "/discover/movie?sort_by=popularity.desc";

	Logger logger = LoggerFactory.getLogger(MovieDiscoverService.class);

	@Value("${themoviedb.api.key}")
	private String apiKey;

	@Value("${themoviedb.url}")
	private String url;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/popular")
	@ApiOperation(value = "Popular movies", notes = "Return the most popular movies", response = MovieList.class)
	public MovieList popular(@RequestParam(defaultValue = "1") String page) {
		String fullUrl = url + POPULAR_PATH + "&api_key=" + apiKey  + "&page=" + page;
		logger.info("fullUrl = " + fullUrl);
		MovieList movieList = restTemplate.getForObject(fullUrl, MovieList.class);
		return movieList;

	}

}
