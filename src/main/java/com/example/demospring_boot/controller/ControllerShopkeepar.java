package com.example.demospring_boot.controller;

import com.example.demospring_boot.modal.Shopkeepar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerShopkeepar {

   @RequestMapping("/shopkeepar")
    public Shopkeepar name(){

        Shopkeepar shopkeepar=new Shopkeepar("Ashok",31,"biltigarh");
        return shopkeepar;
    }

     @RequestMapping("/shop_list")
    public List<Shopkeepar>get_list(){
       List<Shopkeepar> list=new ArrayList<>();
        Shopkeepar shopkeepar=new Shopkeepar("Ashok",31,"biltigarh");
        Shopkeepar shopkeepar1=new Shopkeepar("Ashok kumar",41,"biltigarh");
        Shopkeepar shopkeepar2=new Shopkeepar("Asharam",34,"biltigarh");
        list.add(shopkeepar);
        list.add(shopkeepar1);
        list.add(shopkeepar2);
        return list;
    }
}
