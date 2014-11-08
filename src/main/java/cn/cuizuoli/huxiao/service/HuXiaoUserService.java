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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cuizuoli.huxiao.model.HuxiaoUser;
import cn.cuizuoli.huxiao.repository.HuXiaoUserRepository;

/**
 * HuXiaoUserService
 * @author cuizuoli
 */
@Service
public class HuXiaoUserService {

	@Resource
	private HuXiaoUserRepository huXiaoUserRepository;

	public List<HuxiaoUser> getHuXiaoUser() {
		HuxiaoUser zhangsanUser = huXiaoUserRepository.selectOne("zhangsan");
		System.out.println(zhangsanUser.getNickname());

		List<HuxiaoUser> userList = huXiaoUserRepository.selectList();
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).getNickname());
		}
		for (HuxiaoUser user : userList) {
			System.out.println(user.getNickname());
		}
		return userList;
	}

}
