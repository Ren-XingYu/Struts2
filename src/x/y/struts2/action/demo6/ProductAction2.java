package x.y.struts2.action.demo6;

import com.opensymphony.xwork2.ActionSupport;
import x.y.struts2.domain.Product;

import java.util.List;
import java.util.Map;

public class ProductAction2 extends ActionSupport {

    private Map<String,Product> maps;

    public Map<String, Product> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Product> maps) {
        this.maps = maps;
    }

    @Override
    public String execute() throws Exception {
        for (String key:maps.keySet()){
            System.out.println(maps.get(key));
        }
        return NONE;
    }
}
