package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@RestController
@SpringBootApplication
public class SayHelloApplicationThree {

  private static Logger log = LoggerFactory.getLogger(SayHelloApplicationThree.class);

  @RequestMapping(value = "/greeting")
  public String greet() {
    log.info("Access /greeting");

    List<String> greetings = Arrays.asList("Salut", "Ça va", "Bonjour");
    Random rand = new Random();

    int randomNum = rand.nextInt(greetings.size());
    return greetings.get(randomNum);
  }

  @RequestMapping(value = "/")
  public String home() {
    log.info("Access /");
    return "Hi!";
  }

  public static void main(String[] args) {
    SpringApplication.run(SayHelloApplicationThree.class, args);
  }
}
