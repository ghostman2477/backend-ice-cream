package com.icecreamparlour.icecream.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryResponse {

    private int id;
    private String categoryName;
    private String categoryImageURL;
}
