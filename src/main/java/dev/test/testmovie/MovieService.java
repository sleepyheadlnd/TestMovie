package dev.test.testmovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> allMovies()
    {
        System.out.println(movieRepository.findAll().toString());
        movieRepository.deleteByTitle("The Woman King");
        return movieRepository.findAll();
    }
}
