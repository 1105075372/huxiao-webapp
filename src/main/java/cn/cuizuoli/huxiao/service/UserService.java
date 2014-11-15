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
package cn.cuizuoli.huxiao.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cuizuoli.huxiao.model.HuxiaoUser;
import cn.cuizuoli.huxiao.repository.HuxiaoUserRepository;

/**
 * UserService
 * @author cuizuoli
 */
@Service
public class UserService {

	@Resource
	private HuxiaoUserRepository huxiaoUserRepository;

	/**
	 * addUser
	 * @param huxiaoUser
	 */
	public void addUser(HuxiaoUser huxiaoUser) {
		HuxiaoUser user = huxiaoUserRepository.selectOne(huxiaoUser.getUsername());
		if (user == null) {
			huxiaoUserRepository.insert(huxiaoUser);
		}
	}

	/**
	 * checkUserExists
	 * @param huxiaoUser
	 * @return
	 */
	public boolean checkUserExists(HuxiaoUser huxiaoUser) {
		HuxiaoUser user = huxiaoUserRepository.selectOne(huxiaoUser.getUsername());
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * modifyUser
	 * @param huxiaoUser
	 */
	public void modifyUser(HuxiaoUser huxiaoUser) {
		huxiaoUserRepository.update(huxiaoUser);
	}

}
