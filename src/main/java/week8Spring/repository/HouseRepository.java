package week8Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import week8.beans.House;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Mar 17, 2023
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {}