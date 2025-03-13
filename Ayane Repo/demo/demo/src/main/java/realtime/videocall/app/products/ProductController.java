package realtime.videocall.app.products;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductController {
    @GetMapping
    public String getMethodName(){
        return "i am abin";
    }

    @PostMapping
    public String postMethodName(){
        return "i am post";
    }
}