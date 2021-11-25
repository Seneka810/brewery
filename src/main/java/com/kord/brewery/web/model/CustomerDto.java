package com.kord.brewery.web.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
}
