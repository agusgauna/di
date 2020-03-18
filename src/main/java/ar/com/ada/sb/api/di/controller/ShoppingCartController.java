package ar.com.ada.sb.api.di.controller;

import ar.com.ada.sb.api.di.model.dto.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping-car")
public class ShoppingCartController {

    @Autowired@Qualifier("shoppingCarService")
    private ShoppingCart service;

    @PostMapping({"", "/"})
    public ResponseEntity addNewShopping(@RequestBody ShoppingCart shoppingCar) {
        HttpStatus status = HttpStatus.OK;

        try {
            service.saveShoppingCar(shoppingCar);
        } catch ()
        return  ResponseEntity.ok().body(null);
    }
}
