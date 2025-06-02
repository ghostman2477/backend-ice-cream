package com.icecreamparlour.icecream.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Category {
    int categoryId;
    String categoryName;
    String categoryIconUrl;
}
