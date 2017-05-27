/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizztool.quizztoolbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dhiaa Eddin Anabtawi
 */
public class Question {
    @Id
    @GeneratedValue
    private int id;
    private String text;
    
    @ManyToMany(mappedBy="Quizz")
    @JsonBackReference
    private List<Quizz> quizzes;
    
    @ManyToMany(mappedBy="Alternative")
    @JsonBackReference
    private List<Alternative> alternatives;

    public Question() {
    }

    public Question(int id, String text, List<Quizz> quizzes, List<Alternative> alternatives) {
        this.id = id;
        this.text = text;
        this.quizzes = quizzes;
        this.alternatives = alternatives;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Quizz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quizz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    
}