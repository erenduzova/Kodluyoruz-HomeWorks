package com.eren.emlakcepte.service;

import com.eren.emlakcepte.model.Banner;
import com.eren.emlakcepte.model.Realty;
import com.eren.emlakcepte.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BannerService {
    @Autowired
    private BannerRepository bannerRepository;
    @Autowired
    private UserService userService;

    public Banner firstBanner(Realty realty) {
        return new Banner(String.valueOf(realty.getNo()), 1,
                realty.getUser().getPhone(), "",
                realty.getProvince() + realty.getDistrict());
    }

    public void create(Banner banner) {
        bannerRepository.save(banner);
        System.out.println("BannerService :: banner kaydedildi");
    }


    public List<Banner> getAll() {
        return bannerRepository.findAll();
    }


}
