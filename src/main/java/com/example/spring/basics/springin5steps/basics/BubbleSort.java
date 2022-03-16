package com.example.spring.basics.springin5steps.basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {

    @Override
    public String sort() {
        return "Mandu mahisha";
    }
}
