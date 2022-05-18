package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//JPA Auditing 활성화를 위해 Application에서 @EnableJpaAuditing 어노테이션을 추가
@EnableJpaAuditing
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BoardApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
