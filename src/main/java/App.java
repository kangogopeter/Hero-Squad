import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {

    public static void main(String[] args){
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

staticFileLocation("/public");
String layout = "templates/layout.vtl";
get("/", (request, response) ->{
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/form.vtl");
    return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

        get("/menu",(request,response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/hero.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

 get("/local",(request,response) ->{
Map<String, Object> model = new HashMap<String, Object>();
 model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());




 post("/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();


ArrayList<Hero> hero=request.session().attribute("hero");

 if (hero == null) {
                hero = new ArrayList<Hero>();
                request.session().attribute("hero", hero);
            }

            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String personal = request.queryParams("personal");
            String group = request.queryParams("group");
            Hero newHero = new Hero(name, size, personal, group);
            hero.add(newHero);
            model.put("Hero", request.session().attribute("hero"));
            model.put("template","templates/success.vtl");

            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }

  }
