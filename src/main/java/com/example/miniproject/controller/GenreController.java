package com.example.miniproject.controller;

import com.example.miniproject.model.Genre;
import com.example.miniproject.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(/api/)
public class GenreController {

    private GenreService genreService;

    @Autowired
    public void setGenreService(GenreService genreService) {
        this.genreService = genreService;
    }


    @GetMapping(path = "/genres/") // http://localhost:9092/api/genres/
    public List<Genre> getGenres() {
        return genreService.getGenres();
    }


}
