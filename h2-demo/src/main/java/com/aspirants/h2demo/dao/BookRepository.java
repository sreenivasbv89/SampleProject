package com.aspirants.h2demo.dao;

import com.aspirants.h2demo.entity.onetoone.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer>
{
    @Query(value="select * from books b where b.book_id=:id", nativeQuery = true)
    Optional<Books> findByBookId(@Param("id") int id);

}
