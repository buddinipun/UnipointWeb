package com.unipoint.dao;

import java.util.List;

import com.unipoint.model.BuzzedMe;

public interface BuzzedMeDao {

	public void saveBuzzedMe(BuzzedMe buzzedMe);
	public List<BuzzedMe> getAllBuzzedMe();
	public void updateBuzzMe(BuzzedMe upBuzzedMe);
	public void deleteBuzzMe(BuzzedMe buzzedMeDel);
}
