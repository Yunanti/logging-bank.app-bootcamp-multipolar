package com.multipolar.bootcamp.logging.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "access_log2")
@ToString
@EqualsAndHashCode
public class AccessLog {

    @Id
    private String id;
    private String requestMethod;
    private String requestUri;
    private int responseStatusCode;
    private LocalDateTime timeStamp = LocalDateTime.now();
    private String content;
}

