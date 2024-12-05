package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
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

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //Adding default sample data if both the part and product repository are empty
        //as per the instructions in task E.
        if ((partRepository.count()==0)&&(productRepository.count()==0)) {

            //Adding Parts temporarily commented out parts of code are staged in prep for part G.
            OutsourcedPart coated350Bed = new OutsourcedPart();
            coated350Bed.setCompanyName("IdeaFormer");
            coated350Bed.setName("Coated 350mm bed");
            coated350Bed.setInv(15);
            coated350Bed.setPrice(34.50);
            coated350Bed.setId(350L);
            //coated350Bed.setMinInv(1);
            //coated350Bed.setMaxInv(20);
            outsourcedPartRepository.save(coated350Bed);

            OutsourcedPart hemeraExtruder = new OutsourcedPart();
            hemeraExtruder.setCompanyName("E3D");
            hemeraExtruder.setName("Hemera Extruder");
            hemeraExtruder.setInv(5);
            hemeraExtruder.setPrice(215.95);
            hemeraExtruder.setId(71L);
            //hemeraExtruder.setMinInv(1);
            //hemeraExtruder.setMaxInv(20);
            outsourcedPartRepository.save(hemeraExtruder);

            InhousePart voronSB = new InhousePart();
            voronSB.setName("Voron Stealthburner");
            voronSB.setInv(15);
            voronSB.setPrice(115.95);
            voronSB.setId(70L);
            //voronSB.setMinInv(1);
            //voronSB.setMaxInv(20);
            partRepository.save(voronSB);

            InhousePart voronTap = new InhousePart();
            voronTap.setName("Voron Tap Kit");
            voronTap.setInv(18);
            voronTap.setPrice(45.95);
            voronTap.setId(11L);
            //voronTap.setMinInv(1);
            //voronTap.setMaxInv(20);
            partRepository.save(voronTap);

            InhousePart plate350 = new InhousePart();
            plate350.setName("350mm Standard plate");
            plate350.setInv(20);
            plate350.setPrice(15.95);
            plate350.setId(351L);
            //plate350.setMinInv(1);
            //plate350.setMaxInv(20);
            partRepository.save(plate350);

            //Console outputs that were in existing code
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                System.out.println(part.getName()+" "+part.getCompanyName());
            }

            //Adding products
            productRepository.save(new Product("Voron 2.4 350x350mm 3d Printer", 1390.0, 35));
            productRepository.save(new Product("Voron Trident 350x350mm 3d Printer", 1280.0, 25));
            productRepository.save(new Product("Voron Trident 300x300mm 3d Printer", 1120.0, 10));
            productRepository.save(new Product("Custom Hemera 350x350mm 3d Printer", 1800.0, 5));
            productRepository.save(new Product("Voron Mini 120x120mm 3d Printer", 400.0, 5));
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
