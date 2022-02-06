package com.tatiana.gsl.domain.service;

import com.tatiana.gsl.api.response.DeliveryResponse;
import com.tatiana.gsl.api.response.RouteResponse;
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

        if(deliveryId == 404) {
            return  new DeliveryResponse();
        }

        if (deliveryId == 4) {
            return
                    new DeliveryResponse()
                            .withDeliveryId(deliveryId.toString())
                            .withStatus(DeliveryStatus.DELIVERED.getStatus())
                            .withProductDescription("Livro Capitaes de Areia");
        }

        if (deliveryId == 1) {
            return
                    new DeliveryResponse()
                            .withDeliveryId(deliveryId.toString())
                            .withStatus(DeliveryStatus.DEBT.getStatus())
                            .withProductDescription("Livro Os 7 Maridos de Evelyn Hugo");
        }

        if(deliveryId == 2) {
            return
                    new DeliveryResponse()
                            .withDeliveryId(deliveryId.toString())
                            .withStatus(DeliveryStatus.PAID.getStatus())
                            .withProductDescription("Livro Batwoman 52");
        }

        return
                new DeliveryResponse()
                        .withDeliveryId(deliveryId.toString())
                        .withStatus(DeliveryStatus.ON_ROUTE.getStatus())
                        .withProductDescription("Livro Senhor dos Aneis - Edicao Colecionador");
    }
}
