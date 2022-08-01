package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.IBlogService;
import com.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog/api/v1")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList(){
        List<Blog> blogList = blogService.selectAll();
        List<Category> categoryList = categoryService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable int id){
        Optional<Blog> blogOptional = blogService.FindBlogById(id);
        if (!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
            return  new ResponseEntity<>(blogOptional.get(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> create(@RequestBody Blog blog){
        return  new ResponseEntity<>(blogService.saveBlog(blog),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateCustomer(@PathVariable int id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = blogService.FindBlogById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        return new ResponseEntity<>(blogService.saveBlog(blog), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteCustomer(@PathVariable int id) {
        Optional<Blog> blogOptional = blogService.FindBlogById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }
}
