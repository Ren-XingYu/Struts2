package x.y.struts2.action.demo6;

import com.opensymphony.xwork2.ActionSupport;
import x.y.struts2.domain.Product;

import java.util.Arrays;
import java.util.List;

public class ProductAction1 extends ActionSupport {

    private List<Product> products;

    //提供集合的set方法
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String execute() throws Exception {
        for (Product product:products){
            System.out.println(product);
        }
        return NONE;
    }
}
