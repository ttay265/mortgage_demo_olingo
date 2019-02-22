package com.morgage.service;

import com.morgage.model.Shop;
import com.morgage.model.ShopData;
import com.morgage.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {


    //Add Shop to Shop Data.
    public ShopData addShopToShopData(Shop shop, ShopData shopData) {
        shopData.setShopName(shop.getShopName());
        shopData.setEmail(shop.getEmail());
        shopData.setFacebook(shop.getFacebook());
        shopData.setPhoneNumber(shop.getPhoneNumber());
        shopData.setPolicy(shop.getPolicy());
        shopData.setRating(shop.getRating());
        shopData.setStatus(shop.getStatus());

        return shopData;
    }


}
