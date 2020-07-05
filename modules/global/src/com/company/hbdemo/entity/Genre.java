package com.company.hbdemo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "HBDEMO_GENRE")
@Entity(name = "hbdemo_Genre")
@NamePattern("%s|name")
public class Genre extends StandardEntity {
    private static final long serialVersionUID = -6389589477051368954L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinTable(name = "HBDEMO_GENRE_MOVIE_LINK",
            joinColumns = @JoinColumn(name = "GENRE_ID"),
            inverseJoinColumns = @JoinColumn(name = "MOVIE_ID"))
    @ManyToMany
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}