package com.ruicunha.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ruicunha.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
