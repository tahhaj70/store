package com.thelinear.store.Service;

import com.thelinear.store.entities.Address;
import com.thelinear.store.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {
    AddressRepository addressRepository;

    public void Address(){
        var adr = Address.builder().zip("005").state("CA").city("San Jose").street("123 Main St").build();
        addressRepository.save(adr);
    }

    public void showAddress(){
        addressRepository.findById(1L);
    }

}
