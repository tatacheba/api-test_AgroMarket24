package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BodyRequest {
    @JsonProperty("posId")
    private String posId;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("quantity")
    private int quantity;
}