package com.tatiana.gsl.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
public class DeliveryResponse {

    Integer deliveryId;

    String status;

    String productDescription;
}
