package com.example.ressfullrs.resource;

import com.example.ressfullrs.entity.Product;
import com.example.ressfullrs.repository.InMemoryProductRepo;
import com.example.ressfullrs.repository.MysqlProductModel;
import com.example.ressfullrs.repository.ProductRepository;

import javax.ws.rs.*;
import java.util.List;

@Path("/products")
@Produces("application/json")
@Consumes("application/json")
public class ProductResource {

    ProductRepository productRepository;

    public ProductResource(){
        productRepository = new MysqlProductModel();
    }

    @GET
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @GET
    @Path("{id}")
    public Product findById(@PathParam("id") int id){
        return productRepository.findById(id);
    }

    @POST
    public Product save(Product obj){
        return productRepository.save(obj);
    }

    @PUT
    @Path("{id}")
    public Product update(@PathParam("id") int id, Product updateProduct){
        return productRepository.update(updateProduct, id);
    }

    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") int id){
        return productRepository.delete(id);
    }
}
