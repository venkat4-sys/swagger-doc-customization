package com.ft.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info=@Info(
                contact =@Contact(
                        name = "venkat",
                        email = "contact@gmail.com",
                        url="https://venkat4-sys.com"
                ),
                description ="open API Documentation for the Rest Api",
                title = "open api specification for the Api",
                version = "1.0",
                license = @License(
                        name = "Liscense name",
                        url = "https//some-url.com"
                ),
                termsOfService = "terms of service"
        ),
        servers ={
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "http://venkat4-sys.com/"
                )
        }

)
public class SwaggerConfig {
}
