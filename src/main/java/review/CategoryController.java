package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryRepository repository;

    @RequestMapping("/showCategories")
    public String reviews(Model model) {
    	model.addAttribute("categories", repository.findAll());
        return "categories";
    }

    @RequestMapping("/showCategory")
    public String review(@RequestParam(value="id", required=false, defaultValue="1") long id, Model model) {
        model.addAttribute("category", repository.findOne(id));
        return "category";
    }
}