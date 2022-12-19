package com.umirrosi.demospringboot.config;


import com.umirrosi.demospringboot.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo(), bar());
    }

    @Bean
    public Product product(){
        return new Product();
    }

    @Bean
    public Category category(){
        return new Category();
    }

    @Bean
    public ProductCategory productCategory(Product product, Category category){
        return new ProductCategory(product(), category());
    }
}

