package main.java.com.assignment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String> {
    //public Account findAccountByUserName(String userName);
}
