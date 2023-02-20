package com.gardeners.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GardenerController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //resursa piemērs
    @RequestMapping(value = "/get-all-gardeners")
    public ResponseEntity<List<Gardener>> getAllGardeners(){
        List<Gardener> gardeners = jdbcTemplate.query(
                "select * from gardener;", new GardenerMapper());
        return ResponseEntity.ok().body(gardeners);
    }


}
