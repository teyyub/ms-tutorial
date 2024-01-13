package com.spring.ms.productservice.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponse {
   private String name;
   private String description;
   private BigDecimal price;
}
