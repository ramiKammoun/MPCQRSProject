package cn.answering.repository;

import cn.answering.domain.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// The repository about the tags
@Repository
public interface TagRepository extends CrudRepository<Tag,String>{

}
