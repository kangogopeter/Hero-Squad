import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args){
staticFileLocation("/public");
String layout = "templates/layout.vtl";

get("/",(request,response) ->{
Map<String, Object> model = new HashMap<String, Object>()
 model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
post("/successfully done", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
ArrayList<Squad>squad=request.session().attribute("squad");

 if (squad == 0) {
                squad = new ArrayList<Squad>();
                request.session().attribute("squad", squad);
            }

  String name = request.queryParams("name");
            int size = request.queryParams("size");
            String personal = request.queryParams("hero");
            String group = request.queryParams("squad");
            Squad newSquad = new Squad(name, size, hero, squad);
            squad.add(newSquad);
            model.put("squad", request.session().attribute("squad"));
            model.put("template","templates/success.vtl");
            
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    
    }

  }
