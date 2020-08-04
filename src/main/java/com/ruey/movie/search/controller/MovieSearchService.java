package com.ruey.movie.search.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ruey.movie.search.model.MovieList;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movie-search")
@CrossOrigin
public class MovieSearchService {

	private static final String PATH = "/search/movie?query=";

	Logger logger = LoggerFactory.getLogger(MovieSearchService.class);

	@Value("${themoviedb.api.key}")
	private String apiKey;

	@Value("${themoviedb.url}")
	private String url;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping
	@ApiOperation(value = "Search movies", notes = "Return the movies matching provided criteria", response = MovieList.class)
	public MovieList searchMovie(@RequestParam("query") String query,@RequestParam(defaultValue = "1") String page) {
		String queryUrl = url + PATH + query + "&page=" + page + "&api_key=" + apiKey;
		logger.debug("queryUrl = " + queryUrl);
		MovieList movieList = restTemplate.getForObject(queryUrl, MovieList.class);
		return movieList;
	}
}
