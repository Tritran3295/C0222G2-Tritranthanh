package com.blog.repository;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Blob;
import java.util.List;
import java.util.Optional;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = " select * from blog where name_blog like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select * from blog where name_blog like :searchName ) temp_table ")
    Page<Blog> findAll(@Param("searchName") String searchName, Pageable pageable);

    @Query(value = "select * from blog where name_blog like :nameSearch",nativeQuery = true)
    List<Blog> findAll(String nameSearch);
}
