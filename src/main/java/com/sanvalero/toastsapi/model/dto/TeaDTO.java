package com.sanvalero.toastsapi.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TeaDTO {

    private int id;
    private String type;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;
    private boolean withMenu;
    private float price;
    private float punctuation;
    private int menuId;
    private int publicationId;
}
