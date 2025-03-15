package realtime.videocall.app.products;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ProductController {
    @GetMapping
    public String getMethodName() {
        return "i am get!";
    }

    @PostMapping
    public String postMethodName() {
        return "i am post!";
    }
}