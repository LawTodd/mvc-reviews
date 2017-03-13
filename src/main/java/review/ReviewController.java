package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	
	@Resource
	private ReviewRepository repository;

    @RequestMapping("/showReviews")
    public String reviews(Model model) {
    	model.addAttribute("reviews", repository.findAll());
        return "reviews";
    }

    @RequestMapping("/showReview")
    public String review(@RequestParam(value="id", required=false, defaultValue="1") long id, Model model) {
        model.addAttribute("review", repository.findOne(id));
        return "review";
    }
}