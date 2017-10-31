package com.pixartprinting.docker.kotlin.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DockerKotlinSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(DockerKotlinSpringApplication::class.java, *args)
}
