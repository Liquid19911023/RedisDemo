package SpringGId.RedisDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    private RedisService redisService ;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String demoTest(){
        redisService.set("myKey","woshi666");
        
        Object obj = redisService.get("myKey");
        
        System.out.println(obj);
        return obj.toString();
    }
    
}