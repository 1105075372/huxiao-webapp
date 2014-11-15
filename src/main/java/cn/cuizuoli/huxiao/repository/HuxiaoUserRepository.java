/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.cuizuoli.huxiao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.cuizuoli.huxiao.model.HuxiaoUser;

@Repository
public interface HuxiaoUserRepository {
	/**
	 * selectList
	 * @return
	 */
	List<HuxiaoUser> selectList();

	/**
	 * selectOne
	 * @param username
	 * @return
	 */
	HuxiaoUser selectOne(@Param("username") String username);

	/**
	 * insert
	 * @param huxiaoUser
	 */
	void insert(HuxiaoUser huxiaoUser);

	/**
	 * update
	 * @param huxiaoUser
	 */
	void update(HuxiaoUser huxiaoUser);
}
