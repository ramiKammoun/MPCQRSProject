package cn.answering.repository;

import cn.answering.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//The repository about the UserRepository 
@Repository
public interface UserRepository extends CrudRepository<User,String>{

}
