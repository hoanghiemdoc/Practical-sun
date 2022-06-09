package aptech.t008m.hellospring.repository;

import aptech.t008m.hellospring.entity.SuperNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperNewRepository extends JpaRepository<SuperNew, Long> {
    @Query(value = "SELECT * FROM supernews s WHERE   s.title like %:title% and s.category like %:category%",
            nativeQuery= true)
     List<SuperNew> search(@Param("title") String title, @Param("category") String category);
}