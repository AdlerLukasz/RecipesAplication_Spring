package recipes.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {


@RequestMapping("/")
    public String index(){
        return  "index";
    }
}
