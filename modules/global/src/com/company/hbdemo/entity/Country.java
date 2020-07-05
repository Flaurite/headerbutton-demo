package com.company.hbdemo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "HBDEMO_COUNTRY")
@Entity(name = "hbdemo_Country")
@NamePattern("%s|name")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 4203404952601219949L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "country")
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