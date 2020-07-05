package com.company.hbdemo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Table(name = "HBDEMO_DIRECTOR")
@Entity(name = "hbdemo_Director")
@NamePattern("%s %s|firstName,lastName")
public class Director extends StandardEntity {
    private static final long serialVersionUID = 316547593616970093L;

    @Column(name = "FIRST_NAME", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @NotNull
    private String lastName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "GROWTH")
    private Integer growth;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "director")
    private List<Movie> movies;

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getGrowth() {
        return growth;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}