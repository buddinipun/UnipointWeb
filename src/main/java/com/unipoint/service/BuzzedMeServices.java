package com.unipoint.service;

import java.util.List;

import com.unipoint.model.BuzzedMe;


public interface BuzzedMeServices {

	public void assBuzzedMe(BuzzedMe buzzedMe);
	public List<BuzzedMe> getAllBuzzedMe();
	public void updateBuzzMe(BuzzedMe upBuzzedMe);
	public void deleteBuzzedMe(BuzzedMe buzzedMeDel);
}
