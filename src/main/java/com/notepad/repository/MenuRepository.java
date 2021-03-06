package com.notepad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notepad.entity.Menu;
import com.notepad.entity.User;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	List<Menu> findAllByOrderByMenuName();

	void deleteByMenuId(Long menuId);

	List<Menu> findAllByParentMenu(Menu menu);

	List<Menu> findAllByUser(User user);

	void deleteByUser(User user);

//	@Query("SELECT menu from Menu menu WHERE menu.user.userId = :userId order by :orderId")
//	List<Menu> findAllByUserIdOrderByMenuName(Long userId);

	List<Menu> findAllByUserOrderByOrderId(User user);

	List<Menu> findAllByParentMenuOrderByOrderId(Menu menu);

	List<Menu> findAllByParentMenuAndUserOrderByOrderId(Menu menu, User user);

}
