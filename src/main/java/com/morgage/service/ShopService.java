package com.morgage.service;

import com.morgage.model.Shop;
import com.morgage.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    //Search shop by shop name.
    public List<Shop> searchByShopName(String name) {
        System.out.println(name);
        List<Shop> listShop = shopRepository.searchShopByName(name);


        return listShop;
    }

    //findall
    public List<Shop> findAll() {
        List<Shop> listShop = shopRepository.findAll();

        return listShop;
    }
}
