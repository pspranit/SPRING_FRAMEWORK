package org.jspiders.springmvcproduct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {

    List<Product> productData=new ArrayList<>();

    {
        productData.add(new Product(1,"LAPTOP",50000.25));
        productData.add(new Product(2,"MOBILE",25000.25));
        productData.add(new Product(3,"HEADPHONE",5000.25));
    }

    //display product list
    @GetMapping("/")
    public String getProductInfo(Model model)
    {
        model.addAttribute("records",productData);
        return "productlist";
    }

    //display add product form
    @GetMapping("/addproduct")
    public String displayProductForm(Model model)
    {
        model.addAttribute("product",new Product());
        return "productform";
    }

    //submit form details
    @PostMapping("/insertproduct")
    public String submitProductDetails(Product product)
    {
        productData.add(product);
        return "redirect:/";
    }

    //perform update form
    @GetMapping("/updateproduct/{id}")
    public String showProductForm(@PathVariable(value = "id") int id,Model model)
    {
        Product p=productData.get(id-1);
        model.addAttribute("product",p);
        return "updateform";
    }

    //perform update operation
    @GetMapping("/modifyproduct")
    public String changeProduct(Product p)
    {
        productData.set(p.getProductId()-1,p);
        return "redirect:/";
    }

    //perform delete operation
    @GetMapping("/deleteproduct/{id}")
    public String deleteRecord(@PathVariable(value = "id")int id,Model model)
    {
         productData=this.productData.stream().filter(e->e.getProductId()!=id).collect(Collectors.toList());
            return "redirect:/";

    }
}
