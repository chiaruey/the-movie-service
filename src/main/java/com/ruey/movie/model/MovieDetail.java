package com.ruey.movie.model;

import java.util.List;

public class MovieDetail {
	private Integer id;
	private String imdb_id;
	private String title;
	private String overview;
	private String release_date;
	private String revenue;
	private String runtime;
	private String homepage;
	private String vote_average;
	private String popularity;
	private String original_language;
	private String backdrop_path;
	private List<Genres> genres;
	private MovieCollection belongs_to_collection;
	private Integer budget;
	private String original_title;
	private List<MovieCompany> production_companies;
	private List<Country> production_countries;
	private List<SpokenLanguage> spoken_languages;
	private String status;
	private String poster_path;
	private String tagline;
	private Integer vote_count;
	private List<MovieCredit> cast;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getVote_average() {
		return vote_average;
	}

	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public List<Genres> getGenres() {
		return genres;
	}

	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}

	public MovieCollection getBelongs_to_collection() {
		return belongs_to_collection;
	}

	public void setBelongs_to_collection(MovieCollection belongs_to_collection) {
		this.belongs_to_collection = belongs_to_collection;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public List<MovieCompany> getProduction_companies() {
		return production_companies;
	}

	public void setProduction_companies(List<MovieCompany> production_companies) {
		this.production_companies = production_companies;
	}

	public List<Country> getProduction_countries() {
		return production_countries;
	}

	public void setProduction_countries(List<Country> production_countries) {
		this.production_countries = production_countries;
	}

	public List<SpokenLanguage> getSpoken_languages() {
		return spoken_languages;
	}

	public void setSpoken_languages(List<SpokenLanguage> spoken_languages) {
		this.spoken_languages = spoken_languages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public Integer getVote_count() {
		return vote_count;
	}

	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}

	public List<MovieCredit> getCast() {
		return cast;
	}

	public void setCast(List<MovieCredit> cast) {
		this.cast = cast;
	}
	
	

	
}
