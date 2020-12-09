package controllers;
import play.mvc.*;
import views.html.Books.*;

public class BooksController extends Controller{

        public Result index(){
            return ok("hiiiiiii");
        }

        public Result save(){
            return ok();
        }

        public Result create(){
            return ok();
        }

        public Result edit(Integer id){
            return ok();
        }

        public Result destroy(Integer id){
            return ok();
        }

        public Result update(){
            return ok();
        }

        public Result show(Integer id){
            return ok();
        }
}
