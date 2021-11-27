package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping(path= "products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/listAll")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products/list";
    }

    @GetMapping("/addNewProduct")
    public String addNewProductFrom(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", new Product());
        return "products/add";
    }
    @PostMapping("/addNewProduct")
    public String addNewProductSubmit(@ModelAttribute Product product, Model model) {
        addNewProduct(product);
        return "products/list";
    }


    @PostMapping
    public void addNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);
    }
}


