package com.example.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Qualifier("kuttykani")
@Primary
@Component
public class QuickSort implements SortAlgorithm{
    @Override
    public String sort() {
        return "Gundu mahisha";
    }
}
