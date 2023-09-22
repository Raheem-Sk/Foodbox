package com.TastyTreks.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.TastyTreks.pojos.Cart;



public interface CartRepository extends JpaRepository<Cart, Long> {

}