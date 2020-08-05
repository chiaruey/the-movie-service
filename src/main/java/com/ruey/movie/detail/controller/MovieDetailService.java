package com.ruey.movie.detail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ruey.movie.model.MovieDetail;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movie-detail")
@CrossOrigin
public class MovieDetailService {

	private static final String PATH = "/movie/";
	
	private Logger logger = LoggerFactory.getLogger(MovieDetailService.class);
	
    @Value("${themoviedb.api.key}")
    private String apiKey;

    @Value("${themoviedb.url}")
    private String url;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping
	@ApiOperation(value = "Movie Detail", notes = "Return the movie detail by movie id", response = MovieDetail.class)
    public MovieDetail getMovieById(@RequestParam("movieId") String movieId) {
    	String queryUrl = url + PATH + movieId + "?api_key=" +  apiKey;
    	logger.debug("queryUrl = " + queryUrl);
    	MovieDetail movieDetail = restTemplate.getForObject(queryUrl, MovieDetail.class);
        return movieDetail;
    }

}
