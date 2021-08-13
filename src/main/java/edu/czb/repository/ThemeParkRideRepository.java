package edu.czb.repository;

import edu.czb.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 陈泽彬
 * @date: 2021/8/12 19:04
 * @description:
 */
@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide,Long> {
    List<ThemeParkRide> findByName(String name);
}
