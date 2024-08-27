package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository=inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(outsourcedPartRepository.count() == 0) {
            OutsourcedPart pickups= new OutsourcedPart();
            pickups.setCompanyName("Bareknuckle Pickups");
            pickups.setName("Aftermath Pickups 6 String Set");
            pickups.setInv(5);
            pickups.setPrice(200.0);
            pickups.setId(100L);
            outsourcedPartRepository.save(pickups);
            // OutsourcedPart thePart=null;
            // List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            // for(OutsourcedPart part:outsourcedParts){
            //     if(part.getName().equals("Aftermath Pickups 6 String Set"))thePart=part;
            // }
            // System.out.println(thePart.getCompanyName());

            OutsourcedPart tuners= new OutsourcedPart();
            tuners.setCompanyName("Hipshot");
            tuners.setName("Hipshot Open Gear 6 String Set");
            tuners.setInv(5);
            tuners.setPrice(80.0);
            tuners.setId(101L);
            outsourcedPartRepository.save(tuners);

            OutsourcedPart bridge= new OutsourcedPart();
            bridge.setCompanyName("Hipshot");
            bridge.setName("Hipshot Bridge 6 String");
            bridge.setInv(5);
            bridge.setPrice(200.0);
            bridge.setId(102L);
            outsourcedPartRepository.save(bridge);

            // List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            // for(OutsourcedPart part:outsourcedParts){
            //     System.out.println(part.getName()+" "+part.getCompanyName());
            // }
        }

        if(inhousePartRepository.count() == 0) {
            InhousePart guitarBody = new InhousePart();
            guitarBody.setName("Standard Guitar Body");
            guitarBody.setInv(5);
            guitarBody.setPrice(500.0);
            guitarBody.setId(103L);
            inhousePartRepository.save(guitarBody);

            InhousePart guitarNeck = new InhousePart();
            guitarNeck.setName("Standard Guitar Neck");
            guitarNeck.setInv(5);
            guitarNeck.setPrice(300.0);
            guitarNeck.setId(104L);
            inhousePartRepository.save(guitarNeck);
        }
        
        if(productRepository.count() == 0) {
            Product doubleCut= new Product("Guitar - Double Cut",1500.0,15);
            Product singleCut= new Product("Guitar - Single Cut",1500.0,15);
            Product flyingV= new Product("Guitar - Flying V",1500.0,15);
            Product explorer= new Product("Guitar - Explorer",1500.0,15);
            Product headless= new Product("Guitar - Headless",1500.0,15);
            productRepository.save(doubleCut);
            productRepository.save(singleCut);
            productRepository.save(flyingV);
            productRepository.save(explorer);
            productRepository.save(headless);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
