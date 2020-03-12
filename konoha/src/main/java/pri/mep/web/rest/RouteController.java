package pri.mep.web.rest;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RouteController {
    @Autowired
    private SessionFactory sessionFactory;
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/news")
    public String news() {
        return "news";
    }

    @GetMapping("/problem-info")
    public String problemInfo() {
        return "problemInfo";
    }

    @GetMapping("/problems")
    public String problems() {
        return "problems";
    }

    @GetMapping("/report-problem")
    public String reportProblem() {
        return "reportProblem";
    }
}
