package ma.ehei.ecom.ecommstore.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexContoller {
    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }
}
