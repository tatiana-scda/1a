package com.tatiana.gsl.domain.service;

import com.tatiana.gsl.api.response.DeliveryResponse;
import com.tatiana.gsl.domain.enumerator.DeliveryStatus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeliveryService {

//    DeliveryRepository deliveryRepository;
//
//    ProductRepository productRepository;
//
    public DeliveryResponse getDelivery(Integer deliveryId) {
//        var delivery = deliveryRepository.getById(deliveryId);
//        var product = productRepository.getById(delivery.getProductId());
//
//        var response = new DeliveryResponse();
//
//        response.setDeliveryId(deliveryId);
//        response.setStatus(delivery.getStatus());
//        response.setProductDescription(product.getDescription());

        return
                new DeliveryResponse().withDeliveryId(deliveryId).withStatus(DeliveryStatus.ON_ROUTE.getStatus());
    }
}
