package com.company.hbdemo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "HBDEMO_MOVIE")
@Entity(name = "hbdemo_Movie")
@NamePattern("%s|name")
public class Movie extends StandardEntity {
    private static final long serialVersionUID = -2777901189362523657L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "YEAR_")
    private String year;

    @Column(name = "BUDGET")
    private BigDecimal budget;

    @Column(name = "TIME_")
    private Integer time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECTOR_ID")
    private Director director;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    @JoinTable(name = "HBDEMO_GENRE_MOVIE_LINK",
            joinColumns = @JoinColumn(name = "MOVIE_ID"),
            inverseJoinColumns = @JoinColumn(name = "GENRE_ID"))
    @ManyToMany
    private List<Genre> genres;

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}