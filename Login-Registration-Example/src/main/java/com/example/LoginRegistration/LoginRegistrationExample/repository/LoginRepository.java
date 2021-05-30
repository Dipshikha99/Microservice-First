package com.example.LoginRegistration.LoginRegistrationExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginRegistration.LoginRegistrationExample.model.LoginCredential;


@Repository
public interface LoginRepository extends JpaRepository<LoginCredential, Integer> {

}
