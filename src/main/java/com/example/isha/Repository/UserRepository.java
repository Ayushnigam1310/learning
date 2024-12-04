package com.example.isha.Repository;

import com.example.isha.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {


//    @Query(value = "INSERT INTO users (id, name, email, password) VALUES (:id, :name, :email, :pass)", nativeQuery = true)
//    public void save(int id, String name, String email, String pass);

    public Users findByEmail(String email);

}
