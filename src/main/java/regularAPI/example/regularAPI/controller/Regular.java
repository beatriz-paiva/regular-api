package regularAPI.example.regularAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Driver;
import java.util.List;

@RestController
@RequestMapping("/api/regular")
public class Regular {

    @GetMapping("/hello-world")
    public String hello_world(){
        return "hello world";
    }

//    @GetMapping("/drivers")
//    public ResponseEntity<List<Driver>> getDrivers(){
//        List<Driver> driverList = service.get();
//        return new ResponseEntity<>(driverList, HttpStatus.OK);
//    }

}
