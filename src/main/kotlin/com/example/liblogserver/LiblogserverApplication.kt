package com.example.liblogserver

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@MapperScan("com.example.liblogserver.mapper")
@SpringBootApplication
class LiblogserverApplication
inline fun main(args: Array<String>) {
    runApplication<LiblogserverApplication>(*args)
}

@Override
fun configure(builder: SpringApplicationBuilder) : SpringApplicationBuilder {
    return builder.sources(LiblogserverApplication::class.java)
}