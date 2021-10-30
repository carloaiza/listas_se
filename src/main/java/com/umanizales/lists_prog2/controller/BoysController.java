package com.umanizales.lists_prog2.controller;


import com.umanizales.lists_prog2.controller.dto.ResponseDTO;
import com.umanizales.lists_prog2.exception.ListaSeException;
import com.umanizales.lists_prog2.model.Boy;
import com.umanizales.lists_prog2.service.ListSeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path= "boys")
public class BoysController {
    @Autowired
    private ListSeService listSeService;

    @PostMapping
    public ResponseEntity<ResponseDTO> addBoy(@RequestBody @Valid Boy boy) throws ListaSeException
    {
        return listSeService.addBoy(boy);
    }
    @GetMapping
    public ResponseEntity<ResponseDTO> listBoys() throws ListaSeException
    {return listSeService.listBoys();}

    @GetMapping(path = "invert")
    public ResponseEntity<ResponseDTO> invertList() throws ListaSeException
    {
        return listSeService.invertList();
    }
    @PostMapping(path="addtostart")
    public ResponseEntity<ResponseDTO> addBoyToStart(@RequestBody Boy boy) throws ListaSeException
    {
        return listSeService.addBoy(boy);
    }

    @PostMapping(path="addtoposition/{position}")
    public ResponseEntity<ResponseDTO> addBoyByPosition(@PathVariable int position, @RequestBody Boy boy) throws ListaSeException
    {
        return listSeService.addBoyByPosition(boy,position);
    }


    @PostMapping(path = "addboys")
    public ResponseEntity<ResponseDTO> addBoys(@RequestBody List<Boy> boys) throws ListaSeException
    {
        for(Boy boy:boys)
        {
            listSeService.addBoy(boy);
        }
        return new ResponseEntity<ResponseDTO>(new ResponseDTO("Satisfactorio,",
                listSeService.listBoys(),null), HttpStatus.OK);
    }
    @GetMapping(path="getcount")
    public ResponseEntity<ResponseDTO> getCount()
    {
        return listSeService.getCount();
    }
    @GetMapping(path="count")
    public ResponseEntity<ResponseDTO> count()
    {
        return listSeService.Count();
    }
    @GetMapping(path = "free")
    public ResponseEntity<ResponseDTO> listBoysFree() throws ListaSeException{
            return listSeService.listBoysFree();
    }
    
    @GetMapping(path="changextremes")
    public ResponseEntity<ResponseDTO> changeXtremes() throws ListaSeException{
        return listSeService.changeXtremes();
    }

    @GetMapping(path = "delete/{identification}")
    public ResponseEntity<ResponseDTO> delete(@PathVariable String identification) throws ListaSeException
    {
        return listSeService.delete(identification);
    }

    @GetMapping(path = "variant")
    public ResponseEntity<ResponseDTO> variantList() throws ListaSeException
    {
        return listSeService.variantList();
    }

    @GetMapping(path = "boysbylocation")
    public ResponseEntity<ResponseDTO> boysByLocation()
    {
        return listSeService.getBoysByLocation();
    }
}

