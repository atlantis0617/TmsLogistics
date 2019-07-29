package com.yhy.logistics.controller.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yhy.logistics.model.base.user.TmsUser;

@Repository
public interface TmsUserRepository extends JpaRepository<TmsUser, Integer> {

	public TmsUser findById(Long id);

	@SuppressWarnings("unchecked")
	public TmsUser save(TmsUser user);

	@Query(value = "SELECT u FROM TmsUser u WHERE name=:name")
//	@Query(value = "SELECT * FROM yyh_user WHERE name=?", nativeQuery = true) sql
	public TmsUser findName(@Param("name") String name);

}
