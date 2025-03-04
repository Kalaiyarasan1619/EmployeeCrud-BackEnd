package com.home.employeeCrud.EmployeeCrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.home.employeeCrud.EmployeeCrud.exception.TecktalikException;
import com.home.employeeCrud.EmployeeCrud.model.Tectalik;
import com.home.employeeCrud.EmployeeCrud.repo.TectalikRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/tectlaik/")
public class TectalikController {

    @Autowired
    private TectalikRepo repo;

    @PostMapping("/employees")
    public Tectalik save(@RequestBody Tectalik t){
        return repo.save(t);
    }


    @GetMapping("/employees")
    public List<Tectalik> getall(){
        return repo.findAll();
    }


    @GetMapping("/employees/{id}")
    public ResponseEntity<Tectalik> getbyid(@PathVariable int id){
        Tectalik t=repo.findById(id).orElseThrow(()-> new TecktalikException("Employee Not Found in Tectalik :"+id));
        return ResponseEntity.ok(t);
    }
    

    @PutMapping("/employees/{id}")
    public ResponseEntity<Tectalik> getbyid(@PathVariable int id, @RequestBody Tectalik tec){
        Tectalik t=repo.findById(id).orElseThrow(()-> new TecktalikException("Employee Not Found in Tectalik :"+id));

        t.setEmp_name(tec.getEmp_name());
        t.setDepartment_name(tec.getDepartment_name());
        t.setDesignation_name(tec.getDesignation_name());

        Tectalik tectalik=repo.save(t);

        return ResponseEntity.ok(tectalik);
    }


    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable int id){
        Tectalik t=repo.findById(id).orElseThrow(()-> new TecktalikException("Employee Not Found in Tectalik :"+id));
        Map<String,Boolean> map=new HashMap<>();

        repo.delete(t);
        map.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(map);
    }
}
